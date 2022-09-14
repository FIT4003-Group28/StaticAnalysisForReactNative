package defpackage;
/* compiled from: PG */
/* renamed from: zqw  reason: default package */
/* loaded from: classes7.dex */
public abstract class zqw implements zfr {
    @dzsi
    public static zfr d(@dzsi dpke dpkeVar, vtn vtnVar) {
        float f;
        zgq zgqVar = null;
        if (dpkeVar == null) {
            return null;
        }
        int i = dpkeVar.a;
        if ((i & 1) != 0 && (i & 2) != 0 && (i & 4) != 0 && (i & 8) != 0) {
            cqtd c = vtnVar.c(dpkeVar.c);
            if (c == null) {
                return null;
            }
            String str = dpkeVar.b;
            int a = dpkd.a(dpkeVar.e);
            if (a == 0 || a != 3) {
                f = dpkeVar.d;
            } else {
                f = ((dpkeVar.d - 32.0f) * 5.0f) / 9.0f;
            }
            zgqVar = new zgq(str, String.format("\u200e%d°", Integer.valueOf(Math.round(f))), c);
        }
        return zgqVar;
    }
}
