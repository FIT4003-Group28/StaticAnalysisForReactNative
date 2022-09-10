package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vyw  reason: default package */
/* loaded from: classes7.dex */
public final class vyw {
    private static final long a = TimeUnit.DAYS.toMillis(1);

    public static void a(@dzsi vvy vvyVar, vzc vzcVar) {
        if (vvyVar != null) {
            dwbc dwbcVar = vvyVar.c;
            if (dwbcVar == null) {
                dwbcVar = dwbc.g;
            }
            dwaa dwaaVar = dwbcVar.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            dvzu dvzuVar = dwaaVar.b;
            if (dvzuVar == null) {
                dvzuVar = dvzu.F;
            }
            if (dvzuVar.e.size() <= 0 || dvzuVar.b.size() < 2) {
                return;
            }
            dpjn dpjnVar = dvzuVar.b.get(0).b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            dpjx dpjxVar = dpjnVar.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            if ((dpjxVar.a & 4) == 0) {
                return;
            }
            vzcVar.b(vzd.OFFLINE_NAVIGATION_RESTORE, vvyVar);
        }
    }

    public static void b(vzc vzcVar) {
        vzcVar.a(vzd.OFFLINE_NAVIGATION_RESTORE);
    }

    public static boolean c(@dzsi GmmLocation gmmLocation, Application application, cqat cqatVar, btvo btvoVar, vzc vzcVar) {
        amte a2;
        if (gmmLocation == null) {
            return false;
        }
        vvy d = vzcVar.d(vzd.OFFLINE_NAVIGATION_RESTORE);
        if (d != null) {
            if (cqatVar.b() > a + d.d) {
                vzcVar.a(vzd.OFFLINE_NAVIGATION_RESTORE);
            }
            return d == null && (a2 = vze.a(d, application)) != null && vyz.a(a2, gmmLocation, (float) d(btvoVar), application);
        }
        d = null;
        if (d == null) {
            return false;
        }
    }

    public static int d(btvo btvoVar) {
        return btvoVar.getNavigationParameters().s().a;
    }

    @dzsi
    public static vvy e(vzc vzcVar) {
        vvy d = vzcVar.d(vzd.OFFLINE_NAVIGATION_RESTORE);
        if (d != null) {
            return d;
        }
        return null;
    }
}
