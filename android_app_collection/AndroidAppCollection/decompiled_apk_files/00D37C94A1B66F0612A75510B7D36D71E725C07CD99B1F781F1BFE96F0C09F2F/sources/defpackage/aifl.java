package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aifl  reason: default package */
/* loaded from: classes.dex */
public final class aifl implements View.OnAttachStateChangeListener {
    final /* synthetic */ aifm a;

    public aifl(aifm aifmVar) {
        this.a = aifmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aifm aifmVar = this.a;
        aifmVar.b.removeCallbacks(aifmVar.g);
    }
}
