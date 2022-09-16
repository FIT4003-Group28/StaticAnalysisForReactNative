package defpackage;

import android.os.CancellationSignal;
/* compiled from: PG */
/* renamed from: akl  reason: default package */
/* loaded from: classes.dex */
public final class akl {
    public boolean a;
    public Object b;
    private akk c;
    private boolean d;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            akk akkVar = this.c;
            Object obj = this.b;
            if (akkVar != null) {
                try {
                    akkVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.d = false;
                notifyAll();
            }
        }
    }

    public final void b(akk akkVar) {
        synchronized (this) {
            while (this.d) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.c == akkVar) {
                return;
            }
            this.c = akkVar;
            if (this.a && akkVar != null) {
                akkVar.a();
            }
        }
    }
}
