package defpackage;

import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lw  reason: default package */
/* loaded from: classes3.dex */
public class lw extends lv {
    private gz c;

    public lw(mb mbVar, WindowInsets windowInsets) {
        super(mbVar, windowInsets);
        this.c = null;
    }

    @Override // defpackage.ma
    public final gz j() {
        if (this.c == null) {
            this.c = gz.d(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.ma
    public final mb k() {
        return mb.q(this.a.consumeStableInsets());
    }

    @Override // defpackage.ma
    public final mb l() {
        return mb.q(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.ma
    public void m(gz gzVar) {
        this.c = gzVar;
    }

    @Override // defpackage.ma
    public final boolean n() {
        return this.a.isConsumed();
    }
}
