package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: jdk  reason: default package */
/* loaded from: classes7.dex */
class jdk {
    public final RectF a = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;

    public Path a() {
        Path path = new Path();
        float f = this.a.left;
        float f2 = this.b;
        path.moveTo(f + f2 + f2, this.a.top);
        float f3 = this.a.right;
        float f4 = this.b;
        float f5 = this.a.top;
        float f6 = this.a.right;
        float f7 = this.a.top;
        float f8 = this.b;
        path.arcTo(new RectF(f3 - (f4 + f4), f5, f6, f7 + f8 + f8), 270.0f, 90.0f);
        float f9 = this.a.right;
        float f10 = this.b;
        float f11 = this.a.bottom;
        float f12 = this.b;
        path.arcTo(new RectF(f9 - (f10 + f10), f11 - (f12 + f12), this.a.right, this.a.bottom), 0.0f, 90.0f);
        float f13 = this.a.left;
        float f14 = this.a.bottom;
        float f15 = this.b;
        float f16 = this.a.left;
        float f17 = this.b;
        path.arcTo(new RectF(f13, f14 - (f15 + f15), f16 + f17 + f17, this.a.bottom), 90.0f, 90.0f);
        float f18 = this.a.left;
        float f19 = this.a.top;
        float f20 = this.a.left;
        float f21 = this.b;
        float f22 = this.a.top;
        float f23 = this.b;
        path.arcTo(new RectF(f18, f19, f20 + f21 + f21, f22 + f23 + f23), 180.0f, 90.0f);
        path.close();
        return path;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        float f = this.a.left;
        float f2 = this.a.top;
        float f3 = this.a.right;
        float f4 = this.a.bottom;
        float f5 = this.a.right;
        float f6 = this.a.left;
        float f7 = this.a.bottom;
        float f8 = this.a.top;
        StringBuilder sb = new StringBuilder(99);
        sb.append("(");
        sb.append(f);
        sb.append(",");
        sb.append(f2);
        sb.append(")-(");
        sb.append(f3);
        sb.append(",");
        sb.append(f4);
        sb.append(") ");
        sb.append(f5 - f6);
        sb.append("x");
        sb.append(f7 - f8);
        b.b("rect", sb.toString());
        b.e("radius", this.b);
        b.e("calloutWidth", this.c);
        b.e("calloutHeight", this.d);
        b.e("calloutPosition", this.e);
        return b.toString();
    }
}
