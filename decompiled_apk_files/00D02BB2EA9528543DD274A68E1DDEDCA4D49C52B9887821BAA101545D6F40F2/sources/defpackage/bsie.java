package defpackage;
/* compiled from: PG */
/* renamed from: bsie  reason: default package */
/* loaded from: classes4.dex */
public enum bsie {
    ANY(dtxp.q, 0),
    THREE_PLUS(dtxp.t, 28),
    FOUR_PLUS(dtxp.s, 24),
    FIVE(dtxp.r, 16);
    
    public final int e;
    public final ddho f;

    bsie(ddho ddhoVar, int i) {
        this.f = ddhoVar;
        this.e = i;
    }

    @dzsi
    public static bsie a(int i) {
        bsie bsieVar;
        if (i > 0) {
            int i2 = bsif.a;
            if (i > 31) {
                return null;
            }
            int length = values().length;
            do {
                length--;
                if (length < 0) {
                    return ANY;
                }
                bsieVar = values()[length];
            } while (((bsieVar.e ^ (-1)) & i) != 0);
            return bsieVar;
        }
        return null;
    }
}
