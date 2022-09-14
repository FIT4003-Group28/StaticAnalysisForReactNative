package defpackage;
/* compiled from: PG */
/* renamed from: bycy  reason: default package */
/* loaded from: classes4.dex */
final class bycy implements Runnable {
    @dzsi
    final byct a;
    final /* synthetic */ byda b;

    public bycy(byda bydaVar) {
        this.b = bydaVar;
        this.a = bydaVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byct byctVar = this.a;
        if (byctVar != null) {
            final byda bydaVar = this.b;
            final boolean b = byctVar.b();
            bydaVar.i.execute(new Runnable(bydaVar, b) { // from class: bycv
                private final byda a;
                private final boolean b;

                {
                    this.a = bydaVar;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final byda bydaVar2 = this.a;
                    boolean z = this.b;
                    if (!((ges) bydaVar2.k).aD) {
                        return;
                    }
                    if (z) {
                        bydaVar2.c.P(bvjk.bM);
                        if (bycr.a(bydaVar2.d)) {
                            bydaVar2.d.f();
                        } else {
                            bydaVar2.d.e();
                        }
                        bydaVar2.c.ac(bvjk.dW, bvoc.a(bydaVar2.e));
                        bydaVar2.j.execute(new Runnable(bydaVar2) { // from class: bycw
                            private final byda a;

                            {
                                this.a = bydaVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byda bydaVar3 = this.a;
                                bydaVar3.h.a().k();
                                bydaVar3.g.a().f();
                            }
                        });
                        return;
                    }
                    bydaVar2.b = bydaVar2.o();
                    ppw.b(bydaVar2.e, bydaVar2, bydaVar2);
                }
            });
        }
    }
}
