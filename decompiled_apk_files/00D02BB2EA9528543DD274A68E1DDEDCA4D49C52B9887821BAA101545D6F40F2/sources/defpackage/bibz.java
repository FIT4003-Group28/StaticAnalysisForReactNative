package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bibz  reason: default package */
/* loaded from: classes3.dex */
public class bibz implements bega, bibr {
    private final akfa a;
    private final bibx b;
    private final dxio<axwp> c;
    private final List<bibq> d = new ArrayList();

    public bibz(akfa akfaVar, bibx bibxVar, dxio<axwp> dxioVar) {
        this.a = akfaVar;
        this.b = bibxVar;
        this.c = dxioVar;
    }

    private final void b(baab baabVar, dcde<baab, azwu> dcdeVar) {
        if (dcdeVar.m(baabVar)) {
            dcdc<azwu> h = dcdeVar.h(baabVar);
            int size = h.size();
            for (int i = 0; i < size; i++) {
                this.d.add(this.b.a(h.get(i)));
            }
        }
    }

    @Override // defpackage.bibr
    public List<bibq> a() {
        return this.d;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (!this.a.j().l()) {
            return;
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        azwv a = this.c.a().a(azxb.f(iloVar.ai(), iloVar.aj()));
        if (a == null) {
            return;
        }
        dcde<baab, azwu> C = dcbg.b(a.n()).C(biby.a);
        b(baab.FAVORITES, C);
        b(baab.WANT_TO_GO, C);
        if (a.f()) {
            this.d.add(this.b.a(null));
        }
        b(baab.CUSTOM, C);
    }

    @Override // defpackage.bega
    public void u() {
        this.d.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.d.isEmpty());
    }
}
