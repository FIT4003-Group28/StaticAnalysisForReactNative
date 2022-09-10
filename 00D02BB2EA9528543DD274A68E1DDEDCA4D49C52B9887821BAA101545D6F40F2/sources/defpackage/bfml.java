package defpackage;
/* compiled from: PG */
/* renamed from: bfml  reason: default package */
/* loaded from: classes3.dex */
public class bfml implements bfmf {
    public static final dcep<dwci> a = dcep.B(dwci.VOTING_FACILITIES);
    private final dzsj<brba> b;
    private final bfmi c;
    private final btvo d;
    private Boolean e = false;
    private cjtd f = cjtd.b;
    private dwcm g = dwcm.b;

    public bfml(dzsj<brba> dzsjVar, bfmj bfmjVar, btvo btvoVar) {
        this.b = dzsjVar;
        this.c = bfmjVar.a(3, a, true);
        this.d = btvoVar;
    }

    @Override // defpackage.bfmf
    public dcdc<cqix<?>> a() {
        dccx F = dcdc.F();
        dcdc<bfmh> dcdcVar = this.c.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bfmd(), dcdcVar.get(i)));
        }
        return F.f();
    }

    @Override // defpackage.bfmf
    public Integer b() {
        return Integer.valueOf(this.c.a.size());
    }

    @Override // defpackage.bfmf
    public cqkl c(cjqm cjqmVar) {
        String charSequence = e().toString();
        dcdc<String> dcdcVar = this.c.a;
        bray d = braz.d();
        d.c(true);
        d.b(cjqmVar);
        this.b.a().t(charSequence, dcdcVar, d.a());
        return cqkl.a;
    }

    @Override // defpackage.bfmf
    public cjtd d() {
        return this.f;
    }

    public CharSequence e() {
        return this.g.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (!this.d.getPlaceSheetParameters().af()) {
            return;
        }
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        dbsg m = dcft.m(iloVar.h().aD, bfmk.a);
        if (m.a()) {
            dwcm dwcmVar = ((dwca) m.b()).d;
            if (dwcmVar == null) {
                dwcmVar = dwcm.b;
            }
            this.g = dwcmVar;
            this.e = true;
            this.c.a(bwrsVar);
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxo.bi;
        this.f = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.e = false;
        this.g = dwcm.b;
        this.f = cjtd.b;
        this.c.b();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return this.e;
    }
}
