package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: aega  reason: default package */
/* loaded from: classes.dex */
final class aega extends GestureDetector.SimpleOnGestureListener {
    private final aegc a;
    private final float b;
    @dzsi
    private final cjqy c;
    @dzsi
    private final cjtd d;

    public aega(aegc aegcVar, float f, @dzsi cjqy cjqyVar, @dzsi cjtd cjtdVar) {
        this.a = aegcVar;
        this.b = f;
        this.c = cjqyVar;
        this.d = cjtdVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int w;
        cjql e;
        if (this.b != 1.0f) {
            w = (int) (bvsc.b(this.a.o()) * this.b);
        } else {
            w = this.a.w();
        }
        if (w > this.a.c()) {
            this.a.f(w, true);
            if (this.c != null && this.d != null && (e = cjqg.e(this.a.o())) != null) {
                this.c.n(e, new cjte(deaf.TAP), this.d);
            }
        }
        return true;
    }
}
