package defpackage;
/* compiled from: PG */
/* renamed from: abwu  reason: default package */
/* loaded from: classes2.dex */
final class abwu extends abws {
    private volatile transient cqtv b;

    public abwu(int i) {
        super(i);
    }

    @Override // defpackage.abxz
    protected final cqtv d() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = cqrp.d(this.a);
                    if (this.b == null) {
                        throw new NullPointerException("androidDP() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
