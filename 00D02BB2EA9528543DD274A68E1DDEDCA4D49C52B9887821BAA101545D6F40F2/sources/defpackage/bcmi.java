package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcmi  reason: default package */
/* loaded from: classes3.dex */
final class bcmi implements View.OnAttachStateChangeListener {
    final /* synthetic */ bcmj a;
    private final View.OnAttachStateChangeListener b;

    public bcmi(bcmj bcmjVar) {
        this.a = bcmjVar;
        this.b = bcmjVar.a.b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.onViewAttachedToWindow(view);
        bcmj bcmjVar = this.a;
        view.setOnTouchListener(bcmjVar.b.a(bcmjVar.c()));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.onViewDetachedFromWindow(view);
        view.setOnTouchListener(null);
    }
}
