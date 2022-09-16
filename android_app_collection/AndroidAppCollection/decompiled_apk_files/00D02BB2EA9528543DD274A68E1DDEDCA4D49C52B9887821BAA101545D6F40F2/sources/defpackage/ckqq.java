package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ckqq  reason: default package */
/* loaded from: classes4.dex */
public final class ckqq extends ckrc {
    private final ff c;
    private final ahjq d;
    private final crfm e;
    private final eeu f;
    private final dxio<qbt> g;
    private final dxio<afwr> h;
    private final dxio<araj> i;
    private final dxio<ascb> j;
    private final dxio<crsh> k;
    private final dxio<asbr> l;
    private final dxio<ckqr> m;
    private final btvo n;
    private final akfa o;

    public ckqq(ckra ckraVar, dxio<cref> dxioVar, crem cremVar, ckrh ckrhVar, btvo btvoVar, ff ffVar, ahjq ahjqVar, crfm crfmVar, eeu eeuVar, dxio<qbt> dxioVar2, dxio<afwr> dxioVar3, dxio<araj> dxioVar4, dxio<ascb> dxioVar5, dxio<crsh> dxioVar6, dxio<asbr> dxioVar7, dxio<ckqr> dxioVar8, akfa akfaVar) {
        super(ckraVar, dxioVar, cremVar, ckrhVar);
        this.c = ffVar;
        this.d = ahjqVar;
        this.e = crfmVar;
        this.f = eeuVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.i = dxioVar4;
        this.j = dxioVar5;
        this.k = dxioVar6;
        this.n = btvoVar;
        this.o = akfaVar;
        this.l = dxioVar7;
        this.m = dxioVar8;
    }

    private final boolean s(dmcf dmcfVar) {
        return ckri.g(dmcfVar) || ((efh) this.f).b;
    }

    @Override // defpackage.ckrc
    public final void a(boolean z) {
        boolean c = this.h.a().l().c(afwm.SATELLITE, z);
        if (z) {
            if (c) {
                this.b.f(1);
            } else {
                this.b.f(2);
            }
        } else if (c) {
            this.b.g(2);
        } else {
            this.b.g(1);
        }
    }

    @Override // defpackage.ckrc
    public final int b(boolean z) {
        if (this.h.a().l().c(afwm.TRAFFIC, z) != z) {
            if (z) {
                return -1;
            }
            r(2);
            return q();
        } else if (z) {
            return R.string.DA_SPEECH_SHOW_TRAFFIC_CONFIRMATION;
        } else {
            r(1);
            return R.string.DA_SPEECH_HIDE_TRAFFIC_CONFIRMATION;
        }
    }

    @Override // defpackage.ckrc
    public final int c() {
        if (!s(dmcf.ROUTE_OVERVIEW)) {
            return q();
        }
        if (this.j.a().i()) {
            this.b.i(1);
            return R.string.DA_SPEECH_ROUTE_OVERVIEW_CONFIRMATION;
        }
        this.b.i(2);
        return q();
    }

    @Override // defpackage.ckrc
    public final void d() {
        if (s(dmcf.GO_BACK)) {
            if (this.c.g().j() > 0) {
                this.c.onBackPressed();
                this.b.h(1);
                return;
            }
            this.b.h(2);
        }
    }

    @Override // defpackage.ckrc
    public final int e() {
        if (this.j.a().n()) {
            this.b.k(1);
            return R.string.DA_SPEECH_EXIT_NAVIGATION_CONFIRMATION;
        }
        this.b.k(2);
        return R.string.DA_SPEECH_EXIT_NAVIGATION_FAILURE_NOTIFICATION;
    }

    @Override // defpackage.ckrc
    public final void f() {
        if (s(dmcf.SHOW_DIRECTIONS_LIST)) {
            if (this.j.a().k()) {
                this.b.c(1);
            } else {
                this.b.c(2);
            }
        }
    }

    @Override // defpackage.ckrc
    public final int g() {
        ckqz ckqzVar;
        if (!this.m.a().c() || (ckqzVar = this.m.a().a) == null || !ckqzVar.a()) {
            if (this.j.a().g()) {
                this.j.a().j();
                this.b.s(2);
                return R.string.DA_SPEECH_RESUME_NAVIGATION_ALREADY_NAVIGATING;
            }
            this.g.a().k();
            this.b.s(3);
            return R.string.DA_SPEECH_RESUME_NAVIGATION_FAILURE;
        }
        this.b.s(1);
        return R.string.DA_SPEECH_RESUME_NAVIGATION_CONFIRMATION;
    }

    @Override // defpackage.ckrc
    public final int h() {
        if (!this.j.a().g()) {
            this.b.t(3);
            return -1;
        } else if (this.j.a().m()) {
            this.b.t(1);
            return R.string.DA_SPEECH_CLEAR_SEARCH_RESULTS_RESPONSE;
        } else {
            this.b.t(2);
            return R.string.DA_SPEECH_SEARCH_RESULTS_ALREADY_CLEARED_RESPONSE;
        }
    }

    @Override // defpackage.ckrc
    public final int i() {
        if (!s(dmcf.MY_LOCATION)) {
            return -1;
        }
        boolean d = this.d.d();
        if (((crgt) this.e).b != null) {
            this.j.a().j();
            if (!d) {
                return -1;
            }
            return R.string.DA_SPEECH_MY_LOCATION_CONFIRMATION;
        }
        if (((efh) this.f).b) {
            this.i.a().l();
            if (d) {
                return R.string.DA_SPEECH_MY_LOCATION_CONFIRMATION;
            }
        }
        return -1;
    }

    @Override // defpackage.ckrc
    public final int j() {
        if (s(dmcf.SEND_FEEDBACK)) {
            this.k.a();
            return -1;
        }
        return -1;
    }

    @Override // defpackage.ckrc
    public final void k() {
        if (s(dmcf.FOLLOW_MODE)) {
            if (this.j.a().j()) {
                this.b.n(1);
            } else {
                this.b.n(2);
            }
        }
    }

    @Override // defpackage.ckrc
    public final void l() {
    }

    @Override // defpackage.ckrc
    public final void m() {
    }

    @Override // defpackage.ckrc
    public final void n() {
    }

    @Override // defpackage.ckrc
    protected final int o(afia afiaVar) {
        dqkr dqkrVar;
        int i;
        dmcf dmcfVar = afiaVar.B;
        afif afifVar = afiaVar.C;
        if (dmcfVar == null) {
            return q();
        }
        if (!this.n.getUgcParameters().am()) {
            this.b.v(5, dmcfVar);
            return q();
        } else if (!auej.e(this.o)) {
            this.b.v(7, dmcfVar);
            return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_USER_NOT_SIGNED_IN;
        } else if (((crgt) this.e).b != arym.GUIDED_NAV || this.a.c()) {
            this.b.v(3, dmcfVar);
            return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_NOT_IN_GUIDED_NAV;
        } else {
            afif afifVar2 = afif.HAZARD_CONSTRUCTION;
            int ordinal = dmcfVar.ordinal();
            if (ordinal == 41) {
                dqkrVar = dqkr.INCIDENT_CRASH;
                i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_CRASH_REPORTED;
            } else if (ordinal == 42) {
                dqkrVar = dqkr.INCIDENT_MOBILE_CAMERA;
                i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_SPEED_TRAP_REPORTED;
            } else if (ordinal == 44) {
                dqkrVar = dqkr.INCIDENT_SUSPECTED_JAM;
                i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TRAFFIC_JAM_REPORTED;
            } else if (ordinal != 46) {
                if (ordinal != 48) {
                    return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TYPE_NOT_SUPPORTED;
                }
                if (afifVar == null) {
                    this.b.v(6, dmcfVar);
                    return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TYPE_NOT_SUPPORTED;
                }
                int ordinal2 = afifVar.ordinal();
                if (ordinal2 == 3) {
                    dqkrVar = dqkr.INCIDENT_LANE_CLOSURE;
                    i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_LANE_CLOSURE_REPORTED;
                } else if (ordinal2 == 4) {
                    dqkrVar = dqkr.INCIDENT_SUSPECTED_CLOSURE;
                    i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_SUSPECTED_CLOSURE_REPORTED;
                } else {
                    this.b.v(6, dmcfVar);
                    return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TYPE_NOT_SUPPORTED;
                }
            } else if (afifVar == null) {
                this.b.v(6, dmcfVar);
                return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TYPE_NOT_SUPPORTED;
            } else {
                int ordinal3 = afifVar.ordinal();
                if (ordinal3 == 0) {
                    dqkrVar = dqkr.INCIDENT_CONSTRUCTION;
                    i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_CONSTRUCTION_REPORTED;
                } else if (ordinal3 == 1) {
                    dqkrVar = dqkr.INCIDENT_STALLED_VEHICLE;
                    i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_DISABLED_VEHICLE_REPORTED;
                } else if (ordinal3 == 2) {
                    dqkrVar = dqkr.INCIDENT_OBJECT_ON_ROAD;
                    i = R.string.VOICE_MID_TRIP_REPORT_INCIDENT_OBJECT_ON_ROAD_REPORTED;
                } else {
                    this.b.v(6, dmcfVar);
                    return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TYPE_NOT_SUPPORTED;
                }
            }
            if (auej.d(this.n, dqkrVar) == null) {
                this.b.v(4, dmcfVar);
                return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_TYPE_NOT_SUPPORTED;
            } else if (this.l.a().b) {
                this.b.v(2, dmcfVar);
                return R.string.VOICE_MID_TRIP_REPORT_INCIDENT_LIMIT_REACHED;
            } else {
                this.j.a().o(dqkrVar);
                this.b.v(1, dmcfVar);
                return i;
            }
        }
    }
}
