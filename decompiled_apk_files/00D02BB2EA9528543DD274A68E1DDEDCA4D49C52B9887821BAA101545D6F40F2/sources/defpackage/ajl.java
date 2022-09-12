package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: ajl  reason: default package */
/* loaded from: classes2.dex */
public final class ajl extends ViewGroup.MarginLayoutParams {
    public aji a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;
    private boolean q;

    public ajl(int i, int i2) {
        super(i, i2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public final void a(aji ajiVar) {
        aji ajiVar2 = this.a;
        if (ajiVar2 != ajiVar) {
            if (ajiVar2 != null) {
                ajiVar2.b();
            }
            this.a = ajiVar;
            this.b = true;
            if (ajiVar == null) {
                return;
            }
            ajiVar.a(this);
        }
    }

    public final void b(int i, boolean z) {
        if (i != 0) {
            this.q = z;
        } else {
            this.n = z;
        }
    }

    public final boolean c(int i) {
        return i != 0 ? this.q : this.n;
    }

    public final void d() {
        this.o = false;
    }

    public ajl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajf.b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            this.a = CoordinatorLayout.g(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        aji ajiVar = this.a;
        if (ajiVar != null) {
            ajiVar.a(this);
        }
    }

    public ajl(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ajl(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ajl(ajl ajlVar) {
        super((ViewGroup.MarginLayoutParams) ajlVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
}
