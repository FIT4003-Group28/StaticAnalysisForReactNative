package defpackage;
/* compiled from: PG */
/* renamed from: cwko  reason: default package */
/* loaded from: classes5.dex */
public abstract class cwko {
    public static cwko c() {
        return new cwkp(2, null);
    }

    public abstract String a();

    public abstract int d();

    public final csgr<?> b() {
        int d = d();
        int i = d - 1;
        if (d != 0) {
            if (i == 0) {
                String a = a();
                a.getClass();
                dbsk.a(a.contains("@"));
                dsqv<cshb, cshp> dsqvVar = cshq.a;
                cshm bZ = cshp.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cshp cshpVar = (cshp) bZ.b;
                cshpVar.c = 1;
                int i2 = 2 | cshpVar.a;
                cshpVar.a = i2;
                a.getClass();
                cshpVar.a = 1 | i2;
                cshpVar.b = a;
                return csgr.a(dsqvVar, bZ.bK());
            } else if (i == 1) {
                return cshk.a();
            } else {
                if (i == 2) {
                    dsqv<cshb, cshp> dsqvVar2 = cshq.a;
                    cshm bZ2 = cshp.d.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cshp cshpVar2 = (cshp) bZ2.b;
                    cshpVar2.c = 3;
                    cshpVar2.a |= 2;
                    return csgr.a(dsqvVar2, bZ2.bK());
                } else if (i == 3) {
                    dsqv<cshb, cshp> dsqvVar3 = cshq.a;
                    cshm bZ3 = cshp.d.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    cshp cshpVar3 = (cshp) bZ3.b;
                    cshpVar3.c = 4;
                    cshpVar3.a = 2 | cshpVar3.a;
                    return csgr.a(dsqvVar3, bZ3.bK());
                } else {
                    return cshk.a();
                }
            }
        }
        throw null;
    }
}
