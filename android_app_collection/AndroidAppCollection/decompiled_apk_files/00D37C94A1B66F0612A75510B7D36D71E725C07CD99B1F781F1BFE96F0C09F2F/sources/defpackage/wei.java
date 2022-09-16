package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: wei  reason: default package */
/* loaded from: classes4.dex */
final class wei implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ wek a;

    public wei(wek wekVar) {
        this.a = wekVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        aarw aarwVar;
        if (this.a.a.getVisibility() == 0) {
            wek wekVar = this.a;
            if (wekVar.c || (aarwVar = wekVar.b) == null || !aarwVar.o()) {
                return;
            }
            this.a.a.requestFocus();
            this.a.a.sendAccessibilityEvent(8);
            this.a.c = true;
        }
    }
}
