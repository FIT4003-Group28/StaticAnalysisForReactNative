package defpackage;
/* compiled from: PG */
/* renamed from: bhse  reason: default package */
/* loaded from: classes3.dex */
public class bhse implements bhrx {
    private final iic a;
    private final iib b;
    private final boolean c;

    public bhse(dcdc<bhsl> dcdcVar, bvpe bvpeVar, huc hucVar, boolean z, bwrs<ilo> bwrsVar) {
        final cjtd cjtdVar;
        this.c = z;
        ilo c = bwrsVar.c();
        if (c != null) {
            cjta c2 = cjtd.c(c.ca());
            c2.d = dtxx.I;
            cjtdVar = c2.a();
        } else {
            cjtdVar = cjtd.b;
        }
        bvob bvobVar = new bvob(bvpeVar.b, hucVar.a(new htz(cjtdVar) { // from class: bhsd
            private final cjtd a;

            {
                this.a = cjtdVar;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        iic j = iid.j();
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bhor(dtxx.J), dcdcVar.get(i)));
        }
        j.e(F.f());
        ifj ifjVar = (ifj) j;
        ifjVar.e = bvobVar;
        ifjVar.f = cjtdVar;
        this.a = j;
        this.b = j.f();
    }

    @Override // defpackage.bhrx
    public Boolean a() {
        return false;
    }

    @Override // defpackage.bhrx
    public cqkl b() {
        return cqkl.a;
    }

    @Override // defpackage.bhrx
    public Boolean c() {
        return false;
    }

    @Override // defpackage.bhrx
    public cqkl d() {
        return cqkl.a;
    }

    @Override // defpackage.bhrx
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bhrx
    public iib f() {
        return this.b;
    }

    @Override // defpackage.bhrx
    public Boolean g() {
        return Boolean.valueOf(this.c);
    }
}
