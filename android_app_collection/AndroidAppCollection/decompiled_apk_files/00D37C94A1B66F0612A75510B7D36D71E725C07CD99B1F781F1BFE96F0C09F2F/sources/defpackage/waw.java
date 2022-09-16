package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: waw  reason: default package */
/* loaded from: classes4.dex */
public final class waw implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ UploadPhotoEndpointOuterClass$UploadPhotoEndpoint b;
    final /* synthetic */ wax c;

    public waw(wax waxVar, String str, UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint) {
        this.c = waxVar;
        this.a = str;
        this.b = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        try {
            wax waxVar = this.c;
            way wayVar = waxVar.b;
            Uri uri = waxVar.aj;
            String str = this.a;
            String str2 = waxVar.ak;
            ylr.b();
            if (!wayVar.d.t()) {
                throw new wat("Must be signed in to upload");
            }
            try {
                waq a = waq.a(wayVar.b.getContentResolver(), uri);
                awya awyaVar = new awya();
                if (str2 != null && !str2.isEmpty()) {
                    awyaVar.e("X-YouTube-ChannelId", str2);
                }
                awyaVar.e("Content-Type", "application/json-rpc; charset=utf-8");
                afvm c = wayVar.d.c();
                if (!(c instanceof AccountIdentity)) {
                    throw new wat("Sign in with AccountIdentity required");
                }
                afvv d = wayVar.c.d((AccountIdentity) c);
                if (!d.g()) {
                    throw new wat("Could not fetch auth token");
                }
                Pair b = d.b();
                awyaVar.e((String) b.first, (String) b.second);
                try {
                    awyf awyfVar = new awyf(new BufferedInputStream(wayVar.b.getContentResolver().openInputStream(a.a)), a.c);
                    awyt a2 = awyu.a();
                    a2.a = 600L;
                    a2.b = a.b;
                    awyp a3 = wayVar.e.a(str, awyaVar, awyfVar, null, a2.a());
                    try {
                        try {
                            awys awysVar = (awys) a3.a().get();
                            if (awysVar.b()) {
                                throw new cev(awysVar.a);
                            }
                            if (!awysVar.a()) {
                                throw new cev();
                            }
                            awyb awybVar = awysVar.b;
                            int i = awybVar.a;
                            if (i >= 0) {
                                awya awyaVar2 = awybVar.b;
                                awyaVar2.getClass();
                                try {
                                    InputStream inputStream = awybVar.c;
                                    if (inputStream == null) {
                                        throw new cev();
                                    }
                                    byte[] c2 = anek.c(inputStream);
                                    if (i != 200) {
                                        throw new cfd(way.a(i, awyaVar2, c2));
                                    }
                                    try {
                                        waxVar.al = new JSONObject(new String(c2, way.a)).getString("encryptedBlobId");
                                        this.c.d.execute(new wau(this));
                                        return;
                                    } catch (JSONException unused) {
                                        throw new cey(way.a(200, awyaVar2, bArr));
                                    }
                                } catch (IOException unused2) {
                                    throw new cev();
                                }
                            }
                            throw new cev();
                        } catch (InterruptedException e) {
                            a3.f();
                            throw e;
                        } catch (ExecutionException e2) {
                            if (e2.getCause() != null) {
                                throw new cev(e2.getCause());
                            }
                            throw new cev();
                        }
                    } catch (cev e3) {
                        e = e3;
                        throw new wat(e);
                    } catch (cey e4) {
                        e = e4;
                        throw new wat(e);
                    } catch (cfd e5) {
                        e = e5;
                        throw new wat(e);
                    }
                } catch (FileNotFoundException e6) {
                    throw new wat(e6);
                }
            } catch (IOException e7) {
                throw new wat(e7);
            }
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.c.d.execute(new wav(this, e8));
        }
    }
}
