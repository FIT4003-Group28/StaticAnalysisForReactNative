package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: unr  reason: default package */
/* loaded from: classes4.dex */
final class unr implements View.OnAttachStateChangeListener {
    final /* synthetic */ ExpressSignInLayout a;

    public unr(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.h(aouq.PRESENTED_COMPONENT_EVENT);
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
