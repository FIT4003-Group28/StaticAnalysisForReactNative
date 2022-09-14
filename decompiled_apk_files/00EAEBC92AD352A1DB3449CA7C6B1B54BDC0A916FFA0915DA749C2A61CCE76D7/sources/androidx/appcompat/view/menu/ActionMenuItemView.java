package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.z;
import androidx.appcompat.widget.z0;
/* loaded from: classes.dex */
public class ActionMenuItemView extends z implements o.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    j f988f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f989g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f990h;
    g.b i;
    private h0 j;
    b k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    /* loaded from: classes.dex */
    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.h0
        public q a() {
            b bVar = ActionMenuItemView.this.k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.h0
        protected boolean b() {
            q a2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.i;
            return bVar != null && bVar.a(actionMenuItemView.f988f) && (a2 = a()) != null && a2.b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract q a();
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
        this.l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a.j.ActionMenuItemView, i, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(a.a.j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f989g);
        if (this.f990h != null && (!this.f988f.n() || (!this.l && !this.m))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f989g : null);
        CharSequence contentDescription = this.f988f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f988f.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f988f.getTooltipText();
        if (!TextUtils.isEmpty(tooltipText)) {
            z0.a(this, tooltipText);
            return;
        }
        if (!z3) {
            charSequence = this.f988f.getTitle();
        }
        z0.a(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void a(j jVar, int i) {
        this.f988f = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.a(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (!jVar.hasSubMenu() || this.j != null) {
            return;
        }
        this.j = new a();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return d() && this.f988f.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f988f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f988f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = e();
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.z, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean d2 = d();
        if (d2 && (i3 = this.o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.n) : this.n;
        if (mode != 1073741824 && this.n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (d2 || this.f990h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f990h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f988f.hasSubMenu() || (h0Var = this.j) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m != z) {
            this.m = z;
            j jVar = this.f988f;
            if (jVar == null) {
                return;
            }
            jVar.b();
        }
    }

    public void setIcon(Drawable drawable) {
        this.f990h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.p;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f989g = charSequence;
        f();
    }
}
