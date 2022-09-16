package defpackage;
/* compiled from: PG */
/* renamed from: aesv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aesv implements Runnable {
    public final /* synthetic */ aetg a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ aesv(aetg aetgVar, int i) {
        this.a = aetgVar;
        this.b = i;
    }

    public /* synthetic */ aesv(aetg aetgVar, int i, int i2) {
        this.c = i2;
        this.a = aetgVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.x(this.b);
        } else if (i == 1) {
            this.a.c(this.b);
        } else {
            this.a.b(this.b);
        }
    }
}
