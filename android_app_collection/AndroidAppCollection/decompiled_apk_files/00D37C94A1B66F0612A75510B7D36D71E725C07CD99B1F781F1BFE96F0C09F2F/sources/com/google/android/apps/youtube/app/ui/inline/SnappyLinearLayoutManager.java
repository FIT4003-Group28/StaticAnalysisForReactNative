package com.google.android.apps.youtube.app.ui.inline;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SnappyLinearLayoutManager extends LinearLayoutManager implements fhb {
    private static final float a = (float) (Math.log(0.78d) / Math.log(0.9d));
    private double b;
    private final Context c;
    private final yk d = c();

    public SnappyLinearLayoutManager(Context context) {
        this.c = context;
        double d = context.getResources().getDisplayMetrics().density * 386.0878f * 160.0f;
        Double.isNaN(d);
        this.b = d * 0.84d;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final int I() {
        return J();
    }

    @Override // defpackage.fhb
    public final int a() {
        int left;
        int measuredWidth;
        if (aq() == 0) {
            return 0;
        }
        View az = az(0);
        int bm = bm(az);
        if (this.i == 1) {
            left = az.getTop();
            measuredWidth = az.getMeasuredHeight();
        } else {
            left = az.getLeft();
            measuredWidth = az.getMeasuredWidth();
        }
        return Math.abs(left) > measuredWidth / 2 ? bm + 1 : bm;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void ao(RecyclerView recyclerView, int i) {
        yk ykVar = this.d;
        ykVar.b = i;
        bd(ykVar);
    }

    @Override // defpackage.fhb
    public final int b(int i, int i2) {
        int width;
        int i3;
        int i4;
        if (aq() == 0) {
            return 0;
        }
        View az = az(0);
        if (this.i == 1) {
            int top = az.getTop();
            width = az.getHeight();
            i3 = top;
            i4 = i2;
        } else {
            int left = az.getLeft();
            width = az.getWidth();
            i3 = left;
            i4 = i;
        }
        int bm = bm(az);
        double abs = Math.abs(Math.abs(i4));
        float scrollFriction = ViewConfiguration.getScrollFriction();
        double d = this.b;
        double d2 = scrollFriction;
        Double.isNaN(d2);
        double log = Math.log((abs * 0.3499999940395355d) / (d2 * d));
        float f = a;
        double scrollFriction2 = ViewConfiguration.getScrollFriction();
        double d3 = this.b;
        Double.isNaN(scrollFriction2);
        double d4 = scrollFriction2 * d3;
        double d5 = f;
        double d6 = f;
        Double.isNaN(d6);
        Double.isNaN(d5);
        double exp = d4 * Math.exp((d5 / (d6 - 1.0d)) * log);
        double d7 = i3;
        if (i4 > 0) {
            exp = -exp;
        }
        Double.isNaN(d7);
        double d8 = d7 + exp;
        return (this.i != 0 || !ag()) ? d8 <= ((double) ((-width) / 2)) ? bm + 1 : bm : d8 < ((double) (width / 2)) ? bm : bm + 1;
    }

    @Override // defpackage.xw
    public final void br(View view) {
        int ar;
        int makeMeasureSpec;
        xx xxVar = (xx) view.getLayoutParams();
        if (this.i != 1) {
            ar = ar(this.I, getPaddingTop() + getPaddingBottom() + xxVar.topMargin + xxVar.bottomMargin, xxVar.height, ae());
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.H, 1073741824);
        } else {
            makeMeasureSpec = ar(this.H, getPaddingLeft() + getPaddingRight() + xxVar.leftMargin + xxVar.rightMargin, xxVar.width, ad());
            ar = View.MeasureSpec.makeMeasureSpec(this.I, 1073741824);
        }
        view.measure(makeMeasureSpec, ar);
    }

    protected yk c() {
        return new mdl(this.c, this);
    }
}
