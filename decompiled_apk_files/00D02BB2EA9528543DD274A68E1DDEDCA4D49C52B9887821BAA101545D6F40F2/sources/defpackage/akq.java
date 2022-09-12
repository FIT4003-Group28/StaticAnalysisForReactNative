package defpackage;
/* compiled from: PG */
/* renamed from: akq  reason: default package */
/* loaded from: classes.dex */
public final class akq {
    private boolean a;
    private akp b;
    private boolean c;

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public final void b() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            akp akpVar = this.b;
            if (akpVar != null) {
                try {
                    akpVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.c = false;
                notifyAll();
            }
        }
    }

    public final void c(akp akpVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.b == akpVar) {
                return;
            }
            this.b = akpVar;
            if (this.a && akpVar != null) {
                akpVar.a();
            }
        }
    }
}
