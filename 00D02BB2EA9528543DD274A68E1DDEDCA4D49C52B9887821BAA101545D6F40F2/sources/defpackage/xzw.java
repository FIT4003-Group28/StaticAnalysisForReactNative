package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: xzw  reason: default package */
/* loaded from: classes7.dex */
public final class xzw {
    public static List<xyt> a(dpdy dpdyVar, int i, cqss cqssVar, byyp byypVar) {
        List<dpgw> subList;
        dccx F = dcdc.F();
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        if (dpheVar.j.size() != 0) {
            dphe dpheVar2 = dpdyVar.e;
            if (dpheVar2 == null) {
                dpheVar2 = dphe.x;
            }
            int size = dpheVar2.j.size();
            dphe dpheVar3 = dpdyVar.e;
            if (dpheVar3 == null) {
                dpheVar3 = dphe.x;
            }
            dotv dotvVar = dpheVar3.l.get(i);
            int i2 = dotvVar.c + 1;
            int i3 = dotvVar.d - 1;
            if (i2 > i3) {
                subList = dcdc.e();
            } else {
                int a = ycy.a(i2, size);
                int a2 = ycy.a(i3, size);
                dphe dpheVar4 = dpdyVar.e;
                if (dpheVar4 == null) {
                    dpheVar4 = dphe.x;
                }
                subList = dpheVar4.j.subList(a, a2 + 1);
            }
            for (dpgw dpgwVar : subList) {
                F.g(new xzv(dpgwVar, cqssVar, byypVar));
            }
            return F.f();
        }
        return F.f();
    }
}
