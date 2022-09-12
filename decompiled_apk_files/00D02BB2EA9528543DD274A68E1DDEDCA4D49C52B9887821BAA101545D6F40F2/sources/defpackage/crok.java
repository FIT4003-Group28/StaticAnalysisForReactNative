package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crok  reason: default package */
/* loaded from: classes5.dex */
public final class crok {
    static final long a = TimeUnit.SECONDS.toMillis(60);
    public final croj b = new croj();
    public final List<croi> c = dchl.a();
    public final List<ddoc> d = dchl.a();
    @dzsi
    public akra e = null;
    @dzsi
    public GmmLocation f = null;

    public static boolean c(amvh[] amvhVarArr, amvh[] amvhVarArr2) {
        if (amvhVarArr.length == amvhVarArr2.length) {
            for (int i = 1; i < amvhVarArr.length; i++) {
                akqq akqqVar = amvhVarArr[i].e;
                if (akqqVar == null || amvhVarArr2[i].e == null || !akra.f(akqqVar).equals(akra.f(amvhVarArr2[i].e))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final croi a() {
        if (this.c.size() == 1) {
            return this.c.get(0);
        }
        dqvj dqvjVar = this.c.get(0).b;
        Iterator<croi> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().b != dqvjVar) {
                dqvjVar = dqvj.MIXED;
                break;
            }
        }
        croi croiVar = new croi(0L, dqvjVar, ((croi) dcft.s(this.c)).c, ((croi) dcft.s(this.c)).d);
        croiVar.f = true;
        for (croi croiVar2 : this.c) {
            croiVar.f = croiVar.f && croiVar2.f;
        }
        for (croi croiVar3 : this.c) {
            croiVar.g += croiVar3.g;
            croiVar.i += croiVar3.i;
            if (croiVar.f) {
                croiVar.h += croiVar3.h;
            }
        }
        return croiVar;
    }

    public final int b(croi croiVar) {
        GmmLocation gmmLocation = this.f;
        dbsk.s(gmmLocation);
        float E = gmmLocation.E(croiVar.d);
        akra akraVar = this.e;
        dbsk.s(akraVar);
        double y = akraVar.y(croiVar.d);
        double r = croiVar.d.r();
        Double.isNaN(y);
        double d = y / r;
        double d2 = E;
        Double.isNaN(d2);
        return (int) Math.round(((d - d2) / d) * 100.0d);
    }

    public final String toString() {
        if (this.c.isEmpty()) {
            return "RouteStats{}";
        }
        croi a2 = a();
        dbsb b = dbsc.b(this);
        a2.a(b);
        for (int i = 0; i < this.d.size(); i++) {
            b.b(Integer.toString(i), this.d.get(i));
        }
        akra akraVar = a2.d;
        if (this.e != null && this.f != null) {
            b.f("PROGRESS_PERCENTAGE", b(a2));
        }
        b.b("ROUTE_SOURCES", this.b.toString());
        return b.toString();
    }
}
