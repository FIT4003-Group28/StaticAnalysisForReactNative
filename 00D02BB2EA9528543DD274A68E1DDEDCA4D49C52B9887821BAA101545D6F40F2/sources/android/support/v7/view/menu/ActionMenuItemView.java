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
/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, vu, wu {
    public vi b;
    public ve c;
    public ur d;
    private CharSequence e;
    private Drawable f;
    private zq g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    private final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && ((this.b.n & 4) != 4 || (!this.h && !this.i))) {
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
            afb.a(this, charSequence3);
            return;
        }
        if (!z3) {
            charSequence = this.b.d;
        }
        afb.a(this, charSequence);
    }

    @Override // defpackage.vu
    public final vi a() {
        return this.b;
    }

    @Override // defpackage.vu
    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.wu
    public final boolean d() {
        return c() && this.b.getIcon() == null;
    }

    @Override // defpackage.wu
    public final boolean e() {
        return c();
    }

    @Override // defpackage.vu
    public final void f(vi viVar) {
        this.b = viVar;
        setIcon(viVar.getIcon());
        setTitle(viVar.j(this));
        setId(viVar.a);
        setVisibility(true != viVar.isVisible() ? 8 : 0);
        setEnabled(viVar.isEnabled());
        if (!viVar.hasSubMenu() || this.g != null) {
            return;
        }
        this.g = new uq(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ve veVar = this.c;
        if (veVar != null) {
            veVar.b(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = g();
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean c = c();
        if (c && (i3 = this.k) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.j) : this.j;
        if (mode != 1073741824 && this.j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (c || this.f == null) {
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
        zq zqVar;
        if (!this.b.hasSubMenu() || (zqVar = this.g) == null || !zqVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.i != z) {
            this.i = z;
            vi viVar = this.b;
            if (viVar == null) {
                return;
            }
            viVar.j.B();
        }
    }

    public void setIcon(Drawable drawable) {
        this.f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(ve veVar) {
        this.c = veVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(ur urVar) {
        this.d = urVar;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.e = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.h = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sj.c, i, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.k = -1;
        setSaveEnabled(false);
    }
}
