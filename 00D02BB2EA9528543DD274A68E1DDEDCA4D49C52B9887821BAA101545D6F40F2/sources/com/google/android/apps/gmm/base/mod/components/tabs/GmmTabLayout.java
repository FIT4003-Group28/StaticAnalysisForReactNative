package com.google.android.apps.gmm.base.mod.components.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmTabLayout extends dagg {
    private static final cqrp B = cqrp.d(500.0d);
    private final ArrayList<dafw> C;

    public GmmTabLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.dagg
    public final void a(dafw dafwVar) {
        this.C.add(dafwVar);
        g(dafwVar);
    }

    @Override // defpackage.dagg
    public final void b() {
        this.C.clear();
        super.b();
    }

    @Override // defpackage.dagg
    public final dagb c() {
        dagb c = super.c();
        dage dageVar = c.h;
        dageVar.setClipChildren(false);
        dageVar.setClipToPadding(false);
        return c;
    }

    public final void d(dagb dagbVar) {
        ArrayList arrayList = new ArrayList(this.C);
        b();
        super.p(dagbVar, true);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((dafw) arrayList.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dagg, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(B.e(getContext()), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public GmmTabLayout(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public GmmTabLayout(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = new ArrayList<>();
    }
}
