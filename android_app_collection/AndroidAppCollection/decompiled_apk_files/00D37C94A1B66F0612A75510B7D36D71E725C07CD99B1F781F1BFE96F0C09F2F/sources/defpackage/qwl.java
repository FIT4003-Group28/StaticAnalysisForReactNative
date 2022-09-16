package defpackage;
/* compiled from: PG */
/* renamed from: qwl  reason: default package */
/* loaded from: classes4.dex */
public abstract class qwl {
    public Object d;
    public boolean e = false;
    final /* synthetic */ qwr f;

    public qwl(qwr qwrVar, Object obj) {
        this.f = qwrVar;
        this.d = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.w) {
            this.f.w.remove(this);
        }
    }
}
