package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: twq  reason: default package */
/* loaded from: classes7.dex */
public class twq implements tvx {
    public static final dcep<dozy> a = dcep.E(dozy.TRAFFIC_ONE_LINER, dozy.TRAFFIC_PROBLEM, dozy.TRAFFIC_PROMPT, dozy.TRAFFIC_TREND);
    public static final int b = R.id.trip_card_primary_notice;
    private final cqtd c;
    @dzsi
    private final CharSequence d;

    public twq(Activity activity, vpd vpdVar, vtn vtnVar, tlv tlvVar, amve amveVar, boolean z) {
        dbsg dbsgVar;
        dozz next;
        dqvj c = dqvj.c(amveVar.b().b);
        if ((c == null ? dqvj.DRIVE : c) != dqvj.DRIVE) {
            dbsgVar = dbpy.a;
        } else {
            dphv b2 = dphv.b(amveVar.a.z);
            b2 = b2 == null ? dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION : b2;
            if (vpdVar.b(b2) || vph.g(b2) == null) {
                dbsgVar = dbpy.a;
            } else {
                dbsgVar = dbsg.i(b2);
            }
        }
        if (!dbsgVar.a()) {
            if ((!amveVar.f().c || !i(amveVar, z).booleanValue()) && dcgh.b(h(amveVar)) > 1) {
                this.d = activity.getResources().getQuantityString(R.plurals.ALERTS_DISPLAYED_ON_TRIP_CARD, amveVar.b().j.size(), Integer.valueOf(amveVar.b().j.size())).trim();
                this.c = vyt.g;
                return;
            }
            if (i(amveVar, z).booleanValue()) {
                next = amveVar.q();
            } else {
                next = h(amveVar).next();
            }
            alcb a2 = alcc.a();
            a2.a = activity;
            a2.b = vtnVar;
            alcc a3 = a2.a();
            CharSequence b3 = a3.b(next.n);
            this.d = b3.length() == 0 ? a3.b(next.m) : b3;
            this.c = yzx.a(next, vtnVar, vyt.g);
            return;
        }
        this.d = f(activity, vpdVar, (dphv) dbsgVar.b(), tlvVar, amveVar);
        this.c = vyt.g;
    }

    @dzsi
    public static CharSequence f(Activity activity, vpd vpdVar, dphv dphvVar, tlv tlvVar, amve amveVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        if (vpdVar.a()) {
            dphv b2 = dphv.b(amveVar.a.z);
            if (b2 == null) {
                b2 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
            }
            dqvj c = dqvj.c(amveVar.b().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            for (int i = 0; i < tlvVar.t().n(); i++) {
                dqvj c2 = dqvj.c(tlvVar.t().m(i).b().b);
                if (c2 == null) {
                    c2 = dqvj.DRIVE;
                }
                if (c2 == c) {
                    dphv b3 = dphv.b(tlvVar.t().m(i).a.z);
                    if (b3 == null) {
                        b3 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
                    }
                    if (b3 != b2) {
                    }
                }
            }
            Resources resources = activity.getResources();
            if (vpdVar.d(vpc.MANILA)) {
                dbsgVar2 = dbsg.i(Integer.valueOf((int) R.string.ROUTES_ALL_GO_THROUGH_MANILA_AREA));
            } else {
                dbsgVar2 = dbpy.a;
            }
            return vph.j(resources, dphvVar, R.string.ROUTES_ALL_CONTAIN_ODD_PLATE_ROADS, R.string.ROUTES_ALL_CONTAIN_EVEN_PLATE_ROADS, R.string.ROUTES_ALL_GO_THROUGH_RODIZIO_AREA, dbsgVar2);
        }
        Resources resources2 = activity.getResources();
        if (vpdVar.d(vpc.MANILA)) {
            dbsgVar = dbsg.i(Integer.valueOf((int) R.string.ROUTE_GOES_THROUGH_MANILA_AREA));
        } else {
            dbsgVar = dbpy.a;
        }
        return vph.j(resources2, dphvVar, R.string.ROUTE_INCLUDES_ODD_PLATE_ROADS, R.string.ROUTE_INCLUDES_EVEN_PLATE_ROADS, R.string.ROUTE_GOES_THROUGH_RODIZIO_AREA, dbsgVar);
    }

    public static Boolean g(amve amveVar, boolean z) {
        boolean z2 = true;
        if (!h(amveVar).hasNext() && !i(amveVar, z).booleanValue()) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    private static Iterator<dozz> h(amve amveVar) {
        return dcft.i(amveVar.b().j, twp.a).iterator();
    }

    private static Boolean i(amve amveVar, boolean z) {
        boolean z2 = false;
        if (!amveVar.p() || !z) {
            return false;
        }
        dozz q = amveVar.q();
        doza b2 = doza.b(q.e);
        if (b2 == null) {
            b2 = doza.INFORMATION;
        }
        if (b2 != doza.INFORMATION) {
            dcep<dozy> dcepVar = a;
            dozy b3 = dozy.b(q.f);
            if (b3 == null) {
                b3 = dozy.UNKNOWN;
            }
            if (!dcepVar.contains(b3)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.tvx
    public cqtd a() {
        return this.c;
    }

    @Override // defpackage.tvx
    public Boolean b() {
        return true;
    }

    @Override // defpackage.tvx
    public Boolean c() {
        return true;
    }

    @Override // defpackage.tvx
    @dzsi
    public CharSequence d() {
        return this.d;
    }

    @Override // defpackage.tvx
    public Integer e() {
        return Integer.valueOf(b);
    }
}
