package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: lzc  reason: default package */
/* loaded from: classes7.dex */
public final class lzc {
    public final lzb a;
    @dzsi
    private final mnz b;

    public lzc(lzb lzbVar) {
        dbsk.a(lzbVar != lzb.PLACE_DETAILS);
        this.a = lzbVar;
        this.b = null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof lzc)) {
            return false;
        }
        lzc lzcVar = (lzc) obj;
        return dbsd.a(this.a, lzcVar.a) && dbsd.a(this.b, lzcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.a == lzb.PLACE_DETAILS) {
            dbsk.s(this.b);
            return this.b.name();
        }
        return this.a.name();
    }

    public lzc(mnz mnzVar) {
        this.a = lzb.PLACE_DETAILS;
        this.b = mnzVar;
    }
}
