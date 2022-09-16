package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, su, tr {
    public si b;
    public se c;
    public rr d;
    private CharSequence e;
    private Drawable f;
    private wc g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && ((this.b.n & 4) != 4 || !this.h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.e : null);
        CharSequence charSequence2 = this.b.l;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z3 ? null : this.b.d);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.b.m;
        if (!TextUtils.isEmpty(charSequence3)) {
            hx.a(this, charSequence3);
            return;
        }
        if (!z3) {
            charSequence = this.b.d;
        }
        hx.a(this, charSequence);
    }

    private final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    @Override // defpackage.su
    public final si a() {
        return this.b;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.tr
    public final boolean c() {
        return b();
    }

    @Override // defpackage.tr
    public final boolean d() {
        return b() && this.b.getIcon() == null;
    }

    @Override // defpackage.su
    public final boolean e() {
        return true;
    }

    @Override // defpackage.su
    public final void f(si siVar) {
        this.b = siVar;
        Drawable icon = siVar.getIcon();
        this.f = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.k;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.e = siVar.f(this);
        g();
        setId(siVar.a);
        if (true != siVar.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(siVar.isEnabled());
        if (!siVar.hasSubMenu() || this.g != null) {
            return;
        }
        this.g = new rq(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        se seVar = this.c;
        if (seVar != null) {
            seVar.b(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = h();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean b = b();
        if (b && (i4 = this.j) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.i);
        } else {
            i3 = this.i;
        }
        if (mode != 1073741824 && this.i > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (b || this.f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wc wcVar;
        if (!this.b.hasSubMenu() || (wcVar = this.g) == null || !wcVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.h = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pm.c, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }
}
