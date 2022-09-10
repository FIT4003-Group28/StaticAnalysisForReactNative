package defpackage;
/* compiled from: PG */
/* renamed from: bwpt  reason: default package */
/* loaded from: classes4.dex */
public class bwpt implements bwod {
    public static final dcqe a = dcqe.c("bwpt");

    public bwpt(final bvrb bvrbVar, final cqhn cqhnVar, bwpa bwpaVar) {
        final bvrj a2 = bvrj.a();
        bwpaVar.a(null, new bwoy(this, a2, bvrbVar, cqhnVar) { // from class: bwpr
            private final bwpt a;
            private final bvrj b;
            private final bvrb c;
            private final cqhn d;

            {
                this.a = this;
                this.b = a2;
                this.c = bvrbVar;
                this.d = cqhnVar;
            }

            @Override // defpackage.bwoy
            public final void a() {
                final bwpt bwptVar = this.a;
                bvrj bvrjVar = this.b;
                bvrb bvrbVar2 = this.c;
                if (bvrjVar == null) {
                    bvoo.h("View created on untagged thread.  This cannot be used to run the OfflineRegionListCallback on.", new Object[0]);
                } else {
                    bvrbVar2.b(new Runnable(bwptVar) { // from class: bwps
                        private final bwpt a;

                        {
                            this.a = bwptVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    }, bvrjVar);
                }
            }
        });
    }

    @Override // defpackage.bwod
    public bwof a() {
        return null;
    }
}
