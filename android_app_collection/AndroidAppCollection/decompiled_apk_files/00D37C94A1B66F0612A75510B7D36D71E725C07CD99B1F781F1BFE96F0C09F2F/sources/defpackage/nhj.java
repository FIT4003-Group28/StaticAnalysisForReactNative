package defpackage;

import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: nhj  reason: default package */
/* loaded from: classes3.dex */
public final class nhj extends ngj {
    private final lve e;

    public nhj(lve lveVar, askk askkVar) {
        super(askkVar);
        this.e = lveVar;
    }

    @Override // defpackage.ngj
    public final amvn a(amvn amvnVar) {
        Iterable iterable;
        amvl i = amvn.i();
        askk askkVar = (askk) this.a;
        aunb aunbVar = askkVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(MenuRendererOuterClass.menuRenderer)) {
            iterable = amyg.a;
        } else {
            lve lveVar = this.e;
            aunb aunbVar2 = askkVar.l;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            lveVar.c((atep) aunbVar2.qm(MenuRendererOuterClass.menuRenderer));
            iterable = amvn.p(this.e.b());
        }
        i.j(iterable);
        i.j(amvnVar);
        return i.g();
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        arag aragVar;
        askk askkVar = (askk) this.a;
        if ((askkVar.b & 2) != 0) {
            aragVar = askkVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return zgh.d(ajgl.b(aragVar));
    }
}
