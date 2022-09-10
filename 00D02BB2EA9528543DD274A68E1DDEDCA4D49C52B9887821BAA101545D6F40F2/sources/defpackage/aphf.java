package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aphf  reason: default package */
/* loaded from: classes2.dex */
public final class aphf {
    public static dbsg<aowm> b(List<bwrs<aoyg>> list) {
        dccx F = dcdc.F();
        for (bwrs<aoyg> bwrsVar : list) {
            aoyg c = bwrsVar.c();
            dbsk.s(c);
            F.g(c.g());
        }
        dcdc f = F.f();
        int size = f.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = z || ((dbsg) f.get(i)).a();
        }
        return z ? dbsg.i(aowm.TIMELINE_PLACE_VISITS_NOT_AVAILABLE) : dbpy.a;
    }

    public static jam a(aowm aowmVar, gga ggaVar, @dzsi String str, @dzsi String str2, @dzsi aphe apheVar) {
        if (str2 == null) {
            if (apheVar == null) {
                apheVar = null;
            }
            throw new AssertionError("actionButtonText and actionListener should be both null or both non-null");
        }
        aphe apheVar2 = apheVar;
        if (str2 == null || apheVar2 != null) {
            return new aphd(aowmVar, ggaVar, str, str2, apheVar2);
        }
        throw new AssertionError("actionButtonText and actionListener should be both null or both non-null");
    }
}
