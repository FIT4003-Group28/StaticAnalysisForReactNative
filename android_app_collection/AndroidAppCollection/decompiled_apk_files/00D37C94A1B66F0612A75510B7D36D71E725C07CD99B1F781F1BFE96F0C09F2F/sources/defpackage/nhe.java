package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nhe */
/* loaded from: classes3.dex */
public final class nhe implements alal {
    public final Map a = new HashMap();
    private final Executor b;
    private final Runnable c;
    private final gte d;
    private final /* synthetic */ int e;

    public nhe(gte gteVar, Executor executor, Runnable runnable, int i) {
        this.e = i;
        this.d = gteVar;
        this.b = executor;
        this.c = runnable;
        ylx.k(gteVar.a(), executor, ngc.c, new ylw(null) { // from class: ngs
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                nhe nheVar = nhe.this;
                amuk amukVar = (amuk) obj;
                int size = amukVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    alcw alcwVar = (alcw) amukVar.get(i2);
                    nheVar.a.put(alcwVar.k, alcwVar);
                }
            }
        });
    }

    public static /* synthetic */ void p(Throwable th) {
        zep.d("Error occurred getting reel uploads", th);
    }

    public static /* synthetic */ void q(Throwable th) {
        zep.d("Error occurred getting reel uploads", th);
    }

    @Override // defpackage.alal
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void b(String str, long j, long j2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void c(String str, alda aldaVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void d(String str, augw augwVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void e(String str, double d) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void f(String str, long j, long j2, double d) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void g(String str, alct alctVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void i(String str, alcw alcwVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void l(String str, avvd avvdVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void m(String str, String str2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void n(String str, alcv alcvVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void o(String str, int i) {
    }

    @Override // defpackage.alal
    public final void h(alcw alcwVar) {
        if (this.e == 0) {
            this.a.put(alcwVar.k, alcwVar);
        } else {
            this.a.put(alcwVar.k, alcwVar);
        }
    }

    public nhe(gte gteVar, Executor executor, Runnable runnable) {
        this.d = gteVar;
        this.b = executor;
        this.c = runnable;
        ylx.k(gteVar.a(), executor, ngc.d, new ylw() { // from class: nhd
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                nhe nheVar = nhe.this;
                amuk amukVar = (amuk) obj;
                int size = amukVar.size();
                for (int i = 0; i < size; i++) {
                    alcw alcwVar = (alcw) amukVar.get(i);
                    nheVar.a.put(alcwVar.k, alcwVar);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void k(String str, boolean z) {
        if (this.e == 0) {
            alcw alcwVar = (alcw) this.a.get(str);
            if (alcwVar == null) {
                return;
            }
            alcu a = alcu.a(alcwVar.l);
            if (a == null) {
                a = alcu.UNKNOWN_UPLOAD;
            }
            if (a != alcu.REELS_UPLOAD) {
                return;
            }
            this.b.execute(this.c);
            return;
        }
        alcw alcwVar2 = (alcw) this.a.get(str);
        if (alcwVar2 == null) {
            return;
        }
        alcu a2 = alcu.a(alcwVar2.l);
        if (a2 == null) {
            a2 = alcu.UNKNOWN_UPLOAD;
        }
        if (a2 != alcu.REELS_UPLOAD) {
            return;
        }
        this.b.execute(this.c);
    }
}
