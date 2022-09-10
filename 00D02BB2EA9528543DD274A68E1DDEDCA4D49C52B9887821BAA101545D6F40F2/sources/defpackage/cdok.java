package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdok  reason: default package */
/* loaded from: classes4.dex */
public final class cdok extends cdoi {
    private volatile transient drfq c;

    public cdok(String str, dcdc<cdom> dcdcVar, boolean z, bvrt<drfq> bvrtVar) {
        super(str, dcdcVar, z, bvrtVar);
    }

    @Override // defpackage.cdop
    public final drfq e() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.b.e((dssr) drfq.a.cu(7), drfq.a);
                    if (this.c == null) {
                        throw new NullPointerException("getQuestionId() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
