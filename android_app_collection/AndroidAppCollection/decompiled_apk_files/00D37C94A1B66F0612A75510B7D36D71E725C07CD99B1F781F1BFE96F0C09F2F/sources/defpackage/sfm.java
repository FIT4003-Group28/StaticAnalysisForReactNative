package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: sfm  reason: default package */
/* loaded from: classes4.dex */
final class sfm extends View {
    public String a;
    public final List b;
    private final sbz c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final TextPaint j;
    private final TextPaint k;
    private final sgl l;

    public sfm(Context context) {
        super(context);
        this.l = new sgl();
        this.c = new sbz();
        this.b = sbv.d();
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.j = d(context);
        this.k = d(context);
        this.d = Math.round(scf.b(context, 8.0f));
        this.e = Math.round(scf.b(context, 8.0f));
        this.f = Math.round(scf.b(context, 8.0f));
        this.g = Math.round(scf.b(context, 8.0f));
        this.h = Math.round(scf.b(context, 12.0f));
        this.i = Math.round(scf.b(context, 8.0f));
    }

    private final sbz b(String str, TextPaint textPaint, String str2, TextPaint textPaint2) {
        int i;
        int i2 = 0;
        if (str != null) {
            sgj b = this.l.b(str, textPaint, Paint.Align.CENTER, 2, 0.0f);
            i = b.h;
            i2 = Math.max(0, b.g);
        } else {
            i = 0;
        }
        if (str2 != null) {
            sgj b2 = this.l.b(str2, textPaint2, Paint.Align.CENTER, 2, 0.0f);
            i += b2.h;
            i2 = Math.max(i2, b2.g);
        }
        if (i > 0) {
            i += this.h;
        }
        this.c.a(i, i2);
        return this.c;
    }

    private final void c(Canvas canvas, float f, String str, TextPaint textPaint, String str2, TextPaint textPaint2) {
        if (str != null) {
            this.l.a(str, canvas, this.d, f, null, textPaint, Paint.Align.LEFT, 2, 0.0f, false);
        }
        if (str2 != null) {
            this.l.a(str2, canvas, canvas.getWidth() - this.e, f, null, textPaint2, Paint.Align.RIGHT, 2, 0.0f, false);
        }
    }

    private static final TextPaint d(Context context) {
        float c = scf.c(context, 12.0f);
        int parseColor = Color.parseColor("#808080");
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(parseColor);
        textPaint.setTextSize(c);
        return textPaint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, int i) {
        this.b.add(new sfl(str, str2, i));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.isEmpty()) {
            return;
        }
        int i = this.f;
        String str = this.a;
        if (str != null) {
            int i2 = b(str, this.j, null, null).b + i;
            c(canvas, i + ((i2 - i) / 2), this.a, this.j, null, null);
            i = this.i + i2;
        }
        for (sfl sflVar : this.b) {
            this.k.setColor(sflVar.c);
            int i3 = b(sflVar.a, this.j, sflVar.b, this.k).b + i;
            c(canvas, i + ((i3 - i) / 2), sflVar.a, this.j, sflVar.b, this.k);
            i = this.i + i3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        sbz sbzVar;
        int i4 = 0;
        if (this.b.isEmpty()) {
            this.c.a(0, 0);
            sbzVar = this.c;
        } else {
            String str = this.a;
            if (str != null) {
                sbz b = b(str, this.j, null, null);
                int max = Math.max(0, b.a);
                int i5 = b.b;
                if (!this.b.isEmpty()) {
                    i5 += this.i;
                }
                i4 = i5;
                i3 = max;
            } else {
                i3 = 0;
            }
            for (sfl sflVar : this.b) {
                sbz b2 = b(sflVar.a, this.j, sflVar.b, this.k);
                i3 = Math.max(i3, b2.a);
                i4 += b2.b;
            }
            if (this.b.size() > 1) {
                i4 += (this.b.size() - 1) * this.i;
            }
            this.c.a(i3, i4);
            sbzVar = this.c;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 1073741824) {
            int i6 = sbzVar.a + this.d + this.e;
            if (mode == 0 || size > i6) {
                size = i6;
            }
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 1073741824) {
            int i7 = sbzVar.b + this.f + this.g;
            if (mode2 == 0 || size2 > i7) {
                size2 = i7;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
