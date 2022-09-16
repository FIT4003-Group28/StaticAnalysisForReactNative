package defpackage;
/* compiled from: PG */
/* renamed from: ovf  reason: default package */
/* loaded from: classes4.dex */
final class ovf implements Runnable {
    final /* synthetic */ ovj a;
    private final /* synthetic */ int b;

    public ovf(ovj ovjVar) {
        this.a = ovjVar;
    }

    public ovf(ovj ovjVar, int i) {
        this.b = i;
        this.a = ovjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.c.d();
        } else if (i == 1) {
            this.a.c.e();
        } else if (i == 2) {
            this.a.c.c();
        } else {
            this.a.c.f();
        }
    }
}
