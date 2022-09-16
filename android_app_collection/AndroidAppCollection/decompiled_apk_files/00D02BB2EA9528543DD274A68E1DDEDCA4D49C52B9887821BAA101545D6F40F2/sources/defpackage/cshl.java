package defpackage;
/* compiled from: PG */
/* renamed from: cshl  reason: default package */
/* loaded from: classes5.dex */
public final class cshl implements csfw {
    private final csfs a;

    public cshl(csfs csfsVar) {
        this.a = csfsVar;
    }

    @Override // defpackage.csfw
    public final dehn<csfs> a(csgc csgcVar) {
        Object b;
        if (csgcVar instanceof csio) {
            csio csioVar = (csio) csgcVar;
            cshb b2 = csioVar.b();
            dsqv<cshb, cshp> dsqvVar = cshq.a;
            b2.f(dsqvVar);
            if (b2.V.k(dsqvVar.d)) {
                cshb b3 = csioVar.b();
                dsqv<cshb, cshp> dsqvVar2 = cshq.a;
                b3.f(dsqvVar2);
                Object l = b3.V.l(dsqvVar2.d);
                if (l == null) {
                    b = dsqvVar2.b;
                } else {
                    b = dsqvVar2.b(l);
                }
                cshp cshpVar = (cshp) b;
                int a = csho.a(cshpVar.c);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 1) {
                    if ((cshpVar.a & 1) != 0) {
                        return deha.a(csfs.a(cshpVar.b));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                } else if (i == 2) {
                    return deha.a(new csfs(3, null));
                } else {
                    if (i == 3) {
                        return deha.a(csfs.b());
                    }
                    if (i != 4) {
                        throw new IllegalArgumentException("Unknown type");
                    }
                    return deha.a(this.a);
                }
            }
        }
        return deha.a(null);
    }
}
