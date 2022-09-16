package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: crvw  reason: default package */
/* loaded from: classes5.dex */
public final class crvw {
    private static final dasy a = new dath();
    private final String b;
    private final String c;
    private final crvs d;
    private final dbsz<crua> e;
    private final dbsz<String> f;
    private final String g;
    private final duid h;
    private final String i;
    @dzsi
    private duio j = null;
    private final duiw k;

    public crvw(crwb crwbVar, crvs crvsVar, duiw duiwVar, String str, dars darsVar, dbsz dbszVar, dbsz dbszVar2) {
        this.d = crvsVar;
        this.k = duiwVar;
        this.g = str;
        this.e = dbszVar;
        this.f = dbszVar2;
        dcdn<crvz, String> dcdnVar = crwv.a;
        crvz b = crvz.b(crwbVar.b);
        String str2 = dcdnVar.get(b == null ? crvz.TEST : b);
        dbsk.s(str2);
        this.b = str2;
        this.c = crwbVar.c;
        this.h = new duid(darsVar.c(), ImageMetadata.SHADING_MODE);
        this.i = darsVar.b;
    }

    public final davp a(davp davpVar, @dzsi String str) {
        dgpm dgpmVar;
        dgpm dgpmVar2;
        try {
            dasy dasyVar = a;
            String c = dasyVar.c(davpVar);
            if (str != null) {
                if (str.length() == 0) {
                    new String("Resume upload handle ");
                }
                duiw duiwVar = this.k;
                duid duidVar = this.h;
                duit a2 = duiu.a();
                a2.a = 0L;
                this.j = new duim(str, "PUT", null, duidVar, null, duiwVar.a, a2.a(), true);
            } else {
                duhx duhxVar = new duhx();
                String str2 = this.g;
                duhxVar.a("Authorization", str2.length() != 0 ? "Bearer ".concat(str2) : new String("Bearer "));
                duhxVar.a("Content-Type", "application/json-rpc; charset=utf-8");
                duhxVar.a("X-Goog-Upload-Header-Content-Type", this.i);
                duiw duiwVar2 = this.k;
                String str3 = this.b;
                String str4 = this.c;
                StringBuilder sb = new StringBuilder(str3.length() + 17 + String.valueOf(str4).length());
                sb.append(str3);
                sb.append("/upload/");
                sb.append(str4);
                sb.append("apiPhotos");
                String sb2 = sb.toString();
                duid duidVar2 = this.h;
                duit a3 = duiu.a();
                a3.a = 0L;
                this.j = duiwVar2.b(sb2, duhxVar, duidVar2, c, a3.a());
            }
            boolean z = true;
            crvx crvxVar = new crvx(this.e, this.f, this.d, str != null);
            duio duioVar = this.j;
            dbsk.s(duioVar);
            duioVar.g(crvxVar, 1);
            try {
                duio duioVar2 = this.j;
                dbsk.s(duioVar2);
                duir duirVar = duioVar2.a().get();
                this.j = null;
                if (duirVar.a()) {
                    duirVar.a.toString();
                    duiq duiqVar = duirVar.a;
                    duip duipVar = duip.BAD_URL;
                    int ordinal = duiqVar.a.ordinal();
                    if (ordinal == 0) {
                        dgpmVar2 = dgpm.INVALID_ARGUMENTS;
                    } else if (ordinal == 1 || ordinal == 2) {
                        dgpmVar2 = dgpm.UPLOAD_IO_EXCEPTION;
                        throw new crxr(dgpmVar2, z);
                    } else if (ordinal == 3 || ordinal == 4) {
                        dgpmVar2 = dgpm.CONNECTION_FAILURE;
                    } else if (ordinal == 5) {
                        dgpmVar2 = dgpm.UNKNOWN_EXCEPTION;
                    } else {
                        dgpmVar2 = dgpm.UNKNOWN_EXCEPTION;
                    }
                    z = false;
                    throw new crxr(dgpmVar2, z);
                }
                int i = duirVar.b.a;
                if (i == 200) {
                    try {
                        return (davp) dasyVar.a(duirVar.b.c).o(davp.class);
                    } catch (IOException unused) {
                        throw new crxr(dgpm.UPLOAD_IO_EXCEPTION);
                    }
                } else if (str == null || i != 404) {
                    if (i != 400) {
                        if (i == 401) {
                            dgpmVar = dgpm.AUTHENTICATION_FAILURE;
                        } else if (i != 404) {
                            if (i == 408 || i == 500 || i == 503 || i == 504) {
                                dgpmVar = dgpm.CONNECTION_FAILURE;
                            } else {
                                dgpmVar = dgpm.UNKNOWN_EXCEPTION;
                            }
                        }
                        throw new crxr(dgpmVar, false);
                    }
                    dgpmVar = dgpm.INVALID_ARGUMENTS;
                    throw new crxr(dgpmVar, false);
                } else {
                    crvxVar.b.a.c(59);
                    crvxVar.a.NU(null);
                    throw new crxr(dgpm.CONNECTION_FAILURE, false);
                }
            } catch (InterruptedException unused2) {
                b();
                throw new crxr(dgpm.UPLOAD_IO_EXCEPTION, true);
            } catch (CancellationException e) {
                e = e;
                e.toString();
                throw new crxr(dgpm.UPLOAD_IO_EXCEPTION, true);
            } catch (ExecutionException e2) {
                e = e2;
                e.toString();
                throw new crxr(dgpm.UPLOAD_IO_EXCEPTION, true);
            }
        } catch (IOException unused3) {
            throw new crxr(dgpm.UPLOAD_REQUEST_INITIALIZATION_IO_EXCEPTION);
        }
    }

    public final void b() {
        duio duioVar = this.j;
        if (duioVar != null) {
            duioVar.e();
        }
    }
}
