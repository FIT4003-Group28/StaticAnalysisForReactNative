package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: baqr  reason: default package */
/* loaded from: classes3.dex */
class baqr implements baqc, baqs {
    private final String a;
    private final String b;
    private final dcdc<baqb> c;
    @dzsi
    private gdf d;

    public baqr(final gga ggaVar, int i, int i2, final int i3, dcdc<drdg> dcdcVar, final baqo baqoVar) {
        this.a = ggaVar.getString(i);
        this.b = ggaVar.getString(i2);
        this.c = dcbg.b(dcdcVar).s(new dbrn(ggaVar, baqoVar, i3) { // from class: baqp
            private final gga a;
            private final baqo b;
            private final int c;

            {
                this.a = ggaVar;
                this.b = baqoVar;
                this.c = i3;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new baqq((drdg) obj, this.b, this.a, this.c);
            }
        }).z();
    }

    @Override // defpackage.baqc
    public String a() {
        return this.a;
    }

    @Override // defpackage.baqc
    public String b() {
        return this.b;
    }

    @Override // defpackage.baqc
    public List<baqb> c() {
        return this.c;
    }

    @Override // defpackage.baqc
    public cqkl d() {
        gdf gdfVar = this.d;
        if (gdfVar != null) {
            gdfVar.dismiss();
        }
        return cqkl.a;
    }

    @Override // defpackage.baqs
    public void e(@dzsi gdf gdfVar) {
        this.d = gdfVar;
    }
}
