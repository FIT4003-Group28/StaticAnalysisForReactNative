package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray<View> a;
    ee b;
    private final ArrayList<ed> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private ds j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray<>();
        this.c = new ArrayList<>(100);
        this.b = new ee();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        c(null);
    }

    public static final dq b() {
        return new dq();
    }

    private final void c(AttributeSet attributeSet) {
        this.b.J = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dt.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(9, this.d);
                } else if (index == 10) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(10, this.e);
                } else if (index == 7) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(7, this.f);
                } else if (index == 8) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(8, this.g);
                } else if (index == 89) {
                    this.i = obtainStyledAttributes.getInt(89, this.i);
                } else if (index == 18) {
                    int resourceId = obtainStyledAttributes.getResourceId(18, 0);
                    ds dsVar = new ds();
                    this.j = dsVar;
                    dsVar.o(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.i;
    }

    private final ed d(int i) {
        View view;
        if (i != 0 && (view = this.a.get(i)) != this) {
            if (view != null) {
                return ((dq) view.getLayoutParams()).X;
            }
            return null;
        }
        return this.b;
    }

    private final ed e(View view) {
        if (view == this) {
            return this.b;
        }
        if (view != null) {
            return ((dq) view.getLayoutParams()).X;
        }
        return null;
    }

    protected final void a() {
        this.b.A();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dq;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dq(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dq(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            dq dqVar = (dq) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || dqVar.P || isInEditMode) {
                ed edVar = dqVar.X;
                int h = edVar.h();
                int i6 = edVar.i();
                childAt.layout(h, i6, edVar.d() + h, edVar.g() + i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0460, code lost:
        if (r10.height == (-1)) goto L242;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        ed e = e(view);
        if ((view instanceof Guideline) && !(e instanceof ef)) {
            dq dqVar = (dq) view.getLayoutParams();
            dqVar.X = new ef();
            dqVar.P = true;
            ((ef) dqVar.X).A(dqVar.L);
            ed edVar = dqVar.X;
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(e(view));
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    public void setConstraintSet(ds dsVar) {
        this.j = dsVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.b.ai = i;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray<>();
        this.c = new ArrayList<>(100);
        this.b = new ee();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        c(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray<>();
        this.c = new ArrayList<>(100);
        this.b = new ee();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        c(attributeSet);
    }
}
