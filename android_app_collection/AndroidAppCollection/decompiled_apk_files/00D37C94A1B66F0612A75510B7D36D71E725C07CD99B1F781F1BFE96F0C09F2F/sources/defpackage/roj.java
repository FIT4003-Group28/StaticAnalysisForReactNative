package defpackage;
/* compiled from: PG */
/* renamed from: roj  reason: default package */
/* loaded from: classes4.dex */
final class roj implements Runnable {
    final /* synthetic */ rkj a;
    final /* synthetic */ rol b;
    private final /* synthetic */ int c;

    public roj(rol rolVar, rkj rkjVar) {
        this.b = rolVar;
        this.a = rkjVar;
    }

    public roj(rol rolVar, rkj rkjVar, int i) {
        this.c = i;
        this.b = rolVar;
        this.a = rkjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            synchronized (this.b) {
                this.b.a = false;
                if (!this.b.c.z()) {
                    this.b.c.aG().j.a("Connected to remote service");
                    this.b.c.y(this.a);
                }
            }
            return;
        }
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.z()) {
                this.b.c.aG().k.a("Connected to service");
                this.b.c.y(this.a);
            }
        }
    }
}
