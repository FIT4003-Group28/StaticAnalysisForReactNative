package defpackage;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmdw  reason: default package */
/* loaded from: classes3.dex */
public class bmdw {
    private final Activity a;
    private final eeu b;
    private final btvo c;
    private final dxio<afha> d;
    @dzsi
    private ilo e;
    @dzsi
    private dqdk f;
    @dzsi
    private String g;
    private boolean h;

    public bmdw(Activity activity, eeu eeuVar, btvo btvoVar, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = eeuVar;
        this.c = btvoVar;
        this.d = dxioVar;
    }

    public final void a(@dzsi ilo iloVar) {
        f();
        if (iloVar == null || !b()) {
            return;
        }
        this.e = iloVar;
        dpoa cJ = iloVar.cJ();
        if (cJ == null) {
            return;
        }
        for (dpnw dpnwVar : cJ.b) {
            dqdk dqdkVar = dpnwVar.a;
            if (dqdkVar == null) {
                dqdkVar = dqdk.e;
            }
            if ((dqdkVar.a & 1) != 0) {
                dplx dplxVar = dqdkVar.b;
                if (dplxVar == null) {
                    dplxVar = dplx.g;
                }
                List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(bvrq.a(dplxVar), 0);
                if (!queryIntentActivities.isEmpty()) {
                    this.g = queryIntentActivities.get(0).activityInfo.name;
                    this.h = true;
                    this.f = dqdkVar;
                    return;
                }
            }
        }
    }

    public final boolean b() {
        return this.c.getPlaceSheetParameters().c();
    }

    public final boolean c() {
        return b() && this.h && this.f != null;
    }

    public final void d() {
        if (!b() || !((efh) this.b).b || this.f == null) {
            return;
        }
        Activity activity = this.a;
        dqdk dqdkVar = this.f;
        dbsk.s(dqdkVar);
        this.d.a().E(activity, dqdkVar);
    }

    public final cjtd e(ddho ddhoVar) {
        ilo iloVar = this.e;
        if (iloVar == null) {
            return cjtd.a(ddhoVar);
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = ddhoVar;
        if (!dbsj.d(this.g)) {
            String str = this.g;
            ddjk bZ = ddjl.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjl ddjlVar = (ddjl) bZ.b;
            str.getClass();
            ddjlVar.a |= 1;
            ddjlVar.b = str;
            c.p(bZ.bK());
        }
        return c.a();
    }

    public final void f() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
    }
}
