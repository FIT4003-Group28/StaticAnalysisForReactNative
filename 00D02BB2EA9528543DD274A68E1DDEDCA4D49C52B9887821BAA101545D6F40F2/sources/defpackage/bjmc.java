package defpackage;
/* compiled from: PG */
/* renamed from: bjmc  reason: default package */
/* loaded from: classes3.dex */
final class bjmc implements degu<btzx<djar, djav>> {
    final /* synthetic */ String a;
    final /* synthetic */ bjmi b;

    public bjmc(bjmi bjmiVar, String str) {
        this.b = bjmiVar;
        this.a = str;
    }

    private final void c() {
        bjgh bjghVar = this.b.h;
        final String str = this.a;
        bjghVar.b(new Runnable(this, str) { // from class: bjmb
            private final bjmc a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjmc bjmcVar = this.a;
                bjmcVar.b.j(this.b);
            }
        });
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<djar, djav> btzxVar) {
        btzx<djar, djav> btzxVar2 = btzxVar;
        if (btzxVar2 == null || this.b.b == null) {
            return;
        }
        int a = djau.a(btzxVar2.b().b);
        if (a == 0 || a != 2) {
            c();
            return;
        }
        this.b.b.b(new bjfg());
        this.b.b.b(new bjfa(2, 1));
        this.b.g();
    }
}
