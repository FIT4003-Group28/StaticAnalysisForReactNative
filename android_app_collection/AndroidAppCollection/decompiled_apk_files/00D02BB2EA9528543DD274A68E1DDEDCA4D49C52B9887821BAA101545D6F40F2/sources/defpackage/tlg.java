package defpackage;
/* compiled from: PG */
/* renamed from: tlg  reason: default package */
/* loaded from: classes7.dex */
public final class tlg {
    public final tkt a;
    public final tlh b;

    public tlg(tkt tktVar, tlh tlhVar) {
        this.a = tktVar;
        this.b = tlhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<tmd> a(btlu btluVar, tmd tmdVar, amsy amsyVar) {
        int i;
        if (!tmdVar.a().equals(btluVar)) {
            return dbpy.a;
        }
        dbsg<tme> a = this.b.a(amsyVar, tmdVar.c().d(), tmdVar.c().f());
        dcdg p = dcdn.p();
        dcdc<tlv> g = tmdVar.g();
        int size = g.size();
        int i2 = 0;
        while (i2 < size) {
            tlv tlvVar = g.get(i2);
            dcdc<Integer> c = tlvVar.c();
            int size2 = c.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    p.f(Integer.valueOf(c.get(i3).intValue()), tlvVar.e());
                    i3++;
                }
            }
            i2 = i;
        }
        dbsu dbsuVar = (dbsu) a;
        dcdc<tlu> a2 = this.a.a(btluVar, (tme) dbsuVar.a, p.b());
        int size3 = a2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            tlu tluVar = a2.get(i4);
            dbsg<tlv> h = tmdVar.h(tluVar.b());
            if (h.a()) {
                tluVar.j(h.b().a());
                tluVar.h(h.b().b());
                tluVar.c().g(h.b().f().g());
            }
        }
        tmc j = tmd.j();
        j.e(btluVar);
        ((tlm) j).a = dbpy.a;
        j.g((tme) dbsuVar.a);
        j.i(a2);
        return dbsg.i(j.h());
    }
}
