package defpackage;
/* compiled from: PG */
/* renamed from: acla  reason: default package */
/* loaded from: classes2.dex */
public class acla implements bega, acwf {
    private CharSequence a = "";
    private String b = "";

    @Override // defpackage.acwf
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.acwf
    public String b() {
        return this.b;
    }

    @Override // defpackage.bega
    public void t(@dzsi bwrs<ilo> bwrsVar) {
        CharSequence charSequence;
        this.a = "";
        this.b = "";
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar != null) {
            dvzf dvzfVar = iloVar.h().x;
            if (dvzfVar == null) {
                dvzfVar = dvzf.e;
            }
            if ((dvzfVar.a & 4) != 0) {
                dgly dglyVar = dvzfVar.d;
                if (dglyVar == null) {
                    dglyVar = dgly.c;
                }
                charSequence = acls.a(dglyVar);
            } else {
                charSequence = dvzfVar.b;
            }
            this.a = charSequence;
            this.b = dvzfVar.c;
        }
    }

    @Override // defpackage.bega
    public void u() {
        t(null);
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.a.length() != 0);
    }
}
