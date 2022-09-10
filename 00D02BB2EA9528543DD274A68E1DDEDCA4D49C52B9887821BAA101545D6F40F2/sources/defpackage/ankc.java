package defpackage;
/* compiled from: PG */
/* renamed from: ankc  reason: default package */
/* loaded from: classes2.dex */
final class ankc implements btzi<duxy, duya> {
    final /* synthetic */ duxy a;
    final /* synthetic */ ankd b;

    public ankc(ankd ankdVar, duxy duxyVar) {
        this.b = ankdVar;
        this.a = duxyVar;
    }

    private final void c() {
        for (angx angxVar : this.b.a) {
            angxVar.l();
        }
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duxy> btzrVar, btzy btzyVar) {
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duxy> btzrVar, duya duyaVar) {
        duya duyaVar2 = duyaVar;
        int a = dnqj.a(duyaVar2.b);
        if (a == 0 || a != 1) {
            c();
            return;
        }
        if ((duyaVar2.a & 2) != 0) {
            anhk anhkVar = this.b.b;
            dnwb dnwbVar = this.a.e;
            if (dnwbVar == null) {
                dnwbVar = dnwb.i;
            }
            dnwb dnwbVar2 = duyaVar2.c;
            if (dnwbVar2 == null) {
                dnwbVar2 = dnwb.i;
            }
            anhkVar.b(dnwbVar, dnwbVar2);
        }
        for (angx angxVar : this.b.a) {
            angxVar.k(this.a, duyaVar2);
        }
    }
}
