package defpackage;
/* compiled from: PG */
/* renamed from: aeo  reason: default package */
/* loaded from: classes.dex */
public final class aeo implements Runnable {
    final /* synthetic */ cj a;
    private final /* synthetic */ int b;

    public aeo(cj cjVar) {
        this.a = cjVar;
    }

    public aeo(cj cjVar, int i) {
        this.b = i;
        this.a = cjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0 || i != 1) {
        }
        aen aenVar = this.a.a.a;
    }
}
