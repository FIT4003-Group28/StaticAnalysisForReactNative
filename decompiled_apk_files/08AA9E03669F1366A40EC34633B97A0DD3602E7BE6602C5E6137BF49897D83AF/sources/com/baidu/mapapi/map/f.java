package com.baidu.mapapi.map;

import android.graphics.Point;
/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    public final double f1722a;

    /* renamed from: b  reason: collision with root package name */
    public final double f1723b;

    /* renamed from: c  reason: collision with root package name */
    public final double f1724c;

    /* renamed from: d  reason: collision with root package name */
    public final double f1725d;
    public final double e;
    public final double f;

    public f(double d2, double d3, double d4, double d5) {
        this.f1722a = d2;
        this.f1723b = d4;
        this.f1724c = d3;
        this.f1725d = d5;
        this.e = (d2 + d3) / 2.0d;
        this.f = (d4 + d5) / 2.0d;
    }

    public boolean a(double d2, double d3) {
        return this.f1722a <= d2 && d2 <= this.f1724c && this.f1723b <= d3 && d3 <= this.f1725d;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        return d2 < this.f1724c && this.f1722a < d3 && d4 < this.f1725d && this.f1723b < d5;
    }

    public boolean a(Point point) {
        return a(point.x, point.y);
    }

    public boolean a(f fVar) {
        return a(fVar.f1722a, fVar.f1724c, fVar.f1723b, fVar.f1725d);
    }

    public boolean b(f fVar) {
        return fVar.f1722a >= this.f1722a && fVar.f1724c <= this.f1724c && fVar.f1723b >= this.f1723b && fVar.f1725d <= this.f1725d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("minX: " + this.f1722a);
        sb.append(" minY: " + this.f1723b);
        sb.append(" maxX: " + this.f1724c);
        sb.append(" maxY: " + this.f1725d);
        sb.append(" midX: " + this.e);
        sb.append(" midY: " + this.f);
        return sb.toString();
    }
}
