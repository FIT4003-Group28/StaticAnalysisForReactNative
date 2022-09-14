package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: atnt  reason: default package */
/* loaded from: classes2.dex */
public final class atnt extends View {
    int a;
    int b;
    private List<atnr> c;

    public atnt(Context context) {
        super(context);
        this.c = dchl.a();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(atnt.class, cqmpVarArr);
    }

    private static int b(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 0) {
            size = 16777215;
        }
        return (size <= i2 || mode == 1073741824) ? size < i2 ? 16777216 | size : size : i2;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.c.isEmpty()) {
            return;
        }
        canvas.translate(this.a, this.b);
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            canvas.save();
            atnr atnrVar = this.c.get(size);
            canvas.translate(atnrVar.c, atnrVar.d);
            if (atnrVar.e) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.translate(-atnrVar.b, -atnrVar.a.getIntrinsicHeight());
            atnrVar.a.setColorFilter(atnrVar.f);
            atnrVar.a.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.c.isEmpty()) {
            setMeasuredDimension(b(i, 0), b(i2, 0));
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (atnr atnrVar : this.c) {
            int intrinsicWidth = atnrVar.a.getIntrinsicWidth();
            int intrinsicHeight = atnrVar.a.getIntrinsicHeight();
            int i9 = atnrVar.c;
            if (atnrVar.e) {
                i3 = i9 + atnrVar.b;
                i4 = i3 - intrinsicWidth;
            } else {
                int i10 = i9 - atnrVar.b;
                i3 = intrinsicWidth + i10;
                i4 = i10;
            }
            if (i4 < i7) {
                i7 = i4;
            }
            if (i3 > i6) {
                i6 = i3;
            }
            int i11 = atnrVar.d;
            int i12 = i11 - intrinsicHeight;
            if (i12 < i8) {
                i8 = i12;
            }
            if (i11 > i5) {
                i5 = i11;
            }
        }
        int paddingLeft = i7 - getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = i5 + getPaddingBottom();
        int i13 = (i6 + paddingRight) - paddingLeft;
        int b = b(i, i13);
        this.a = (-paddingLeft) + Math.round(((b & 16777215) - i13) * 0.5f);
        int b2 = b(i2, paddingBottom - (i8 - paddingTop));
        this.b = (-paddingBottom) + (b2 & 16777215);
        setMeasuredDimension(b, b2);
    }

    public void setIcons(List<atnr> list) {
        this.c = list;
        invalidate();
        requestLayout();
    }

    public void setIconsFromProvider(@dzsi atns atnsVar) {
        if (atnsVar == null) {
            setIcons(dcdc.e());
        } else {
            atnsVar.b(this);
        }
    }

    public atnt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = dchl.a();
    }
}
