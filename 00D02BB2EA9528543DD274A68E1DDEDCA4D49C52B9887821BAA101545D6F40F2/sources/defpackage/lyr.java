package defpackage;
/* compiled from: PG */
/* renamed from: lyr  reason: default package */
/* loaded from: classes7.dex */
public final class lyr {
    public final lxv a;
    public final lyj b;
    public final lym c;
    private final lxt d;

    public lyr(btrm btrmVar, dehq dehqVar) {
        lxv lxvVar = new lxv(bvrj.UI_THREAD);
        this.a = lxvVar;
        lxt lxtVar = new lxt(btrmVar, dehqVar, bvrj.UI_THREAD);
        this.d = lxtVar;
        this.b = new lyj(15000L, lxtVar, lxvVar, dehqVar, dehqVar, bvrj.UI_THREAD);
        this.c = new lym(15000L, lxtVar, lxvVar, dehqVar, dehqVar, bvrj.UI_THREAD);
    }

    public final void a() {
        lyj lyjVar = this.b;
        lyjVar.a.c();
        if (!lyjVar.b) {
            return;
        }
        if (lyjVar.d != null) {
            lyjVar.e();
            lyjVar.b();
        }
        lyjVar.c();
    }

    public final void b(lya lyaVar) {
        this.b.f(lyaVar);
    }
}
