package defpackage;
/* compiled from: PG */
/* renamed from: ayuv  reason: default package */
/* loaded from: classes2.dex */
abstract class ayuv extends ayup {
    private static final long serialVersionUID = 4127754106204442833L;

    public ayuv(bame bameVar) {
        super(bameVar);
    }

    @Override // defpackage.aynw
    public final void a(Object obj) {
        if (l()) {
            return;
        }
        if (obj == null) {
            h(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() != 0) {
            this.a.c(obj);
            ayno.e(this, 1L);
        } else {
            m();
        }
    }

    public abstract void m();
}
