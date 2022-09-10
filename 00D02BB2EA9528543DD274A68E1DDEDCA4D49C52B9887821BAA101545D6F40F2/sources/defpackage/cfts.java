package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfts  reason: default package */
/* loaded from: classes4.dex */
final class cfts {
    final /* synthetic */ cftt a;
    final /* synthetic */ cfuk b;

    public cfts(cftt cfttVar, cfuk cfukVar) {
        this.a = cfttVar;
        this.b = cfukVar;
    }

    public final void a() {
        cftt cfttVar = this.a;
        cfttVar.e.set(!cfttVar.a.a().h().b());
        cftt cfttVar2 = this.a;
        arag aragVar = cfttVar2.d;
        boolean z = cfttVar2.e.get();
        final cfuk cfukVar = this.b;
        aragVar.f(!z, new arae(this, cfukVar) { // from class: cftq
            private final cfts a;
            private final cfuk b;

            {
                this.a = this;
                this.b = cfukVar;
            }

            @Override // defpackage.arae
            public final void a(araf arafVar) {
                cfts cftsVar = this.a;
                cfuk cfukVar2 = this.b;
                cftt cfttVar3 = cftsVar.a;
                boolean a = cfttVar3.a.a().h().a();
                boolean z2 = false;
                if (cfttVar3.e.compareAndSet(!a, a) && a) {
                    z2 = true;
                }
                if (arafVar.j || z2) {
                    Executor executor = cfttVar3.b;
                    cfukVar2.getClass();
                    executor.execute(new Runnable(cfukVar2) { // from class: cftn
                        private final cfuk a;

                        {
                            this.a = cfukVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cfuk cfukVar3 = this.a;
                            cfukVar3.a.a.a().t(7);
                            cfukVar3.a.a.a().l(aesa.WRITE_REVIEW, bzwi.c(blpk.CONTRIBUTE_TAB_TOP_ACTION));
                        }
                    });
                } else if (arafVar.equals(araf.NO_LOCATION_DEVICE)) {
                    Executor executor2 = cfttVar3.b;
                    cfukVar2.getClass();
                    executor2.execute(new Runnable(cfukVar2) { // from class: cfto
                        private final cfuk a;

                        {
                            this.a = cfukVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a();
                        }
                    });
                } else {
                    Executor executor3 = cfttVar3.b;
                    cfukVar2.getClass();
                    executor3.execute(new Runnable(cfukVar2) { // from class: cftp
                        private final cfuk a;

                        {
                            this.a = cfukVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a();
                        }
                    });
                }
            }
        });
    }
}
