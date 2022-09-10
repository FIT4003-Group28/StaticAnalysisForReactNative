package defpackage;
/* compiled from: PG */
/* renamed from: tdx  reason: default package */
/* loaded from: classes7.dex */
public class tdx extends tdz implements tdg {
    private final iaa a;
    private final dcdc<tdw> b;

    public tdx(cqhn cqhnVar, cjqy cjqyVar, tmi tmiVar, sxa sxaVar, tlv tlvVar, amve amveVar) {
        final tmh a = tmiVar.a(tlvVar, dbsg.i(amveVar));
        this.b = dcdc.q(dcft.o(a.a, new dbrn(a) { // from class: tdt
            private final tmh a;

            {
                this.a = a;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                amuk amukVar = (amuk) obj;
                amuk b = this.a.b().b();
                dbsk.s(b);
                return new tdw(amukVar, amukVar.equals(b));
            }
        }));
        dcdc<amuk> dcdcVar = a.a;
        amuk b = a.b().b();
        dbsk.s(b);
        iaa iaaVar = new iaa(cqhnVar, cjqyVar, dcdcVar.indexOf(b));
        this.a = iaaVar;
        iaaVar.NQ(new tdv(a, sxaVar, tlvVar));
    }

    @Override // defpackage.hzw, defpackage.absq
    public hzv a() {
        return this.a.a();
    }

    @Override // defpackage.hzw
    public Integer b() {
        throw null;
    }

    @Override // defpackage.tdg
    public dcdc<cqix<?>> c() {
        return dcdc.q(dcbg.b(this.b).s(tdu.a));
    }
}
