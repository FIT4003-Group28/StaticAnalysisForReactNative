package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asxd  reason: default package */
/* loaded from: classes2.dex */
public final class asxd extends asxe {
    public asxd(asxu asxuVar, asxw asxwVar, btrm btrmVar, askx askxVar, akox akoxVar, qbo qboVar, cjqy cjqyVar, aufc aufcVar, dxio<ania> dxioVar, Executor executor) {
        super(asxuVar, asxwVar, btrmVar, askxVar, akoxVar, qboVar, cjqyVar, aufcVar, dxioVar, executor);
    }

    @Override // defpackage.asxe, defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        asld asldVar = this.f;
        super.a(aszmVar, aszmVar2);
        if (this.f != asldVar) {
            this.c.a(aszmVar, aszmVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asxe
    public final boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asxe
    public final void h(aryn arynVar) {
        if (arynVar instanceof aryr) {
            aryr aryrVar = (aryr) arynVar;
            this.a.b(new crhz(astj.f(aryrVar), aryrVar));
        }
    }
}
