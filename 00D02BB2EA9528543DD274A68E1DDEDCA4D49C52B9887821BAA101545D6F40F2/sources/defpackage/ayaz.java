package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayaz  reason: default package */
/* loaded from: classes3.dex */
public final class ayaz implements View.OnAttachStateChangeListener {
    final /* synthetic */ axwo a;
    final /* synthetic */ ilo b;

    public ayaz(axwo axwoVar, ilo iloVar) {
        this.a = axwoVar;
        this.b = iloVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.setAccessibilityDelegate(new ayba(this.a, this.b));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.setAccessibilityDelegate(null);
    }
}
