package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ru  reason: default package */
/* loaded from: classes4.dex */
public final class ru implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ rz a;

    public ru(rz rzVar) {
        this.a = rzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.u() || this.a.b.size() <= 0 || ((ry) this.a.b.get(0)).a.o) {
            return;
        }
        View view = this.a.d;
        if (view == null || !view.isShown()) {
            this.a.k();
            return;
        }
        for (ry ryVar : this.a.b) {
            ryVar.a.s();
        }
    }
}
