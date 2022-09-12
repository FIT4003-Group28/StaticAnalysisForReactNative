package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: owz  reason: default package */
/* loaded from: classes7.dex */
public final class owz {
    public final int a;
    public final int b;
    public final int c;
    private final int d;
    private final boolean e;

    public owz(int i, int i2, int i3, int i4, boolean z) {
        this.c = i;
        this.a = i2;
        this.b = i4;
        this.e = z;
        this.d = i3;
    }

    private final cqtd c(int i) {
        cqtd f = cqrt.f(i);
        int i2 = this.b;
        if (i2 != 0) {
            f = cqrt.j(f, cqrt.c(i2));
        }
        return this.e ? iut.a(f) : f;
    }

    public final cqtd a() {
        return c(this.a);
    }

    public final cqtd b() {
        int i = this.d;
        if (i == R.drawable.ic_blank_replacement) {
            return a();
        }
        return c(i);
    }
}
