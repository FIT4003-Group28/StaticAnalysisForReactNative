package defpackage;
/* compiled from: PG */
/* renamed from: cnub  reason: default package */
/* loaded from: classes.dex */
public abstract class cnub<TListener> {
    public TListener d;
    public boolean e = false;
    final /* synthetic */ cnui f;

    public cnub(cnui cnuiVar, TListener tlistener) {
        this.f = cnuiVar;
        this.d = tlistener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    public final void e() {
        f();
        synchronized (this.f.i) {
            this.f.i.remove(this);
        }
    }

    public final void f() {
        synchronized (this) {
            this.d = null;
        }
    }
}
