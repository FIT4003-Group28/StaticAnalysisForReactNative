package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qdv  reason: default package */
/* loaded from: classes7.dex */
public abstract class qdv {
    public static qdv f(dphe dpheVar, boolean z, boolean z2) {
        dpgw dpgwVar = dpheVar.c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return new qbc((dpgwVar.a & 4096) != 0 ? akqi.b(dpgwVar.n) : null, dcdc.f(dpheVar.n), true != z ? 3 : 1, 3, z2);
    }

    public static qdv g(dphe dpheVar, btvo btvoVar) {
        dpgw dpgwVar = dpheVar.c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return new qbc((dpgwVar.a & 4096) != 0 ? akqi.b(dpgwVar.n) : null, dcdc.f(dpheVar.n), btvoVar.getTransitTrackingParameters().n, 4, false);
    }

    @dzsi
    public abstract akqi a();

    public abstract List<String> b();

    public abstract int c();

    public abstract boolean d();

    public abstract int e();
}
