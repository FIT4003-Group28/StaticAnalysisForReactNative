package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: jdl  reason: default package */
/* loaded from: classes7.dex */
final class jdl extends jdk {
    @Override // defpackage.jdk
    public final Path a() {
        Path path = new Path();
        path.moveTo(this.e, this.a.bottom + this.d);
        path.lineTo(this.e + (this.c / 2.0f), this.a.bottom);
        float f = this.a.right;
        float f2 = this.b;
        float f3 = this.a.bottom;
        float f4 = this.b;
        path.arcTo(new RectF(f - (f2 + f2), f3 - (f4 + f4), this.a.right, this.a.bottom), 90.0f, -90.0f);
        float f5 = this.a.right;
        float f6 = this.b;
        float f7 = this.a.top;
        float f8 = this.a.right;
        float f9 = this.a.top;
        float f10 = this.b;
        path.arcTo(new RectF(f5 - (f6 + f6), f7, f8, f9 + f10 + f10), 0.0f, -90.0f);
        float f11 = this.a.left;
        float f12 = this.a.top;
        float f13 = this.a.left;
        float f14 = this.b;
        float f15 = this.a.top;
        float f16 = this.b;
        path.arcTo(new RectF(f11, f12, f13 + f14 + f14, f15 + f16 + f16), 270.0f, -90.0f);
        float f17 = this.a.left;
        float f18 = this.a.bottom;
        float f19 = this.b;
        float f20 = this.a.left;
        float f21 = this.b;
        path.arcTo(new RectF(f17, f18 - (f19 + f19), f20 + f21 + f21, this.a.bottom), 180.0f, -90.0f);
        path.lineTo(this.e - (this.c / 2.0f), this.a.bottom);
        path.close();
        return path;
    }
}
