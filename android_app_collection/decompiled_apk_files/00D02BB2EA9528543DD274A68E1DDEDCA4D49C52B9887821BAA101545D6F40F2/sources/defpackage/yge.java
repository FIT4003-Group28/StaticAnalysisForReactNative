package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yge  reason: default package */
/* loaded from: classes7.dex */
class yge implements jam {
    final /* synthetic */ ygh a;

    public yge(ygh yghVar) {
        this.a = yghVar;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return Boolean.valueOf(this.a.q == 2);
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        this.a.M(1);
        return this.a.b();
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jam
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public CharSequence j() {
        return null;
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.a(dtyc.dv);
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        return null;
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        ygh yghVar = this.a;
        int i = yghVar.q;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return yghVar.d.getText(R.string.DATA_REQUEST_ERROR);
            }
            return (i2 == 2 || i2 == 3) ? yghVar.d.getString(R.string.TRANSIT_LINE_NO_TRIPS_FOUND) : "";
        }
        throw null;
    }

    @Override // defpackage.jam
    public Boolean a() {
        int i = this.a.q;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return true;
            }
            return false;
        }
        throw null;
    }

    @Override // defpackage.jam
    public cjtd c() {
        int i = this.a.q;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return cjtd.a(dtyc.ds);
            }
            if (i2 == 2 || i2 == 3) {
                return cjtd.a(dtyc.du);
            }
            return cjtd.b;
        }
        throw null;
    }
}
