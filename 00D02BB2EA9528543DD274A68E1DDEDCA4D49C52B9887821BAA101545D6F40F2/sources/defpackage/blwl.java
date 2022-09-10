package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: blwl  reason: default package */
/* loaded from: classes3.dex */
public final class blwl {
    public static blvw a(blpg blpgVar, @dzsi blvw blvwVar, String str) {
        bvrj.UI_THREAD.d();
        return new blvw(b(blpgVar, blvwVar == null ? null : blvwVar.a, str));
    }

    public static dcdc<blvu> b(blpg blpgVar, @dzsi List<blvu> list, @dzsi String str) {
        bvrj.UI_THREAD.d();
        dccx F = dcdc.F();
        if (str != null && list != null) {
            for (blvu blvuVar : list) {
                if (!blpgVar.c(str, blvuVar.c)) {
                    F.g(blvuVar);
                }
            }
        }
        return F.f();
    }
}
