package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: tmh  reason: default package */
/* loaded from: classes7.dex */
public final class tmh {
    public final dcdc<amuk> a;
    public final dbsg<wuv> b;
    private final dcdc<wuv> c;

    public tmh(wuw wuwVar, tlv tlvVar, dbsg<amve> dbsgVar) {
        dccx F = dcdc.F();
        dcdc<amve> m = tlvVar.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            amve amveVar = m.get(i);
            dbsg j = dbsg.j(wuwVar.a(amveVar, tlvVar.w(amveVar).b().intValue()));
            if (j.a()) {
                F.g((wuv) j.b());
            }
        }
        dcdc<wuv> f = F.f();
        this.c = f;
        final int intValue = tlvVar.w((amve) ((dbsu) dbsgVar).a).b().intValue();
        this.b = dcft.m(f, new dbsl(intValue) { // from class: tmf
            private final int a;

            {
                this.a = intValue;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((wuv) obj).s() == this.a;
            }
        });
        dccx F2 = dcdc.F();
        HashSet hashSet = new HashSet();
        int size2 = f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            wuv wuvVar = f.get(i2);
            if (hashSet.add(wuvVar.b())) {
                F2.g(wuvVar.b());
            }
        }
        this.a = F2.f();
    }

    public final dcdc<wuv> a(final amuk amukVar) {
        return dcdc.q(dcft.i(this.c, new dbsl(amukVar) { // from class: tmg
            private final amuk a;

            {
                this.a = amukVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((wuv) obj).b().equals(this.a);
            }
        }));
    }

    public final dbsg<amuk> b() {
        return this.b.a() ? dbsg.i(this.b.b().b()) : dbpy.a;
    }
}
