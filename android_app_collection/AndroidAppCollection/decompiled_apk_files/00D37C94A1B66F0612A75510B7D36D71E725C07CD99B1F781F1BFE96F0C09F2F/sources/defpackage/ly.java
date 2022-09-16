package defpackage;

import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ly  reason: default package */
/* loaded from: classes3.dex */
public class ly extends lx {
    private gz c;
    private gz f;
    private gz g;

    public ly(mb mbVar, WindowInsets windowInsets) {
        super(mbVar, windowInsets);
        this.c = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.lv, defpackage.ma
    public final mb b(int i, int i2, int i3, int i4) {
        return mb.q(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.lw, defpackage.ma
    public final void m(gz gzVar) {
    }

    @Override // defpackage.ma
    public final gz q() {
        if (this.f == null) {
            this.f = gz.e(this.a.getMandatorySystemGestureInsets());
        }
        return this.f;
    }

    @Override // defpackage.ma
    public final gz r() {
        if (this.c == null) {
            this.c = gz.e(this.a.getSystemGestureInsets());
        }
        return this.c;
    }

    @Override // defpackage.ma
    public final gz s() {
        if (this.g == null) {
            this.g = gz.e(this.a.getTappableElementInsets());
        }
        return this.g;
    }
}
