package defpackage;
/* compiled from: PG */
/* renamed from: bgsf  reason: default package */
/* loaded from: classes3.dex */
public final class bgsf {
    public static boolean a(bwrs<ilo> bwrsVar) {
        return ((ilo) bwrs.b(bwrsVar)) != null;
    }

    @dzsi
    public static dwca b(@dzsi bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return null;
        }
        for (dwca dwcaVar : iloVar.h().aD) {
            dwci b = dwci.b(dwcaVar.c);
            if (b == null) {
                b = dwci.UNKNOWN_RELATION_CATEGORY;
            }
            if (b == dwci.INDEPENDENT_ESTABLISHMENTS) {
                return dwcaVar;
            }
        }
        return null;
    }

    public static boolean c(@dzsi bwrs<ilo> bwrsVar) {
        dwca b = b(bwrsVar);
        return b != null && b.a.size() >= 5;
    }

    public static String d(String str) {
        return str.toLowerCase().replaceFirst("^\\s*", "");
    }

    public static void e(ilo iloVar, begg beggVar) {
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        beggVar.o(begjVar, false, null);
    }
}
