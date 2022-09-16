package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ccd  reason: default package */
/* loaded from: classes2.dex */
final class ccd {
    private static final ccv a = ccv.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(ccw ccwVar) {
        int r = ccwVar.r();
        int i = r - 1;
        if (i == 0) {
            ccwVar.i();
            float a2 = (float) ccwVar.a();
            while (ccwVar.p()) {
                ccwVar.o();
            }
            ccwVar.k();
            return a2;
        } else if (i != 6) {
            String f = na.f(r);
            StringBuilder sb = new StringBuilder(f.length() + 32);
            sb.append("Unknown value for token of type ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else {
            return (float) ccwVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(ccw ccwVar) {
        ccwVar.i();
        int a2 = (int) (ccwVar.a() * 255.0d);
        int a3 = (int) (ccwVar.a() * 255.0d);
        int a4 = (int) (ccwVar.a() * 255.0d);
        while (ccwVar.p()) {
            ccwVar.o();
        }
        ccwVar.k();
        return Color.argb((int) PrivateKeyType.INVALID, a2, a3, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(ccw ccwVar, float f) {
        int r = ccwVar.r() - 1;
        if (r == 0) {
            ccwVar.i();
            float a2 = (float) ccwVar.a();
            float a3 = (float) ccwVar.a();
            while (ccwVar.r() != 2) {
                ccwVar.o();
            }
            ccwVar.k();
            return new PointF(a2 * f, a3 * f);
        } else if (r != 2) {
            if (r == 6) {
                float a4 = (float) ccwVar.a();
                float a5 = (float) ccwVar.a();
                while (ccwVar.p()) {
                    ccwVar.o();
                }
                return new PointF(a4 * f, a5 * f);
            }
            String f2 = na.f(ccwVar.r());
            StringBuilder sb = new StringBuilder(f2.length() + 26);
            sb.append("Unknown point starts with ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ccwVar.j();
            float f3 = 0.0f;
            float f4 = 0.0f;
            while (ccwVar.p()) {
                int c = ccwVar.c(a);
                if (c == 0) {
                    f3 = a(ccwVar);
                } else if (c == 1) {
                    f4 = a(ccwVar);
                } else {
                    ccwVar.n();
                    ccwVar.o();
                }
            }
            ccwVar.l();
            return new PointF(f3 * f, f4 * f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List d(ccw ccwVar, float f) {
        ArrayList arrayList = new ArrayList();
        ccwVar.i();
        while (ccwVar.r() == 1) {
            ccwVar.i();
            arrayList.add(c(ccwVar, f));
            ccwVar.k();
        }
        ccwVar.k();
        return arrayList;
    }
}
