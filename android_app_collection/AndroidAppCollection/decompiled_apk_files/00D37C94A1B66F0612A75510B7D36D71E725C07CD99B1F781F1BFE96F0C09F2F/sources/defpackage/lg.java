package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: lg  reason: default package */
/* loaded from: classes3.dex */
public class lg {
    public static jw a(View view, jw jwVar) {
        ContentInfo d = jwVar.a.d();
        ContentInfo performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d ? jwVar : new jw(new jt(performReceiveContent));
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bzy i(ccw ccwVar, bwx bwxVar) {
        return new bzy(p(ccwVar, bwxVar, cbx.b));
    }

    public static bzz j(ccw ccwVar, bwx bwxVar) {
        return k(ccwVar, bwxVar, true);
    }

    public static bzz k(ccw ccwVar, bwx bwxVar, boolean z) {
        return new bzz(r(ccwVar, z ? cdh.a() : 1.0f, bwxVar, cbx.a));
    }

    public static caa l(ccw ccwVar, bwx bwxVar, int i) {
        return new caa(p(ccwVar, bwxVar, new cca(i)));
    }

    public static cab m(ccw ccwVar, bwx bwxVar) {
        return new cab(p(ccwVar, bwxVar, cbx.c));
    }

    public static cad n(ccw ccwVar, bwx bwxVar) {
        return new cad(ccf.a(ccwVar, bwxVar, cdh.a(), cbx.e, true));
    }

    public static caf o(ccw ccwVar, bwx bwxVar) {
        return new caf(r(ccwVar, cdh.a(), bwxVar, ccm.a));
    }

    public static List p(ccw ccwVar, bwx bwxVar, ccs ccsVar) {
        return ccf.a(ccwVar, bwxVar, 1.0f, ccsVar, false);
    }

    public static int[] q() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    private static List r(ccw ccwVar, float f, bwx bwxVar, ccs ccsVar) {
        return ccf.a(ccwVar, bwxVar, f, ccsVar, false);
    }

    public void c() {
    }

    public void d(int i, int i2) {
    }

    public void e(int i, int i2, Object obj) {
        d(i, i2);
    }

    public void f(int i, int i2) {
    }

    public void g(int i, int i2) {
    }

    public void h(int i, int i2) {
    }
}
