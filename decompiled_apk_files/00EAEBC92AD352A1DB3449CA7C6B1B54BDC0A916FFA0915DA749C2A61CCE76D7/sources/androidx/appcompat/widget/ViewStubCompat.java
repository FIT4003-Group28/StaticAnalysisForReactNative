package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f1180b;

    /* renamed from: c  reason: collision with root package name */
    private int f1181c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<View> f1182d;

    /* renamed from: e  reason: collision with root package name */
    private LayoutInflater f1183e;

    /* renamed from: f  reason: collision with root package name */
    private a f1184f;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1180b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a.j.ViewStubCompat, i, 0);
        this.f1181c = obtainStyledAttributes.getResourceId(a.a.j.ViewStubCompat_android_inflatedId, -1);
        this.f1180b = obtainStyledAttributes.getResourceId(a.a.j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(a.a.j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1180b == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1183e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1180b, viewGroup, false);
            int i = this.f1181c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1182d = new WeakReference<>(inflate);
            a aVar = this.f1184f;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1181c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1183e;
    }

    public int getLayoutResource() {
        return this.f1180b;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1181c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1183e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1180b = i;
    }

    public void setOnInflateListener(a aVar) {
        this.f1184f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1182d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        a();
    }
}
