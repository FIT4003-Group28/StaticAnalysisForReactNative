package com.google.android.apps.youtube.app.common.ui.navigation;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaneFragmentOrientationLocker implements f {
    public final gcc a;
    public Object b;
    private final gbu c;
    private aypg d;

    public PaneFragmentOrientationLocker(gbu gbuVar, gcc gccVar) {
        this.c = gbuVar;
        this.a = gccVar;
    }

    public final void g() {
        Object obj = this.b;
        if (obj != null) {
            this.a.d(obj);
            this.b = null;
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.d = null;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        this.d = this.c.b().af(gam.c).B().C(new aypv() { // from class: gbe
            @Override // defpackage.aypv
            public final void a() {
                PaneFragmentOrientationLocker.this.g();
            }
        }).as(new ayqb() { // from class: gbf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final PaneFragmentOrientationLocker paneFragmentOrientationLocker = PaneFragmentOrientationLocker.this;
                paneFragmentOrientationLocker.g();
                ((Optional) obj).ifPresent(new Consumer() { // from class: gbg
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj2) {
                        PaneFragmentOrientationLocker paneFragmentOrientationLocker2 = PaneFragmentOrientationLocker.this;
                        paneFragmentOrientationLocker2.b = paneFragmentOrientationLocker2.a.c(((gcb) obj2).d);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return consumer.getClass();
                    }
                });
            }
        });
    }
}
