package defpackage;

import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: alxt  reason: default package */
/* loaded from: classes.dex */
public final class alxt implements View.OnTouchListener {
    public final long a;
    public final View b;
    private final int c;
    private final int d;
    private final int e;
    private final alxs f;
    private int g = 1;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private VelocityTracker l;
    private float m;

    public alxt(View view, alxs alxsVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.c = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = view.getContext().getResources().getInteger(17694720);
        this.b = view;
        this.f = alxsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
        if (r11 > 0.0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
        if (r10.l.getXVelocity() > 0.0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014e, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
        r11 = false;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alxt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
