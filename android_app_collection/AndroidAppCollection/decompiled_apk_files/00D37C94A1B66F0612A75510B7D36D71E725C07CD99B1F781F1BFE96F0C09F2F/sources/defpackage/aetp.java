package defpackage;
/* compiled from: PG */
/* renamed from: aetp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aetp implements Runnable {
    public final /* synthetic */ aetv a;
    private final /* synthetic */ int b;

    public /* synthetic */ aetp(aetv aetvVar, int i) {
        this.b = i;
        this.a = aetvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.f();
        } else if (i == 1) {
            this.a.d();
        } else if (i == 2) {
            this.a.m();
        } else if (i == 3) {
            this.a.n();
        } else if (i == 4) {
            this.a.q();
        } else if (i == 5) {
            this.a.r();
        } else {
            this.a.v();
        }
    }
}
