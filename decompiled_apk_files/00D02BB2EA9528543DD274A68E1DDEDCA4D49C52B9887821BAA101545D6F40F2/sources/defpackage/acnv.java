package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: acnv  reason: default package */
/* loaded from: classes2.dex */
public final class acnv extends LinearLayout {
    public int a;
    public float b;
    @dzsi
    public acny c;
    public final acnu d;
    private final int e;
    private final Paint f;
    private final boolean g;
    private int h;
    private final Paint i;
    @dzsi
    private Drawable j;
    private boolean k;
    private final Rect l;
    private final int m;
    private int n;
    private int o;
    private int p;
    private boolean q;

    public acnv(Context context) {
        super(context, null);
        setWillNotDraw(false);
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i = typedValue.data;
        int c = c(i, (byte) 38);
        this.m = c;
        acnu acnuVar = new acnu();
        this.d = acnuVar;
        acnuVar.a = new int[]{-13388315};
        c(i, (byte) 32);
        this.e = (int) (0.0f * f);
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(c);
        this.h = (int) (f * 8.0f);
        this.i = new Paint();
        this.k = true;
        this.l = new Rect();
        this.g = acpf.a(this);
    }

    private static int a(View view, boolean z) {
        int left = view.getLeft();
        if (!z && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = Integer.MAX_VALUE;
            boolean z2 = false;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null && childAt.getVisibility() == 0) {
                    i = Math.min(i, childAt.getLeft() + left);
                    z2 = true;
                }
            }
            if (z2) {
                return i;
            }
        }
        return left;
    }

    private static int b(View view, boolean z) {
        if (z || !(view instanceof ViewGroup)) {
            return view.getRight();
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = Integer.MIN_VALUE;
        boolean z2 = false;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i = Math.max(i, view.getLeft() + childAt.getRight());
                z2 = true;
            }
        }
        return z2 ? i : view.getRight();
    }

    private static int c(int i, byte b) {
        return Color.argb((int) b, Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        acny acnyVar = this.c;
        if (acnyVar == null) {
            acnyVar = this.d;
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.a);
            int a = a(childAt, this.k);
            int b = b(childAt, this.k);
            int a2 = acnyVar.a(this.a);
            if (this.b > 0.0f && this.a < getChildCount() - 1) {
                int a3 = acnyVar.a(this.a + 1);
                if (a2 != a3) {
                    float f = this.b;
                    float f2 = 1.0f - f;
                    a2 = Color.rgb((int) ((Color.red(a3) * f) + (Color.red(a2) * f2)), (int) ((Color.green(a3) * f) + (Color.green(a2) * f2)), (int) ((Color.blue(a3) * f) + (Color.blue(a2) * f2)));
                }
                View childAt2 = getChildAt(this.a + 1);
                float f3 = this.b;
                int a4 = a(childAt2, this.k);
                float f4 = this.b;
                a = (int) ((f3 * a4) + ((1.0f - f4) * a));
                b = (int) ((f4 * b(childAt2, this.k)) + ((1.0f - this.b) * b));
            }
            int i = a + this.o;
            int i2 = b - this.n;
            int i3 = this.p;
            if (i2 - i < i3) {
                int i4 = (i + i2) / 2;
                int i5 = i3 / 2;
                int i6 = i4 - i5;
                int i7 = i5 + i4;
                i = i6;
                i2 = i7;
            }
            this.i.setColor(a2);
            if (this.q) {
                Rect rect = this.l;
                int i8 = height / 2;
                int i9 = this.h / 2;
                rect.set(i, i8 - i9, i2, i8 + i9);
            } else {
                this.l.set(i, height - this.h, i2, height);
            }
            Drawable drawable = this.j;
            if (drawable == null) {
                canvas.drawRect(this.l, this.i);
            } else {
                Drawable b2 = ks.b(drawable);
                b2.setBounds(this.l);
                b2.setTint(a2);
                b2.draw(canvas);
            }
        }
        canvas.drawRect(0.0f, height - this.e, getWidth(), height, this.f);
    }

    public void setSelectedIndicatorCenterOnTitle(boolean z) {
        this.q = z;
    }

    public void setSelectedIndicatorDrawable(@dzsi Drawable drawable) {
        this.j = drawable;
    }

    public void setSelectedIndicatorFullWidth(boolean z) {
        this.k = z;
    }

    public void setSelectedIndicatorHeight(int i) {
        this.h = i;
    }

    public void setSelectedIndicatorMinWidth(int i) {
        this.p = i;
    }

    public void setSelectedIndicatorPaddingEnd(int i) {
        if (this.g) {
            this.o = i;
        } else {
            this.n = i;
        }
    }

    public void setSelectedIndicatorPaddingStart(int i) {
        if (this.g) {
            this.n = i;
        } else {
            this.o = i;
        }
    }
}
