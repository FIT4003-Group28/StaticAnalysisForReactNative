package defpackage;
/* compiled from: PG */
/* renamed from: bmja  reason: default package */
/* loaded from: classes3.dex */
public class bmja implements bmiz {
    private final dgii a;

    public bmja(dgii dgiiVar) {
        this.a = dgiiVar;
    }

    @Override // defpackage.bmiz
    public CharSequence a() {
        dgly dglyVar = this.a.b;
        if (dglyVar == null) {
            dglyVar = dgly.c;
        }
        return acls.a(dglyVar);
    }

    @Override // defpackage.bmiz
    public CharSequence b() {
        dgii dgiiVar = this.a;
        if ((dgiiVar.a & 2) != 0) {
            return dgiiVar.c;
        }
        dgly dglyVar = dgiiVar.b;
        if (dglyVar == null) {
            dglyVar = dgly.c;
        }
        return dglyVar.a;
    }

    @Override // defpackage.bmiz
    @dzsi
    public jhp c() {
        dgii dgiiVar = this.a;
        if ((dgiiVar.a & 4) != 0) {
            dgih dgihVar = dgiiVar.d;
            if (dgihVar == null) {
                dgihVar = dgih.b;
            }
            dgig dgigVar = dgihVar.a;
            if (dgigVar == null) {
                dgigVar = dgig.c;
            }
            String str = dgigVar.a;
            dgih dgihVar2 = this.a.d;
            if (dgihVar2 == null) {
                dgihVar2 = dgih.b;
            }
            dgig dgigVar2 = dgihVar2.a;
            if (dgigVar2 == null) {
                dgigVar2 = dgig.c;
            }
            return new jhp(str, dgigVar2.b, ckqc.FULLY_QUALIFIED);
        }
        return null;
    }
}
