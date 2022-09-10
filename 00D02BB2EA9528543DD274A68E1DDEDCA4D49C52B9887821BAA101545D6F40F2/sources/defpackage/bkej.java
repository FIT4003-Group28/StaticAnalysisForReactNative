package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: bkej  reason: default package */
/* loaded from: classes3.dex */
final class bkej implements View.OnAttachStateChangeListener {
    final /* synthetic */ bkem a;

    public bkej(bkem bkemVar) {
        this.a = bkemVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof AutoCompleteTextView) {
            bkem bkemVar = this.a;
            bkemVar.f = (AutoCompleteTextView) view;
            bkemVar.f.setImeOptions(268435459);
            this.a.f.setThreshold(1);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jmw.d(this.a.a, null);
        this.a.f = null;
    }
}
