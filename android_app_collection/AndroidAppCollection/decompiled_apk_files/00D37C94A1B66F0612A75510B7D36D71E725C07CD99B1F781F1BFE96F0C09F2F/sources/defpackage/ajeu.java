package defpackage;
/* compiled from: PG */
/* renamed from: ajeu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajeu implements Runnable {
    public final /* synthetic */ ajet a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajeu(ajet ajetVar, int i) {
        this.b = i;
        this.a = ajetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.c();
        } else {
            this.a.a();
        }
    }
}
