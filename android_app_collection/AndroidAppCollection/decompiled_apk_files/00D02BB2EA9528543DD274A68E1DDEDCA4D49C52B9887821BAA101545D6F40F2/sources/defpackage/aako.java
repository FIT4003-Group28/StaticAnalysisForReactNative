package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: aako  reason: default package */
/* loaded from: classes2.dex */
final class aako implements ViewTreeObserver.OnGlobalLayoutListener {
    private final aazp a;
    private final View b;

    public aako(aazp aazpVar, View view) {
        this.a = aazpVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.a.a()) {
            return;
        }
        this.a.b();
    }
}
