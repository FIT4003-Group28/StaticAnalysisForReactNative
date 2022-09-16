package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wuv  reason: default package */
/* loaded from: classes7.dex */
public abstract class wuv {
    public static final dcqe v = dcqe.c("wuv");

    public static wuq w() {
        return new wuf();
    }

    public final String A(Resources resources) {
        dgas g = g();
        return (g == null || (g.a & 1) == 0) ? "" : resources.getString(R.string.DIRECTIONS_TAXI_AWAY_TIME, bvtb.c(resources, g, bvsz.ABBREVIATED));
    }

    public final CharSequence B(Resources resources) {
        dgas g = g();
        if (g == null || (g.a & 1) == 0) {
            return "";
        }
        bvsu c = new bvsx(resources).c(R.string.DIRECTIONS_TAXI_WAITING_TIME);
        c.a(bvtb.e(resources, g.b, bvsz.EXTENDED));
        return c.c();
    }

    public final wuv C(int i) {
        wuq u = u();
        u.i(i);
        return u.a();
    }

    public abstract String a();

    public abstract amuk b();

    @dzsi
    public abstract Intent c();

    @dzsi
    public abstract cjta d();

    public abstract boolean e();

    @dzsi
    public abstract String f();

    @dzsi
    public abstract dgas g();

    @dzsi
    public abstract dquj h();

    public abstract boolean i();

    @dzsi
    public abstract wur j();

    @dzsi
    public abstract wus k();

    @dzsi
    public abstract drgz l();

    @dzsi
    public abstract wup m();

    @dzsi
    public abstract String n();

    @dzsi
    public abstract String o();

    public abstract boolean p();

    @dzsi
    public abstract String q();

    @dzsi
    public abstract wuu r();

    public abstract int s();

    public abstract dpej t();

    public abstract wuq u();

    public abstract int v();

    public final wut x() {
        wuu r = r();
        if (r != null) {
            return wut.b(r.a());
        }
        return wut.b(Integer.toString(hashCode()));
    }

    @dzsi
    public final String y(Resources resources) {
        dquj h = h();
        if (h == null) {
            return null;
        }
        return vxc.a(resources, h).toString();
    }

    public final CharSequence z(Resources resources) {
        dquj h = h();
        CharSequence b = h != null ? vxc.b(resources, h) : null;
        return b != null ? b : "";
    }
}
