package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zxc  reason: default package */
/* loaded from: classes7.dex */
public class zxc extends jgq {
    @dzsi
    private CharSequence c;
    @dzsi
    private Drawable d;

    public zxc(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> l(cqmp<T>... cqmpVarArr) {
        return new cqmh(zxc.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> m(cqtd cqtdVar) {
        return cqjv.i(ztg.MIDDLE_DIVIDER, cqtdVar, zth.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int right;
        super.dispatchDraw(canvas);
        Drawable drawable = this.d;
        int i = 0;
        if (drawable != null) {
            dcdc<View> dcdcVar = this.b;
            for (int i2 = 0; i2 < dcdcVar.size() - 1; i2++) {
                View view = dcdcVar.get(i2);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int height = getHeight();
                int paddingBottom = getPaddingBottom();
                int paddingTop = getPaddingTop() + ((((height - paddingBottom) - getPaddingTop()) - intrinsicHeight) / 2);
                if (bvox.a(this)) {
                    right = (view.getLeft() - this.a) - intrinsicWidth;
                } else {
                    right = view.getRight() + this.a;
                }
                drawable.setBounds(right, paddingTop, intrinsicWidth + right, intrinsicHeight + paddingTop);
                drawable.draw(canvas);
            }
        }
        StringBuilder sb = new StringBuilder();
        String string = getResources().getString(R.string.TRANSIT_STEP_SEPARATOR);
        dcdc<View> dcdcVar2 = this.b;
        int size = dcdcVar2.size();
        boolean z = false;
        while (i < size) {
            View view2 = dcdcVar2.get(i);
            if (z) {
                sb.append(string);
            }
            sb.append(view2.getContentDescription());
            i++;
            z = true;
        }
        bvsi bvsiVar = new bvsi(getContext());
        bvsiVar.d(this.c);
        bvsiVar.d(sb);
        setContentDescription(bvsiVar.toString());
    }

    @Override // defpackage.jgq
    public final int f() {
        int i = this.a;
        Drawable drawable = this.d;
        return drawable != null ? i + i + drawable.getIntrinsicWidth() : i;
    }

    @Override // defpackage.jgq
    protected final void g() {
        super.h();
        Drawable drawable = this.d;
        if (drawable != null) {
            ks.d(drawable, od.s(this));
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof zxb) {
                ((zxb) childAt).k();
            }
        }
    }

    @Override // defpackage.jgq
    protected final int i(int i, int i2, int i3, int i4) {
        int i5 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        int i6 = 0;
        int i7 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if ((childAt instanceof zxb) && ((zxb) childAt).n()) {
                i6++;
                i7 += childAt.getMeasuredWidth();
            }
        }
        if (i6 == 0) {
            return i4;
        }
        int i8 = (i3 - (i4 - i7)) / i6;
        int childCount2 = getChildCount();
        while (true) {
            childCount2--;
            if (childCount2 < 0) {
                break;
            }
            View childAt2 = getChildAt(childCount2);
            if (childAt2 instanceof zxb) {
                zxb zxbVar = (zxb) childAt2;
                if (zxbVar.n()) {
                    i6--;
                    zxbVar.m(i8);
                    measureChild(childAt2, makeMeasureSpec, i2);
                    int measuredWidth = childAt2.getMeasuredWidth();
                    if (i6 <= 0) {
                        i5 = i8 - measuredWidth;
                        break;
                    }
                    i8 += (i8 - measuredWidth) / i6;
                } else {
                    continue;
                }
            }
        }
        return i3 - i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgq
    public final int k() {
        int k = super.k();
        Drawable drawable = this.d;
        return drawable != null ? Math.max(k, drawable.getIntrinsicHeight()) : k;
    }

    public void setContentDescriptionPrefix(@dzsi CharSequence charSequence) {
        this.c = charSequence;
        invalidate();
    }

    public void setMiddleDividerDrawable(@dzsi Drawable drawable) {
        this.d = drawable;
        requestLayout();
        invalidate();
    }

    public zxc(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zxc(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = null;
    }
}
