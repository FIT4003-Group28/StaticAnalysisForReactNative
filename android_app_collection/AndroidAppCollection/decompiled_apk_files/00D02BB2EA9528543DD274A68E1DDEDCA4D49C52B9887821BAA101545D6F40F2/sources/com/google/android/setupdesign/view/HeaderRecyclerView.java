package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class HeaderRecyclerView extends RecyclerView {
    public View S;
    private int T;
    private boolean U;

    public HeaderRecyclerView(Context context) {
        super(context);
        this.U = false;
        a(null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dapf.g, i, 0);
        this.T = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r1 != false) goto L6;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.U
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            int r0 = r6.getAction()
            if (r0 != r2) goto L10
            r5.U = r1
            goto L89
        L10:
            int r0 = r6.getAction()
            if (r0 != 0) goto L8a
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 2
            if (r0 == r3) goto L59
            r3 = 20
            if (r0 == r3) goto L24
            goto L84
        L24:
            android.view.View r0 = r5.findFocus()
            if (r0 != 0) goto L2b
            goto L84
        L2b:
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r3 = r3[r2]
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            r0 = r4[r2]
            int r4 = r5.getMeasuredHeight()
            int r0 = r0 + r4
            int r3 = r3 - r0
            if (r3 <= 0) goto L84
            int r0 = r5.getMeasuredHeight()
            float r0 = (float) r0
            r4 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r4
            int r0 = (int) r0
            int r0 = java.lang.Math.min(r0, r3)
            r5.t(r1, r0)
            goto L83
        L59:
            android.view.View r0 = r5.findFocus()
            if (r0 != 0) goto L60
            goto L84
        L60:
            int[] r3 = new int[r4]
            int[] r4 = new int[r4]
            r0.getLocationInWindow(r3)
            r5.getLocationInWindow(r4)
            r0 = r3[r2]
            r3 = r4[r2]
            int r0 = r0 - r3
            if (r0 >= 0) goto L84
            int r3 = r5.getMeasuredHeight()
            float r3 = (float) r3
            r4 = -1087163597(0xffffffffbf333333, float:-0.7)
            float r3 = r3 * r4
            int r3 = (int) r3
            int r0 = java.lang.Math.max(r3, r0)
            r5.t(r1, r0)
        L83:
            r1 = 1
        L84:
            r5.U = r1
            if (r1 != 0) goto L89
            goto L8a
        L89:
            return r2
        L8a:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.HeaderRecyclerView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.S != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(abg abgVar) {
        if (this.S != null && abgVar != null) {
            daqc daqcVar = new daqc(abgVar);
            daqcVar.a = this.S;
            abgVar = daqcVar;
        }
        super.setAdapter(abgVar);
    }

    public void setHeader(View view) {
        this.S = view;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(abs absVar) {
        super.setLayoutManager(absVar);
        if (absVar == null || this.S != null || this.T == 0) {
            return;
        }
        this.S = LayoutInflater.from(getContext()).inflate(this.T, (ViewGroup) this, false);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = false;
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.U = false;
        a(attributeSet, i);
    }
}
