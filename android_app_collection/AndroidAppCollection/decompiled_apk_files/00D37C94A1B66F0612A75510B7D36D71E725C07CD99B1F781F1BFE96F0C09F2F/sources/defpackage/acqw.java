package defpackage;
/* compiled from: PG */
/* renamed from: acqw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acqw implements Runnable {
    public final /* synthetic */ acqx a;
    private final /* synthetic */ int b;

    public /* synthetic */ acqw(acqx acqxVar, int i) {
        this.b = i;
        this.a = acqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.d();
        } else {
            this.a.i();
        }
    }
}
