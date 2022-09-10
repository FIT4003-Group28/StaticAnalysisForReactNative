package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rj  reason: default package */
/* loaded from: classes.dex */
public final class rj extends ok {
    final /* synthetic */ rv a;

    public rj(rv rvVar) {
        this.a = rvVar;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void b() {
        this.a.n.setAlpha(1.0f);
        this.a.q.f(null);
        this.a.q = null;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void c() {
        this.a.n.setVisibility(0);
        this.a.n.sendAccessibilityEvent(32);
        if (this.a.n.getParent() instanceof View) {
            od.L((View) this.a.n.getParent());
        }
    }
}
