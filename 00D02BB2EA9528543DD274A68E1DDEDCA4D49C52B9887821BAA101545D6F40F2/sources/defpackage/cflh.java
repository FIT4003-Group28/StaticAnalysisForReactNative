package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: cflh  reason: default package */
/* loaded from: classes4.dex */
public final class cflh extends FrameLayout {
    static final cqkv a = new cfld();
    private cflf b;
    private MotionEvent c;

    public cflh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = cfle.a;
        this.c = null;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(cflh.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, cflf> cqlcVar) {
        return cqjv.g(cflg.a, cqlcVar, a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r0 != 3) goto L9;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L22
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 == r1) goto L10
            r1 = 3
            if (r0 == r1) goto L20
            goto L28
        L10:
            android.view.MotionEvent r0 = r2.c
            if (r0 == 0) goto L28
            int r0 = r3.getActionMasked()
            if (r0 != r1) goto L28
            cflf r0 = r2.b
            r0.a()
            goto L28
        L20:
            r0 = 0
            goto L26
        L22:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3)
        L26:
            r2.c = r0
        L28:
            boolean r3 = super.dispatchTouchEvent(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflh.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnDragListener(cflf cflfVar) {
        this.b = cflfVar;
    }
}
