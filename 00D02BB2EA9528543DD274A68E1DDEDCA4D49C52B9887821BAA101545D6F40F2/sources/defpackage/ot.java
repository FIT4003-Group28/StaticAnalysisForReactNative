package defpackage;

import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ot  reason: default package */
/* loaded from: classes7.dex */
public class ot extends os {
    private kd b;
    private kd e;

    public ot(ow owVar, WindowInsets windowInsets) {
        super(owVar, windowInsets);
        this.b = null;
        this.e = null;
    }

    @Override // defpackage.oq, defpackage.ov
    public final ow c(int i, int i2, int i3, int i4) {
        return ow.a(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.ov
    public final kd l() {
        if (this.b == null) {
            this.b = kd.c(this.a.getSystemGestureInsets());
        }
        return this.b;
    }

    @Override // defpackage.ov
    public final kd m() {
        if (this.e == null) {
            this.e = kd.c(this.a.getMandatorySystemGestureInsets());
        }
        return this.e;
    }
}
