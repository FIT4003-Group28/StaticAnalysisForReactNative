package defpackage;
/* compiled from: PG */
/* renamed from: mxj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mxj implements Runnable {
    public final /* synthetic */ mxk a;
    private final /* synthetic */ int b;

    public /* synthetic */ mxj(mxk mxkVar, int i) {
        this.b = i;
        this.a = mxkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            mxk mxkVar = this.a;
            mxkVar.a.q(mxkVar.b);
            return;
        }
        mxk mxkVar2 = this.a;
        mxkVar2.a.e(mxkVar2.c, true);
    }
}
