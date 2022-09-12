package com.google.android.apps.gmm.base.components.gmmrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmRecyclerView extends RecyclerView {
    private float S;
    private float T;
    private final List<abw> U;

    public GmmRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(int r6, int r7, defpackage.fzn r8) {
        /*
            r5 = this;
            boolean r0 = defpackage.od.ac(r5)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L26
            if (r6 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r3 = 2
            if (r7 == 0) goto L12
            r4 = 2
            goto L13
        L12:
            r4 = 0
        L13:
            r0 = r0 | r4
            boolean r0 = defpackage.od.aa(r5, r0)
            if (r0 == 0) goto L26
            int[] r0 = new int[r3]
            defpackage.od.aB(r5, r6, r7, r0)
            r2 = r0[r2]
            int r6 = r6 - r2
            r0 = r0[r1]
            int r7 = r7 - r0
            goto L27
        L26:
            r1 = 0
        L27:
            r8.a(r6, r7)
            if (r1 == 0) goto L2f
            defpackage.od.ab(r5)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView.a(int, int, fzn):void");
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> aw(cqjb<T, cqiv> cqjbVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.gmm_recycler_view, cqqx.F(), cqgr.ck(cqjbVar));
        bt.f(cqmpVarArr);
        return bt;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> ax(cqlc<T, List<cqix>> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.gmm_recycler_view, cqqx.F(), cqgr.an(cqlcVar));
        bt.f(cqmpVarArr);
        return bt;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void D(abw abwVar) {
        super.D(abwVar);
        this.U.add(abwVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void E(abw abwVar) {
        this.U.remove(abwVar);
        super.E(abwVar);
    }

    public final /* synthetic */ void ay(int i, int i2) {
        super.t(i, i2);
    }

    public final /* synthetic */ void az(int i, int i2) {
        super.scrollBy(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.U.isEmpty()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (action == 2) {
            boolean z = true;
            boolean z2 = this.l.D() && !this.l.E();
            if (this.l.D() || !this.l.E()) {
                z = false;
            }
            float abs = Math.abs(this.S - motionEvent.getX());
            float abs2 = Math.abs(this.T - motionEvent.getY());
            if ((z2 && abs < abs2) || (z && abs > abs2)) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void scrollBy(int i, int i2) {
        a(i, i2, new fzn(this) { // from class: fzl
            private final GmmRecyclerView a;

            {
                this.a = this;
            }

            @Override // defpackage.fzn
            public final void a(int i3, int i4) {
                this.a.az(i3, i4);
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void t(int i, int i2) {
        a(i, i2, new fzn(this) { // from class: fzm
            private final GmmRecyclerView a;

            {
                this.a = this;
            }

            @Override // defpackage.fzn
            public final void a(int i3, int i4) {
                this.a.ay(i3, i4);
            }
        });
    }
}
