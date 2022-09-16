package com.google.android.apps.youtube.app.common.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScrollToTopLinearLayoutManager extends OverScrollLinearLayoutManager implements akak {
    public int b;
    public boolean c = true;

    @Override // defpackage.xw
    public final void aM(RecyclerView recyclerView) {
        this.b = 0;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final boolean ae() {
        return this.c && super.ae();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void ao(RecyclerView recyclerView, int i) {
        c(recyclerView, i, 0);
    }

    @Override // defpackage.akak
    public final void c(RecyclerView recyclerView, int i, int i2) {
        fre freVar = new fre(this, recyclerView.getContext(), Math.abs(i - I()) <= 2, i2);
        freVar.b = i;
        bd(freVar);
    }

    @Override // com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager, android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final int e(int i, yd ydVar, yl ylVar) {
        int e = super.e(i, ydVar, ylVar);
        this.b += e;
        return e;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void n(yd ydVar, yl ylVar) {
        try {
            super.n(ydVar, ylVar);
        } catch (ClassCastException e) {
            View aA = aA();
            if (aA == null || aA.getLayoutParams() == null || (aA.getLayoutParams() instanceof xx)) {
                throw e;
            }
            String valueOf = String.valueOf(aA);
            String name = aA.getLayoutParams().getClass().getName();
            String valueOf2 = String.valueOf(aA.getParent());
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(name).length() + String.valueOf(valueOf2).length());
            sb.append("UnsafeLayoutParams.\nFOCUSED VIEW: ");
            sb.append(valueOf);
            sb.append(" LayoutParams:");
            sb.append(name);
            sb.append("\nPARENT  VIEW: ");
            sb.append(valueOf2);
            sb.append("\n");
            boolean d = afus.d(2, 25, sb.toString(), e, 0.05000000074505806d);
            if (!(aA.getParent() instanceof ViewGroup)) {
                throw e;
            }
            ((ViewGroup) aA.getParent()).clearFocus();
            try {
                super.n(ydVar, ylVar);
            } catch (ClassCastException e2) {
                if (d) {
                    afus.c(2, 25, "UnsafeLayoutParams clear focus and retry layout failed.\n", e2);
                }
                throw e2;
            }
        }
    }
}
