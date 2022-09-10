package defpackage;
/* compiled from: PG */
/* renamed from: pjb  reason: default package */
/* loaded from: classes7.dex */
public class pjb implements piv {
    private final dfoe a;
    private final begg b;
    private ilo c;

    public pjb(begg beggVar, dfoe dfoeVar) {
        this.b = beggVar;
        this.a = dfoeVar;
    }

    @Override // defpackage.piv
    public String a() {
        dfoi dfoiVar = this.a.b;
        if (dfoiVar == null) {
            dfoiVar = dfoi.h;
        }
        return dfoiVar.d;
    }

    @Override // defpackage.piv
    public String b() {
        dfoi dfoiVar = this.a.b;
        if (dfoiVar == null) {
            dfoiVar = dfoi.h;
        }
        dgbk dgbkVar = dfoiVar.c;
        if (dgbkVar == null) {
            dgbkVar = dgbk.d;
        }
        return akqq.p(dgbkVar).b();
    }

    @Override // defpackage.piv
    public cqkl c() {
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c(false);
        begjVar.c = jjn.EXPANDED;
        if (this.c == null) {
            ily ilyVar = new ily();
            dfoi dfoiVar = this.a.b;
            if (dfoiVar == null) {
                dfoiVar = dfoi.h;
            }
            dghy dghyVar = dfoiVar.b;
            if (dghyVar == null) {
                dghyVar = dghy.e;
            }
            ilyVar.j(akqi.b(dghyVar.b));
            dfoi dfoiVar2 = this.a.b;
            if (dfoiVar2 == null) {
                dfoiVar2 = dfoi.h;
            }
            dgbk dgbkVar = dfoiVar2.c;
            if (dgbkVar == null) {
                dgbkVar = dgbk.d;
            }
            ilyVar.q(akqq.p(dgbkVar));
            this.c = ilyVar.d();
        }
        ilo iloVar = this.c;
        dbsk.s(iloVar);
        begjVar.b(iloVar);
        this.b.n(begjVar, false, null);
        return cqkl.a;
    }
}
