package defpackage;
/* compiled from: PG */
/* renamed from: pnu  reason: default package */
/* loaded from: classes7.dex */
public enum pnu {
    START("start"),
    ARRIVAL("arrive"),
    TRAFFIC("traffic");
    
    public final String d;

    pnu(String str) {
        this.d = str;
    }

    public static dbsg<ddho> a(pnu pnuVar) {
        int ordinal = pnuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dbsg.i(dtxl.is);
            }
            return ordinal != 2 ? dbpy.a : dbsg.i(dtxl.iz);
        }
        return dbsg.i(dtxl.iy);
    }
}
