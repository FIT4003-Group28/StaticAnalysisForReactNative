package defpackage;
/* compiled from: PG */
/* renamed from: ctw  reason: default package */
/* loaded from: classes5.dex */
public class ctw {
    private final efc a;

    public ctw(efc efcVar) {
        this.a = efcVar;
    }

    public static dbsg<String> d(ilo iloVar) {
        ikz ikzVar = iloVar.d;
        if (ikzVar != null) {
            String str = ikzVar.m;
            if (!iloVar.f && !dbsj.d(str)) {
                return dbsg.i(str);
            }
        }
        return dbpy.a;
    }

    public static final dbsg<String> e(ilo iloVar) {
        cut cD = iloVar.cD();
        if (cD != null) {
            djie djieVar = cD.b;
            if (djieVar == null) {
                djieVar = djie.k;
            }
            dhph dhphVar = djieVar.f;
            if (dhphVar == null) {
                dhphVar = dhph.e;
            }
            if ((dhphVar.a & 8) != 0) {
                djie djieVar2 = cD.b;
                if (djieVar2 == null) {
                    djieVar2 = djie.k;
                }
                dhph dhphVar2 = djieVar2.f;
                if (dhphVar2 == null) {
                    dhphVar2 = dhph.e;
                }
                return dbsg.i(dhphVar2.d);
            }
        }
        return dbpy.a;
    }

    public final dbsg<String> a(ilo iloVar) {
        dbsg<String> c = c(iloVar);
        return c.a() ? c : d(iloVar);
    }

    public final dbsg<ddho> b(ilo iloVar) {
        if (e(iloVar).a()) {
            return dbsg.i(dtxy.ly);
        }
        if (c(iloVar).a()) {
            return dbsg.i(dtxy.mk);
        }
        return d(iloVar).a() ? dbsg.i(dtyb.bd) : dbpy.a;
    }

    public final dbsg<String> c(ilo iloVar) {
        ikz ikzVar = iloVar.d;
        if (ikzVar != null) {
            String str = ikzVar.n;
            egu c = this.a.c();
            if (iloVar.f && c != null && c.j.b() && !dbsj.d(str)) {
                return dbsg.i(str);
            }
        }
        return dbpy.a;
    }
}
