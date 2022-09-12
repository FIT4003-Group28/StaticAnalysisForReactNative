package defpackage;

import android.view.GestureDetector;
/* compiled from: PG */
/* renamed from: atoe  reason: default package */
/* loaded from: classes2.dex */
final class atoe extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ atog a;

    public atoe(atog atogVar) {
        this.a = atogVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 < 0.0f) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        r3.v = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 > 0.0f) goto L10;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
        /*
            r2 = this;
            float r3 = java.lang.Math.abs(r5)
            float r4 = java.lang.Math.abs(r6)
            r6 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto Le
            return r6
        Le:
            atog r3 = r2.a
            boolean r3 = r3.q()
            r4 = 2
            r0 = 3
            r1 = 0
            if (r3 == 0) goto L20
            atog r3 = r2.a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L27
            goto L28
        L20:
            atog r3 = r2.a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L27
            goto L28
        L27:
            r4 = 3
        L28:
            r3.v = r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atoe.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
