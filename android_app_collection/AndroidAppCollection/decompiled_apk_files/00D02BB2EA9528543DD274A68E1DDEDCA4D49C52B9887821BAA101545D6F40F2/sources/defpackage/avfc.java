package defpackage;
/* compiled from: PG */
/* renamed from: avfc  reason: default package */
/* loaded from: classes2.dex */
final class avfc implements crzp<awme> {
    final /* synthetic */ avfd a;
    private awme b = awme.c;

    public avfc(avfd avfdVar) {
        this.a = avfdVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<awme> crzmVar) {
        avfa M = this.a.M();
        awme e = this.a.g.e();
        final avel b = ((avag) M).a.b();
        if (b != null) {
            if (this.b.b() != 0 || e.b() <= 0) {
                if (this.b.c() > 0 && e.c() == 0 && !b.k()) {
                    b.g.Pk(new Runnable(b) { // from class: avdu
                        private final avel a;

                        {
                            this.a = b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dlrq b2;
                            avfn a = this.a.e.a();
                            avbe avbeVar = a.a;
                            avol avolVar = a.c;
                            try {
                                b2 = (dlrq) dsqw.cq(dlrq.q, avolVar.c.h(avolVar.b));
                            } catch (Exception e2) {
                                avolVar.a("shutdown", e2);
                                b2 = avol.b();
                            }
                            avbeVar.a(b2);
                            a.e.b();
                        }
                    }, b.i);
                }
            } else {
                this.a.a(M, e);
            }
        }
        this.b = e;
    }
}
