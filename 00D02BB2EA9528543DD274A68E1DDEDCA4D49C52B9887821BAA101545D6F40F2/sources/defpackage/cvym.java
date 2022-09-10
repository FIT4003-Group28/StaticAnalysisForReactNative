package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cvym  reason: default package */
/* loaded from: classes.dex */
public final class cvym implements View.OnAttachStateChangeListener {
    final /* synthetic */ cvyo a;

    public cvym(cvyo cvyoVar) {
        this.a = cvyoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a.a.a().a) {
            cvyo cvyoVar = this.a;
            cvyoVar.b(cvyoVar.a.a().e());
        }
        this.a.b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
