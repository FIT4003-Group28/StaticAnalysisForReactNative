package defpackage;
/* compiled from: PG */
/* renamed from: ckmg  reason: default package */
/* loaded from: classes4.dex */
final class ckmg implements cjqw {
    final /* synthetic */ ckmh a;

    public ckmg(ckmh ckmhVar) {
        this.a = ckmhVar;
    }

    @Override // defpackage.cjqw
    public final void c(cjte cjteVar, cjtd cjtdVar) {
        if (deaf.AUTOMATED.equals(cjteVar.a)) {
            int i = ckmh.d;
            return;
        }
        synchronized (this.a) {
            ckmh ckmhVar = this.a;
            if (!ckmhVar.a) {
                ckmhVar.e(ckoi.INTERRUPTED);
            }
        }
    }
}
