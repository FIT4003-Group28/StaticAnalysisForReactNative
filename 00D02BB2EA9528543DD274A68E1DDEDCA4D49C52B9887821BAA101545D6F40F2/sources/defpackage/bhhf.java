package defpackage;
/* compiled from: PG */
/* renamed from: bhhf  reason: default package */
/* loaded from: classes.dex */
public class bhhf {
    public final btvo a;
    private final apyx b;

    public bhhf(btvo btvoVar, apyx apyxVar) {
        this.a = btvoVar;
        this.b = apyxVar;
    }

    public final boolean a(@dzsi ilo iloVar) {
        return iloVar != null && iloVar.bf() != null && iloVar.bf().r && this.a.getMerchantModeParameters().b;
    }

    public final boolean b(@dzsi bwrs<ilo> bwrsVar) {
        return a((ilo) bwrs.b(bwrsVar));
    }

    public final boolean c() {
        return this.a.getMerchantModeParameters().d && this.a.getMerchantModeParameters().b;
    }

    public final boolean d(@dzsi bwrs<ilo> bwrsVar) {
        return b(bwrsVar) && this.a.getMerchantModeParameters().c;
    }

    public final cjtd e(ilo iloVar, ddho ddhoVar) {
        if (a(iloVar)) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = ddhoVar;
            return c.a();
        }
        return cjtd.b;
    }

    public final boolean f(@dzsi bwrs<ilo> bwrsVar) {
        return b(bwrsVar) && this.a.getMerchantModeParameters().e;
    }

    public final boolean g(@dzsi bwrs<ilo> bwrsVar) {
        if (bwrsVar != null && a(bwrsVar.c())) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            if ((c.bf().a & 16777216) != 0) {
                ilo c2 = bwrsVar.c();
                dbsk.s(c2);
                dvwi dvwiVar = c2.bf().v;
                if (dvwiVar == null) {
                    dvwiVar = dvwi.m;
                }
                int i = dvwiVar.a;
                if (((i & 8) != 0 || (i & 16) != 0 || (i & 32) != 0 || (i & 64) != 0) && this.a.getMerchantModeParameters().f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(@dzsi bwrs<ilo> bwrsVar) {
        return g(bwrsVar) && this.a.getMerchantModeParameters().m;
    }

    public final boolean i(@dzsi bwrs<ilo> bwrsVar) {
        return b(bwrsVar) && this.a.getMerchantModeParameters().g;
    }

    public final boolean j(@dzsi bwrs<ilo> bwrsVar, dboe dboeVar) {
        if (!g(bwrsVar)) {
            return false;
        }
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        dvwi dvwiVar = c.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        dboe dboeVar2 = dboe.POST_TOPIC_TYPE_UNSPECIFIED;
        int ordinal = dboeVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal == 4 && (dvwiVar.a & 32) != 0 : (dvwiVar.a & 16) != 0 : (dvwiVar.a & 8) != 0 : (dvwiVar.a & 64) != 0;
    }

    public final boolean k(@dzsi bwrs<ilo> bwrsVar) {
        return b(bwrsVar) && this.a.getMerchantModeParameters().k;
    }

    public final boolean l(@dzsi bwrs<ilo> bwrsVar) {
        return b(bwrsVar) && this.a.getMerchantModeParameters().l;
    }

    public final boolean m(@dzsi bwrs<ilo> bwrsVar) {
        return b(bwrsVar) && this.a.getMerchantModeParameters().h;
    }

    public final boolean n(@dzsi ilo iloVar) {
        return a(iloVar) && this.a.getMerchantModeParameters().s;
    }

    public final boolean o() {
        return this.a.getMerchantModeParameters().v;
    }

    public final boolean p(@dzsi ilo iloVar) {
        return a(iloVar) && this.a.getMerchantModeParameters().u;
    }

    public final boolean q(@dzsi bwrs<ilo> bwrsVar) {
        return this.b.d() && b(bwrsVar) && this.a.getMerchantModeParameters().o;
    }
}
