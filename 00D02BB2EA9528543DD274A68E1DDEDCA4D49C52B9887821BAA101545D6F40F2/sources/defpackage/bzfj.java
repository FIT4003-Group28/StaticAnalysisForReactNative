package defpackage;
/* compiled from: PG */
/* renamed from: bzfj  reason: default package */
/* loaded from: classes4.dex */
public final class bzfj {
    private final bzds a;
    private final bzda b;
    private final vxv c;

    public bzfj(bzds bzdsVar, vxv vxvVar, bzda bzdaVar) {
        this.a = bzdsVar;
        this.c = vxvVar;
        this.b = bzdaVar;
    }

    private static final bzek b(bzek bzekVar, cray crayVar) {
        amuo amuoVar = crayVar.b;
        dbsk.s(amuoVar);
        bzekVar.getClass();
        bzdg bzdgVar = bzekVar.b;
        bzek d = bzekVar.d();
        return (!(d instanceof bzdp) && d.a(amuoVar) != 0) ? b(d, crayVar) : d;
    }

    public final void a(bzek bzekVar, cray crayVar) {
        int i;
        bzdr bzdrVar;
        amuo amuoVar = crayVar.b;
        dbsk.t(amuoVar, "Invalid null step");
        amuoVar.g();
        if (bzekVar.a(amuoVar) > 0) {
            bzdrVar = this.a.a(bzekVar.a, bzdg.a(crayVar.a.o(0), this.b, this.c));
            i = 4;
        } else {
            i = 7;
            bzdrVar = bzekVar;
        }
        bzek b = b(bzdrVar, crayVar);
        b.getClass();
        bzdg bzdgVar = b.b;
        bzekVar.s(b, i, false);
        if ((b instanceof bzdp) || !b.e(crayVar)) {
            b.m();
        }
    }
}
