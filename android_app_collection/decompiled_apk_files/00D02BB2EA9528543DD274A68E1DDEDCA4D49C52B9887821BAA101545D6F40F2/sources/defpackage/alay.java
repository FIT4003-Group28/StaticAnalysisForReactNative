package defpackage;
/* compiled from: PG */
/* renamed from: alay  reason: default package */
/* loaded from: classes2.dex */
public final class alay {
    public static final alax a(dmni dmniVar, akox akoxVar, boolean z) {
        alaw alawVar;
        dmti b = dmti.b(dmniVar.b);
        if (b == null) {
            b = dmti.WORLD_ENCODING_UNKNOWN;
        }
        if (!z) {
            alawVar = new alaw(false, dbpy.a);
        } else {
            alawVar = new alaw(true, dbpy.a);
        }
        return new albf(dmniVar, new albd(akoxVar, b, 1, alawVar));
    }

    public static final alax b(dmni dmniVar, akox akoxVar, @dzsi akvo<aktj<?, ?>> akvoVar, int i) {
        if (i == 2) {
            dbsk.l(dmniVar.c.isEmpty());
        }
        dmti b = dmti.b(dmniVar.b);
        if (b == null) {
            b = dmti.WORLD_ENCODING_UNKNOWN;
        }
        return new albf(dmniVar, new albd(akoxVar, b, i, new alaw(false, dbsg.i(akvoVar))));
    }

    public static final alax c(dmni dmniVar, akox akoxVar, @dzsi akvo<aktj<?, ?>> akvoVar) {
        return b(dmniVar, akoxVar, akvoVar, 1);
    }
}
