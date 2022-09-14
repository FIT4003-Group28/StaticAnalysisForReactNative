package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public class o extends Spinner implements android.support.v4.j.r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f986a = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final g f987b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f988c;

    /* renamed from: d  reason: collision with root package name */
    private x f989d;
    private SpinnerAdapter e;
    private final boolean f;
    private b g;
    private int h;
    private final Rect i;

    public o(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public o(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r12 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        r12.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r12 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.o.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.g != null) {
            return this.f988c;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        return super.getPopupContext();
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.g != null) {
            this.g.a(drawable);
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(android.support.v7.b.a.b.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        if (this.g != null) {
            return this.g.h();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        if (this.g != null) {
            this.g.d(i);
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        if (this.g != null) {
            return this.g.k();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return 0;
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        if (this.g != null) {
            this.g.c(i);
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        if (this.g != null) {
            return this.g.j();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return 0;
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return 0;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g == null) {
            return;
        }
        this.g.a(new a(spinnerAdapter, (this.f988c == null ? getContext() : this.f988c).getTheme()));
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g == null || !this.g.d()) {
            return;
        }
        this.g.c();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f989d == null || !this.f989d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        if (this.g != null) {
            if (this.g.d()) {
                return true;
            }
            this.g.a();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        if (this.g != null) {
            this.g.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.g != null ? this.g.b() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f987b != null) {
            this.f987b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f987b != null) {
            this.f987b.a(drawable);
        }
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f987b != null) {
            this.f987b.a(colorStateList);
        }
    }

    @Override // android.support.v4.j.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f987b != null) {
            return this.f987b.a();
        }
        return null;
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f987b != null) {
            this.f987b.a(mode);
        }
    }

    @Override // android.support.v4.j.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f987b != null) {
            return this.f987b.b();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f987b != null) {
            this.f987b.c();
        }
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.i);
        return i2 + this.i.left + this.i.right;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static class a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f992a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f993b;

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f992a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f993b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == theme) {
                        return;
                    }
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                } else if (!(spinnerAdapter instanceof ai)) {
                } else {
                    ai aiVar = (ai) spinnerAdapter;
                    if (aiVar.a() != null) {
                        return;
                    }
                    aiVar.a(theme);
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f992a == null) {
                return 0;
            }
            return this.f992a.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (this.f992a == null) {
                return null;
            }
            return this.f992a.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (this.f992a == null) {
                return -1L;
            }
            return this.f992a.getItemId(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f992a == null) {
                return null;
            }
            return this.f992a.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            return this.f992a != null && this.f992a.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f992a != null) {
                this.f992a.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f992a != null) {
                this.f992a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f993b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f993b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class b extends z {

        /* renamed from: a  reason: collision with root package name */
        ListAdapter f994a;
        private CharSequence h;
        private final Rect i;

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.i = new Rect();
            b(o.this);
            a(true);
            a(0);
            a(new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.o.b.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    o.this.setSelection(i2);
                    if (o.this.getOnItemClickListener() != null) {
                        o.this.performItemClick(view, i2, b.this.f994a.getItemId(i2));
                    }
                    b.this.c();
                }
            });
        }

        @Override // android.support.v7.widget.z
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.f994a = listAdapter;
        }

        public CharSequence b() {
            return this.h;
        }

        public void a(CharSequence charSequence) {
            this.h = charSequence;
        }

        void f() {
            Drawable h = h();
            int i = 0;
            if (h != null) {
                h.getPadding(o.this.i);
                i = as.a(o.this) ? o.this.i.right : -o.this.i.left;
            } else {
                Rect rect = o.this.i;
                o.this.i.right = 0;
                rect.left = 0;
            }
            int paddingLeft = o.this.getPaddingLeft();
            int paddingRight = o.this.getPaddingRight();
            int width = o.this.getWidth();
            if (o.this.h != -2) {
                if (o.this.h != -1) {
                    g(o.this.h);
                } else {
                    g((width - paddingLeft) - paddingRight);
                }
            } else {
                int a2 = o.this.a((SpinnerAdapter) this.f994a, h());
                int i2 = (o.this.getContext().getResources().getDisplayMetrics().widthPixels - o.this.i.left) - o.this.i.right;
                if (a2 > i2) {
                    a2 = i2;
                }
                g(Math.max(a2, (width - paddingLeft) - paddingRight));
            }
            c(as.a(o.this) ? i + ((width - paddingRight) - l()) : i + paddingLeft);
        }

        @Override // android.support.v7.widget.z, android.support.v7.view.menu.q
        public void a() {
            ViewTreeObserver viewTreeObserver;
            boolean d2 = d();
            f();
            h(2);
            super.a();
            e().setChoiceMode(1);
            i(o.this.getSelectedItemPosition());
            if (!d2 && (viewTreeObserver = o.this.getViewTreeObserver()) != null) {
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.o.b.2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (!b.this.a(o.this)) {
                            b.this.c();
                            return;
                        }
                        b.this.f();
                        b.super.a();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                a(new PopupWindow.OnDismissListener() { // from class: android.support.v7.widget.o.b.3
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver2 = o.this.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                        }
                    }
                });
            }
        }

        boolean a(View view) {
            return android.support.v4.j.s.q(view) && view.getGlobalVisibleRect(this.i);
        }
    }
}
