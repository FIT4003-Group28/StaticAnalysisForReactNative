package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: icw  reason: default package */
/* loaded from: classes3.dex */
public final class icw {
    public final List a;
    public final PointF b;
    public final PointF c;
    public final acth d;
    public final int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public actj i;
    private final PointF j;

    public icw(Context context, acth acthVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new PointF();
        this.c = new PointF();
        this.j = new PointF();
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d = acthVar;
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_NON_SAFE_ZONE_SWIPE));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_TAP_SCREEN_RIGHT));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_TAP_SCREEN_LEFT));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_TAP_SCREEN_MIDDLE));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_RIGHT));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_RIGHT_COMPLETE));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_DOWN));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_DOWN_COMPLETE));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_UP));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_UP_COMPLETE));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_LEFT));
        arrayList.add(c(actj.LIGHTWEIGHT_PLAYER_SWIPE_LEFT_COMPLETE));
    }

    public static float a(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(b(pointF, pointF2));
    }

    static float b(PointF pointF, PointF pointF2) {
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        return (f * f) + (f2 * f2);
    }

    static awbs c(actj actjVar) {
        aopa createBuilder = awbs.a.createBuilder();
        int i = actjVar.II;
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        return (awbs) createBuilder.mo39build();
    }

    public final void d() {
        this.f = false;
        this.i = null;
    }

    public final void e() {
        actj actjVar;
        actj actjVar2;
        if (!this.f || a(this.b, this.c) <= this.e) {
            return;
        }
        this.f = false;
        float degrees = (float) Math.toDegrees(Math.atan2(this.c.y - this.b.y, this.c.x - this.b.x));
        if (degrees > -45.0f && degrees < 45.0f) {
            actjVar = actj.LIGHTWEIGHT_PLAYER_SWIPE_RIGHT;
            actjVar2 = actj.LIGHTWEIGHT_PLAYER_SWIPE_RIGHT_COMPLETE;
        } else if (degrees < 45.0f || degrees > 135.0f) {
            if (degrees < -135.0f || degrees > -45.0f) {
                actjVar = actj.LIGHTWEIGHT_PLAYER_SWIPE_LEFT;
                actjVar2 = actj.LIGHTWEIGHT_PLAYER_SWIPE_LEFT_COMPLETE;
            } else if (!this.g) {
                return;
            } else {
                actjVar = actj.LIGHTWEIGHT_PLAYER_SWIPE_UP;
                actjVar2 = actj.LIGHTWEIGHT_PLAYER_SWIPE_UP_COMPLETE;
            }
        } else if (!this.g) {
            return;
        } else {
            actjVar = actj.LIGHTWEIGHT_PLAYER_SWIPE_DOWN;
            actjVar2 = actj.LIGHTWEIGHT_PLAYER_SWIPE_DOWN_COMPLETE;
        }
        h(65, actjVar);
        this.i = actjVar2;
    }

    public final void f(float f, float f2) {
        if (!this.f) {
            return;
        }
        this.j.set(f, f2);
        if (b(this.b, this.j) <= b(this.b, this.c)) {
            return;
        }
        this.c.set(this.j);
    }

    public final void g(float f, float f2) {
        this.b.set(f, f2);
        this.c.set(this.b);
        this.f = true;
        this.i = null;
    }

    public final void h(int i, actj actjVar) {
        this.d.oi().H(i, new acte(actjVar), null);
    }
}
