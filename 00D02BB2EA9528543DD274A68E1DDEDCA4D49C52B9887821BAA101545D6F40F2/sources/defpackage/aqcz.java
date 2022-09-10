package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aqcz  reason: default package */
/* loaded from: classes2.dex */
public final class aqcz {
    public final dxio<aqav> a;
    public final dxio<akfa> b;
    public final aqbz c;
    public final Executor d;
    public final btvo e;
    public final dxio<bvow> f;
    public final bvjj g;
    private final dxio<aqbv> h;
    private final bvrb i;

    public aqcz(dxio<aqav> dxioVar, dxio<aqbv> dxioVar2, dxio<akfa> dxioVar3, aqbz aqbzVar, Executor executor, btvo btvoVar, bvrb bvrbVar, dxio<bvow> dxioVar4, bvjj bvjjVar) {
        this.a = dxioVar;
        this.h = dxioVar2;
        this.b = dxioVar3;
        this.c = aqbzVar;
        this.d = executor;
        this.e = btvoVar;
        this.i = bvrbVar;
        this.f = dxioVar4;
        this.g = bvjjVar;
    }

    public final void a(final ctyy ctyyVar) {
        final dehn g = deew.g(this.h.a().a(ctyyVar), new defg(this, ctyyVar) { // from class: aqcu
            private final aqcz a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final aqcz aqczVar = this.a;
                final ctyy ctyyVar2 = this.b;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar == null || !dbsgVar.a() || !aqczVar.g.o(bvjk.bl, (btlu) dbsgVar.b(), false)) {
                    cuss<dcdc<cufp>> s = aqczVar.a.a().c().s(ctyyVar2, 1, 1);
                    final deig d = deig.d();
                    s.k(new cusr(aqczVar, d, ctyyVar2) { // from class: aqcv
                        private final aqcz a;
                        private final deig b;
                        private final ctyy c;

                        {
                            this.a = aqczVar;
                            this.b = d;
                            this.c = ctyyVar2;
                        }

                        @Override // defpackage.cusr
                        public final void a(Object obj2) {
                            aqcz aqczVar2 = this.a;
                            deig deigVar = this.b;
                            ctyy ctyyVar3 = this.c;
                            dcdc dcdcVar = (dcdc) obj2;
                            if (dcdcVar.isEmpty()) {
                                deigVar.j(false);
                                return;
                            }
                            final int i = aqczVar2.e.getBusinessMessagingParameters().b;
                            aqbz aqbzVar = aqczVar2.c;
                            ConversationId a = ((cufp) dcdcVar.get(0)).a();
                            dbsl dbslVar = new dbsl(i) { // from class: aqcw
                                private final int a;

                                {
                                    this.a = i;
                                }

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj3) {
                                    int i2 = this.a;
                                    cugu cuguVar = (cugu) obj3;
                                    if (cuguVar == null) {
                                        return false;
                                    }
                                    long convert = TimeUnit.SECONDS.convert(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - cuguVar.d().longValue(), TimeUnit.MICROSECONDS);
                                    return convert >= 0 && convert <= ((long) i2);
                                }
                            };
                            cuss<dcdc<cugu>> e = aqbzVar.a.a().c().e(ctyyVar3, a, 1, 0, cugt.e);
                            aqbzVar.b.a();
                            deigVar.p(deew.h(deew.h(aqbv.c(e), new dbrn(dbslVar) { // from class: aqby
                                private final dbsl a;

                                {
                                    this.a = dbslVar;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj3) {
                                    return dcdc.q(dcft.i((dcdc) obj3, this.a));
                                }
                            }, dege.a), aqcx.a, dege.a));
                        }
                    });
                    return d;
                }
                aqczVar.g.T(bvjk.bl, (btlu) dbsgVar.b(), false);
                return deha.a(true);
            }
        }, this.d);
        deha.m(g).b(new Callable(this, g, ctyyVar) { // from class: aqcq
            private final aqcz a;
            private final dehn b;
            private final ctyy c;

            {
                this.a = this;
                this.b = g;
                this.c = ctyyVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                aqcz aqczVar = this.a;
                dehn dehnVar = this.b;
                ctyy ctyyVar2 = this.c;
                if (Boolean.TRUE.equals(deha.s(dehnVar))) {
                    aqczVar.b(ctyyVar2);
                }
                return new Object();
            }
        }, this.d);
    }

    public final void b(final ctyy ctyyVar) {
        this.i.b(new Runnable(this, ctyyVar) { // from class: aqcr
            private final aqcz a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final aqcz aqczVar = this.a;
                final ctyy ctyyVar2 = this.b;
                try {
                    boolean a = aqczVar.f.a().a();
                    dbsg<String> a2 = ctyyVar2.b().a();
                    if (!a2.a()) {
                        return;
                    }
                    if (!a2.b().equals(aqczVar.b.a().o()) || !a) {
                        aqczVar.c(ctyyVar2);
                        return;
                    }
                    final dehn<Boolean> a3 = aqczVar.a.a().a().a(ctyyVar2, 1);
                    deha.m(a3).b(new Callable(aqczVar, a3, ctyyVar2) { // from class: aqct
                        private final aqcz a;
                        private final dehn b;
                        private final ctyy c;

                        {
                            this.a = aqczVar;
                            this.b = a3;
                            this.c = ctyyVar2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            aqcz aqczVar2 = this.a;
                            dehn dehnVar = this.b;
                            ctyy ctyyVar3 = this.c;
                            csuk c = aqczVar2.a.a().c();
                            if (Boolean.TRUE.equals(deha.s(dehnVar))) {
                                dcdc f = dcdc.f(ctyyVar3);
                                dkht businessMessagingParameters = aqczVar2.e.getBusinessMessagingParameters();
                                c.k(f, aqda.c(ctyyVar3) ? businessMessagingParameters.d : businessMessagingParameters.c);
                            } else {
                                c.n(ctyyVar3);
                            }
                            return new Object();
                        }
                    }, aqczVar.d);
                } catch (bvov unused) {
                    aqczVar.c(ctyyVar2);
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    public final void c(ctyy ctyyVar) {
        deha.q(this.h.a().a(ctyyVar), bvqj.b(new bvqg(this) { // from class: aqcy
            private final aqcz a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                aqcz aqczVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    aqczVar.g.T(bvjk.bl, (btlu) dbsgVar.b(), true);
                }
            }
        }), this.d);
    }
}
