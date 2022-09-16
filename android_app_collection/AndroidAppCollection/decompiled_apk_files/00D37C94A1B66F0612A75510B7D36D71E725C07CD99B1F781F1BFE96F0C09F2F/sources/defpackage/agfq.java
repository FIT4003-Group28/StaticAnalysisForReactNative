package defpackage;
/* compiled from: PG */
/* renamed from: agfq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agfq implements Runnable {
    public final /* synthetic */ agfs a;
    private final /* synthetic */ int b;

    public /* synthetic */ agfq(agfs agfsVar, int i) {
        this.b = i;
        this.a = agfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.f();
                return;
            } else {
                this.a.f();
                return;
            }
        }
        agfs agfsVar = this.a;
        agfsVar.a.d();
        agfsVar.d = (String) ((ampv) agfsVar.a.a()).a;
        if (!agfsVar.g()) {
            return;
        }
        agfsVar.c.execute(new agfq(agfsVar, 1));
    }
}
