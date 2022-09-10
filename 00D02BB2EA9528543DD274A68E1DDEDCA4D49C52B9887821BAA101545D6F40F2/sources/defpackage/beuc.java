package defpackage;
/* compiled from: PG */
/* renamed from: beuc  reason: default package */
/* loaded from: classes3.dex */
public class beuc implements beub {
    private ilo a;

    @Override // defpackage.beub
    public String a() {
        ilo iloVar = this.a;
        return iloVar != null ? iloVar.bD() : "";
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.a = bwrsVar.c();
    }

    @Override // defpackage.bega
    public void u() {
        this.a = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (this.a != null && !dbsj.d(a())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
