package defpackage;
/* compiled from: PG */
/* renamed from: bbrp  reason: default package */
/* loaded from: classes3.dex */
final class bbrp implements bbrk {
    private final bbuk a;

    public bbrp(bbuk bbukVar) {
        this.a = bbukVar;
    }

    @Override // defpackage.bbrk
    public final boolean a(crua cruaVar) {
        crtx crtxVar = crtx.UNKNOWN;
        crtx b = crtx.b(cruaVar.e);
        if (b == null) {
            b = crtx.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal == 3) {
            if ((cruaVar.a & 128) != 0) {
                bbuk bbukVar = this.a;
                dfqq dfqqVar = cruaVar.j;
                if (dfqqVar == null) {
                    dfqqVar = dfqq.x;
                }
                String str = dfqqVar.m;
                dfqq dfqqVar2 = cruaVar.j;
                if (dfqqVar2 == null) {
                    dfqqVar2 = dfqq.x;
                }
                bbukVar.a(str, dfqqVar2.c);
            }
            return true;
        } else if (ordinal != 5) {
            int i = cruaVar.e;
            dfqq dfqqVar3 = cruaVar.j;
            if (dfqqVar3 == null) {
                dfqqVar3 = dfqq.x;
            }
            String str2 = dfqqVar3.m;
            String str3 = cruaVar.c;
            return false;
        } else {
            bbuk bbukVar2 = this.a;
            dbpy<Object> dbpyVar = dbpy.a;
            cruc b2 = cruc.b(cruaVar.n);
            if (b2 == null) {
                b2 = cruc.PERMANENT_UNKNOWN;
            }
            bbukVar2.b(dbpyVar, dbsg.i(b2));
            return true;
        }
    }
}
