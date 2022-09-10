package defpackage;
/* compiled from: PG */
/* renamed from: cqv  reason: default package */
/* loaded from: classes5.dex */
final class cqv implements cpnn {
    final /* synthetic */ cqf a;
    final /* synthetic */ cqz b;

    public cqv(cqz cqzVar, cqf cqfVar) {
        this.b = cqzVar;
        this.a = cqfVar;
    }

    @Override // defpackage.cpnn
    public final void a(dgzv dgzvVar) {
        dbsk.s(this.b.f);
        bows bowsVar = this.a.c;
        akqq akqqVar = bowsVar.c;
        if (!dgzvVar.equals(dgzv.c) || akqqVar == null) {
            if (dgzvVar.b == null) {
                return;
            }
            if (akqqVar == null) {
                bowsVar.c = this.b.f.g();
                bowsVar.d = bowsVar.f;
            }
            dgzu dgzuVar = dgzvVar.b;
            if (dgzuVar == null) {
                dgzuVar = dgzu.b;
            }
            dhah dhahVar = dgzuVar.a;
            if (dhahVar == null) {
                dhahVar = dhah.c;
            }
            this.b.f.f(akqq.d(dhahVar.a, dhahVar.b), false, dory.FEEDBACK_SERVICE);
            return;
        }
        bope bopeVar = this.b.f;
        dory doryVar = bowsVar.d;
        dbsk.s(doryVar);
        bopeVar.f(akqqVar, true, doryVar);
    }

    @Override // defpackage.cpnn
    public final void b(String str) {
    }
}
