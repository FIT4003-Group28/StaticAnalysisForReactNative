package defpackage;
/* compiled from: PG */
/* renamed from: mjy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjy implements Runnable {
    public final /* synthetic */ mka a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjy(mka mkaVar) {
        this.a = mkaVar;
    }

    public /* synthetic */ mjy(mka mkaVar, int i) {
        this.b = i;
        this.a = mkaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            mka mkaVar = this.a;
            mkaVar.c.aC(mkaVar.b);
            return;
        }
        mka mkaVar2 = this.a;
        mkaVar2.c.aF(mkaVar2.b);
    }
}
