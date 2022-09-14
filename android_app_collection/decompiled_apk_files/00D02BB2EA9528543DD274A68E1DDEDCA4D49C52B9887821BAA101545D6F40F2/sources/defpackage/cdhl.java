package defpackage;
/* compiled from: PG */
/* renamed from: cdhl  reason: default package */
/* loaded from: classes4.dex */
public final class cdhl {
    public final ilo a;

    private cdhl(ilo iloVar) {
        this.a = iloVar;
    }

    public static cdhl e(aeuf aeufVar) {
        ilo c = aeufVar.f().c();
        dbsk.s(c);
        return new cdhl(c);
    }

    public final akqi a() {
        return this.a.ai();
    }

    public final akqq b() {
        return this.a.aj();
    }

    public final String c() {
        return this.a.q();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cdhl) && this.a.cr(((cdhl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static dbsg<cdhl> d(dwjb dwjbVar) {
        String str;
        if ((dwjbVar.a & 8) != 0) {
            str = dwjbVar.e;
        } else {
            dvyw dvywVar = dwjbVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            str = dvywVar.am;
        }
        if ((dwjbVar.a & 1) != 0) {
            ily ilyVar = new ily();
            dvyw dvywVar2 = dwjbVar.b;
            if (dvywVar2 == null) {
                dvywVar2 = dvyw.bv;
            }
            ilyVar.E(dvywVar2);
            ilyVar.x = str;
            return dbsg.i(new cdhl(ilyVar.d()));
        }
        return dbpy.a;
    }
}
