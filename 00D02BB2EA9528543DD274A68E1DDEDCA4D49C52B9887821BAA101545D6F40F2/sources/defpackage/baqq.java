package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: baqq  reason: default package */
/* loaded from: classes3.dex */
class baqq implements baqb {
    final /* synthetic */ drdg a;
    final /* synthetic */ baqo b;
    final /* synthetic */ gga c;
    final /* synthetic */ int d;
    @dzsi
    private baku e = null;

    public baqq(drdg drdgVar, baqo baqoVar, gga ggaVar, int i) {
        this.a = drdgVar;
        this.b = baqoVar;
        this.c = ggaVar;
        this.d = i;
    }

    @Override // defpackage.baqb
    public drdg a() {
        return this.a;
    }

    @Override // defpackage.baqb
    public String b() {
        return this.a.g;
    }

    @Override // defpackage.baqb
    public jic c() {
        drcx drcxVar = ((drcy) dcft.r(this.a.i, drcy.e)).d;
        if (drcxVar == null) {
            drcxVar = drcx.d;
        }
        return new jic(drcxVar.c, ckqc.FIFE, cqrt.f(R.drawable.trip_reservations_placeholder), 250);
    }

    @Override // defpackage.baqb
    @dzsi
    public cqtd d() {
        baku bakuVar = this.e;
        if (bakuVar == null) {
            return null;
        }
        return baqz.j(bakuVar);
    }

    @Override // defpackage.baqb
    @dzsi
    public Integer e() {
        baku bakuVar = this.e;
        if (bakuVar == null || !bakuVar.d()) {
            return null;
        }
        return Integer.valueOf(this.e.a);
    }

    @Override // defpackage.baqb
    public Boolean f() {
        baku bakuVar = this.e;
        boolean z = false;
        if (bakuVar != null && bakuVar.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baqb
    public void g(baku bakuVar) {
        this.e = bakuVar;
    }

    @Override // defpackage.baqb
    public cqkl h() {
        this.b.a(this.a);
        return cqkl.a;
    }

    @Override // defpackage.baqb
    public String i() {
        baku bakuVar = this.e;
        if (bakuVar == null) {
            return this.c.getString(this.d, new Object[]{b()});
        }
        if (bakuVar.c()) {
            return this.c.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON_COMPLETED_DESTINATION_ACCESSIBILITY_HINT, new Object[]{b()});
        }
        if (this.e.d()) {
            return this.c.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON_PARTIALLY_COMPLETED_DESTINATION_ACCESSIBILITY_HINT, new Object[]{b()});
        }
        return this.c.getString(R.string.TRIP_DESTINATION_OFFLINE_MAP_ACTION_BUTTON_NOT_STARTED_DESTINATION_ACCESSIBILITY_HINT, new Object[]{b()});
    }
}
