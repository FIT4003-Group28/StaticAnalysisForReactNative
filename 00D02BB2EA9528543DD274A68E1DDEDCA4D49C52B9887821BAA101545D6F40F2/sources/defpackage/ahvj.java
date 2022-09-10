package defpackage;
/* compiled from: PG */
/* renamed from: ahvj  reason: default package */
/* loaded from: classes2.dex */
public final class ahvj {
    public final doek a;
    public final dbty<amtm> b;
    public final dbty<dcwi> c;
    private final dbty<amub> d;

    public ahvj(final doek doekVar, dbty<amub> dbtyVar, dbty<amtm> dbtyVar2) {
        this.a = doekVar;
        this.d = dbud.a(dbtyVar);
        this.b = dbud.a(dbtyVar2);
        this.c = dbud.a(new dbty(doekVar) { // from class: ahvh
            private final doek a;

            {
                this.a = doekVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                doek doekVar2 = this.a;
                dccx F = dcdc.F();
                doqt doqtVar = doekVar2.c;
                if (doqtVar == null) {
                    doqtVar = doqt.k;
                }
                doud doudVar = doqtVar.e;
                if (doudVar == null) {
                    doudVar = doud.c;
                }
                dcvs dcvsVar = dcvs.a;
                for (int i = 0; i < doudVar.a.size() && i < doudVar.b.size(); i++) {
                    dcvs c = dcvs.c(doudVar.a.f(i), doudVar.b.f(i));
                    dcvsVar = new dcvs(dcvsVar.b + c.b, dcvsVar.c + c.c).j();
                    F.g(dcvsVar.k());
                }
                return new dcwi(F.f());
            }
        });
    }

    public final amub a() {
        return this.d.a();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof ahvj) {
            return this.a.equals(((ahvj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        doek doekVar = this.a;
        int i = doekVar.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(doekVar).c(doekVar);
        doekVar.bC = c;
        return c;
    }
}
