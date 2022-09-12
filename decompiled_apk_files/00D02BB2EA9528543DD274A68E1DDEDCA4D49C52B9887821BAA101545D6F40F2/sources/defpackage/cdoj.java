package defpackage;
/* compiled from: PG */
/* renamed from: cdoj  reason: default package */
/* loaded from: classes4.dex */
final class cdoj extends cdoh {
    private volatile transient drfq b;

    public cdoj(String str, boolean z, bvrt<drfq> bvrtVar) {
        super(str, z, bvrtVar);
    }

    @Override // defpackage.cdom
    public final drfq d() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.e((dssr) drfq.a.cu(7), drfq.a);
                    if (this.b == null) {
                        throw new NullPointerException("getOptionId() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
