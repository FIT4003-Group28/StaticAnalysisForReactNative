package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpcd  reason: default package */
/* loaded from: classes3.dex */
public final class bpcd implements bnyn<dwbw, dwby> {
    final /* synthetic */ bpce a;

    public bpcd(bpce bpceVar) {
        this.a = bpceVar;
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        dwbw dwbwVar = (dwbw) dssjVar;
        dwby dwbyVar = (dwby) dssjVar2;
        bpce bpceVar = this.a;
        if (dwbyVar == null || (dwbyVar.a & 2) == 0) {
            bpceVar.n(null, false);
            return;
        }
        dpum dpumVar = dwbyVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        bpceVar.n(new akqq(dpumVar.b, dpumVar.c), false);
    }
}
