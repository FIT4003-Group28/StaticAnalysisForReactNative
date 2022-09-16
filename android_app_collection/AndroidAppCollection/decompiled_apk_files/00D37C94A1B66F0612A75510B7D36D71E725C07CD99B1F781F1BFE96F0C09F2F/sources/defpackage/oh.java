package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oh  reason: default package */
/* loaded from: classes3.dex */
public final class oh extends lp {
    final /* synthetic */ ot a;

    public oh(ot otVar) {
        this.a = otVar;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void a(View view) {
        this.a.k.setAlpha(1.0f);
        this.a.n.f(null);
        this.a.n = null;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void c() {
        this.a.k.setVisibility(0);
        this.a.k.sendAccessibilityEvent(32);
        if (this.a.k.getParent() instanceof View) {
            lj.K((View) this.a.k.getParent());
        }
    }
}
