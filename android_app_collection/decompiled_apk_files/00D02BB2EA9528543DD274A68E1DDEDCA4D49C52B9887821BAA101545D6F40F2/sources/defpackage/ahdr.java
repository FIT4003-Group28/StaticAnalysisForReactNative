package defpackage;
/* compiled from: PG */
/* renamed from: ahdr  reason: default package */
/* loaded from: classes2.dex */
public class ahdr implements agzj {
    public final dcdc<ahfn> a;
    public final dcdc<ahfn> b;
    private final gga c;
    private final dxio<afha> d;
    private final dlbw e;
    private final dspd f;
    private final boolean g;
    @dzsi
    private final jic h;
    @dzsi
    private final jic i;
    private final dcdc<ilo> j;
    private final cjta k;

    public ahdr(gga ggaVar, ahfo ahfoVar, dxio<afha> dxioVar, dlbw dlbwVar, dspd dspdVar, boolean z, boolean z2, int i, ddzg ddzgVar) {
        this.c = ggaVar;
        this.d = dxioVar;
        this.e = dlbwVar;
        this.f = dspdVar;
        this.g = z;
        dsrj<dwfl> dsrjVar = dlbwVar.d;
        if (dsrjVar.isEmpty()) {
            this.h = null;
        } else {
            this.h = agxk.i(agxk.g(dsrjVar.get(0)));
        }
        dlcs dlcsVar = dlbwVar.e;
        dwfl dwflVar = (dlcsVar == null ? dlcs.f : dlcsVar).d;
        this.i = agxk.g(dwflVar == null ? dwfl.w : dwflVar);
        dccx G = dcdc.G(dlbwVar.f.size());
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < dlbwVar.f.size(); i2++) {
            dlcx dlcxVar = dlbwVar.f.get(i2);
            ahfn a = ahfoVar.a(dlcxVar, i2, ddzgVar, null, false);
            G.g(a);
            if (z2 && dlcxVar.d) {
                F.g(a);
            }
        }
        dcdc<ahfn> f = G.f();
        this.a = f;
        this.b = F.f();
        this.j = dcbg.b(f).s(ahdq.a).z();
        cjta b = cjtd.b();
        b.g(dlbwVar.a);
        b.i(0);
        b.r(ddzgVar);
        this.k = b;
    }

    @Override // defpackage.agzj
    public CharSequence a() {
        return this.e.b;
    }

    @Override // defpackage.agzj
    @dzsi
    public jic b() {
        return this.h;
    }

    @Override // defpackage.agzj
    @dzsi
    public CharSequence c() {
        dlcs dlcsVar = this.e.e;
        if (dlcsVar == null) {
            dlcsVar = dlcs.f;
        }
        return dlcsVar.b;
    }

    @Override // defpackage.agzj
    @dzsi
    public jic d() {
        return this.i;
    }

    @Override // defpackage.agzj
    public cjtd e(ddho ddhoVar) {
        return this.k.b(ddhoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
        if (r4 != false) goto L44;
     */
    @Override // defpackage.agzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl f() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahdr.f():cqkl");
    }

    public CharSequence g() {
        return this.e.c;
    }
}
