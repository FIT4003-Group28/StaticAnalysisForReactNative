package defpackage;

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: PG */
/* renamed from: cukf  reason: default package */
/* loaded from: classes5.dex */
public final class cukf implements ctxf<dxxc, Object, cujt, cukc> {
    final int a;
    private final cukn b;
    private final dehp c = cstu.b().a;
    private final String d;
    private final ctyy e;

    public cukf(ctyy ctyyVar, String str, cukn cuknVar, int i) {
        this.b = cuknVar;
        this.d = str;
        this.e = ctyyVar;
        this.a = i;
    }

    @Override // defpackage.ctxf
    public final dehn<dxxc> a(dxwi dxwiVar) {
        dxxb bZ = dxxc.c.bZ();
        dxvx bZ2 = dxvy.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dxvy) bZ2.b).b = eacr.a(12);
        String a = this.b.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        a.getClass();
        ((dxvy) bZ2.b).a = a;
        dsqy c = dsqy.c(this.b.b());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        c.getClass();
        ((dxvy) bZ2.b).c = c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxvy bK = bZ2.bK();
        bK.getClass();
        ((dxxc) bZ.b).b = bK;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxwiVar.getClass();
        ((dxxc) bZ.b).a = dxwiVar;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        int i2 = dyjbVar.p.r;
        Throwable th = dyjbVar.r;
        if (th instanceof cujx) {
            int i3 = ((cujx) th).a;
        }
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.e.b().e());
        r.o(this.e.c().J());
        r.p(uuid.toString());
        r.j(this.a);
        r.m(Integer.valueOf(i2));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, cujt cujtVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.e.b().e());
        r.o(this.e.c().J());
        r.p(uuid.toString());
        r.j(this.a);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ cujt d(Object obj) {
        cujs b = cujt.b();
        b.b(this.d);
        return b.a();
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<Object> e(dehn<cukc> dehnVar, dxxc dxxcVar) {
        final dxxc dxxcVar2 = dxxcVar;
        return deew.h(dehnVar, new dbrn(this, dxxcVar2) { // from class: cuke
            private final cukf a;
            private final dxxc b;

            {
                this.a = this;
                this.b = dxxcVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.f(this.b, (cukc) obj);
            }
        }, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object f(dxxc dxxcVar, cukc cukcVar) {
        String str;
        try {
            File file = new File(this.d);
            File parentFile = file.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                throw cukc.a("Unknown", "Unable to create parent directory", dyjb.m);
            }
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(cukcVar.b.a.f()).openConnection();
                httpsURLConnection.setConnectTimeout(cukcVar.b.Y.f().intValue());
                httpsURLConnection.setReadTimeout(cukcVar.b.Z.f().intValue());
                httpsURLConnection.setInstanceFollowRedirects(true);
                httpsURLConnection.setRequestProperty("X-Goog-Download-Metadata", Base64.encodeToString(dxxcVar.bS(), 2));
                String valueOf = String.valueOf(cukcVar.c);
                httpsURLConnection.setRequestProperty("Authorization", valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpsURLConnection.getInputStream());
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    ddak.a(bufferedInputStream, bufferedOutputStream);
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return new Object();
                } catch (IOException e) {
                    file.delete();
                    try {
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (httpsURLConnection.getHeaderField("x-guploader-uploadid") != null) {
                            str = httpsURLConnection.getHeaderField("x-guploader-uploadid");
                            if (String.valueOf(str).length() == 0) {
                                new String("Media Download requestId=");
                            }
                            cstl.a("ScottyStub");
                        } else {
                            str = "Unknown";
                        }
                        if (responseCode == 200) {
                            throw new dyjd(dyjb.d.f(e));
                        }
                        if (responseCode == 401) {
                            throw cukc.a(str, "Media download unauthenticated (Response Code 401)", dyjb.i);
                        }
                        if (responseCode == 404) {
                            throw cukc.a(str, "404 error", dyjb.g);
                        }
                        StringBuilder sb = new StringBuilder(47);
                        sb.append("Media download failed: responseCode=");
                        sb.append(responseCode);
                        throw cukc.a(str, sb.toString(), dyjb.m);
                    } catch (IOException e2) {
                        throw cukc.b("Unknown", "Missing Status", dyjb.m, e2);
                    }
                }
            } catch (IOException e3) {
                throw cukc.b("Unknown", "Unable to open connection", dyjb.m, e3);
            }
        } catch (MalformedURLException e4) {
            throw new dyjd(dyjb.e.f(e4));
        }
    }
}
