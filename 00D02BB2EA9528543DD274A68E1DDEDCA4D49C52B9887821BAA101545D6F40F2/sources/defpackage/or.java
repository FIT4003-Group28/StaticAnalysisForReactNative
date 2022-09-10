package defpackage;

import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: or  reason: default package */
/* loaded from: classes7.dex */
public class or extends oq {
    private kd b;

    public or(ow owVar, WindowInsets windowInsets) {
        super(owVar, windowInsets);
        this.b = null;
    }

    @Override // defpackage.ov
    public final boolean f() {
        return this.a.isConsumed();
    }

    @Override // defpackage.ov
    public final ow g() {
        return ow.a(this.a.consumeStableInsets());
    }

    @Override // defpackage.ov
    public final ow h() {
        return ow.a(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.ov
    public final kd i() {
        if (this.b == null) {
            this.b = kd.a(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
        }
        return this.b;
    }
}
