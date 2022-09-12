package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: kd  reason: default package */
/* loaded from: classes7.dex */
public final class kd {
    public static final kd a = new kd(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private kd(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static kd a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i2 != 0) {
                i = 0;
            } else if (i3 != 0) {
                i = 0;
                i2 = 0;
            } else if (i4 == 0) {
                return a;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
        }
        return new kd(i, i2, i3, i4);
    }

    public static kd b(Rect rect) {
        return a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static kd c(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kd kdVar = (kd) obj;
        return this.e == kdVar.e && this.b == kdVar.b && this.d == kdVar.d && this.c == kdVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
