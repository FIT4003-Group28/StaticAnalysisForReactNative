package defpackage;
/* compiled from: PG */
/* renamed from: jfm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jfm implements Runnable {
    public final /* synthetic */ jfq a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ jfm(jfq jfqVar, boolean z) {
        this.a = jfqVar;
        this.b = z;
    }

    public /* synthetic */ jfm(jfq jfqVar, boolean z, int i) {
        this.c = i;
        this.a = jfqVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.n(true, this.b);
        } else {
            this.a.o(this.b);
        }
    }
}
