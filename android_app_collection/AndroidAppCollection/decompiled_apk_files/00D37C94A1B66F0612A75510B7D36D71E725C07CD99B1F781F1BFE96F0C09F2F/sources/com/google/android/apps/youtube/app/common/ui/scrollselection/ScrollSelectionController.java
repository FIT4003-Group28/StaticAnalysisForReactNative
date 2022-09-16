package com.google.android.apps.youtube.app.common.ui.scrollselection;

import android.util.Pair;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScrollSelectionController implements ajrv, f {
    public ges a;
    protected View b;
    private final WeakHashMap c = new WeakHashMap();
    private final WeakHashMap d = new WeakHashMap();
    private boolean e;
    private WeakReference f;
    private WeakReference g;
    private WeakReference h;
    private aypg i;

    private final View q() {
        WeakReference weakReference = this.h;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    private final geq r() {
        WeakReference weakReference = this.g;
        if (weakReference == null) {
            return null;
        }
        return (geq) weakReference.get();
    }

    private final void s() {
        l(null);
        this.g = null;
        this.h = null;
    }

    protected ges g(ger gerVar) {
        return new ges(this.b, gerVar);
    }

    public void h(ger gerVar) {
        aypg aypgVar = this.i;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.i);
        }
        geq r = r();
        if (r != null) {
            this.i = r.oI(0).Q();
        }
        View q = q();
        ges gesVar = this.a;
        if (gesVar != null && q != null) {
            gesVar.e(q);
        }
        s();
        if (gerVar == null) {
            this.a = null;
            this.f = null;
            return;
        }
        ges gesVar2 = (ges) this.c.get(gerVar);
        this.a = gesVar2;
        if (gesVar2 == null) {
            ges g = g(gerVar);
            this.a = g;
            this.c.put(gerVar, g);
        }
        this.f = new WeakReference(gerVar.l());
        gerVar.k().post(new mcm(this, 1));
    }

    public final void i(View view, geq geqVar) {
        this.d.put(view, new WeakReference(geqVar));
        ges gesVar = this.a;
        if (gesVar != null) {
            gesVar.a.put(view, 0);
        }
    }

    public final void j() {
        ges gesVar = this.a;
        if (gesVar == null) {
            return;
        }
        p(gesVar.d(true), true, false);
    }

    public final void k(View view) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b = view;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l(Integer num) {
        mco mcoVar;
        WeakReference weakReference = this.f;
        if (weakReference == null || (mcoVar = (mco) weakReference.get()) == null) {
            return;
        }
        mcoVar.a.b = num;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.ajrv
    public final void m(ajru ajruVar, Object obj) {
        if (ajruVar instanceof geq) {
            i(ajruVar.a(), (geq) ajruVar);
        }
    }

    public final void n(View view) {
        this.d.remove(view);
        ges gesVar = this.a;
        if (gesVar != null) {
            gesVar.a.remove(view);
        }
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.i;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.i);
        }
        s();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    public final void o() {
        ges gesVar = this.a;
        if (gesVar == null) {
            return;
        }
        p(gesVar.d(false), false, false);
    }

    public final void p(final Pair pair, boolean z, boolean z2) {
        View view = (View) pair.first;
        WeakReference weakReference = (WeakReference) this.d.get(view);
        geq geqVar = weakReference == null ? null : (geq) weakReference.get();
        geq r = r();
        if (z || geqVar == null || !geqVar.oJ(r)) {
            aypg aypgVar = this.i;
            if (aypgVar != null && !aypgVar.e()) {
                ayqi.c((AtomicReference) this.i);
            }
            aynr f = aynr.f();
            if (r != null && !r.oJ(geqVar)) {
                View q = q();
                ges gesVar = this.a;
                if (gesVar != null && q != null) {
                    gesVar.e(q);
                }
                l(null);
                f = f.c(r.oI(0));
            }
            if (geqVar != null) {
                int i = 1;
                if (true == z2) {
                    i = 2;
                }
                f = f.c(geqVar.oI(i).o(new aypv() { // from class: geo
                    @Override // defpackage.aypv
                    public final void a() {
                        ScrollSelectionController scrollSelectionController = ScrollSelectionController.this;
                        Pair pair2 = pair;
                        ges gesVar2 = scrollSelectionController.a;
                        if (gesVar2 != null) {
                            View view2 = (View) pair2.first;
                            ylr.c();
                            if (gesVar2.a.containsKey(view2)) {
                                String.valueOf(String.valueOf(view2)).length();
                                gesVar2.a.put(view2, 2);
                            }
                        }
                        scrollSelectionController.l((Integer) pair2.second);
                    }
                }));
            }
            this.i = f.q(new ayqb() { // from class: gep
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ScrollSelectionController.this.l(null);
                }
            }).p(new aypv() { // from class: gen
                @Override // defpackage.aypv
                public final void a() {
                    ScrollSelectionController.this.l(null);
                }
            }).Q();
            this.g = new WeakReference(geqVar);
            this.h = new WeakReference(view);
        }
    }
}
