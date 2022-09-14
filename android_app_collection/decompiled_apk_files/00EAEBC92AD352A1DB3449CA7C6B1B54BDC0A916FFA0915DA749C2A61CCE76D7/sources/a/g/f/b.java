package a.g.f;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f200e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f201a;

    /* renamed from: b  reason: collision with root package name */
    public final int f202b;

    /* renamed from: c  reason: collision with root package name */
    public final int f203c;

    /* renamed from: d  reason: collision with root package name */
    public final int f204d;

    private b(int i, int i2, int i3, int i4) {
        this.f201a = i;
        this.f202b = i2;
        this.f203c = i3;
        this.f204d = i4;
    }

    public static b a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f200e : new b(i, i2, i3, i4);
    }

    public static b a(b bVar, b bVar2) {
        return a(Math.max(bVar.f201a, bVar2.f201a), Math.max(bVar.f202b, bVar2.f202b), Math.max(bVar.f203c, bVar2.f203c), Math.max(bVar.f204d, bVar2.f204d));
    }

    public static b a(Rect rect) {
        return a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Insets a() {
        return Insets.of(this.f201a, this.f202b, this.f203c, this.f204d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f204d == bVar.f204d && this.f201a == bVar.f201a && this.f203c == bVar.f203c && this.f202b == bVar.f202b;
    }

    public int hashCode() {
        return (((((this.f201a * 31) + this.f202b) * 31) + this.f203c) * 31) + this.f204d;
    }

    public String toString() {
        return "Insets{left=" + this.f201a + ", top=" + this.f202b + ", right=" + this.f203c + ", bottom=" + this.f204d + '}';
    }
}
