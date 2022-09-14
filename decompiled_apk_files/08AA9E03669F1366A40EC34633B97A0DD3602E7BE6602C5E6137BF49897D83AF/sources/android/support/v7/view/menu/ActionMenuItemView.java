package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.a.a;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.n;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.ao;
import android.support.v7.widget.x;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
public class ActionMenuItemView extends android.support.v7.widget.r implements n.a, ActionMenuView.a, View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    h f726b;

    /* renamed from: c  reason: collision with root package name */
    g.b f727c;

    /* renamed from: d  reason: collision with root package name */
    b f728d;
    private CharSequence e;
    private Drawable f;
    private x g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract q a();
    }

    @Override // android.support.v7.view.menu.n.a
    public boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.h = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.ActionMenuItemView, i, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(a.j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.k = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = e();
        f();
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.k = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.v7.view.menu.n.a
    public h getItemData() {
        return this.f726b;
    }

    @Override // android.support.v7.view.menu.n.a
    public void a(h hVar, int i) {
        this.f726b = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.a((n.a) this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (!hVar.hasSubMenu() || this.g != null) {
            return;
        }
        this.g = new a();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f726b.hasSubMenu() || this.g == null || !this.g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f727c != null) {
            this.f727c.a(this.f726b);
        }
    }

    public void setItemInvoker(g.b bVar) {
        this.f727c = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.f728d = bVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (this.f726b == null) {
                return;
            }
            this.f726b.h();
        }
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && (!this.f726b.m() || (!this.h && !this.i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.e : null);
        CharSequence contentDescription = this.f726b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f726b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f726b.getTooltipText();
        if (!TextUtils.isEmpty(tooltipText)) {
            ao.a(this, tooltipText);
            return;
        }
        if (!z3) {
            charSequence = this.f726b.getTitle();
        }
        ao.a(this, charSequence);
    }

    public void setIcon(Drawable drawable) {
        this.f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.l) {
                float f = this.l / intrinsicWidth;
                intrinsicWidth = this.l;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.l) {
                float f2 = this.l / intrinsicHeight;
                intrinsicHeight = this.l;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.e = charSequence;
        f();
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean c() {
        return b() && this.f726b.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean d() {
        return b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean b2 = b();
        if (b2 && this.k >= 0) {
            super.setPadding(this.k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.j) : this.j;
        if (mode != 1073741824 && this.j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (b2 || this.f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* loaded from: classes.dex */
    private class a extends x {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.x
        public q a() {
            if (ActionMenuItemView.this.f728d != null) {
                return ActionMenuItemView.this.f728d.a();
            }
            return null;
        }

        @Override // android.support.v7.widget.x
        protected boolean b() {
            q a2;
            return ActionMenuItemView.this.f727c != null && ActionMenuItemView.this.f727c.a(ActionMenuItemView.this.f726b) && (a2 = a()) != null && a2.d();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
