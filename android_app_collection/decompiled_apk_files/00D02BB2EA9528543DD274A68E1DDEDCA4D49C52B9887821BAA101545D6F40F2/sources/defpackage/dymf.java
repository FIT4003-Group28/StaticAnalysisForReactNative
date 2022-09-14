package defpackage;
/* compiled from: PG */
/* renamed from: dymf  reason: default package */
/* loaded from: classes6.dex */
abstract class dymf implements Runnable {
    private final dyfo a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dymf(dyfo dyfoVar) {
        this.a = dyfoVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        dyfo b = this.a.b();
        try {
            a();
        } finally {
            this.a.c(b);
        }
    }
}
