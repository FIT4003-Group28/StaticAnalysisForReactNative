package defpackage;
/* compiled from: PG */
/* renamed from: ayfb  reason: default package */
/* loaded from: classes2.dex */
abstract class ayfb implements Runnable {
    private final axyx a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ayfb(axyx axyxVar) {
        this.a = axyxVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        axyx a = this.a.a();
        try {
            a();
        } finally {
            this.a.c(a);
        }
    }
}
