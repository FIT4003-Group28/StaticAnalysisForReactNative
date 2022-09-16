package defpackage;
/* compiled from: PG */
/* renamed from: sns  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class sns implements Runnable {
    public final /* synthetic */ soa a;
    public final /* synthetic */ anku b;
    private final /* synthetic */ int c;

    public /* synthetic */ sns(soa soaVar, anku ankuVar) {
        this.a = soaVar;
        this.b = ankuVar;
    }

    public /* synthetic */ sns(soa soaVar, anku ankuVar, int i) {
        this.c = i;
        this.a = soaVar;
        this.b = ankuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.execute(new snt(this.b));
        } else {
            this.a.execute(new snt(this.b, 1));
        }
    }
}
