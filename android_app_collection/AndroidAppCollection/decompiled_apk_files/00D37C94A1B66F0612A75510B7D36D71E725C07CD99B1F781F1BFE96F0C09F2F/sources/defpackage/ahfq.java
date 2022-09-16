package defpackage;
/* compiled from: PG */
/* renamed from: ahfq  reason: default package */
/* loaded from: classes.dex */
public final class ahfq {
    public final ahfs a;
    public zgz b;
    public ahhh c;
    public boolean d;
    public boolean e;

    public ahfq(afkf afkfVar) {
        ahfs ahfsVar = new ahfs();
        this.a = ahfsVar;
        afkfVar.d(ahfsVar);
    }

    public final acvg a() {
        zgz zgzVar = this.b;
        if (zgzVar != null) {
            return (acvg) zgzVar.a();
        }
        return null;
    }

    public final void b(aynx aynxVar, aynx aynxVar2, aynx aynxVar3) {
        aypf aypfVar = new aypf();
        aypfVar.d(aynxVar.Z(new ahfp(this, 8)));
        aypfVar.d(aynxVar3.Z(new ahfp(this, 9)));
        aypfVar.d(aiwv.j(aynxVar2, agix.r).Z(new ahfp(this, 7)));
        aypfVar.d(aiwv.j(aynxVar3, agix.l).Z(new ahfp(this, 3)));
        aypfVar.d(aiwv.j(aynxVar3, agix.m).Z(new ahfp(this, 4)));
        aypfVar.d(aiwv.j(aynxVar2, agix.k).Z(new ahfp(this, 10)));
        aypfVar.d(aiwv.j(aynxVar2, agix.p).Z(new ahfp(this, 2)));
        aypfVar.d(aiwv.j(aynxVar2, agix.n).Z(new ahfp(this, 5)));
        aypfVar.d(aiwv.j(aynxVar3, agix.q).Z(new ahfp(this, 6)));
        aypfVar.d(aiwv.j(aynxVar3, agix.o).Z(new ahfp(this, 1)));
        aypfVar.d(aynxVar2.n().P(aaku.o).Z(new ahfp(this)));
    }

    public final void c() {
        acvg a = a();
        if (a != null) {
            a.c("pl_int");
            e();
        }
    }

    public final void d(ahgm ahgmVar) {
        acvg acvgVar = (acvg) this.b.a();
        if (acvgVar != null) {
            if (ahgmVar.a() > 0) {
                acvgVar.d(ahgmVar.f(), ahgmVar.a());
            } else {
                acvgVar.c(ahgmVar.f());
            }
        }
    }

    public final void e() {
        acvg acvgVar = (acvg) this.b.a();
        if (acvgVar != null) {
            acvgVar.c("aa");
            zgz zgzVar = this.b;
            if (zgzVar instanceof aiiy) {
                ((aiiy) zgzVar).a = null;
            }
            this.d = false;
            this.e = false;
        }
    }
}
