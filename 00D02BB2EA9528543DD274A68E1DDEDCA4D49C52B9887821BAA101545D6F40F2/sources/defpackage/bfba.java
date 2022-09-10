package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfba  reason: default package */
/* loaded from: classes3.dex */
public final class bfba implements View.OnAttachStateChangeListener {
    final /* synthetic */ bfbb a;
    @dzsi
    private ViewTreeObserver.OnGlobalLayoutListener b;

    public bfba(bfbb bfbbVar) {
        this.a = bfbbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = new bfaz(this, view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.b;
        dbsk.s(onGlobalLayoutListener);
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.b;
        dbsk.s(onGlobalLayoutListener);
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
