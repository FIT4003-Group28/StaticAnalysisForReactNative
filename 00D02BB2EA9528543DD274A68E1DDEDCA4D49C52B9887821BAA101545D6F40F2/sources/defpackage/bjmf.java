package defpackage;
/* compiled from: PG */
/* renamed from: bjmf  reason: default package */
/* loaded from: classes3.dex */
final class bjmf implements degu<btzx<djaa, djae>> {
    final /* synthetic */ bjfo a;
    final /* synthetic */ bjmi b;

    public bjmf(bjmi bjmiVar, bjfo bjfoVar) {
        this.b = bjmiVar;
        this.a = bjfoVar;
    }

    private final void c() {
        bjgh bjghVar = this.b.h;
        final bjfo bjfoVar = this.a;
        bjghVar.b(new Runnable(this, bjfoVar) { // from class: bjme
            private final bjmf a;
            private final bjfo b;

            {
                this.a = this;
                this.b = bjfoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjmf bjmfVar = this.a;
                bjmfVar.b.k(this.b);
            }
        });
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<djaa, djae> btzxVar) {
        btzx<djaa, djae> btzxVar2 = btzxVar;
        if (btzxVar2 == null || this.b.b == null) {
            return;
        }
        int a = djad.a(btzxVar2.b().b);
        if (a == 0 || a != 2) {
            c();
            return;
        }
        this.b.b.b(new bjfg());
        this.b.b.b(new bjfa(3, 2));
        bjmi bjmiVar = this.b;
        bjfs bjfsVar = bjmiVar.o;
        dsqp dsqpVar = (dsqp) bjfsVar.cu(5);
        dsqpVar.bC(bjfsVar);
        bjfr bjfrVar = (bjfr) dsqpVar;
        if (bjfrVar.c) {
            bjfrVar.bF();
            bjfrVar.c = false;
        }
        bjfs bjfsVar2 = bjfs.e;
        ((bjfs) bjfrVar.b).c = bjfs.ck();
        dcbg b = dcbg.b(this.b.o.c);
        final bjfo bjfoVar = this.a;
        bjfrVar.a(b.o(new dbsl(bjfoVar) { // from class: bjmd
            private final bjfo a;

            {
                this.a = bjfoVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bjfo bjfoVar2 = this.a;
                bjfm bjfmVar = ((bjfo) obj).b;
                if (bjfmVar == null) {
                    bjfmVar = bjfm.c;
                }
                bjfm bjfmVar2 = bjfoVar2.b;
                if (bjfmVar2 == null) {
                    bjfmVar2 = bjfm.c;
                }
                return !bjfmVar.equals(bjfmVar2);
            }
        }));
        bjmiVar.o = bjfrVar.bK();
        this.b.n();
    }
}
