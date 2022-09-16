package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xsh  reason: default package */
/* loaded from: classes4.dex */
final class xsh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ xsi a;

    public xsh(xsi xsiVar) {
        this.a = xsiVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        xsi xsiVar = this.a;
        View view = xsiVar.f;
        int i = xsiVar.g;
        yce.f(view, i, 0, i, 0);
        this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
