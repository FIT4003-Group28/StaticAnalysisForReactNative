package defpackage;
/* compiled from: PG */
/* renamed from: aesw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aesw implements Runnable {
    public final /* synthetic */ aetg a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ aesw(aetg aetgVar, long j) {
        this.a = aetgVar;
        this.b = j;
    }

    public /* synthetic */ aesw(aetg aetgVar, long j, int i) {
        this.c = i;
        this.a = aetgVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.o(this.b);
        } else if (i == 1) {
            this.a.g(new afkn("unavailable.events", this.b, "PlayerEvents not available inside onEmbeddedMetadata"));
        } else if (i == 2) {
            this.a.s(this.b);
        } else if (i == 3) {
            this.a.t(this.b);
        } else if (i == 4) {
            this.a.u(this.b);
        } else {
            this.a.y(this.b);
        }
    }
}
