package defpackage;

import java.util.EnumSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tno  reason: default package */
/* loaded from: classes7.dex */
public final class tno implements ymm, vxn {
    public final dxio<toz> a;
    public final Executor b;
    public final dxio<akfa> c;
    private final qef d;

    public tno(dxio<akfa> dxioVar, Executor executor, Executor executor2, final qef qefVar, dxio<toz> dxioVar2) {
        this.c = dxioVar;
        this.b = dehx.b(executor2);
        this.d = qefVar;
        this.a = dxioVar2;
        executor.execute(new Runnable(this, qefVar) { // from class: tnk
            private final tno a;
            private final qef b;

            {
                this.a = this;
                this.b = qefVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final tno tnoVar = this.a;
                crzm<qee> b = this.b.b();
                if (b != null) {
                    b.a(new crzp(tnoVar) { // from class: tnn
                        private final tno a;

                        {
                            this.a = tnoVar;
                        }

                        @Override // defpackage.crzp
                        public final void On(crzm crzmVar) {
                            tno tnoVar2 = this.a;
                            if (crzmVar.l() == qee.ENABLED) {
                                final btlu j = tnoVar2.c.a().j();
                                if (j == null) {
                                    j = btlu.b;
                                }
                                final toz a = tnoVar2.a.a();
                                a.a.execute(new Runnable(a, j) { // from class: toq
                                    private final toz a;
                                    private final btlu b;

                                    {
                                        this.a = a;
                                        this.b = j;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        toz tozVar = this.a;
                                        btlu btluVar = this.b;
                                        tog l = tozVar.c(btluVar).l();
                                        dbsk.s(l);
                                        tog a2 = tozVar.b.a(btluVar);
                                        tof d = l.d();
                                        d.f(a2.b());
                                        d.g(a2.c());
                                        tozVar.d(btluVar, d.d());
                                    }
                                });
                            }
                        }
                    }, tnoVar.b);
                }
            }
        });
    }

    @Override // defpackage.ymm
    public final void a(final btlu btluVar, final yiv yivVar) {
        if (this.d.a()) {
            this.b.execute(new Runnable(this, btluVar, yivVar) { // from class: tnl
                private final tno a;
                private final btlu b;
                private final yiv c;

                {
                    this.a = this;
                    this.b = btluVar;
                    this.c = yivVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    tno tnoVar = this.a;
                    btlu btluVar2 = this.b;
                    yiv yivVar2 = this.c;
                    tog l = tnoVar.a.a().c(btluVar2).l();
                    dbsk.s(l);
                    tof d = l.d();
                    d.g(tnj.b(yivVar2));
                    yiu yiuVar = yivVar2.c;
                    if (yiuVar == null) {
                        yiuVar = yiu.c;
                    }
                    if ((yiuVar.a & 1) != 0) {
                        yiu yiuVar2 = yivVar2.c;
                        if (yiuVar2 == null) {
                            yiuVar2 = yiu.c;
                        }
                        dqvb b = dqvb.b(yiuVar2.b);
                        if (b == null) {
                            b = dqvb.TRANSIT_BEST;
                        }
                        if (b == dqvb.TRANSIT_PREFER_ACCESSIBLE) {
                            d.i(tob.WHEELCHAIR_ACCESSIBLE, true);
                            tnoVar.a.a().d(btluVar2, d.d());
                        }
                    }
                    d.i(tob.WHEELCHAIR_ACCESSIBLE, false);
                    tnoVar.a.a().d(btluVar2, d.d());
                }
            });
        }
    }

    @Override // defpackage.vxn
    public final void b(final btlu btluVar, final EnumSet<vux> enumSet) {
        if (this.d.a()) {
            this.b.execute(new Runnable(this, btluVar, enumSet) { // from class: tnm
                private final tno a;
                private final btlu b;
                private final EnumSet c;

                {
                    this.a = this;
                    this.b = btluVar;
                    this.c = enumSet;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    tno tnoVar = this.a;
                    btlu btluVar2 = this.b;
                    EnumSet enumSet2 = this.c;
                    tog l = tnoVar.a.a().c(btluVar2).l();
                    dbsk.s(l);
                    tof d = l.d();
                    d.f(tnj.a(enumSet2));
                    tnoVar.a.a().d(btluVar2, d.d());
                }
            });
        }
    }
}
