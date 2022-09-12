package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: clbs  reason: default package */
/* loaded from: classes5.dex */
public final class clbs {
    public final int a;
    public final int b;
    public final /* synthetic */ clbu c;

    public clbs(clbu clbuVar, int i) {
        this.c = clbuVar;
        clbk.b(i >= 0 && i < clbuVar.a(), String.format("Index %d incompatible with this board %s", Integer.valueOf(i), clbuVar));
        int i2 = clbuVar.e;
        this.a = i / i2;
        this.b = i % i2;
    }

    public final boolean a(clbu clbuVar) {
        return this.c == clbuVar;
    }

    public final int b() {
        return (this.c.e * this.a) + this.b;
    }

    public final Point c() {
        return new Point(this.b * clbu.a.a, this.a * clbu.a.b);
    }

    public final Rect d() {
        Point c = c();
        return new Rect(c.x, c.y, c.x + clbu.a.a, c.y + clbu.a.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clbs) {
            clbs clbsVar = (clbs) obj;
            if (clbsVar.a(this.c) && this.a == clbsVar.a && this.b == clbsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + 31 + b();
    }

    public final String toString() {
        return String.format("Tile %d @(%d, %d)", Integer.valueOf(b()), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
