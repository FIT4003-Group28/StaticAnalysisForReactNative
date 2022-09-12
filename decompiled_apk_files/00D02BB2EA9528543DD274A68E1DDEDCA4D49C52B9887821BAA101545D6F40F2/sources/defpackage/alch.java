package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: alch  reason: default package */
/* loaded from: classes2.dex */
public final class alch extends ReplacementSpan {
    private final Paint.FontMetrics A;
    private final RectF B;
    private int C;
    @dzsi
    private CharSequence D;
    public final float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final float g;
    public int h;
    @dzsi
    public Integer i;
    @dzsi
    public Integer j;
    @dzsi
    public Integer k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    private final float p;
    private final float q;
    private final int r;
    private final int s;
    private final Paint t;
    private final Paint u;
    private final Path v;
    private final boolean w;
    private final boolean x;
    private final float y;
    private final float z;

    public alch(dpce dpceVar, boolean z, boolean z2, Resources resources, int i) {
        Paint paint = new Paint();
        this.t = paint;
        Paint paint2 = new Paint();
        this.u = paint2;
        this.v = new Path();
        this.A = new Paint.FontMetrics();
        this.B = new RectF();
        boolean z3 = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = 0;
        this.c = z;
        this.x = z2;
        this.d = z2;
        float dimension = resources.getDimension(R.dimen.transit_line_stroke_width);
        this.z = dimension;
        float f = dimension / 2.0f;
        float dimension2 = resources.getDimension(R.dimen.transit_line_name_mod_box_border_corner_radius);
        float dimension3 = resources.getDimension(R.dimen.transit_line_name_slash_border_corner_radius);
        this.a = resources.getDimension(R.dimen.transit_line_name_mod_box_padding) + dimension2;
        this.g = resources.getDimension(R.dimen.transit_line_alternate_triangle_width) + dimension3;
        this.p = dimension2 - f;
        this.q = dimension3 - f;
        this.y = resources.getDimension(R.dimen.transit_line_mod_alternate_triangle_overlap);
        boolean z4 = resources.getBoolean(R.bool.transit_line_span_dark_mode);
        this.w = z4;
        int color = resources.getColor(R.color.transit_line_span_default_foreground);
        doul doulVar = dpceVar.c;
        if (((doulVar == null ? doul.f : doulVar).a & 8) != 0) {
            doul doulVar2 = dpceVar.c;
            if (bvoa.d((doulVar2 == null ? doul.f : doulVar2).e)) {
                doul doulVar3 = dpceVar.c;
                color = Color.parseColor((doulVar3 == null ? doul.f : doulVar3).e);
            }
        }
        this.r = color;
        int color2 = resources.getColor(R.color.transit_line_span_default_stroke);
        this.s = color2;
        doul doulVar4 = dpceVar.c;
        if (((doulVar4 == null ? doul.f : doulVar4).a & 4) != 0) {
            doul doulVar5 = dpceVar.c;
            if (bvoa.d((doulVar5 == null ? doul.f : doulVar5).d)) {
                doul doulVar6 = dpceVar.c;
                i = Color.parseColor((doulVar6 == null ? doul.f : doulVar6).d);
            }
        }
        boolean c = bvox.c(resources);
        this.b = c;
        this.e = (!c && !z) || (c && !z2);
        if ((!c && !z2) || (c && !z)) {
            z3 = true;
        }
        this.f = z3;
        int color3 = resources.getColor(R.color.mod_daynight_white);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        double c2 = kc.c(color3, i);
        if (!z4 ? bvoa.a(i) : c2 >= 3.0d) {
            paint2.setColor(i);
        } else {
            int a = kc.a(color2, i);
            paint2.setColor(kc.c(color3, a) > c2 ? a : color2);
        }
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dimension);
        paint2.setStrokeJoin(Paint.Join.ROUND);
    }

    private final void d(float f, float f2, float f3, float f4, float f5) {
        this.B.set(f - f3, f2 - f3, f + f3, f2 + f3);
        this.v.arcTo(this.B, f4, f5);
    }

    public final void a() {
        boolean z = false;
        this.l = false;
        boolean z2 = this.x;
        this.d = z2;
        boolean z3 = this.b;
        this.e = (!z3 && !this.c) || (z3 && !z2);
        if ((!z3 && !z2) || (z3 && !this.c)) {
            z = true;
        }
        this.f = z;
    }

    public final int b() {
        return (int) ((this.c ? this.a : this.g) + 0.0f + (this.d ? this.a : this.g - this.y));
    }

    public final boolean c(alch alchVar) {
        return this.t.getColor() == alchVar.t.getColor();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (!this.n) {
            return;
        }
        paint.getFontMetrics(this.A);
        if (!this.b || !this.e) {
            f2 = this.e ? this.g : this.a;
        } else {
            f2 = this.g - this.y;
        }
        float f9 = f + f2;
        float f10 = i4;
        float f11 = this.A.ascent + f10;
        float f12 = this.A.descent + f10;
        Integer num = this.k;
        if (num != null) {
            float intValue = num.intValue();
            float f13 = f12 - f11;
            if (intValue > f13) {
                f11 -= (intValue - f13) / 2.0f;
                f12 = Math.min(f12 + (intValue - (f12 - f11)), canvas.getClipBounds().bottom);
            }
        }
        float f14 = this.z;
        float f15 = f14 / 2.0f;
        float f16 = f12 - f15;
        float f17 = f11 + f15;
        float f18 = f9 + f15;
        if (this.b) {
            float f19 = ((this.h + f18) + this.C) - (f14 * 1.5f);
            double atan = ((float) Math.atan((f16 - f17) / (this.g - this.q))) / 2.0f;
            double d = this.q;
            double tan = Math.tan(atan);
            Double.isNaN(d);
            float f20 = (float) (d / tan);
            double d2 = this.q;
            double tan2 = Math.tan(atan);
            Double.isNaN(d2);
            float f21 = (float) (d2 * tan2);
            float degrees = (float) Math.toDegrees(atan);
            this.v.reset();
            if (this.f) {
                float f22 = this.q;
                float f23 = degrees + degrees;
                f6 = degrees;
                f7 = f21;
                f8 = f20;
                d((f19 + f22) - f21, f17 + f22, f22, 270.0f, f23);
                float f24 = this.g;
                float f25 = this.q;
                d((f19 + f24) - f8, f16 - f25, f25, f23 + 270.0f, 180.0f - f23);
            } else {
                f6 = degrees;
                f7 = f21;
                f8 = f20;
                float f26 = this.a;
                float f27 = this.p;
                d((f19 + f26) - f27, f17 + f27, f27, 270.0f, 90.0f);
                float f28 = this.a;
                float f29 = this.p;
                d((f19 + f28) - f29, f16 - f29, f29, 0.0f, 90.0f);
            }
            if (this.e) {
                float f30 = this.q;
                float f31 = f6 + f6;
                d((f18 - f30) + f7, f16 - f30, f30, 90.0f, f31);
                float f32 = this.g;
                float f33 = this.q;
                d((f18 - f32) + f8, f17 + f33, f33, f31 + 90.0f, 180.0f - f31);
            } else {
                float f34 = this.a;
                float f35 = this.p;
                d((f18 - f34) + f35, f16 - f35, f35, 90.0f, 90.0f);
                float f36 = this.a;
                float f37 = this.p;
                d((f18 - f36) + f37, f17 + f37, f37, 180.0f, 90.0f);
            }
            this.v.close();
            canvas.drawPath(this.v, this.t);
            canvas.drawPath(this.v, this.u);
        } else {
            float f38 = ((this.h + f18) + this.C) - (f14 * 1.5f);
            double atan2 = ((float) Math.atan((f16 - f17) / (this.g - this.q))) / 2.0f;
            double d3 = this.q;
            double tan3 = Math.tan(atan2);
            Double.isNaN(d3);
            float f39 = (float) (d3 / tan3);
            double d4 = this.q;
            double tan4 = Math.tan(atan2);
            Double.isNaN(d4);
            float f40 = (float) (d4 * tan4);
            float degrees2 = (float) Math.toDegrees(atan2);
            this.v.reset();
            if (this.e) {
                float f41 = this.g;
                float f42 = this.q;
                float f43 = degrees2 + degrees2;
                f3 = degrees2;
                f4 = f40;
                f5 = f39;
                d((f18 - f41) + f39, f16 - f42, f42, 90.0f, 180.0f - f43);
                float f44 = this.q;
                d((f18 - f44) + f4, f17 + f44, f44, 270.0f - f43, f43);
            } else {
                f3 = degrees2;
                f4 = f40;
                f5 = f39;
                float f45 = this.a;
                float f46 = this.p;
                d((f18 - f45) + f46, f16 - f46, f46, 90.0f, 90.0f);
                float f47 = this.a;
                float f48 = this.p;
                d((f18 - f47) + f48, f17 + f48, f48, 180.0f, 90.0f);
            }
            if (this.f) {
                float f49 = this.g;
                float f50 = this.q;
                float f51 = f3 + f3;
                d((f38 + f49) - f5, f17 + f50, f50, 270.0f, 180.0f - f51);
                float f52 = this.q;
                d((f38 + f52) - f4, f16 - f52, f52, 90.0f - f51, f51);
            } else {
                float f53 = this.a;
                float f54 = this.p;
                d((f38 + f53) - f54, f17 + f54, f54, 270.0f, 90.0f);
                float f55 = this.a;
                float f56 = this.p;
                d((f38 + f55) - f56, f16 - f56, f56, 0.0f, 90.0f);
            }
            this.v.close();
            canvas.drawPath(this.v, this.t);
            canvas.drawPath(this.v, this.u);
        }
        int color = paint.getColor();
        paint.setColor(this.r);
        float f57 = f18 + (this.C / 2);
        if (!this.m) {
            CharSequence charSequence2 = this.D;
            if (charSequence2 != null) {
                if (this.l) {
                    canvas.drawText("…", 0, 1, f57, f10, paint);
                } else {
                    canvas.drawText(charSequence2, 0, charSequence2.length(), f57, f10, paint);
                }
            } else if (this.l) {
                canvas.drawText("…", 0, 1, f57, f10, paint);
            } else {
                canvas.drawText(charSequence, i, i2, f57, f10, paint);
            }
        }
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (!this.n) {
            return 0;
        }
        int b = b();
        this.o = (int) paint.measureText("…", 0, 1);
        if (!this.m) {
            int measureText = (int) paint.measureText(charSequence, i, i2);
            this.h = measureText;
            Integer num = this.i;
            if (num == null || measureText + b <= num.intValue() || !(paint instanceof TextPaint)) {
                this.D = null;
            } else {
                CharSequence ellipsize = TextUtils.ellipsize(TextUtils.substring(charSequence, i, i2), (TextPaint) paint, this.i.intValue() - b, TextUtils.TruncateAt.END);
                this.D = ellipsize;
                this.h = (int) paint.measureText(ellipsize, 0, ellipsize.length());
            }
            if (this.l) {
                this.h = this.o;
            }
        } else {
            this.h = 0;
        }
        int b2 = b();
        this.C = 0;
        Integer num2 = this.j;
        if (num2 != null && this.h + b2 < num2.intValue()) {
            int intValue = this.j.intValue();
            Integer num3 = this.i;
            if (num3 != null && num3.intValue() < intValue) {
                intValue = this.i.intValue();
            }
            this.C = (intValue - this.h) - b2;
        }
        return this.h + this.C + b;
    }
}
