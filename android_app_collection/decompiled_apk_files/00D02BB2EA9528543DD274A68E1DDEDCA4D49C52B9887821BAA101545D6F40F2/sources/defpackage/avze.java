package defpackage;
/* compiled from: PG */
/* renamed from: avze  reason: default package */
/* loaded from: classes.dex */
public abstract class avze {
    public static final avze a = new avyu(null, null, avzd.DISABLED);

    public static avze h() {
        return new avyu(null, null, avzd.INCOGNITO);
    }

    public static avze i(@dzsi btlu btluVar, @dzsi String str) {
        btlu.p(btluVar);
        return dbsd.a(btluVar, btlu.a) ? a : new avyu(btluVar, str, avzd.SINGLE_OWNER);
    }

    @dzsi
    @Deprecated
    public abstract btlu a();

    @dzsi
    public abstract String b();

    public abstract avzd c();

    @dzsi
    public final String d() {
        return equals(a) ? "disabled" : c().equals(avzd.MULTI_OWNER) ? "shared" : c().equals(avzd.INCOGNITO) ? "incognitoAccount" : btlu.p(a()) ? "notLoggedInAccount" : btlu.h(a());
    }

    public final boolean e() {
        return b() != null;
    }

    public final boolean f() {
        return !equals(a) && b() == null;
    }

    public final dlrl g() {
        dlrk bZ = dlrl.d.bZ();
        String d = d();
        if (d != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlrl dlrlVar = (dlrl) bZ.b;
            d.getClass();
            dlrlVar.a |= 1;
            dlrlVar.b = d;
        }
        String b = b();
        if (b != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlrl dlrlVar2 = (dlrl) bZ.b;
            b.getClass();
            dlrlVar2.a |= 2;
            dlrlVar2.c = b;
        }
        return bZ.bK();
    }
}
