package defpackage;
/* compiled from: PG */
/* renamed from: bbrl  reason: default package */
/* loaded from: classes3.dex */
final class bbrl implements bbrk {
    private final cdfp a;

    public bbrl(cdfp cdfpVar) {
        this.a = cdfpVar;
    }

    @Override // defpackage.bbrk
    public final boolean a(crua cruaVar) {
        crtx crtxVar = crtx.UNKNOWN;
        crtx b = crtx.b(cruaVar.e);
        if (b == null) {
            b = crtx.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal == 4 || ordinal == 5) {
            String str = cruaVar.b;
            dccx dccxVar = new dccx();
            for (crtv crtvVar : cruaVar.g) {
                crtx b2 = crtx.b(crtvVar.b);
                if (b2 == null) {
                    b2 = crtx.UNKNOWN;
                }
                if (b2 == crtx.IMPORTED) {
                    dccxVar.g(new bbsg(decs.c(crtvVar.c, 16), decs.c(crtvVar.d, 16), ""));
                }
            }
            this.a.a(dccxVar.f());
            return true;
        }
        return false;
    }
}
