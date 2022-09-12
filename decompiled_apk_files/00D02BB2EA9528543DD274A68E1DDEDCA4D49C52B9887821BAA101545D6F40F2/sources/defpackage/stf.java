package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: stf  reason: default package */
/* loaded from: classes7.dex */
public final class stf {
    private static final dcqe a = dcqe.c("stf");
    private static final cqrp b = cqrp.d(14.0d);

    @dzsi
    public static String a(Activity activity, dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        switch (dqvjVar.ordinal()) {
            case 0:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_DRIVE);
            case 1:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_BICYCLE);
            case 2:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_WALK);
            case 3:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_TRANSIT);
            case 4:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_FLY);
            case 5:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_TWO_WHEELER);
            case 6:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_MIXED_MODES);
            case 7:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_RIDESHARING);
            case 8:
                return activity.getString(R.string.TRAVEL_MODE_TITLE_TEXT_BIKESHARING);
            default:
                bvoo.h("Unknown or unsupported Travel Mode title requested.", new Object[0]);
                return null;
        }
    }

    public static CharSequence b(Activity activity, @dzsi CharSequence charSequence, @dzsi CharSequence charSequence2) {
        return j(activity, charSequence, charSequence2);
    }

    public static CharSequence c(Activity activity, @dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3) {
        return j(activity, charSequence, charSequence2, charSequence3);
    }

    public static CharSequence d(Activity activity) {
        bvsx bvsxVar = new bvsx(activity.getResources());
        Drawable a2 = itd.c().a(activity);
        cqrp cqrpVar = b;
        Spannable f = bvsxVar.f(a2, cqrpVar.e(activity), cqrpVar.e(activity));
        bvsu c = bvsxVar.c(R.string.NO_TRAFFIC_DATA);
        bvsv a3 = bvsxVar.a(f);
        a3.g(" ");
        a3.f(c);
        return a3.c();
    }

    @dzsi
    public static String e(Activity activity, amve amveVar) {
        if (!amveVar.r() || !amveVar.s().j) {
            return null;
        }
        return activity.getResources().getString(R.string.MOSTLY_FLAT_ROUTE);
    }

    @dzsi
    public static String f(Context context, amve amveVar, cqat cqatVar, @dzsi dosz doszVar, boolean z) {
        if (z && doszVar != null) {
            int a2 = dquo.a(doszVar.b);
            if (a2 != 0 && a2 == 2) {
                doxd doxdVar = amveVar.b().k;
                if (doxdVar == null) {
                    doxdVar = doxd.l;
                }
                if ((doxdVar.a & 256) != 0) {
                    doxd doxdVar2 = amveVar.b().k;
                    if (doxdVar2 == null) {
                        doxdVar2 = doxd.l;
                    }
                    dgaw dgawVar = doxdVar2.i;
                    if (dgawVar == null) {
                        dgawVar = dgaw.g;
                    }
                    if ((dgawVar.a & 1) != 0) {
                        doxd doxdVar3 = amveVar.b().k;
                        if (doxdVar3 == null) {
                            doxdVar3 = doxd.l;
                        }
                        dgaw dgawVar2 = doxdVar3.i;
                        if (dgawVar2 == null) {
                            dgawVar2 = dgaw.g;
                        }
                        Calendar q = bvtb.q(dgawVar2);
                        int c = bvsk.c(cqatVar, q);
                        return context.getString((c & 16) > 0 ? R.string.DIRECTIONS_LEAVE_AROUND_TIME_AND_DATE : R.string.DIRECTIONS_LEAVE_AROUND_TIME, bvsk.a(context, q, c));
                    }
                }
            }
            int a3 = dquo.a(doszVar.b);
            if (a3 == 0 || a3 == 1) {
                doxd doxdVar4 = amveVar.b().k;
                if (doxdVar4 == null) {
                    doxdVar4 = doxd.l;
                }
                if ((doxdVar4.a & 128) != 0) {
                    doxd doxdVar5 = amveVar.b().k;
                    if (doxdVar5 == null) {
                        doxdVar5 = doxd.l;
                    }
                    dgaw dgawVar3 = doxdVar5.h;
                    if (dgawVar3 == null) {
                        dgawVar3 = dgaw.g;
                    }
                    if ((dgawVar3.a & 1) != 0) {
                        doxd doxdVar6 = amveVar.b().k;
                        if (doxdVar6 == null) {
                            doxdVar6 = doxd.l;
                        }
                        dgaw dgawVar4 = doxdVar6.h;
                        if (dgawVar4 == null) {
                            dgawVar4 = dgaw.g;
                        }
                        Calendar q2 = bvtb.q(dgawVar4);
                        int c2 = bvsk.c(cqatVar, q2);
                        return context.getString((c2 & 16) > 0 ? R.string.DIRECTIONS_ARRIVE_AROUND_TIME_AND_DATE : R.string.DIRECTIONS_ARRIVE_AROUND_TIME, bvsk.a(context, q2, c2));
                    }
                }
            }
        }
        return null;
    }

    public static CharSequence h(Activity activity, vtn vtnVar, amve amveVar) {
        dozz q = amveVar.q();
        dozy b2 = dozy.b(q.f);
        if (b2 == null) {
            b2 = dozy.UNKNOWN;
        }
        if (b2 == dozy.CRISIS) {
            return "";
        }
        alcb a2 = alcc.a();
        a2.a = activity;
        a2.b = vtnVar;
        a2.d = cqrp.d(14.0d).e(activity);
        return a2.a().b(q.m);
    }

    @dzsi
    public static CharSequence i(Activity activity, cqat cqatVar, amve amveVar, dbsg<dosz> dbsgVar) {
        if (dbsgVar.a()) {
            dqvj b2 = vyb.b(amveVar);
            dbsk.s(b2);
            String f = f(activity, amveVar, cqatVar, dbsgVar.b(), vxq.a(b2));
            if (f == null) {
                return null;
            }
            return f;
        }
        return null;
    }

    private static CharSequence j(Activity activity, CharSequence... charSequenceArr) {
        dccx F = dcdc.F();
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                F.g(charSequence);
            }
        }
        dcdc f = F.f();
        if (f.isEmpty()) {
            return "";
        }
        if (f.size() == 1) {
            return (CharSequence) f.get(0);
        }
        bvsv a2 = new bvsx(activity.getResources()).a(f.get(0));
        for (int i = 1; i < f.size(); i++) {
            a2.g(" · ");
            a2.g((CharSequence) f.get(i));
        }
        return a2.c();
    }

    private static Calendar k(dosz doszVar, amve amveVar) {
        int a2;
        int a3;
        eapd eapdVar = new eapd(vxb.a(doszVar));
        dgas x = vyb.x(amveVar);
        if (x != null && (a3 = dquo.a(doszVar.b)) != 0 && a3 == 2) {
            eapdVar = eapdVar.f(eaow.d(x.b));
        } else if (x != null && ((a2 = dquo.a(doszVar.b)) == 0 || a2 == 1)) {
            eapdVar = eapdVar.e(eaow.d(x.b));
        }
        return vxb.e(eapdVar.a);
    }

    @dzsi
    public static String g(Context context, amve amveVar, cqat cqatVar, @dzsi dosz doszVar) {
        if (doszVar == null) {
            return null;
        }
        int a2 = dquo.a(doszVar.b);
        if (a2 != 0 && a2 == 2) {
            Calendar k = k(doszVar, amveVar);
            int c = bvsk.c(cqatVar, k);
            return context.getString((c & 16) > 0 ? R.string.DIRECTIONS_LEAVE_AROUND_TIME_AND_DATE : R.string.DIRECTIONS_LEAVE_AROUND_TIME, bvsk.a(context, k, c));
        }
        int a3 = dquo.a(doszVar.b);
        if (a3 != 0 && a3 != 1) {
            return null;
        }
        Calendar k2 = k(doszVar, amveVar);
        int c2 = bvsk.c(cqatVar, k2);
        return context.getString((c2 & 16) > 0 ? R.string.DIRECTIONS_ARRIVE_AROUND_TIME_AND_DATE : R.string.DIRECTIONS_ARRIVE_AROUND_TIME, bvsk.a(context, k2, c2));
    }
}
