package defpackage;

import android.content.Context;
import android.location.Location;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vyz  reason: default package */
/* loaded from: classes7.dex */
public final class vyz {
    public static final long a = TimeUnit.MINUTES.toMillis(90);

    public static boolean a(amte amteVar, Location location, float f, Context context) {
        akra e = akra.e(location.getLatitude(), location.getLongitude());
        try {
            List<amub> a2 = amteVar.a(context);
            double d = f;
            double r = e.r();
            Double.isNaN(d);
            double d2 = d * r;
            for (amub amubVar : a2) {
                if (amubVar.V(e, d2) != null) {
                    return true;
                }
            }
            return false;
        } catch (bvon e2) {
            bvoo.j(e2);
            return false;
        }
    }

    public static boolean b(vvy vvyVar) {
        int i = vvyVar.a;
        if ((i & 32) != 0 && (i & 16) != 0) {
            vvw vvwVar = vvyVar.f;
            if (vvwVar == null) {
                vvwVar = vvw.d;
            }
            int a2 = vvv.a(vvwVar.b);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 6 && a2 != 5 && a2 != 9) {
                vvw vvwVar2 = vvyVar.f;
                if (vvwVar2 == null) {
                    vvwVar2 = vvw.d;
                }
                int a3 = vvv.a(vvwVar2.b);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 != 2 && a3 != 3 && a3 != 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c(Context context, Executor executor, Executor executor2, vyy vyyVar) {
        new vzc(context, executor, executor2).c(vzd.NAVIGATION_RESTORE, new vyx(vyyVar));
    }

    public static boolean d(vvy vvyVar, @dzsi Location location) {
        if (location == null) {
            vvw vvwVar = vvyVar.f;
            if (vvwVar == null) {
                vvwVar = vvw.d;
            }
            if ((vvwVar.a & 2) == 0) {
                return false;
            }
            location = new Location("");
            vvw vvwVar2 = vvyVar.f;
            if (vvwVar2 == null) {
                vvwVar2 = vvw.d;
            }
            dnoh dnohVar = vvwVar2.c;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            location.setLatitude(dnohVar.b);
            vvw vvwVar3 = vvyVar.f;
            if (vvwVar3 == null) {
                vvwVar3 = vvw.d;
            }
            dnoh dnohVar2 = vvwVar3.c;
            if (dnohVar2 == null) {
                dnohVar2 = dnoh.d;
            }
            location.setLongitude(dnohVar2.c);
        }
        dwaw dwawVar = vvyVar.b;
        if (dwawVar == null) {
            dwawVar = dwaw.j;
        }
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        dpjx dpjxVar = (dpjx) dcft.s(dvzyVar.d);
        if ((dpjxVar.a & 4) != 0) {
            Location location2 = new Location("");
            dnoh dnohVar3 = dpjxVar.d;
            if (dnohVar3 == null) {
                dnohVar3 = dnoh.d;
            }
            location2.setLatitude(dnohVar3.b);
            dnoh dnohVar4 = dpjxVar.d;
            if (dnohVar4 == null) {
                dnohVar4 = dnoh.d;
            }
            location2.setLongitude(dnohVar4.c);
            if (location.distanceTo(location2) < 500.0f) {
                return true;
            }
        }
        return false;
    }
}
