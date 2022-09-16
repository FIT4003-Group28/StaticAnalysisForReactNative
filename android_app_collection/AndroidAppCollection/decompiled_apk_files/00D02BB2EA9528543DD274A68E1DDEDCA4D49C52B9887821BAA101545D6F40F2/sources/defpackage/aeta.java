package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aeta  reason: default package */
/* loaded from: classes2.dex */
class aeta implements jam {
    final /* synthetic */ aetb a;

    public aeta(aetb aetbVar) {
        this.a = aetbVar;
    }

    @Override // defpackage.jam
    public Boolean a() {
        aeuh q = this.a.q();
        boolean z = true;
        if (q != aeuh.CONNECTIVITY_ERROR && q != aeuh.GAIA_ERROR && q != aeuh.SERVER_ERROR) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        if (!this.a.c.S()) {
            return null;
        }
        aeuh aeuhVar = aeuh.NEUTRAL;
        if (this.a.q().ordinal() == 5) {
            return this.a.c.Rp(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_TITLE);
        }
        return this.a.c.Rp(R.string.DATA_REQUEST_ERROR_TITLE);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return true;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        this.a.e();
        return cqkl.a;
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
        return cjtd.b;
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        if (!this.a.c.S()) {
            return null;
        }
        aeuh q = this.a.q();
        aeuh aeuhVar = aeuh.NEUTRAL;
        if (q.ordinal() == 5) {
            return this.a.c.Rp(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_SUBTITLE);
        }
        return this.a.c.Rp(R.string.DATA_REQUEST_ERROR_SUBTITLE);
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }
}
