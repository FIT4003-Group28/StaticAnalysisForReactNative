package defpackage;

import android.graphics.Point;
/* compiled from: PG */
/* renamed from: alrh  reason: default package */
/* loaded from: classes.dex */
public final class alrh {
    private final akzh a;

    public alrh(akzh akzhVar) {
        this.a = akzhVar;
    }

    @dzsi
    public final akqq a(Point point) {
        akra s = akyx.s(this.a, point.x, point.y, new float[8]);
        if (s == null) {
            return null;
        }
        return akqg.b(s);
    }

    @dzsi
    public final Point b(akqq akqqVar) {
        int[] n = akyx.n(this.a, akqg.a(akqqVar));
        if (n == null) {
            return null;
        }
        return new Point(n[0], n[1]);
    }

    public final aksg c() {
        aksi r = this.a.r();
        return new aksg(akqg.b(r.c()), akqg.b(r.d()), akqg.b(r.a[3]), akqg.b(r.e()), akqg.d(r.c));
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("camera", this.a);
        return b.toString();
    }
}
