package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.net.Uri;
import c.f;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.b;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class BlobModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs;
    protected final WebSocketModule.a mContentHandler;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public BlobModule(ah ahVar) {
        super(ahVar);
        this.mBlobs = new HashMap();
        this.mContentHandler = new WebSocketModule.a() { // from class: com.facebook.react.modules.blob.BlobModule.1
            @Override // com.facebook.react.modules.websocket.WebSocketModule.a
            public void a(String str, ar arVar) {
                arVar.putString(DataBufferSafeParcelable.DATA_FIELD, str);
            }

            @Override // com.facebook.react.modules.websocket.WebSocketModule.a
            public void a(f fVar, ar arVar) {
                byte[] i = fVar.i();
                ar b2 = b.b();
                b2.putString("blobId", BlobModule.this.store(i));
                b2.putInt("offset", 0);
                b2.putInt("size", i.length);
                arVar.a(DataBufferSafeParcelable.DATA_FIELD, b2);
                arVar.putString("type", "blob");
            }
        };
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return com.facebook.react.b.f.a("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        return i > 0 ? Arrays.copyOfRange(bArr, i, i2 + i) : bArr;
    }

    public byte[] resolve(an anVar) {
        return resolve(anVar.getString("blobId"), anVar.getInt("offset"), anVar.getInt("size"));
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().b(WebSocketModule.class);
    }

    @al
    public void enableBlobSupport(int i) {
        getWebSocketModule().setContentHandler(i, this.mContentHandler);
    }

    @al
    public void disableBlobSupport(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    @al
    public void sendBlob(an anVar, int i) {
        byte[] resolve = resolve(anVar.getString("blobId"), anVar.getInt("offset"), anVar.getInt("size"));
        if (resolve != null) {
            getWebSocketModule().sendBinary(f.a(resolve), i);
        } else {
            getWebSocketModule().sendBinary((f) null, i);
        }
    }

    @al
    public void createFromParts(am amVar, String str) {
        ArrayList arrayList = new ArrayList(amVar.size());
        int i = 0;
        for (int i2 = 0; i2 < amVar.size(); i2++) {
            an c2 = amVar.c(i2);
            i += c2.getInt("size");
            arrayList.add(i2, c2);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put(resolve((an) it.next()));
        }
        store(allocate.array(), str);
    }

    @al
    public void release(String str) {
        remove(str);
    }
}
