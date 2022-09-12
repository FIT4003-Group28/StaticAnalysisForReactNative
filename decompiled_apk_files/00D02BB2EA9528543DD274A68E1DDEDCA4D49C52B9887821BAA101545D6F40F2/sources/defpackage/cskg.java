package defpackage;

import java.util.Map;
/* compiled from: PG */
@Deprecated
/* renamed from: cskg  reason: default package */
/* loaded from: classes5.dex */
public final class cskg implements csit {
    private final csit a = cskf.a;
    private final csit b;
    private final Map<String, csit> c;

    public cskg(csit csitVar, Map<String, csit> map) {
        this.b = csitVar;
        this.c = map;
    }

    private final csit g(csgc csgcVar) {
        Object b;
        if (csgcVar instanceof csio) {
            csio csioVar = (csio) csgcVar;
            cshb b2 = csioVar.b();
            dsqv<cshb, cski> dsqvVar = cskj.a;
            b2.f(dsqvVar);
            if (b2.V.k(dsqvVar.d)) {
                cshb b3 = csioVar.b();
                dsqv<cshb, cski> dsqvVar2 = cskj.a;
                b3.f(dsqvVar2);
                Object l = b3.V.l(dsqvVar2.d);
                if (l == null) {
                    b = dsqvVar2.b;
                } else {
                    b = dsqvVar2.b(l);
                }
                String str = ((cski) b).b;
                csit csitVar = this.c.get(str);
                String valueOf = String.valueOf(str);
                dbsk.t(csitVar, valueOf.length() != 0 ? "No config for: ".concat(valueOf) : new String("No config for: "));
                return csitVar;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.csit
    public final String a(csgc csgcVar) {
        return g(csgcVar).a(csgcVar);
    }

    @Override // defpackage.csit
    public final dehn<dssj> b(csgc csgcVar, dehn<csfs> dehnVar) {
        return g(csgcVar).b(csgcVar, dehnVar);
    }

    @Override // defpackage.csit
    public final dbsg<dsrb> c(csgc csgcVar) {
        return g(csgcVar).c(csgcVar);
    }

    @Override // defpackage.csit
    public final dehn<int[]> d(dehn<csfs> dehnVar) {
        return this.b.d(dehnVar);
    }

    @Override // defpackage.csit
    public final int e(csgc csgcVar) {
        return g(csgcVar).e(csgcVar);
    }

    @Override // defpackage.csit
    public final dehn f() {
        return csis.b();
    }
}
