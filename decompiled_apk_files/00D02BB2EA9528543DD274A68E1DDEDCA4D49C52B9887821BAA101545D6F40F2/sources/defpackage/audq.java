package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: audq  reason: default package */
/* loaded from: classes2.dex */
public final class audq {
    public final cqtd[] a = new cqtd[16];
    public final int[] b = new int[16];

    public final audr a() {
        return new audr(this);
    }

    public final void b(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        int c = audr.c(z, z2, z3, z4);
        this.a[c] = cqrt.f(i);
        this.b[c] = i2;
    }

    public final void c() {
        b(true, false, true, false, R.color.qu_google_green_500, 0);
        b(true, true, true, false, R.color.qu_google_green_500, 0);
        b(true, false, true, true, R.color.qu_google_green_600, 0);
        b(true, true, true, true, R.color.qu_google_green_600, 0);
        b(true, false, false, false, R.color.qu_grey_500, 0);
        b(true, true, false, false, R.color.qu_grey_500, 0);
        b(true, false, false, true, R.color.qu_grey_600, 0);
        b(true, true, false, true, R.color.qu_grey_600, 0);
        b(false, true, true, false, 2131231758, 3);
        b(false, false, true, false, R.color.quantum_googgreen700, 0);
        b(false, true, true, true, 2131231759, 3);
        b(false, false, true, true, R.color.qu_google_green_800, 0);
        b(false, true, false, false, 2131231760, 3);
        b(false, true, false, true, 2131231760, 3);
        b(false, false, false, false, R.color.quantum_grey700, 0);
        b(false, false, false, true, R.color.quantum_grey700, 0);
    }
}
