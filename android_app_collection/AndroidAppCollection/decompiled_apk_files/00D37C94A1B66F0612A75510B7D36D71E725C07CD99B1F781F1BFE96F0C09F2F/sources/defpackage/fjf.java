package defpackage;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
/* compiled from: PG */
/* renamed from: fjf  reason: default package */
/* loaded from: classes3.dex */
public final class fjf implements tct {
    public final srw a;
    private final ActiveStateLifecycleController b;

    public fjf(srw srwVar, ActiveStateLifecycleController activeStateLifecycleController, fxk fxkVar) {
        this.a = srwVar;
        this.b = activeStateLifecycleController;
        activeStateLifecycleController.c.add(fxkVar);
    }

    @Override // defpackage.tct
    public final aooq a() {
        return asvo.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        fxr fxrVar;
        asvo asvoVar = (asvo) obj;
        int i = asvoVar.c;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return aynr.f();
        }
        if (asvoVar.g) {
            return aynr.t(new fje(this, asvoVar, tcsVar, 1));
        }
        ActiveStateLifecycleController activeStateLifecycleController = this.b;
        int d = aqvb.d(asvoVar.d);
        if (d == 0 || d != 2) {
            fxrVar = fxr.INACTIVE;
        } else {
            fxrVar = fxr.ACTIVE;
        }
        return activeStateLifecycleController.g(fxrVar).o(new fje(this, asvoVar, tcsVar));
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
