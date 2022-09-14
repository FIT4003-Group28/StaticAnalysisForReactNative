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
/* renamed from: cptr  reason: default package */
/* loaded from: classes5.dex */
final class cptr extends View {
    public String a;
    public final List<cptq> b;
    private final cpuv c;
    private final cppz d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final TextPaint k;
    private final TextPaint l;

    public cptr(Context context) {
        super(context);
        this.c = new cpux();
        this.d = new cppz();
        this.b = cpwi.a();
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.k = d(context);
        this.l = d(context);
        this.e = Math.round(cpqk.a(context, 8.0f));
        this.f = Math.round(cpqk.a(context, 8.0f));
        this.g = Math.round(cpqk.a(context, 8.0f));
        this.h = Math.round(cpqk.a(context, 8.0f));
        this.i = Math.round(cpqk.a(context, 12.0f));
        this.j = Math.round(cpqk.a(context, 8.0f));
    }

    private final void b(Canvas canvas, float f, String str, TextPaint textPaint, String str2, TextPaint textPaint2) {
        if (str != null) {
            this.c.a(str, canvas, this.e, f, null, textPaint, Paint.Align.LEFT, 2, 0.0f, false);
        }
        if (str2 != null) {
            this.c.a(str2, canvas, canvas.getWidth() - this.f, f, null, textPaint2, Paint.Align.RIGHT, 2, 0.0f, false);
        }
    }

    private final cppz c(String str, TextPaint textPaint, String str2, TextPaint textPaint2) {
        int i;
        int i2 = 0;
        if (str != null) {
            cpuu b = this.c.b(str, textPaint, Paint.Align.CENTER, 2, 0.0f);
            i = b.h;
            i2 = Math.max(0, b.g);
        } else {
            i = 0;
        }
        if (str2 != null) {
            cpuu b2 = this.c.b(str2, textPaint2, Paint.Align.CENTER, 2, 0.0f);
            i += b2.h;
            i2 = Math.max(i2, b2.g);
        }
        if (i > 0) {
            i += this.i;
        }
        this.d.a(i, i2);
        return this.d;
    }

    private static final TextPaint d(Context context) {
        float b = cpqk.b(context, 12.0f);
        int parseColor = Color.parseColor("#808080");
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(parseColor);
        textPaint.setTextSize(b);
        return textPaint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, int i) {
        this.b.add(new cptq(str, str2, i));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.isEmpty()) {
            return;
        }
        int i = this.g;
        String str = this.a;
        if (str != null) {
            int i2 = c(str, this.k, null, null).b + i;
            b(canvas, i + ((i2 - i) / 2), this.a, this.k, null, null);
            i = this.j + i2;
        }
        for (cptq cptqVar : this.b) {
            this.l.setColor(cptqVar.c);
            int i3 = c(cptqVar.a, this.k, cptqVar.b, this.l).b + i;
            b(canvas, i + ((i3 - i) / 2), cptqVar.a, this.k, cptqVar.b, this.l);
            i = this.j + i3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        cppz cppzVar;
        int i4 = 0;
        if (this.b.isEmpty()) {
            this.d.a(0, 0);
            cppzVar = this.d;
        } else {
            String str = this.a;
            if (str != null) {
                cppz c = c(str, this.k, null, null);
                int max = Math.max(0, c.a);
                int i5 = c.b;
                if (!this.b.isEmpty()) {
                    i5 += this.j;
                }
                i4 = i5;
                i3 = max;
            } else {
                i3 = 0;
            }
            for (cptq cptqVar : this.b) {
                cppz c2 = c(cptqVar.a, this.k, cptqVar.b, this.l);
                i3 = Math.max(i3, c2.a);
                i4 += c2.b;
            }
            if (this.b.size() > 1) {
                i4 += (this.b.size() - 1) * this.j;
            }
            this.d.a(i3, i4);
            cppzVar = this.d;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 1073741824) {
            int i6 = cppzVar.a + this.e + this.f;
            if (mode == 0 || size > i6) {
                size = i6;
            }
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 1073741824) {
            int i7 = cppzVar.b + this.g + this.h;
            if (mode2 == 0 || size2 > i7) {
                size2 = i7;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
