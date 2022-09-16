package defpackage;
/* compiled from: PG */
/* renamed from: aikl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aikl implements ayqb {
    public final /* synthetic */ aikm a;
    private final /* synthetic */ int b;

    public /* synthetic */ aikl(aikm aikmVar, int i) {
        this.b = i;
        this.a = aikmVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aoob aoobVar = null;
        if (this.b == 0) {
            aikm aikmVar = this.a;
            ahie ahieVar = (ahie) obj;
            if (ahieVar.a().a() != 0 || !ahieVar.a().Z().equals(aikmVar.b)) {
                return;
            }
            aikmVar.a = null;
            return;
        }
        aikm aikmVar2 = this.a;
        ahhg ahhgVar = (ahhg) obj;
        asaa t = ahhgVar.a().t();
        if (t != null) {
            aoobVar = t.o;
        }
        aikmVar2.a = aoobVar;
        aikmVar2.b = ahhgVar.b();
    }
}
