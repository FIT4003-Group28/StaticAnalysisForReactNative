package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: buf  reason: default package */
/* loaded from: classes4.dex */
public final class buf extends buw<AssetFileDescriptor> {
    public buf(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.buj
    public final Class<AssetFileDescriptor> d() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.buw
    protected final /* bridge */ /* synthetic */ void f(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    @Override // defpackage.buw
    protected final /* bridge */ /* synthetic */ AssetFileDescriptor g(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("FileDescriptor is null for: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }
}
