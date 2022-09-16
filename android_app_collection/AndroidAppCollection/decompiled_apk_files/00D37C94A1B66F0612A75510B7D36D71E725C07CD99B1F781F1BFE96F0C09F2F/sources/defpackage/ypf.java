package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ypf  reason: default package */
/* loaded from: classes4.dex */
public final class ypf {
    public final apu a;

    public ypf(apu apuVar) {
        apuVar.getClass();
        this.a = apuVar;
    }

    public static void e(Runnable runnable) {
        if (ylr.e()) {
            runnable.run();
        } else {
            aypa.a().f(runnable);
        }
    }

    private final void h(ype ypeVar, Callable callable) {
        callable.getClass();
        b(ypeVar).az(new ypc(callable));
    }

    public final aynr a() {
        return d().h();
    }

    public final ayoi b(final ype ypeVar) {
        return d().V(new ayqe() { // from class: yoy
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                return Boolean.valueOf(((ype) obj).ordinal() >= ype.this.ordinal());
            }
        }).B();
    }

    public final ayoi c() {
        return b(ype.STARTED);
    }

    public final ayoi d() {
        return ayoi.w(new ayoj() { // from class: yow
            @Override // defpackage.ayoj
            public final void a(final azeh azehVar) {
                final ypf ypfVar = ypf.this;
                ypf.e(new Runnable() { // from class: ypa
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ypf ypfVar2 = ypf.this;
                        final azeh azehVar2 = azehVar;
                        final Runnable runnable = new Runnable() { // from class: ypb
                            @Override // java.lang.Runnable
                            public final void run() {
                                azeh azehVar3 = azeh.this;
                                if (!azehVar3.e()) {
                                    azehVar3.c();
                                }
                            }
                        };
                        if (ypfVar2.a.a() == apt.DESTROYED) {
                            runnable.run();
                            return;
                        }
                        final zdt zdtVar = new zdt() { // from class: yov
                            @Override // defpackage.zdt
                            public final void a(Object obj) {
                                azeh azehVar3 = azeh.this;
                                ype ypeVar = (ype) obj;
                                if (!azehVar3.e()) {
                                    azehVar3.a(ypeVar);
                                }
                            }
                        };
                        final f fVar = new f() { // from class: com.google.android.libraries.youtube.common.lifecycle.rx.RxLifecycle$2
                            @Override // defpackage.f, defpackage.g
                            public final void kG(apy apyVar) {
                                zdt.this.a(ype.RESUMED);
                            }

                            @Override // defpackage.f, defpackage.g
                            public final void lc(apy apyVar) {
                                zdt.this.a(ype.CREATED);
                            }

                            @Override // defpackage.f, defpackage.g
                            public final void ld(apy apyVar) {
                                runnable.run();
                            }

                            @Override // defpackage.g
                            public final void nA(apy apyVar) {
                                zdt.this.a(ype.CREATED);
                            }

                            @Override // defpackage.g
                            public final void nv(apy apyVar) {
                                zdt.this.a(ype.STARTED);
                            }

                            @Override // defpackage.f, defpackage.g
                            public final void nz(apy apyVar) {
                                zdt.this.a(ype.STARTED);
                            }
                        };
                        ayqi.f(azehVar2, banl.n(new aypv() { // from class: yox
                            @Override // defpackage.aypv
                            public final void a() {
                                final ypf ypfVar3 = ypf.this;
                                final apx apxVar = fVar;
                                ypf.e(new Runnable() { // from class: yoz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ypf ypfVar4 = ypf.this;
                                        ypfVar4.a.e(apxVar);
                                    }
                                });
                            }
                        }));
                        ypfVar2.a.c(fVar);
                    }
                });
            }
        });
    }

    public final void f(Callable callable) {
        h(ype.CREATED, callable);
    }

    public final void g(Callable callable) {
        h(ype.RESUMED, callable);
    }
}
