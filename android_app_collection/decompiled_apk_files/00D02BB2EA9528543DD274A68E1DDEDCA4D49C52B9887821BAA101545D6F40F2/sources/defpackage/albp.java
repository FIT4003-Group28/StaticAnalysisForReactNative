package defpackage;
/* compiled from: PG */
/* renamed from: albp  reason: default package */
/* loaded from: classes2.dex */
public final class albp {
    public final akuh a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public albp(akuh akuhVar, int i) {
        this(akuhVar, false, false, i);
    }

    public albp(akuh akuhVar, boolean z, boolean z2, int i) {
        this.a = akuhVar;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public static albp a(dozr dozrVar, akvz akvzVar) {
        if ((dozrVar.a & 4) != 0) {
            dozq dozqVar = dozrVar.d;
            if (dozqVar == null) {
                dozqVar = dozq.e;
            }
            dmqc b = dmqc.b(dozqVar.b);
            if (b == null) {
                b = dmqc.LEGEND_STYLE_UNDEFINED;
            }
            akuh a = akvzVar.a(b);
            int i = (b == dmqc.LEGEND_STYLE_JAMCIDENT || b == dmqc.LEGEND_STYLE_ROAD_CLOSURE) ? 2 : 1;
            if ((dozqVar.a & 2) != 0) {
                dmqc b2 = dmqc.b(dozqVar.c);
                if (b2 == null) {
                    b2 = dmqc.LEGEND_STYLE_UNDEFINED;
                }
                if (b2 != dmqc.LEGEND_STYLE_UNDEFINED) {
                    if ((dozqVar.a & 4) != 0) {
                        dmqc b3 = dmqc.b(dozqVar.d);
                        if (b3 == null) {
                            b3 = dmqc.LEGEND_STYLE_UNDEFINED;
                        }
                        if (b3 != dmqc.LEGEND_STYLE_UNDEFINED) {
                            return new albp(a, true, true, i);
                        }
                    }
                    return new albp(a, true, false, i);
                }
            }
            return new albp(a, i);
        }
        return new albp(akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_SLOW), 1);
    }
}
