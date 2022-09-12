package defpackage;
/* compiled from: PG */
/* renamed from: agwj  reason: default package */
/* loaded from: classes2.dex */
final class agwj implements btzi<diqx, diqz> {
    final /* synthetic */ deig a;

    public agwj(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<diqx> btzrVar, btzy btzyVar) {
        int i = agwm.d;
        this.a.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<diqx> btzrVar, diqz diqzVar) {
        diqz diqzVar2 = diqzVar;
        if ((diqzVar2.a & 1) != 0) {
            dqhy b = dqhy.b(diqzVar2.b);
            if (b == null) {
                b = dqhy.UNKNOWN_STATUS_CODE;
            }
            if (b != dqhy.OK) {
                int i = agwm.d;
                deig deigVar = this.a;
                dqhy b2 = dqhy.b(diqzVar2.b);
                if (b2 == null) {
                    b2 = dqhy.UNKNOWN_STATUS_CODE;
                }
                deigVar.k(new agwn(b2));
                return;
            }
        }
        int i2 = agwm.d;
        this.a.j(diqzVar2);
    }
}
