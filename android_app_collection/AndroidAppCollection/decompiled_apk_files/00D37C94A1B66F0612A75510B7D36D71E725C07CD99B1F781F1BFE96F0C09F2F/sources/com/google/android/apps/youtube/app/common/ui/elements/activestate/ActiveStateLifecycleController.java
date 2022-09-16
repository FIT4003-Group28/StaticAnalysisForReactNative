package com.google.android.apps.youtube.app.common.ui.elements.activestate;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActiveStateLifecycleController implements f {
    public final Executor a;
    public final ArrayList b;
    public final List c;
    public final dt d;
    public aypg e;
    private final zhd f = zhd.a(fxm.a);
    private fxr g;
    private azpo h;

    public ActiveStateLifecycleController(Executor executor, dt dtVar) {
        executor.getClass();
        this.a = executor;
        this.d = dtVar;
        this.c = Collections.synchronizedList(new ArrayList());
        this.b = new ArrayList();
        this.g = fxr.INACTIVE;
    }

    public final aynr g(final fxr fxrVar) {
        String.valueOf(String.valueOf(fxrVar)).length();
        if (i()) {
            zep.c("Could not transition, request is blocked %s", this.b.toString());
        }
        for (fxk fxkVar : this.c) {
            this.b.add(fxkVar);
            fxl fxlVar = new fxl(this, fxkVar, fxrVar);
            if (fxrVar != fxr.ACTIVE || eog.Z(fxkVar.b) <= 0) {
                fxkVar.a();
            } else {
                fxkVar.a();
                fxkVar.a.sendEmptyMessageDelayed(153535, eog.Z(fxkVar.b));
                fxkVar.c = fxlVar;
                if (!fxrVar.equals(fxr.INACTIVE)) {
                    String.valueOf(String.valueOf(fxkVar)).length();
                }
            }
            j(fxkVar);
        }
        if (!i()) {
            this.a.execute(new Runnable() { // from class: fxp
                @Override // java.lang.Runnable
                public final void run() {
                    ActiveStateLifecycleController.this.h(fxrVar);
                }
            });
        }
        this.h = azpo.W();
        if (fxrVar.equals(fxr.INACTIVE)) {
            return aynr.f();
        }
        return this.h.p(new aypv() { // from class: fxo
            @Override // defpackage.aypv
            public final void a() {
                ActiveStateLifecycleController.this.b.clear();
            }
        });
    }

    public final void h(fxr fxrVar) {
        azpo azpoVar;
        fxr fxrVar2 = this.g;
        this.g = fxrVar;
        String valueOf = String.valueOf(fxrVar2);
        String valueOf2 = String.valueOf(this.g);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        this.f.b(fxq.a(fxrVar2, this.g));
        if (fxrVar != fxr.ACTIVE || (azpoVar = this.h) == null) {
            return;
        }
        azpoVar.sm();
    }

    public final boolean i() {
        return !this.b.isEmpty();
    }

    public final void j(fxk fxkVar) {
        this.b.remove(fxkVar);
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
        aypg aypgVar = this.e;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.e);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
