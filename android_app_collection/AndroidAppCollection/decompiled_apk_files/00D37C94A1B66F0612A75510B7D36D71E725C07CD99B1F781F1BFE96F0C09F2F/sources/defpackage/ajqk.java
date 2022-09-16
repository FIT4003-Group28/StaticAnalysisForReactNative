package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
/* compiled from: PG */
/* renamed from: ajqk  reason: default package */
/* loaded from: classes.dex */
public final class ajqk extends ajqb {
    private ConstraintLayout a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int[] g;
    private View h;
    private View i;

    public ajqk(Context context, ajrx ajrxVar, ajsa ajsaVar) {
        super(context, ajrxVar, ajsaVar);
    }

    @Override // defpackage.ajqb
    protected final ViewGroup d(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.a = constraintLayout;
        constraintLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return this.a;
    }

    @Override // defpackage.ajqb
    protected final ajqi e(Context context, ajsa ajsaVar) {
        return new ajqj(context, ajsaVar);
    }

    @Override // defpackage.ajqb
    protected final void f(int i, ajrs ajrsVar, ajqo ajqoVar) {
        this.g = new int[i];
        this.b = ajrsVar.b("grid_row_presenter_horizontal_row_padding", ajqoVar.e);
        this.d = ajrsVar.b("grid_row_presenter_top_padding", ajqoVar.c);
        this.c = ajrsVar.b("grid_row_presenter_horizontal_row_padding", ajqoVar.f);
        this.e = ajrsVar.b("grid_row_presenter_bottom_padding", ajqoVar.d);
        this.f = ajqoVar.g;
    }

    @Override // defpackage.ajqb
    protected final void g(ajrs ajrsVar, ajqo ajqoVar) {
        int length;
        bt btVar = new bt();
        btVar.d(this.a);
        btVar.e(this.h.getId(), 6, 0, 6);
        btVar.h(this.h.getId(), 6, this.b);
        btVar.e(this.i.getId(), 7, 0, 7);
        btVar.h(this.i.getId(), 7, this.c);
        int[] iArr = this.g;
        int i = 1;
        if (iArr.length == 1) {
            btVar.e(iArr[0], 6, this.h.getId(), 6);
            btVar.e(this.g[0], 7, this.i.getId(), 7);
        } else {
            int id = this.h.getId();
            int id2 = this.i.getId();
            int[] iArr2 = this.g;
            if (iArr2.length < 2) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            btVar.a(iArr2[0]).P = 0;
            btVar.f(iArr2[0], 6, id, 6, -1);
            while (true) {
                length = iArr2.length;
                if (i >= length) {
                    break;
                }
                int i2 = i - 1;
                btVar.f(iArr2[i], 6, iArr2[i2], 7, -1);
                btVar.f(iArr2[i2], 7, iArr2[i], 6, -1);
                i++;
            }
            btVar.f(iArr2[length - 1], 7, id2, 7, -1);
        }
        int i3 = 0;
        while (true) {
            int[] iArr3 = this.g;
            if (i3 >= iArr3.length) {
                this.a.c = btVar;
                return;
            }
            btVar.e(iArr3[i3], 3, 0, 3);
            btVar.e(this.g[i3], 4, 0, 4);
            btVar.a(this.g[i3]).v = 0.0f;
            int[] iArr4 = this.g;
            int length2 = iArr4.length;
            float f = length2;
            float f2 = this.f;
            int i4 = (int) ((i3 / f) * f2);
            int i5 = i3 == length2 + (-1) ? 0 : (int) ((((length2 - i3) - 1) / f) * f2);
            int i6 = this.d;
            int i7 = this.e;
            btVar.h(iArr4[i3], 6, i4);
            btVar.h(this.g[i3], 7, i5);
            btVar.h(this.g[i3], 3, i6);
            btVar.h(this.g[i3], 4, i7);
            i3++;
        }
    }

    @Override // defpackage.ajqb
    protected final void i(View view, ajqo ajqoVar, int i) {
        this.g[i] = view.getId();
        if (i == 0) {
            View view2 = new View(view.getContext());
            this.h = view2;
            view2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            this.h.setId(View.generateViewId());
            this.h.setVisibility(4);
            this.a.addView(this.h);
            i = 0;
        }
        this.a.addView(view);
        if (i == ajqoVar.a - 1) {
            View view3 = new View(view.getContext());
            this.i = view3;
            view3.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            this.i.setId(View.generateViewId());
            this.i.setVisibility(4);
            this.a.addView(this.i);
        }
    }
}
