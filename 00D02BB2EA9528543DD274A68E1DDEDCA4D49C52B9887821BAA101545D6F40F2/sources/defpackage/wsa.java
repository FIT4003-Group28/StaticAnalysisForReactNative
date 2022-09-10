package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wsa  reason: default package */
/* loaded from: classes7.dex */
public class wsa implements jam {
    final /* synthetic */ wsc a;

    public wsa(wsc wscVar) {
        this.a = wscVar;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.a.d.getString(R.string.TRANSIT_STATION_NO_DEPARTURES);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return true;
    }

    @Override // defpackage.jam
    public cqkl i() {
        if (this.a.x().booleanValue()) {
            View o = cqkx.o(this);
            if (o != null) {
                this.a.n.i(o);
            }
        } else {
            qcw x = qcx.x();
            x.r(amvh.i(this.a.e));
            this.a.h.a().m(x.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence j() {
        if (this.a.x().booleanValue()) {
            return this.a.d.getString(R.string.TRANSIT_STATION_CLEAR_FILTER_LINK);
        }
        return this.a.d.getString(R.string.TRANSIT_STATION_NO_UPCOMING_DEPARTURES_DIRECTIONS_BUTTON);
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public cqtd m() {
        if (this.a.x().booleanValue()) {
            return cqrt.g(2131232205, ibm.x());
        }
        return cqrt.i(iup.e(R.raw.ic_mod_directions), ibm.x());
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public cqtd o() {
        return iup.e(R.raw.illy_no_upcoming_departures);
    }
}
