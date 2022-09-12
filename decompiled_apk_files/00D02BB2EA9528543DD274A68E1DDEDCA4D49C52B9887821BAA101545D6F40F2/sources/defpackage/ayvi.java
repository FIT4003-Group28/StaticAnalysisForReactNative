package defpackage;

import android.app.Activity;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: ayvi  reason: default package */
/* loaded from: classes3.dex */
public class ayvi extends aywq {
    private boolean c;
    private final ayvf d;
    private final int e;

    public ayvi(Activity activity, cqhn cqhnVar, cklf cklfVar, baad baadVar, ayvf ayvfVar) {
        super(activity, cklfVar, baadVar);
        this.d = ayvfVar;
        this.c = false;
        this.e = (int) TypedValue.applyDimension(1, 38.0f, activity.getApplicationContext().getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r4.getTop() > r2.e) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3.Z(r3.getChildAt(0)) > 0) goto L15;
     */
    @Override // defpackage.abx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.support.v7.widget.RecyclerView r3, int r4, int r5) {
        /*
            r2 = this;
            ayvf r4 = r2.d
            java.lang.Boolean r4 = r4.J()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto Ld
            return
        Ld:
            boolean r4 = r2.c
            boolean r5 = r2.a
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L2e
            abs r3 = r3.l
            if (r3 == 0) goto L3b
            android.view.View r4 = r3.I(r0)
            android.view.View r3 = r3.I(r1)
            if (r3 == 0) goto L38
            if (r4 == 0) goto L3a
            int r3 = r4.getTop()
            int r4 = r2.e
            if (r3 > r4) goto L3a
            goto L38
        L2e:
            android.view.View r4 = r3.getChildAt(r1)
            int r3 = r3.Z(r4)
            if (r3 <= 0) goto L3a
        L38:
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            boolean r3 = r2.c
            if (r3 == r4) goto L46
            r2.c = r4
            ayvf r3 = r2.d
            defpackage.cqkx.p(r3)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayvi.a(android.support.v7.widget.RecyclerView, int, int):void");
    }

    @Override // defpackage.aywq, defpackage.ayvg
    public Boolean d() {
        return n(this.d.j());
    }

    @Override // defpackage.aywq, defpackage.ayvg
    public Boolean e() {
        return n(this.d.k());
    }

    public void l() {
        this.a = true;
        this.c = false;
    }

    public Boolean m() {
        return Boolean.valueOf(this.c);
    }
}
