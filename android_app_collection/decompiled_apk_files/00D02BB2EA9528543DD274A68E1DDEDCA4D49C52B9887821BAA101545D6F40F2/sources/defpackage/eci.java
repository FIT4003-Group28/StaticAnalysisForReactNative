package defpackage;
/* compiled from: PG */
/* renamed from: eci  reason: default package */
/* loaded from: classes6.dex */
public class eci {
    public static dkfr a(dspd dspdVar, int i, dkfv dkfvVar) {
        dkgf dkgfVar = dkfvVar.c;
        if (dkgfVar == null) {
            dkgfVar = dkgf.c;
        }
        for (dkfr dkfrVar : dkgfVar.a.get(i).b) {
            if (dspdVar.equals(dkfrVar.a)) {
                return dkfrVar;
            }
        }
        return dkfr.d;
    }
}
