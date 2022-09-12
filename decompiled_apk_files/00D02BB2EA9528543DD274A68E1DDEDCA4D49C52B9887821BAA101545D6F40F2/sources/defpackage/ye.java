package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner$SavedState;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ye  reason: default package */
/* loaded from: classes.dex */
public final class ye extends Spinner {
    private static final int[] e = {16843505};
    public final Context a;
    public yd b;
    int c;
    final Rect d;
    private final xc f;
    private zq g;
    private SpinnerAdapter h;
    private final boolean i;

    public ye(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            int i3 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max2++;
            i = i3;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.d);
        return i2 + this.d.left + this.d.right;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.d(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.f;
        if (xcVar != null) {
            xcVar.e();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        yd ydVar = this.b;
        return ydVar != null ? ydVar.j() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        yd ydVar = this.b;
        return ydVar != null ? ydVar.i() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        yd ydVar = this.b;
        if (ydVar != null) {
            return ydVar.h();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        yd ydVar = this.b;
        return ydVar != null ? ydVar.c() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yd ydVar = this.b;
        if (ydVar == null || !ydVar.m()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new xv(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        yd ydVar = this.b;
        boolean z = false;
        if (ydVar != null && ydVar.m()) {
            z = true;
        }
        appCompatSpinner$SavedState.a = z;
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zq zqVar = this.g;
        if (zqVar == null || !zqVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        yd ydVar = this.b;
        if (ydVar != null) {
            if (ydVar.m()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b == null) {
            return;
        }
        Context context = this.a;
        if (context == null) {
            context = getContext();
        }
        this.b.MZ(new xx(spinnerAdapter, context.getTheme()));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.f;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.f;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        yd ydVar = this.b;
        if (ydVar != null) {
            ydVar.l(i);
            this.b.g(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        yd ydVar = this.b;
        if (ydVar != null) {
            ydVar.f(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        yd ydVar = this.b;
        if (ydVar != null) {
            ydVar.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(sl.b(this.a, i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        yd ydVar = this.b;
        if (ydVar != null) {
            ydVar.b(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.f;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.f;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    public ye(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ye(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.d = r0
            android.content.Context r0 = r9.getContext()
            defpackage.ael.d(r9, r0)
            int[] r0 = defpackage.sj.u
            r1 = 0
            aeq r0 = defpackage.aeq.b(r10, r11, r0, r12, r1)
            xc r2 = new xc
            r2.<init>(r9)
            r9.f = r2
            r2 = 4
            int r2 = r0.o(r2, r1)
            if (r2 == 0) goto L2e
            uf r3 = new uf
            r3.<init>(r10, r2)
            r9.a = r3
            goto L30
        L2e:
            r9.a = r10
        L30:
            r2 = 1
            r3 = 0
            int[] r4 = defpackage.ye.e     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9b
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L9b
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            if (r5 == 0) goto L43
            int r5 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            goto L44
        L43:
            r5 = -1
        L44:
            if (r4 == 0) goto L49
            r4.recycle()
        L49:
            r4 = 2
            if (r5 == 0) goto L80
            if (r5 == r2) goto L4f
            goto La1
        L4f:
            yb r5 = new yb
            android.content.Context r6 = r9.a
            r5.<init>(r9, r6, r11, r12)
            android.content.Context r6 = r9.a
            int[] r7 = defpackage.sj.u
            aeq r6 = defpackage.aeq.b(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.n(r7, r8)
            r9.c = r7
            android.graphics.drawable.Drawable r7 = r6.d(r2)
            r5.e(r7)
            java.lang.String r4 = r0.g(r4)
            r5.a = r4
            r6.q()
            r9.b = r5
            xu r4 = new xu
            r4.<init>(r9, r9, r5)
            r9.g = r4
            goto La1
        L80:
            xw r5 = new xw
            r5.<init>(r9)
            r9.b = r5
            java.lang.String r4 = r0.g(r4)
            r5.b(r4)
            goto La1
        L8f:
            r10 = move-exception
            r3 = r4
            goto L95
        L92:
            goto L9c
        L94:
            r10 = move-exception
        L95:
            if (r3 == 0) goto L9a
            r3.recycle()
        L9a:
            throw r10
        L9b:
            r4 = r3
        L9c:
            if (r4 == 0) goto La1
            r4.recycle()
        La1:
            android.content.res.TypedArray r4 = r0.b
            java.lang.CharSequence[] r1 = r4.getTextArray(r1)
            if (r1 == 0) goto Lba
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r4.<init>(r10, r5, r1)
            r10 = 2131624397(0x7f0e01cd, float:1.8875973E38)
            r4.setDropDownViewResource(r10)
            r9.setAdapter(r4)
        Lba:
            r0.q()
            r9.i = r2
            android.widget.SpinnerAdapter r10 = r9.h
            if (r10 == 0) goto Lc8
            r9.setAdapter(r10)
            r9.h = r3
        Lc8:
            xc r10 = r9.f
            r10.a(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
