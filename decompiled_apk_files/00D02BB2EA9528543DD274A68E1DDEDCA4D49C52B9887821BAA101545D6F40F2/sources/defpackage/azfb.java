package defpackage;
/* compiled from: PG */
/* renamed from: azfb  reason: default package */
/* loaded from: classes3.dex */
public final class azfb {
    public final pbu a;
    public final akfa b;
    public final bvrb c;
    @dzsi
    public dpov d;
    private final dxio<axwq> e;
    private final dxio<axyz> f;

    public azfb(@dzsi pbu pbuVar, dxio<azex> dxioVar, akfa akfaVar, bvrb bvrbVar, dxio<axwq> dxioVar2, dxio<axyz> dxioVar3) {
        this.b = akfaVar;
        this.c = bvrbVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        if (pbuVar != null) {
            this.a = pbuVar;
        } else {
            this.a = dxioVar.a();
        }
    }

    public static boolean c(@dzsi dpov dpovVar, @dzsi dpov dpovVar2) {
        String str = null;
        String str2 = dpovVar == null ? null : dpovVar.b;
        if (dpovVar2 != null) {
            str = dpovVar2.b;
        }
        return dbsd.a(str2, str);
    }

    public final void a(final dpov dpovVar) {
        this.d = null;
        final String o = this.b.o();
        this.c.b(new Runnable(this, o, dpovVar) { // from class: azez
            private final azfb a;
            private final String b;
            private final dpov c;

            {
                this.a = this;
                this.b = o;
                this.c = dpovVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azfb azfbVar = this.a;
                String str = this.b;
                dpov dpovVar2 = this.c;
                if (str == null) {
                    return;
                }
                azfbVar.a.b(str, dcdc.f(dpovVar2.b));
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    public final synchronized void b(dpov dpovVar) {
        if (!c(dpovVar, this.d)) {
            a(dpovVar);
            return;
        }
        this.f.a().c(dpovVar);
        this.e.a().s(azfa.a);
    }
}
