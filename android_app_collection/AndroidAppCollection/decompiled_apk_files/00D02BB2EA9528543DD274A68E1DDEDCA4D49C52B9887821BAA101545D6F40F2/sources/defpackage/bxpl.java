package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxpl  reason: default package */
/* loaded from: classes4.dex */
public final class bxpl implements btzi<dwjd, dwjf> {
    final /* synthetic */ bxpm a;

    public bxpl(bxpm bxpmVar) {
        this.a = bxpmVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjd> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjd> btzrVar, dwjf dwjfVar) {
        dwjf dwjfVar2 = dwjfVar;
        if (!this.a.c.aD) {
            return;
        }
        dccx F = dcdc.F();
        for (dwjb dwjbVar : dwjfVar2.b) {
            F.g(new bxpk(dwjbVar, this.a.b));
        }
        this.a.d = F.f();
        bxeq bxeqVar = this.a.b;
        if (bxeqVar != null) {
            bxeqVar.aK();
        }
        cqkx.p(this.a.a);
    }
}
