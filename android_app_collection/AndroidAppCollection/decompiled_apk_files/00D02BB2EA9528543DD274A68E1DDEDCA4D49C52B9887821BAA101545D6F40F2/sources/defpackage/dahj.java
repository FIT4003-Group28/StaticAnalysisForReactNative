package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahj  reason: default package */
/* loaded from: classes5.dex */
public final class dahj extends xb {
    public final aaq a;
    private final AccessibilityManager b;
    private final Rect c;

    public dahj(Context context) {
        this(context, null);
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final <T extends ListAdapter & Filterable> void a(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.h) ? super.getHint() : b.b();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b == null || !b.h || super.getHint() != null || !daan.a()) {
            return;
        }
        setHint("");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.a.v()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i4 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    int i5 = itemViewType != i3 ? itemViewType : i3;
                    if (itemViewType != i3) {
                        view = null;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                    max++;
                    i3 = i5;
                }
                Drawable h = this.a.h();
                if (h != null) {
                    h.getPadding(this.c);
                    i4 += this.c.left + this.c.right;
                }
                i3 = i4 + b.l.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.a.MZ(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.a.MY();
        }
    }

    public dahj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public dahj(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 0), attributeSet, i);
        this.c = new Rect();
        Context context2 = getContext();
        TypedArray a = daaz.a(context2, attributeSet, dahq.a, i, com.google.android.filament.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.b = (AccessibilityManager) context2.getSystemService("accessibility");
        aaq aaqVar = new aaq(context2, null, R.attr.listPopupWindowStyle);
        this.a = aaqVar;
        aaqVar.y();
        aaqVar.l = this;
        aaqVar.x();
        aaqVar.MZ(getAdapter());
        aaqVar.m = new dahi(this);
        a.recycle();
    }
}
