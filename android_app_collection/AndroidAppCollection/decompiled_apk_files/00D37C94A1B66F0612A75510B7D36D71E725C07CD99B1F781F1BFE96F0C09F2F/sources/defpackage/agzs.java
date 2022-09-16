package defpackage;

import android.os.Process;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: agzs  reason: default package */
/* loaded from: classes.dex */
public final class agzs implements agxp {
    protected final agxo a;
    protected final agqz b;
    protected final String c;
    protected final String d;
    protected final String e;
    protected final byte[] f;
    protected final ahai g;
    protected final agvx h;
    protected final agvw i;
    private final agzv j;
    private aegk k;
    private final ahag l;
    private final ahak m = new ahak();
    private final int n;
    private volatile boolean o;
    private final int p;

    public agzs(agxo agxoVar, snc sncVar, zey zeyVar, agqz agqzVar, agzv agzvVar, ahai ahaiVar, agvx agvxVar, agvw agvwVar) {
        this.a = agxoVar;
        this.b = agqzVar;
        this.j = agzvVar;
        this.g = ahaiVar;
        this.h = agvxVar;
        this.i = agvwVar;
        this.n = agxg.d(agqzVar.f);
        this.p = agxg.am(agqzVar.f);
        this.c = agqzVar.a;
        this.d = zeyVar.a();
        this.e = agxg.t(agqzVar.f);
        this.f = agxg.aj(agqzVar.f);
        this.l = new ahag(sncVar, agvxVar.d(), new ahaf() { // from class: agzr
            @Override // defpackage.ahaf
            public final void a(long j, double d) {
                agzs.this.c(j, d, true);
            }
        });
    }

    private final agpw d() {
        agpw agpwVar = this.b.g;
        agxg.y(agpwVar, this.m.a());
        agxg.Q(agpwVar, this.m.b());
        return agpwVar;
    }

    private static final boolean e(agql agqlVar, boolean z) {
        return z || (agqlVar != null && !agqlVar.i());
    }

    @Override // defpackage.agxp
    public final void a(int i) {
        String.valueOf(this.c).length();
        boolean z = true;
        this.o = true;
        if ((i & 384) != 0) {
            z = false;
        }
        aegk aegkVar = this.k;
        if (aegkVar != null) {
            aegkVar.a(z);
        }
    }

    protected final void b(agxq agxqVar, agpw agpwVar) {
        if (agxqVar.a) {
            Throwable cause = agxqVar.getCause();
            if (cause != null) {
                String str = this.c;
                String message = agxqVar.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(message).length());
                sb.append("[Offline] offline ad task[");
                sb.append(str);
                sb.append("] failed: ");
                sb.append(message);
                zep.d(sb.toString(), cause);
            } else {
                String str2 = this.c;
                String message2 = agxqVar.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(message2).length());
                sb2.append("[Offline] offline ad task[");
                sb2.append(str2);
                sb2.append("] failed, unknown cause: ");
                sb2.append(message2);
                zep.d(sb2.toString(), new IllegalArgumentException());
            }
            aglj A = this.h.A();
            if (A != null) {
                A.A(this.e, agxqVar.b);
            }
        } else {
            String str3 = this.c;
            String message3 = agxqVar.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 29 + String.valueOf(message3).length());
            sb3.append("[Offline] offline ad task[");
            sb3.append(str3);
            sb3.append("]: ");
            sb3.append(message3);
            zep.l(sb3.toString());
        }
        this.a.d(this.c, agxqVar, agpwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(long j, double d, boolean z) {
        aglj A = this.h.A();
        if (A != null) {
            String.valueOf(this.c).length();
            A.A(this.e, agqe.ACTIVE);
            this.a.b(this.c, j, d, z);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        agpz a;
        Process.setThreadPriority(10);
        try {
            String.valueOf(this.c).length();
            try {
                ahai ahaiVar = this.g;
                String str = this.e;
                byte[] bArr = this.f;
                agqz agqzVar = this.b;
                PlayerResponseModel h = ahaiVar.h(str, bArr, agqzVar, true != agxg.af(agqzVar.f) ? 2 : 3);
                ahai.i(this.c, h);
                agqm g = this.g.g(this.n, this.p, null, this.e, h.c, h.c(), this.h.d());
                long j = g.c;
                long j2 = g.d;
                boolean z = j2 > j;
                this.l.c = j2;
                this.a.c(this.c, j2);
                c(j, 0.0d, z);
                ahag ahagVar = this.l;
                ahagVar.a = this.e;
                ahagVar.b = 0L;
                aghe b = this.h.b();
                String str2 = null;
                if (b != null && (a = b.a()) != null) {
                    str2 = a.a;
                }
                aegk aegkVar = this.k;
                if (aegkVar == null) {
                    aegkVar = this.j.a();
                    aegkVar.b = this.l;
                    this.k = aegkVar;
                }
                agql agqlVar = g.b;
                boolean e = e(agqlVar, z);
                if (agqlVar != null) {
                    String str3 = this.e;
                    String str4 = this.c;
                    String str5 = this.d;
                    long b2 = agqlVar.b();
                    agmc d = this.h.d();
                    ahak ahakVar = this.m;
                    ahai.d(str3, str4, str5, aegkVar, agqlVar, b2, d, str2, ahakVar.d, ahakVar.b, this.i);
                    this.l.b = agqlVar.b();
                }
                if (this.o) {
                    return;
                }
                agql agqlVar2 = g.a;
                boolean e2 = e(agqlVar2, e);
                if (agqlVar2 != null) {
                    String str6 = this.e;
                    String str7 = this.c;
                    String str8 = this.d;
                    long b3 = agqlVar2.b();
                    agmc d2 = this.h.d();
                    ahak ahakVar2 = this.m;
                    ahai.d(str6, str7, str8, aegkVar, agqlVar2, b3, d2, str2, ahakVar2.c, ahakVar2.a, this.i);
                }
                if (this.o) {
                    return;
                }
                c(j2, 0.0d, e2);
                agpw d3 = d();
                aglj A = this.h.A();
                if (A != null) {
                    String.valueOf(this.c).length();
                    A.A(this.e, agqe.COMPLETE);
                    this.a.a(this.c, d3);
                    return;
                }
                b(agxq.a("Null dbHelper", new NullPointerException(), agqe.FAILED_UNKNOWN, atsg.UNKNOWN_FAILURE_REASON), d3);
            } catch (agxq e3) {
                b(e3, d());
            } catch (IOException e4) {
                b(this.g.a(e4), d());
            } catch (InterruptedException e5) {
                String str9 = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 51);
                sb.append("[Offline] pudl task[");
                sb.append(str9);
                sb.append("] error while downloading video");
                zep.d(sb.toString(), e5);
                b(agxq.b("Error encountered while downloading the video", e5, agqe.FAILED_UNKNOWN, atsg.OFFLINE_TRANSFER_INTERRUPTED), d());
            }
        } catch (Exception e6) {
            String str10 = this.c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 47);
            sb2.append("[Offline] pudl task[");
            sb2.append(str10);
            sb2.append("] error while pinning video");
            zep.d(sb2.toString(), e6);
            String valueOf = String.valueOf(e6.getMessage());
            afus.c(2, 28, valueOf.length() != 0 ? "Abstract pin exception: ".concat(valueOf) : new String("Abstract pin exception: "), e6);
            b(agxq.b("Error encountered while pinning the video", e6, agqe.FAILED_UNKNOWN, atsg.UNKNOWN_FAILURE_REASON), d());
        }
    }
}
