package defpackage;
/* compiled from: PG */
/* renamed from: snt  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class snt implements Runnable {
    public final /* synthetic */ anku a;
    private final /* synthetic */ int b;

    public /* synthetic */ snt(anku ankuVar, int i) {
        this.b = i;
        this.a = ankuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            anku ankuVar = this.a;
            int i = soa.b;
            ankuVar.run();
            return;
        }
        anku ankuVar2 = this.a;
        int i2 = soa.b;
        ankuVar2.run();
    }
}
