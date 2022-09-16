package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: gz  reason: default package */
/* loaded from: classes3.dex */
public final class gz {
    public static final gz a = new gz(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private gz(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static gz b(gz gzVar, gz gzVar2) {
        return d(Math.max(gzVar.b, gzVar2.b), Math.max(gzVar.c, gzVar2.c), Math.max(gzVar.d, gzVar2.d), Math.max(gzVar.e, gzVar2.e));
    }

    public static gz c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static gz d(int i, int i2, int i3, int i4) {
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
        return new gz(i, i2, i3, i4);
    }

    public static gz e(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gz gzVar = (gz) obj;
        return this.e == gzVar.e && this.b == gzVar.b && this.d == gzVar.d && this.c == gzVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
