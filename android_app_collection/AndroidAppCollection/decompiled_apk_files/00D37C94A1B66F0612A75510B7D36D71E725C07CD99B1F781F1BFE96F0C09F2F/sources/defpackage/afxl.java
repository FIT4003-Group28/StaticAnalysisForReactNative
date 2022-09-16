package defpackage;
/* compiled from: PG */
/* renamed from: afxl  reason: default package */
/* loaded from: classes.dex */
public final class afxl implements afyf {
    public final amwg a = new amze(amry.u());
    private final afyf b;

    public afxl(afyf afyfVar) {
        this.b = afyfVar;
    }

    @Override // defpackage.afyf
    public final void a(Object obj, yiw yiwVar) {
        synchronized (this.a) {
            if (this.a.o(obj)) {
                this.a.p(obj, yiwVar);
                return;
            }
            this.a.p(obj, yiwVar);
            this.b.a(obj, new afxk(this));
        }
    }
}
