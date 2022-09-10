package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqc  reason: default package */
/* loaded from: classes4.dex */
public final class cdqc extends cdpz {
    private volatile transient dcdc<cdjd> a;

    public cdqc(bvrt<dmas> bvrtVar) {
        super(bvrtVar);
    }

    @Override // defpackage.cdqr
    public final dcdc<cdjd> b() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = dcbg.b(super.c().b).s(cdqq.a).z();
                    if (this.a == null) {
                        throw new NullPointerException("posts() cannot return null");
                    }
                }
            }
        }
        return this.a;
    }
}
