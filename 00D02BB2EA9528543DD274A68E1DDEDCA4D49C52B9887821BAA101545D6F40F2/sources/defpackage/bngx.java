package defpackage;
/* compiled from: PG */
/* renamed from: bngx  reason: default package */
/* loaded from: classes3.dex */
public class bngx implements bnes {
    private static final bneu a = new bngw();
    private final bnhc b;
    @dzsi
    private bnev c;
    @dzsi
    private bwrs<ilo> d;

    public bngx(bnhc bnhcVar) {
        this.b = bnhcVar;
    }

    @Override // defpackage.bnes
    public bnev a() {
        bnev bnevVar = this.c;
        if (bnevVar == null || this.d == null) {
            throw new IllegalStateException("Place module has no display data.");
        }
        return bnevVar;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
        this.c = this.b.a(bwrsVar, a);
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
        this.c = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo c;
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar == null || (c = bwrsVar.c()) == null) {
            return false;
        }
        dghy dghyVar = c.h().f;
        if (dghyVar == null) {
            dghyVar = dghy.e;
        }
        if ((dghyVar.a & 32) != 0) {
            return false;
        }
        return Boolean.valueOf(!a().b().booleanValue());
    }
}
