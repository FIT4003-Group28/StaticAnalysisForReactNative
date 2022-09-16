package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final C0043a f1185b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f1186c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuView f1187d;

    /* renamed from: e  reason: collision with root package name */
    protected c f1188e;

    /* renamed from: f  reason: collision with root package name */
    protected int f1189f;

    /* renamed from: g  reason: collision with root package name */
    protected a.g.m.z f1190g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1191h;
    private boolean i;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0043a implements a.g.m.a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1192a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1193b;

        protected C0043a() {
        }

        public C0043a a(a.g.m.z zVar, int i) {
            a.this.f1190g = zVar;
            this.f1193b = i;
            return this;
        }

        @Override // a.g.m.a0
        public void a(View view) {
            this.f1192a = true;
        }

        @Override // a.g.m.a0
        public void b(View view) {
            if (this.f1192a) {
                return;
            }
            a aVar = a.this;
            aVar.f1190g = null;
            a.super.setVisibility(this.f1193b);
        }

        @Override // a.g.m.a0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1192a = false;
        }
    }

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f1185b = new C0043a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f1186c = context;
        } else {
            this.f1186c = new ContextThemeWrapper(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public a.g.m.z a(int i, long j) {
        a.g.m.z zVar = this.f1190g;
        if (zVar != null) {
            zVar.a();
        }
        if (i != 0) {
            a.g.m.z a2 = a.g.m.v.a(this);
            a2.a(0.0f);
            a2.a(j);
            C0043a c0043a = this.f1185b;
            c0043a.a(a2, i);
            a2.a(c0043a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        a.g.m.z a3 = a.g.m.v.a(this);
        a3.a(1.0f);
        a3.a(j);
        C0043a c0043a2 = this.f1185b;
        c0043a2.a(a3, i);
        a3.a(c0043a2);
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.f1190g != null ? this.f1185b.f1193b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1189f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.a.j.ActionBar, a.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(a.a.j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1188e;
        if (cVar != null) {
            cVar.a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1191h = false;
        }
        if (!this.f1191h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1191h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1191h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a.g.m.z zVar = this.f1190g;
            if (zVar != null) {
                zVar.a();
            }
            super.setVisibility(i);
        }
    }
}
