package defpackage;

import android.view.View;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: aeap  reason: default package */
/* loaded from: classes2.dex */
final class aeap implements cqfk {
    final /* synthetic */ aeat a;

    public aeap(aeat aeatVar) {
        this.a = aeatVar;
    }

    @Override // defpackage.cqfk
    public final void a(View view) {
        onViewDetachedFromWindow(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aeat aeatVar = this.a;
        bvrj.UI_THREAD.c();
        aeatVar.c.add(view);
        ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getSize(aeatVar.f);
        view.getViewTreeObserver().addOnPreDrawListener(aeatVar.k);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a(view, false);
        this.a.c.remove(view);
    }
}
