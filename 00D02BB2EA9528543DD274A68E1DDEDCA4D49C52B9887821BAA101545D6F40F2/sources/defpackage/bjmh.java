package defpackage;
/* compiled from: PG */
/* renamed from: bjmh  reason: default package */
/* loaded from: classes3.dex */
final class bjmh implements degu<btzx<djar, djav>> {
    final /* synthetic */ bjfw a;
    final /* synthetic */ bjmi b;

    public bjmh(bjmi bjmiVar, bjfw bjfwVar) {
        this.b = bjmiVar;
        this.a = bjfwVar;
    }

    private final void c() {
        bjgh bjghVar = this.b.h;
        final bjfw bjfwVar = this.a;
        bjghVar.b(new Runnable(this, bjfwVar) { // from class: bjmg
            private final bjmh a;
            private final bjfw b;

            {
                this.a = this;
                this.b = bjfwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjmh bjmhVar = this.a;
                bjmhVar.b.l(this.b);
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
        this.b.b.b(new bjfa(3, 1));
        this.b.f();
    }
}
