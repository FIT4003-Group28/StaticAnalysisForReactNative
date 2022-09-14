package defpackage;
/* compiled from: PG */
/* renamed from: xke  reason: default package */
/* loaded from: classes7.dex */
public final class xke {
    @dzsi
    public static dqea a(dooa dooaVar) {
        if ((dooaVar.a & 256) != 0) {
            dpjb dpjbVar = dooaVar.k;
            if (dpjbVar == null) {
                dpjbVar = dpjb.e;
            }
            if ((dpjbVar.a & 1) == 0) {
                return null;
            }
            dqea dqeaVar = dpjbVar.b;
            return dqeaVar == null ? dqea.b : dqeaVar;
        }
        return null;
    }
}
