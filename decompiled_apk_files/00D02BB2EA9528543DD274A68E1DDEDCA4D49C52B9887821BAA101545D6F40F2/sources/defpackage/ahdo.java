package defpackage;
/* compiled from: PG */
/* renamed from: ahdo  reason: default package */
/* loaded from: classes2.dex */
public class ahdo implements agzh {
    private final agaw a;
    private final dlba b;
    @dzsi
    private final String c;
    @dzsi
    private final jic d;
    @dzsi
    private final bgnq e;
    private final ahfn f;
    private final cjta g;

    public ahdo(bmdq bmdqVar, cqat cqatVar, gga ggaVar, ahfo ahfoVar, agaw agawVar, dxio<afha> dxioVar, dlba dlbaVar, ddzg ddzgVar, int i) {
        this.a = agawVar;
        this.b = dlbaVar;
        dipk dipkVar = dlbaVar.c;
        dipkVar = dipkVar == null ? dipk.x : dipkVar;
        if ((dipkVar.a & 16) != 0) {
            dipf dipfVar = dipkVar.h;
            this.c = dbrz.f(' ').g(dcbg.b((dipfVar == null ? dipf.b : dipfVar).a).s(ahdn.a));
        } else {
            this.c = null;
        }
        if (dipkVar.m.size() > 0 && !dipkVar.m.get(0).b.isEmpty()) {
            this.d = agxk.h(dipkVar.m.get(0).b, ckqc.FIFE);
        } else {
            this.d = null;
        }
        ily ilyVar = new ily();
        dlcx dlcxVar = dlbaVar.b;
        dvyw dvywVar = (dlcxVar == null ? dlcx.e : dlcxVar).c;
        ilyVar.E(dvywVar == null ? dvyw.bv : dvywVar);
        this.e = bgot.g(dipkVar, ggaVar, i, ilyVar.d(), bmdqVar, bgnk.FOR_YOU_STREAM, dxioVar);
        dlcx dlcxVar2 = dlbaVar.b;
        this.f = ahfoVar.a(dlcxVar2 == null ? dlcx.e : dlcxVar2, 0, ddzgVar, null, false);
        dlcx dlcxVar3 = dlbaVar.b;
        dvyw dvywVar2 = (dlcxVar3 == null ? dlcx.e : dlcxVar3).c;
        akqi f = akqi.f((dvywVar2 == null ? dvyw.bv : dvywVar2).g);
        f = f == null ? akqi.a : f;
        cjta b = cjtd.b();
        bgnf.a(b, dipkVar);
        b.b = dipkVar.p;
        b.g(dipkVar.q);
        b.g = decs.a(f.c);
        b.r(ddzgVar);
        this.g = b;
    }

    @Override // defpackage.agzh
    public CharSequence a() {
        dipk dipkVar = this.b.c;
        if (dipkVar == null) {
            dipkVar = dipk.x;
        }
        return dipkVar.g;
    }

    @Override // defpackage.agzh
    @dzsi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.agzh
    public jic c() {
        return agxk.i(g());
    }

    @Override // defpackage.agzh
    @dzsi
    public bgnq d() {
        return this.e;
    }

    @Override // defpackage.agzh
    public cjtd e(ddho ddhoVar) {
        return this.g.b(ddhoVar);
    }

    @Override // defpackage.agzh
    public cqkl f() {
        this.a.a(this.f.b(), bege.UPDATES, jjn.EXPANDED);
        return cqkl.a;
    }

    @dzsi
    public jic g() {
        return this.d;
    }
}
