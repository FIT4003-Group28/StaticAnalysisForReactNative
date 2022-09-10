package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anqt  reason: default package */
/* loaded from: classes2.dex */
public final class anqt implements btzi<dwjd, dwjf> {
    final /* synthetic */ anqu a;
    final /* synthetic */ anqv b;

    public anqt(anqv anqvVar, anqu anquVar) {
        this.b = anqvVar;
        this.a = anquVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjd> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        this.b.a = false;
        this.a.b();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjd> btzrVar, dwjf dwjfVar) {
        bvrj.UI_THREAD.c();
        this.b.a = false;
        dccx F = dcdc.F();
        for (dwjb dwjbVar : dwjfVar.b) {
            dvyw dvywVar = dwjbVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            dvar bZ = dvas.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvas dvasVar = (dvas) bZ.b;
            dvywVar.getClass();
            dvasVar.b = dvywVar;
            dvasVar.a |= 1;
            F.g(bZ.bK());
        }
        this.a.a(F.f());
    }
}
