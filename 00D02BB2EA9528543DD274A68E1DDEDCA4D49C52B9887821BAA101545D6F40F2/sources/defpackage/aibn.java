package defpackage;
/* compiled from: PG */
/* renamed from: aibn  reason: default package */
/* loaded from: classes2.dex */
final class aibn implements aibt {
    @dzsi
    public aibu a;
    final /* synthetic */ aibo b;

    public aibn(aibo aiboVar) {
        this.b = aiboVar;
    }

    @Override // defpackage.aibh
    public final void a() {
    }

    @Override // defpackage.aibh
    public final void b() {
        cjqy cjqyVar = this.b.c;
        cjsx i = cjsy.i();
        i.b(ddda.cU);
        cjqyVar.k(i.a());
        aibo aiboVar = this.b;
        if (aiboVar.f == this.a) {
            aiboVar.j.h();
        }
    }

    @Override // defpackage.aibh
    public final void c(ahvn ahvnVar, btlu btluVar) {
        aibu aibuVar = this.a;
        dbsk.s(aibuVar);
        aibuVar.g.c();
        if (aibuVar.a()) {
            aibo aiboVar = this.b;
            ahvn ahvnVar2 = ahvn.ARRIVED;
            ahvk ahvkVar = ahvk.STANDARD_NAVIGATION;
            int ordinal = ahvnVar.ordinal();
            if (ordinal == 0) {
                cjqy cjqyVar = aiboVar.c;
                cjsx i = cjsy.i();
                i.b(ddda.cW);
                cjqyVar.k(i.a());
            } else if (ordinal == 1) {
                cjqy cjqyVar2 = aiboVar.c;
                cjsx i2 = cjsy.i();
                i2.b(ddda.cT);
                cjqyVar2.k(i2.a());
            } else if (ordinal == 2) {
                cjqy cjqyVar3 = aiboVar.c;
                cjsx i3 = cjsy.i();
                i3.b(ddda.cV);
                cjqyVar3.k(i3.a());
            }
        } else {
            aibo aiboVar2 = this.b;
            ahvn ahvnVar3 = ahvn.ARRIVED;
            ahvk ahvkVar2 = ahvk.STANDARD_NAVIGATION;
            int ordinal2 = ahvnVar.ordinal();
            if (ordinal2 == 1) {
                cjqy cjqyVar4 = aiboVar2.c;
                cjsx i4 = cjsy.i();
                i4.b(ddda.cY);
                cjqyVar4.k(i4.a());
            } else if (ordinal2 == 2) {
                cjqy cjqyVar5 = aiboVar2.c;
                cjsx i5 = cjsy.i();
                i5.b(ddda.cV);
                cjqyVar5.k(i5.a());
            } else {
                bvoo.h("non-creation case not handled", new Object[0]);
            }
        }
        aibo aiboVar3 = this.b;
        if (aiboVar3.f == aibuVar) {
            aiboVar3.f = null;
            aiboVar3.j.i();
        }
        bvqd.a(this.b.e.c(dqyy.c, dqza.c, dqzg.c, dcep.B(btluVar), dcep.B(dqym.JOURNEY_SHARE_COMPLETED), dbpy.a), this.b.b);
    }

    @Override // defpackage.aibt
    public final void d() {
        cjqy cjqyVar = this.b.c;
        cjsx i = cjsy.i();
        i.b(ddda.cX);
        cjqyVar.k(i.a());
        aibo aiboVar = this.b;
        if (aiboVar.f == this.a) {
            aiboVar.j.g();
        }
    }
}
