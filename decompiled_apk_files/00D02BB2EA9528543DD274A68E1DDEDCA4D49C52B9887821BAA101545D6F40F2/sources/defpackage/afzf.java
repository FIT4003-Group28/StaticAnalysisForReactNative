package defpackage;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afzf  reason: default package */
/* loaded from: classes2.dex */
public final class afzf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ afzm a;

    public afzf(afzm afzmVar) {
        this.a = afzmVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.at.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.at.n(0);
    }
}
