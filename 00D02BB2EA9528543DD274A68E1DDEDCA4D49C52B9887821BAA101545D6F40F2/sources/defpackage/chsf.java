package defpackage;
/* compiled from: PG */
/* renamed from: chsf  reason: default package */
/* loaded from: classes4.dex */
public class chsf {
    public static final dcdc<Integer> a = dcdc.k(3, 4, 1, 2, 5, 7);
    public final btvo b;

    public chsf(btvo btvoVar) {
        this.b = btvoVar;
    }

    public final boolean a() {
        dhpt dhptVar = this.b.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.u;
    }

    public final boolean b(chtq chtqVar) {
        if (a()) {
            chxj chxjVar = chxj.RATING;
            drrx drrxVar = drrx.UNKNOWN_MODE;
            switch (chtqVar.a().ordinal()) {
                case 0:
                    return true;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return false;
                default:
                    throw new AssertionError(chtqVar.a());
            }
        }
        return false;
    }

    public final boolean c() {
        if (!a()) {
            dhpt dhptVar = this.b.getContributionsPageParameters().h;
            if (dhptVar == null) {
                dhptVar = dhpt.w;
            }
            return dhptVar.o;
        }
        return false;
    }

    public final boolean d(chtq chtqVar) {
        return !b(chtqVar) && c() && chtqVar.m();
    }

    public final boolean e() {
        dhpt dhptVar = this.b.getContributionsPageParameters().h;
        if (dhptVar == null) {
            dhptVar = dhpt.w;
        }
        return dhptVar.v;
    }
}
