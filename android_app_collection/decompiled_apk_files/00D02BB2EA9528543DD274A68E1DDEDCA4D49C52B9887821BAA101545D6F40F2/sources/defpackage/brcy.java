package defpackage;
/* compiled from: PG */
/* renamed from: brcy  reason: default package */
/* loaded from: classes4.dex */
public abstract class brcy {
    public static brcy f(String str, @dzsi String str2, String str3, Iterable<Integer> iterable, Iterable<Integer> iterable2) {
        return new brcx(str, dbsj.e(str2), str3, dcep.L(iterable), dcep.L(iterable2));
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract dcep<Integer> d();

    public abstract dcep<Integer> e();

    public final dgba g() {
        dgaz bZ = dgba.b.bZ();
        dcpd<Integer> it = e().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            dgax bZ2 = dgay.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dgay dgayVar = (dgay) bZ2.b;
            dgayVar.a |= 1;
            dgayVar.b = intValue;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgba dgbaVar = (dgba) bZ.b;
            dgay bK = bZ2.bK();
            bK.getClass();
            dsrj<dgay> dsrjVar = dgbaVar.a;
            if (!dsrjVar.a()) {
                dgbaVar.a = dsqw.cl(dsrjVar);
            }
            dgbaVar.a.add(bK);
        }
        return bZ.bK();
    }
}
