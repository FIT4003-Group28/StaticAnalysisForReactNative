package defpackage;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
/* compiled from: PG */
/* renamed from: fxn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fxn implements aniq {
    public final /* synthetic */ ActiveStateLifecycleController a;
    public final /* synthetic */ fxr b;
    private final /* synthetic */ int c;

    public /* synthetic */ fxn(ActiveStateLifecycleController activeStateLifecycleController, fxr fxrVar) {
        this.a = activeStateLifecycleController;
        this.b = fxrVar;
    }

    public /* synthetic */ fxn(ActiveStateLifecycleController activeStateLifecycleController, fxr fxrVar, int i) {
        this.c = i;
        this.a = activeStateLifecycleController;
        this.b = fxrVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        if (this.c == 0) {
            this.a.h(this.b);
            return ankq.a;
        }
        ActiveStateLifecycleController activeStateLifecycleController = this.a;
        return anlz.v(new fxn(activeStateLifecycleController, this.b), activeStateLifecycleController.a);
    }
}
