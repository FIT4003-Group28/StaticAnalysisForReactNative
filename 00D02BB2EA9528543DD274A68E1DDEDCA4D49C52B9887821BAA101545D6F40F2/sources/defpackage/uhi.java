package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uhi  reason: default package */
/* loaded from: classes7.dex */
public class uhi implements uha {
    private static final dcdn<ufa, uhg> a = dcdn.m(ufa.NO_WAYPOINT_FOUND, uhg.NO_WAYPOINT_FOUND, ufa.UNKNOWN_ROUTE, uhg.NO_ROUTES_FOUND, ufa.DIRECTIONS_BACKEND_UNAVAILABLE, uhg.NO_CONNECTION);
    private final Activity b;
    private ufb c;
    @dzsi
    private uhh d;

    public uhi(Activity activity, ufb ufbVar) {
        uhh uhhVar;
        this.b = activity;
        this.c = ufbVar;
        if (ufbVar.e().a()) {
            dcdn<ufa, uhg> dcdnVar = a;
            ufa b = ufbVar.e().b();
            dbsk.s(b);
            uhg uhgVar = dcdnVar.get(b);
            dbsk.s(uhgVar);
            uhhVar = new uhh(activity, uhgVar);
        } else {
            uhhVar = null;
        }
        this.d = uhhVar;
    }

    @Override // defpackage.uha
    @dzsi
    public jam a() {
        return this.d;
    }

    @Override // defpackage.uha
    public Boolean b() {
        return Boolean.valueOf(!this.c.c());
    }

    public void c(ufb ufbVar) {
        uhh uhhVar;
        if (!this.c.equals(ufbVar)) {
            this.c = ufbVar;
            if (ufbVar.e().a()) {
                Activity activity = this.b;
                dcdn<ufa, uhg> dcdnVar = a;
                ufa b = ufbVar.e().b();
                dbsk.s(b);
                uhg uhgVar = dcdnVar.get(b);
                dbsk.s(uhgVar);
                uhhVar = new uhh(activity, uhgVar);
            } else {
                uhhVar = null;
            }
            this.d = uhhVar;
            cqkx.p(this);
        }
    }
}
