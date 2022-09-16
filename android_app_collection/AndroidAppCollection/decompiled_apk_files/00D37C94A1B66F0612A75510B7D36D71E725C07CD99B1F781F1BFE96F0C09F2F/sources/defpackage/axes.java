package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axes  reason: default package */
/* loaded from: classes2.dex */
public final class axes extends OrientationEventListener {
    final /* synthetic */ axeu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axes(axeu axeuVar, Context context) {
        super(context);
        this.a = axeuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        axeu axeuVar = this.a;
        axeuVar.a = i;
        if (axeuVar.b) {
            if (!axeu.d(i)) {
                Math.abs(i - 90);
                return;
            } else {
                this.a.f(false);
                return;
            }
        }
        axeuVar.a();
    }
}
