package defpackage;
/* compiled from: PG */
/* renamed from: ydr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ydr implements akbi {
    public final /* synthetic */ yds a;
    private final /* synthetic */ int b;

    public /* synthetic */ ydr(yds ydsVar, int i) {
        this.b = i;
        this.a = ydsVar;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (this.b == 0) {
            yds ydsVar = this.a;
            ydsVar.d = 1;
            ydsVar.b.run();
            return;
        }
        this.a.a.run();
    }
}
