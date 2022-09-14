package defpackage;
/* compiled from: PG */
/* renamed from: aife  reason: default package */
/* loaded from: classes2.dex */
final class aife implements akth {
    final /* synthetic */ aifk a;

    public aife(aifk aifkVar) {
        this.a = aifkVar;
    }

    @Override // defpackage.akth
    public final akwf a(akti aktiVar) {
        aifk aifkVar = this.a;
        if (aifkVar.g) {
            return akwf.h;
        }
        synchronized (aifkVar.c) {
            dbsk.b(aktiVar == this.a.a, "Renderable should only animate itself.");
            aifk aifkVar2 = this.a;
            aifo aifoVar = aifkVar2.f;
            if (aifoVar != null) {
                if (!aifoVar.c()) {
                    this.a.f.b();
                }
                aifk aifkVar3 = this.a;
                aifo aifoVar2 = aifkVar3.f;
                aifp aifpVar = aifkVar3.d;
                for (int i = 0; i < aifoVar2.a.size(); i++) {
                    aifoVar2.f(aifpVar, i);
                }
                akwf g = this.a.g();
                aifo aifoVar3 = this.a.f;
                dbsk.s(aifoVar3);
                if (aifoVar3.d()) {
                    this.a.hashCode();
                    this.a.f = null;
                    aktiVar.d();
                    aktiVar.a(g);
                }
                return g;
            }
            akwf g2 = aifkVar2.g();
            aktiVar.d();
            aktiVar.a(g2);
            return g2;
        }
    }
}
