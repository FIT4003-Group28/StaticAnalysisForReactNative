package defpackage;

import android.graphics.drawable.Drawable;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ctr  reason: default package */
/* loaded from: classes3.dex */
public abstract class ctr implements ctz {
    private final int a;
    private final int b;
    public cth c;

    public ctr() {
        this(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    }

    @Override // defpackage.ctz
    public final cth c() {
        return this.c;
    }

    @Override // defpackage.ctz
    public final void d(cty ctyVar) {
        ctyVar.g(this.a, this.b);
    }

    @Override // defpackage.ctz
    public void e(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void g(cty ctyVar) {
    }

    @Override // defpackage.ctz
    public final void h(cth cthVar) {
        this.c = cthVar;
    }

    @Override // defpackage.cse
    public final void k() {
    }

    @Override // defpackage.cse
    public final void l() {
    }

    @Override // defpackage.cse
    public final void m() {
    }

    public ctr(int i, int i2) {
        if (cvd.o(i, i2)) {
            this.a = i;
            this.b = i2;
            return;
        }
        StringBuilder sb = new StringBuilder(111);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
