package defpackage;
/* compiled from: PG */
/* renamed from: grs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class grs implements Runnable {
    public final /* synthetic */ grt a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ grs(grt grtVar, int i) {
        this.a = grtVar;
        this.b = i;
    }

    public /* synthetic */ grs(grt grtVar, int i, int i2) {
        this.c = i2;
        this.a = grtVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.ok(this.b);
        } else {
            this.a.ok(this.b);
        }
    }
}
