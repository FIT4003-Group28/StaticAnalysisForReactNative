package defpackage;
/* compiled from: PG */
/* renamed from: bfaq  reason: default package */
/* loaded from: classes3.dex */
public class bfaq {
    private final btvo a;

    public bfaq(btvo btvoVar) {
        this.a = btvoVar;
    }

    public static final dbsg<dipk> c(ilo iloVar) {
        dizx cM = iloVar.cM();
        if (cM != null) {
            dizw dizwVar = cM.c;
            if (dizwVar == null) {
                dizwVar = dizw.c;
            }
            dipo dipoVar = dizwVar.b;
            if (dipoVar == null) {
                dipoVar = dipo.e;
            }
            if (dipoVar.c.size() != 0) {
                dizw dizwVar2 = cM.c;
                if (dizwVar2 == null) {
                    dizwVar2 = dizw.c;
                }
                dipo dipoVar2 = dizwVar2.b;
                if (dipoVar2 == null) {
                    dipoVar2 = dipo.e;
                }
                dipk dipkVar = dipoVar2.c.get(0);
                int a = dgce.a(dipkVar.f);
                if (a == 0 || a != 6) {
                    return dbpy.a;
                }
                return dbsg.i(dipkVar);
            }
        }
        return dbpy.a;
    }

    public final boolean a() {
        return this.a.getPlaceSheetParameters().g().a;
    }

    public final boolean b(bwrs<ilo> bwrsVar) {
        if (a()) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            return c(c).a();
        }
        return false;
    }
}
