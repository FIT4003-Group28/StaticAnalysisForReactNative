package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: anqx  reason: default package */
/* loaded from: classes2.dex */
public class anqx {
    private static final cqss a = cqrt.c(R.color.maps_activity_timeline_default_polyline_color);
    private static final cqss b = cqrt.c(R.color.maps_activity_timeline_stop_segment_line_color);
    private final Context c;
    private final cqss d;
    private final cqss e;
    private final dbrn<aogu, aogu> f;

    public anqx(Application application) {
        cqss cqssVar = a;
        cqss cqssVar2 = b;
        anqw anqwVar = new anqw();
        this.c = application;
        this.d = cqssVar;
        this.e = cqssVar2;
        this.f = anqwVar;
    }

    public final dbsg<aogl> a(aogu aoguVar, dbsg<dvay> dbsgVar, aofn aofnVar) {
        cqss cqssVar;
        int i;
        aogu a2 = this.f.a(aoguVar);
        if (a2.a.isEmpty()) {
            return dbpy.a;
        }
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        boolean z = false;
        F.g(a2.a.get(0).d());
        dcdc<aogt> dcdcVar = a2.a;
        int size = dcdcVar.size();
        int i2 = 0;
        while (i2 < size) {
            aogt aogtVar = dcdcVar.get(i2);
            if (!aogtVar.b().a()) {
                cqssVar = this.d;
            } else {
                dvay b2 = aogtVar.b().b();
                int i3 = b2.b;
                if (i3 == 7) {
                    cqssVar = this.e;
                } else if (i3 == 9) {
                    dqjl b3 = dqjl.b(((dvak) b2.c).b);
                    if (b3 == null) {
                        b3 = dqjl.UNKNOWN_ACTIVITY_TYPE;
                    }
                    cqssVar = aofnVar.b(b3);
                } else {
                    cqssVar = this.d;
                }
            }
            aofv aofvVar = new aofv(cqssVar.b(this.c), dbsgVar.a() && !aogtVar.b().equals(dbsgVar));
            Iterator it = dcft.u(aogtVar.a(), 1).iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    F.g((akqq) it.next());
                    F2.g(aofvVar);
                }
            }
            i2 = i;
        }
        dcdc f = F.f();
        dcdc f2 = F2.f();
        dbsk.b(f.size() >= 2, "polyline contains less than two vertices");
        if (f2.size() + 1 == f.size()) {
            z = true;
        }
        dbsk.b(z, "polyline has inconsistent number of vertices and edges");
        return dbsg.i(new aofu(f, f2));
    }
}
