package defpackage;
/* compiled from: PG */
/* renamed from: rgx  reason: default package */
/* loaded from: classes7.dex */
public final class rgx {
    public final rha a;
    private final rhk b;

    public rgx(rhk rhkVar, rha rhaVar) {
        this.b = rhkVar;
        this.a = rhaVar;
    }

    public final rhj a(String str, dnkh dnkhVar, dnkh dnkhVar2, dcep<Integer> dcepVar, dbsg<dngu> dbsgVar, dbsg<dngu> dbsgVar2) {
        rhk rhkVar = this.b;
        rhk.a(rhkVar.e.a(), 1);
        rhz a = rhkVar.f.a();
        rhk.a(a, 2);
        rin a2 = rhkVar.g.a();
        rhk.a(a2, 3);
        rhr a3 = rhkVar.d.a();
        rhk.a(a3, 4);
        rhk.a(str, 5);
        dnln bZ = dnls.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnls dnlsVar = (dnls) bZ.b;
        str.getClass();
        dnlsVar.a |= 2;
        dnlsVar.c = str;
        rhj rhjVar = new rhj(a, a2, a3, bZ.bK());
        rhy d = rhjVar.d();
        d.c.b(dnkhVar);
        if (dbsgVar.a()) {
            d.b(2).a().a.a = dbsgVar.b();
        }
        rhy d2 = rhjVar.d();
        d2.c.b(dnkhVar2);
        if (dbsgVar2.a()) {
            d2.b(1).a().a.a = dbsgVar2.b();
        }
        rie a4 = rhjVar.b.a();
        dcpd<Integer> it = dcepVar.iterator();
        while (it.hasNext()) {
            a4.a().a(it.next().intValue());
        }
        return rhjVar;
    }
}
