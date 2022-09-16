package defpackage;
/* compiled from: PG */
/* renamed from: kpq  reason: default package */
/* loaded from: classes3.dex */
final class kpq implements akad {
    final /* synthetic */ kpr a;

    public kpq(kpr kprVar) {
        this.a = kprVar;
    }

    @Override // defpackage.akad
    public final /* bridge */ /* synthetic */ void b(Object obj, akac akacVar) {
        aslt asltVar = (aslt) obj;
        if ((asltVar.d & 32) != 0) {
            audo audoVar = asltVar.X;
            if (audoVar == null) {
                audoVar = audo.a;
            }
            akacVar.a(audoVar);
            if (!audoVar.c) {
                aunb aunbVar = audoVar.b;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                for (aues auesVar : ((aueq) aunbVar.qm(auet.a)).d) {
                    Object obj2 = auesVar.c;
                    if (obj2 == null) {
                        obj2 = auex.a;
                    }
                    akacVar.a(obj2);
                }
                return;
            }
            this.a.a.add(audoVar);
        }
    }

    @Override // defpackage.akad
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.akad
    public final ampt e() {
        return jny.f;
    }
}
