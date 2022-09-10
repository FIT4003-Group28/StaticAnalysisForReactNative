package defpackage;
/* compiled from: PG */
/* renamed from: iuk  reason: default package */
/* loaded from: classes.dex */
public final class iuk extends cqhw implements btni {
    private final btmk d;

    public iuk(btml btmlVar) {
        this.d = btmlVar.a(ckip.V);
    }

    public final void a(btmv btmvVar) {
        btmvVar.a(this, "GmmViewPool");
    }

    @Override // defpackage.btni
    public final int b(float f) {
        return e();
    }

    @Override // defpackage.btni
    @dzsi
    public final String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqhw
    @dzsi
    public final <V extends cqkp> cqkf<V> d(cqiw<V> cqiwVar) {
        cqkf<V> d = super.d(cqiwVar);
        if (d != null) {
            this.d.a();
        } else {
            this.d.b();
        }
        return d;
    }
}
