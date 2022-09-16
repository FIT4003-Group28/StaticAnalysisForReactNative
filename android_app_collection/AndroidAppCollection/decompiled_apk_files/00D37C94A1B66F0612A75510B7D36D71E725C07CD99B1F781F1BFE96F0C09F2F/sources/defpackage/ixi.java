package defpackage;
/* compiled from: PG */
/* renamed from: ixi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ixi implements Runnable {
    public final /* synthetic */ ixj a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixi(ixj ixjVar, int i) {
        this.b = i;
        this.a = ixjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a.dismiss();
            return;
        }
        ixj ixjVar = this.a;
        ixjVar.a.dismiss();
        ixjVar.a.ai.a();
    }
}
