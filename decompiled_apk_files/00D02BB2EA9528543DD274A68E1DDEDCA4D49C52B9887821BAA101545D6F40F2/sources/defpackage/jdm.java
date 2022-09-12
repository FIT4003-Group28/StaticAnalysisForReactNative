package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: jdm  reason: default package */
/* loaded from: classes7.dex */
final class jdm extends jdk {
    @Override // defpackage.jdk
    public final Path a() {
        Path path = new Path();
        path.moveTo(this.e, this.a.top - this.d);
        path.lineTo(this.e + (this.c / 2.0f), this.a.top);
        float f = this.a.right;
        float f2 = this.b;
        float f3 = this.a.top;
        float f4 = this.a.right;
        float f5 = this.a.top;
        float f6 = this.b;
        path.arcTo(new RectF(f - (f2 + f2), f3, f4, f5 + f6 + f6), 270.0f, 90.0f);
        float f7 = this.a.right;
        float f8 = this.b;
        float f9 = this.a.bottom;
        float f10 = this.b;
        path.arcTo(new RectF(f7 - (f8 + f8), f9 - (f10 + f10), this.a.right, this.a.bottom), 0.0f, 90.0f);
        float f11 = this.a.left;
        float f12 = this.a.bottom;
        float f13 = this.b;
        float f14 = this.a.left;
        float f15 = this.b;
        path.arcTo(new RectF(f11, f12 - (f13 + f13), f14 + f15 + f15, this.a.bottom), 90.0f, 90.0f);
        float f16 = this.a.left;
        float f17 = this.a.top;
        float f18 = this.a.left;
        float f19 = this.b;
        float f20 = this.a.top;
        float f21 = this.b;
        path.arcTo(new RectF(f16, f17, f18 + f19 + f19, f20 + f21 + f21), 180.0f, 90.0f);
        path.lineTo(this.e - (this.c / 2.0f), this.a.top);
        path.close();
        return path;
    }
}
