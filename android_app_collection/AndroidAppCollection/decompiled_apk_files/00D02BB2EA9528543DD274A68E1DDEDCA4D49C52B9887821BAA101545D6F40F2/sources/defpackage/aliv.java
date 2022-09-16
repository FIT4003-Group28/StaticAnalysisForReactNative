package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: aliv  reason: default package */
/* loaded from: classes2.dex */
public final class aliv {
    protected final float a;
    protected final float b;
    protected final long c;
    protected final int d;
    @dzsi
    private MotionEvent e;

    /* JADX INFO: Access modifiers changed from: protected */
    public aliv(MotionEvent motionEvent) {
        this.e = motionEvent;
        int pointerCount = motionEvent.getPointerCount();
        this.d = pointerCount;
        if (pointerCount > 1) {
            int i = 0;
            double y = motionEvent.getY(0);
            int i2 = 0;
            double y2 = motionEvent.getY(0);
            double x = motionEvent.getX(0);
            int i3 = 1;
            double x2 = motionEvent.getX(0);
            int i4 = 0;
            int i5 = 0;
            while (i3 < this.d) {
                int i6 = i;
                int i7 = i2;
                double x3 = motionEvent.getX(i3);
                int i8 = i4;
                int i9 = i5;
                double y3 = motionEvent.getY(i3);
                double d = x2 > x3 ? x3 : x2;
                i8 = x2 > x3 ? i3 : i8;
                double d2 = x < x3 ? x3 : x;
                i9 = x < x3 ? i3 : i9;
                double d3 = y2 > y3 ? y3 : y2;
                i7 = y2 > y3 ? i3 : i7;
                double d4 = y < y3 ? y3 : y;
                if (y < y3) {
                    i6 = i3;
                }
                i3++;
                y = d4;
                i4 = i8;
                i5 = i9;
                y2 = d3;
                x = d2;
                i = i6;
                i2 = i7;
                x2 = d;
            }
            int i10 = i2;
            int i11 = i4;
            double d5 = x - x2;
            double d6 = y - y2;
            int i12 = d5 <= d6 ? i : i5;
            int i13 = d5 <= d6 ? i10 : i11;
            double x4 = motionEvent.getX(i13) - motionEvent.getX(i12);
            double y4 = motionEvent.getY(i13) - motionEvent.getY(i12);
            this.a = (float) Math.atan2(x4, y4);
            this.b = (float) Math.hypot(x4, y4);
        } else {
            this.a = 0.0f;
            this.b = 0.0f;
        }
        this.c = motionEvent.getEventTime();
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.atan2(f3 - f, f4 - f2);
    }

    public final float b(int i) {
        dbsk.t(this.e, "Event has been recycled.");
        return this.e.getX(i);
    }

    public final float c(int i) {
        dbsk.t(this.e, "Event has been recycled.");
        return this.e.getY(i);
    }

    public final void d() {
        dbsk.t(this.e, "Event has been recycled.");
        this.e.recycle();
        this.e = null;
    }
}
