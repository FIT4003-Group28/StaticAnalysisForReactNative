package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: ahyj  reason: default package */
/* loaded from: classes.dex */
final class ahyj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ahym a;

    public ahyj(ahym ahymVar) {
        this.a = ahymVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.m()) {
            return;
        }
        this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.a(64);
        if (!this.a.h(2) && !this.a.h(4)) {
            return;
        }
        this.a.d();
    }
}
