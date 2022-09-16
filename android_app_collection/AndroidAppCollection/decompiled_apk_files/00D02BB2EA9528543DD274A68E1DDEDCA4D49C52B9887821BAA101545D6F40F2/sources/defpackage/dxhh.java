package defpackage;
/* compiled from: PG */
/* renamed from: dxhh  reason: default package */
/* loaded from: classes6.dex */
public final class dxhh<T> extends dxgw<T> {
    public volatile dxhg d;
    private volatile dxhf<T> e;

    public final void a(dxhf<T> dxhfVar) {
        this.e = dxhfVar;
        if (this.b == null || !this.b.b()) {
            return;
        }
        b();
    }

    @Override // defpackage.dxgw
    protected final void b() {
        if (e() || this.e == null) {
            return;
        }
        this.e.a(this.b.a());
    }
}
