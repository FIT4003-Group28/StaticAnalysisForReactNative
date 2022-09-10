package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kqy  reason: default package */
/* loaded from: classes7.dex */
public final class kqy implements ndx {
    final /* synthetic */ krc a;

    public kqy(krc krcVar) {
        this.a = krcVar;
    }

    @Override // defpackage.ndx
    public final void a(String str, @dzsi ldm ldmVar, boolean z, bxmg bxmgVar) {
        this.a.n.a(bxmgVar);
        if (ldmVar != null) {
            ((ckco) this.a.n.a.a(ckjw.ax)).a(z ? ckjv.a(2) : ckjv.a(1));
            this.a.c.a();
            krc krcVar = this.a;
            nop nopVar = krcVar.d;
            kdi kdiVar = krcVar.e;
            kdk kdkVar = kdk.NOTHING;
            mnz mnzVar = mnz.KEYBOARD_PLACE;
            dcdc<ldm> e = dcdc.e();
            krc krcVar2 = this.a;
            nopVar.k(kdiVar.c(ldmVar, null, null, kdkVar, mnzVar, false, true, e, null, krcVar2.j, krcVar2.d));
            this.a.c.b();
            return;
        }
        ((ckco) this.a.n.a.a(ckjw.ax)).a(z ? ckjv.a(4) : ckjv.a(3));
        this.a.m(str, dtxm.bq, deaf.TAP);
    }
}
