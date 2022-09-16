package defpackage;
/* compiled from: PG */
/* renamed from: acex  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acex implements Runnable {
    public final /* synthetic */ acfh a;
    private final /* synthetic */ int b;

    public /* synthetic */ acex(acfh acfhVar, int i) {
        this.b = i;
        this.a = acfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.f(true);
        } else if (i == 1) {
            this.a.h();
        } else if (i == 2) {
            this.a.l(false);
        } else if (i == 3) {
            this.a.l(true);
        } else {
            this.a.h();
        }
    }
}
