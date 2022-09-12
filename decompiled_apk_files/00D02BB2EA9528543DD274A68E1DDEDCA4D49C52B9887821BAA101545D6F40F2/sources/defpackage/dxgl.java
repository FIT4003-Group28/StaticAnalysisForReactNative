package defpackage;
/* compiled from: PG */
/* renamed from: dxgl  reason: default package */
/* loaded from: classes6.dex */
public class dxgl<T> extends dxgw<T> {
    private dxgk<T> d;

    @Override // defpackage.dxgw
    protected final void b() {
        dxgk<T> dxgkVar;
        if (e() || (dxgkVar = this.d) == null) {
            return;
        }
        dxgkVar.a(this.b.a());
    }

    public final void c(dxgk<T> dxgkVar) {
        this.d = dxgkVar;
        if (this.b == null || !this.b.b()) {
            return;
        }
        b();
    }
}
