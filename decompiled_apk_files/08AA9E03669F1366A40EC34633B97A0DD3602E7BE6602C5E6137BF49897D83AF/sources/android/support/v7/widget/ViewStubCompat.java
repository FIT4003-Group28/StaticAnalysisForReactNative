package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f866a;

    /* renamed from: b  reason: collision with root package name */
    private int f867b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f868c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f869d;
    private a e;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f866a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.ViewStubCompat, i, 0);
        this.f867b = obtainStyledAttributes.getResourceId(a.j.ViewStubCompat_android_inflatedId, -1);
        this.f866a = obtainStyledAttributes.getResourceId(a.j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(a.j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f867b;
    }

    public void setInflatedId(int i) {
        this.f867b = i;
    }

    public int getLayoutResource() {
        return this.f866a;
    }

    public void setLayoutResource(int i) {
        this.f866a = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f869d = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f869d;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.f868c != null) {
            View view = this.f868c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        a();
    }

    public View a() {
        LayoutInflater from;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            if (this.f866a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (this.f869d != null) {
                    from = this.f869d;
                } else {
                    from = LayoutInflater.from(getContext());
                }
                View inflate = from.inflate(this.f866a, viewGroup, false);
                if (this.f867b != -1) {
                    inflate.setId(this.f867b);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f868c = new WeakReference<>(inflate);
                if (this.e != null) {
                    this.e.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void setOnInflateListener(a aVar) {
        this.e = aVar;
    }
}
