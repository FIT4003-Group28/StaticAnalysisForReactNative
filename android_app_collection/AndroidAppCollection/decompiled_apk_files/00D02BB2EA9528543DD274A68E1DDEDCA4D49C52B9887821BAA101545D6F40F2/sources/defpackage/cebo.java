package defpackage;
/* compiled from: PG */
/* renamed from: cebo  reason: default package */
/* loaded from: classes4.dex */
final class cebo implements btzi<dihn, dihp> {
    final /* synthetic */ cebp a;
    final /* synthetic */ Runnable b;

    public cebo(cebp cebpVar, Runnable runnable) {
        this.a = cebpVar;
        this.b = runnable;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dihn> btzrVar, btzy btzyVar) {
        this.b.run();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dihn> btzrVar, dihp dihpVar) {
        dihp dihpVar2 = dihpVar;
        if ((dihpVar2.a & 1) == 0) {
            this.b.run();
            return;
        }
        cebp cebpVar = this.a;
        dmbc dmbcVar = dihpVar2.b;
        if (dmbcVar == null) {
            dmbcVar = dmbc.h;
        }
        cebpVar.a(new cdsa(dmbcVar));
    }
}
