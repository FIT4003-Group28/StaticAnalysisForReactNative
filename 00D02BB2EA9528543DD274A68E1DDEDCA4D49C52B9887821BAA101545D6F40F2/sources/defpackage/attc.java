package defpackage;
/* compiled from: PG */
/* renamed from: attc  reason: default package */
/* loaded from: classes2.dex */
final class attc implements degu<Void> {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ attf c;

    public attc(attf attfVar, String str, int i) {
        this.c = attfVar;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i = attf.F;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r6) {
        final attf attfVar = this.c;
        String str = this.a;
        int i = this.b;
        int s = attfVar.A.s(bvjk.jm, 0);
        if (pot.c(s)) {
            attfVar.d.v(s);
        }
        attfVar.A.W(bvjk.jm, i);
        attfVar.A.ac(bvjk.jn, str);
        attfVar.B.k(ardz.NAVIGATION);
        attfVar.B.r(str, i, attfVar.D.e(i), new Runnable(attfVar) { // from class: atsz
            private final attf a;

            {
                this.a = attfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final attf attfVar2 = this.a;
                attfVar2.C.execute(new Runnable(attfVar2) { // from class: attb
                    private final attf a;

                    {
                        this.a = attfVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        attf attfVar3 = this.a;
                        attfVar3.B.k(ardz.NAVIGATION_CUSTOM_3D_CHEVRON);
                        attfVar3.p();
                    }
                });
            }
        });
    }
}
