package defpackage;
/* compiled from: PG */
/* renamed from: bmai  reason: default package */
/* loaded from: classes3.dex */
public class bmai extends bmbq implements bega {
    @dzsi
    private ilo b;

    public bmai(bego begoVar, bnxa bnxaVar) {
        super(begoVar, bnxaVar);
    }

    @Override // defpackage.bmbq, defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        super.t(bwrsVar);
        ilo c = bwrsVar.c();
        this.b = c;
        if (c == null) {
            return;
        }
        e(c.cA());
    }

    @Override // defpackage.bmbq, defpackage.bega
    public void u() {
        super.u();
        this.b = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (this.b != null && super.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
