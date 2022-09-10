package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tlv  reason: default package */
/* loaded from: classes7.dex */
public abstract class tlv {
    private amte a;
    public dcdn<Integer, amub> i;

    public static tlu C() {
        tlk tlkVar = new tlk();
        tlkVar.a = dbpy.a;
        return tlkVar;
    }

    public final dbsg<amub> A(amve amveVar, Context context) {
        dbsg<Integer> w = w(amveVar);
        if (!w.a()) {
            return dbpy.a;
        }
        if (this.i == null) {
            D(context);
        }
        return dbsg.j(this.i.get(w.b()));
    }

    public final amte B(Context context) {
        if (this.a == null) {
            amtd amtdVar = new amtd();
            amtdVar.a = u();
            dqvj c = dqvj.c(p().b().b().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            amtdVar.b = c;
            amtdVar.e(amvj.e(u(), context));
            amtdVar.g = d().f().a;
            dwao dwaoVar = d().k().g;
            if (dwaoVar == null) {
                dwaoVar = dwao.R;
            }
            amtdVar.d(dwaoVar);
            amtdVar.c(d().d());
            this.a = amtdVar.a();
        }
        return this.a;
    }

    public final void D(Context context) {
        if (this.i == null) {
            dcdg p = dcdn.p();
            dcpd<Integer> it = g().keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                amsy u = u();
                dvzy k = d().k();
                int indexOf = c().indexOf(next);
                long j = d().f().a;
                amvh[] e = amvj.e(u, context);
                dwao dwaoVar = k.g;
                if (dwaoVar == null) {
                    dwaoVar = dwao.R;
                }
                amtx aD = amub.aD(u, j, indexOf, context, null, e, false, dwaoVar);
                dbsg i = aD == null ? dbpy.a : dbsg.i(aD.a());
                if (i.a()) {
                    p.f(next, (amub) i.b());
                }
            }
            this.i = p.b();
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract dcdc<Integer> c();

    public abstract tme d();

    public abstract String e();

    public abstract tly f();

    public abstract dcdn<Integer, amve> g();

    public abstract int h();

    public abstract boolean i();

    public abstract dbsg<tli> j();

    public abstract tlu k();

    public dcdc<amve> l() {
        throw null;
    }

    public dcdc<amve> m() {
        throw null;
    }

    public int n() {
        throw null;
    }

    public dcdn<amve, Integer> o() {
        throw null;
    }

    public dbsg<amve> p() {
        throw null;
    }

    public boolean q() {
        throw null;
    }

    public boolean r() {
        throw null;
    }

    public boolean s() {
        throw null;
    }

    public amsy t() {
        throw null;
    }

    public amsy u() {
        throw null;
    }

    public final boolean v(int i) {
        return c().contains(Integer.valueOf(i));
    }

    public final dbsg<Integer> w(amve amveVar) {
        return o().containsKey(amveVar) ? dbsg.j(o().get(amveVar)) : dbpy.a;
    }

    public final dbsg<Integer> x(int i) {
        dcdc<Integer> c = c();
        Integer valueOf = Integer.valueOf(i);
        return c.contains(valueOf) ? dbsg.i(Integer.valueOf(c().indexOf(valueOf))) : dbpy.a;
    }

    public final String y(Activity activity) {
        tlx tlxVar = tlx.UNKNOWN_GROUP;
        if (f().a().ordinal() != 1) {
            return "Unknown Group";
        }
        if (e().equals("OFFLINE-TAXI")) {
            return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_OFFLINE_TAXI);
        }
        if (e().equals("ONLINE-TAXI")) {
            String a = stf.a(activity, dqvj.TAXI);
            dbsk.s(a);
            return a;
        }
        String a2 = stf.a(activity, f().b().b());
        dbsk.s(a2);
        return a2;
    }

    public final dcdc<amub> z(Context context) {
        if (this.i == null) {
            D(context);
        }
        return this.i.values().v();
    }
}
