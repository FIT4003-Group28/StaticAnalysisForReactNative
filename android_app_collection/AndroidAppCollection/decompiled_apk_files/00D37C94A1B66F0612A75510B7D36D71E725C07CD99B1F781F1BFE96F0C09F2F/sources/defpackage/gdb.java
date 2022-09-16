package defpackage;
/* compiled from: PG */
/* renamed from: gdb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gdb implements Runnable {
    public final /* synthetic */ airr a;
    private final /* synthetic */ int b;

    public /* synthetic */ gdb(airr airrVar) {
        this.a = airrVar;
    }

    public /* synthetic */ gdb(airr airrVar, int i) {
        this.b = i;
        this.a = airrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a();
        } else if (i == 1) {
            this.a.b();
        } else if (i == 2) {
            this.a.b();
        } else if (i == 3) {
            this.a.B();
        } else if (i == 4) {
            this.a.ab();
        } else if (i == 5) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
