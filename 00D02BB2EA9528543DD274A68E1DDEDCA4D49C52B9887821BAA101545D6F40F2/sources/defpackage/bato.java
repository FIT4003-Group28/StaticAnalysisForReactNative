package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bato  reason: default package */
/* loaded from: classes3.dex */
public final class bato {
    public final cqat a;

    public bato(cqat cqatVar) {
        this.a = cqatVar;
    }

    public static drjs a(List<drjs> list) {
        if (list.size() == 1) {
            drjs drjsVar = (drjs) dcft.c(list);
            if (b(batk.e(drjsVar))) {
                return drjsVar;
            }
            return null;
        }
        return null;
    }

    public static boolean b(drdg drdgVar) {
        return (drdgVar.a & 16) != 0 && !drdgVar.g.isEmpty();
    }

    public static boolean c(drjs drjsVar, long j) {
        dqfu c = batk.c(drjsVar);
        return (c.a & 1) != 0 && j < c.b;
    }

    public static boolean d(drjs drjsVar, drjs drjsVar2) {
        return drjsVar == null || batk.c(drjsVar2).b < batk.c(drjsVar).b;
    }

    public static dcdc<drjs> e(drjs... drjsVarArr) {
        dccx F = dcdc.F();
        for (drjs drjsVar : drjsVarArr) {
            if (drjsVar != null) {
                F.g(drjsVar);
            }
        }
        return F.f();
    }
}
