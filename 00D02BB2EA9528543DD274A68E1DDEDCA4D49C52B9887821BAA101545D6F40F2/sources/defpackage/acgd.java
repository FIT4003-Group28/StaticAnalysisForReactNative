package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acgd  reason: default package */
/* loaded from: classes2.dex */
public final class acgd extends ggo {
    public hwe al;
    private akqq am;

    @Override // defpackage.ges
    public final void Nv() {
        ((acge) btsx.b(acge.class, this)).bM(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final void aX() {
        akqq akqqVar = this.am;
        if (akqqVar != null) {
            Nw(akqqVar.g());
        }
        gn gnVar = this.A;
        dbsk.s(gnVar);
        gnVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final boolean bB(alhr alhrVar) {
        if (!this.aD) {
            return false;
        }
        akqq S = alhrVar.a.S();
        this.am = S;
        hwb i = this.al.i(akpp.o(S), true);
        if (i == null) {
            return false;
        }
        this.ak = i;
        bz(true);
        bx();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String g() {
        return Rp(R.string.LOCATION_FEEDBACK_TITLE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggo
    public final String i() {
        return Rp(R.string.LOCATION_FEEDBACK_HINT_PICK_LOCATION);
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bC();
    }

    @Override // defpackage.ggo
    protected final String w() {
        return Rp(R.string.DONE);
    }
}
