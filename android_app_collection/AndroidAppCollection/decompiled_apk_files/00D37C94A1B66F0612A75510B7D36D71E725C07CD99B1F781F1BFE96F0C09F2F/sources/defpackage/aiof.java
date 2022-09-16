package defpackage;
/* compiled from: PG */
/* renamed from: aiof  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiof implements ayqb {
    public final /* synthetic */ aiog a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiof(aiog aiogVar, int i) {
        this.b = i;
        this.a = aiogVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.b = ((ahhg) obj).b();
            return;
        }
        aiog aiogVar = this.a;
        ahff ahffVar = (ahff) obj;
        acte acteVar = new acte(actj.PUSH_NOTIFICATION_DISMISSAL);
        aiogVar.a.n(acteVar);
        aiogVar.a.H(3, acteVar, null);
    }
}
