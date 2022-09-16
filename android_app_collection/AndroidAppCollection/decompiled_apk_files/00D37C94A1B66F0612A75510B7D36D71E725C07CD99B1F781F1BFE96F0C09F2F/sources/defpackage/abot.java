package defpackage;
/* compiled from: PG */
/* renamed from: abot  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abot implements Runnable {
    public final /* synthetic */ abow a;
    private final /* synthetic */ int b;

    public /* synthetic */ abot(abow abowVar, int i) {
        this.b = i;
        this.a = abowVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.k(true);
        } else {
            this.a.f();
        }
    }
}
