package defpackage;
/* compiled from: PG */
/* renamed from: eaex  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaex implements Runnable {
    protected final String b;

    public eaex(String str, Object... objArr) {
        this.b = eafa.v(str, objArr);
    }

    protected abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
