package defpackage;
/* compiled from: PG */
/* renamed from: ajsr  reason: default package */
/* loaded from: classes2.dex */
public final class ajsr implements btzi<dwdc, dwde> {
    final /* synthetic */ dqzv a;
    final /* synthetic */ btlu b;
    final /* synthetic */ deig c;
    final /* synthetic */ ajsu d;

    public ajsr(ajsu ajsuVar, dqzv dqzvVar, btlu btluVar, deig deigVar) {
        this.d = ajsuVar;
        this.a = dqzvVar;
        this.b = btluVar;
        this.c = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwdc> btzrVar, btzy btzyVar) {
        bttq bttqVar = btzyVar.p;
        ajsu ajsuVar = this.d;
        ajsuVar.f.a(new aiht(new eapd(ajsuVar.e.b()), this.a), dbsg.i(this.b));
        this.d.b.b(this.b);
        this.c.j(1);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwdc> btzrVar, dwde dwdeVar) {
        deig deigVar;
        int i;
        ajsu ajsuVar = this.d;
        ajsuVar.f.a(new aihp(new eapd(ajsuVar.e.b()), this.a), dbsg.i(this.b));
        this.d.b.b(this.b);
        if (dwdeVar.a.size() == 0) {
            deigVar = this.c;
            i = 0;
        } else {
            deigVar = this.c;
            i = 2;
        }
        deigVar.j(Integer.valueOf(i));
    }
}
