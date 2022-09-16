package defpackage;
/* compiled from: PG */
/* renamed from: aigu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aigu implements ayqb {
    public final /* synthetic */ aigw a;
    private final /* synthetic */ int b;

    public /* synthetic */ aigu(aigw aigwVar, int i) {
        this.b = i;
        this.a = aigwVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            aigw aigwVar = this.a;
            ahic ahicVar = (ahic) obj;
            aigwVar.a = ahicVar.a().q();
            aigwVar.d = ahicVar.a().f();
            aigwVar.c.clear();
            return;
        }
        this.a.b((ahgb) obj);
    }
}
