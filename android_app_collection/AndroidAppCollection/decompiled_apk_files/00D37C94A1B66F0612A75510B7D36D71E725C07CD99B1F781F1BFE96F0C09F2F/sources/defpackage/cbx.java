package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: cbx  reason: default package */
/* loaded from: classes2.dex */
public final class cbx implements ccs {
    private final /* synthetic */ int g;
    public static final cbx f = new cbx(5);
    public static final cbx e = new cbx(4);
    public static final cbx d = new cbx(3);
    public static final cbx c = new cbx(2);
    public static final cbx b = new cbx(1);
    public static final cbx a = new cbx();

    private cbx() {
    }

    private cbx(int i) {
        this.g = i;
    }

    @Override // defpackage.ccs
    public final /* bridge */ /* synthetic */ Object a(ccw ccwVar, float f2) {
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                int r = ccwVar.r();
                if (r == 1) {
                    ccwVar.i();
                }
                double a2 = ccwVar.a();
                double a3 = ccwVar.a();
                double a4 = ccwVar.a();
                double a5 = ccwVar.r() == 7 ? ccwVar.a() : 1.0d;
                if (r == 1) {
                    ccwVar.k();
                }
                if (a2 <= 1.0d && a3 <= 1.0d && a4 <= 1.0d) {
                    a2 *= 255.0d;
                    a3 *= 255.0d;
                    a4 *= 255.0d;
                    if (a5 <= 1.0d) {
                        a5 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) a5, (int) a2, (int) a3, (int) a4));
            } else if (i == 2) {
                return Integer.valueOf(Math.round(ccd.a(ccwVar) * f2));
            } else {
                if (i == 3) {
                    return ccd.c(ccwVar, f2);
                }
                if (i == 4) {
                    int r2 = ccwVar.r();
                    if (r2 == 1) {
                        return ccd.c(ccwVar, f2);
                    }
                    if (r2 == 3) {
                        return ccd.c(ccwVar, f2);
                    }
                    if (r2 == 7) {
                        PointF pointF = new PointF(((float) ccwVar.a()) * f2, ((float) ccwVar.a()) * f2);
                        while (ccwVar.p()) {
                            ccwVar.o();
                        }
                        return pointF;
                    }
                    String f3 = na.f(r2);
                    StringBuilder sb = new StringBuilder(f3.length() + 44);
                    sb.append("Cannot convert json to point. Next token is ");
                    sb.append(f3);
                    throw new IllegalArgumentException(sb.toString());
                }
                int r3 = ccwVar.r();
                if (r3 == 1) {
                    ccwVar.i();
                }
                float a6 = (float) ccwVar.a();
                float a7 = (float) ccwVar.a();
                while (ccwVar.p()) {
                    ccwVar.o();
                }
                if (r3 == 1) {
                    ccwVar.k();
                }
                return new cdk((a6 / 100.0f) * f2, (a7 / 100.0f) * f2);
            }
        }
        return Float.valueOf(ccd.a(ccwVar) * f2);
    }
}
