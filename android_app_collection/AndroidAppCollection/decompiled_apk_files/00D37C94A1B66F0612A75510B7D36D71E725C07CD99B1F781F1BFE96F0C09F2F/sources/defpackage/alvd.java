package defpackage;
/* compiled from: PG */
/* renamed from: alvd  reason: default package */
/* loaded from: classes.dex */
public final class alvd {
    public final Object a;
    public final alvf b;
    public boolean c;
    public Object d;
    public Exception e;

    public alvd() {
    }

    public final void a() {
        akpq.k(!this.c, "Task is already complete");
    }

    public final void b() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            this.b.b(this);
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void d(aluy aluyVar) {
        this.b.a(new alux(alvi.a, aluyVar));
        b();
    }

    public final void e(alvb alvbVar) {
        this.b.a(new alva(alvi.a, alvbVar));
        b();
    }

    public alvd(byte[] bArr) {
        this.a = new Object();
        this.b = new alvf();
    }
}
