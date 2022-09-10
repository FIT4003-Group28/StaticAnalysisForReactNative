package defpackage;
/* compiled from: PG */
/* renamed from: azlt  reason: default package */
/* loaded from: classes3.dex */
final class azlt implements btzi<dvoj, dvon> {
    final /* synthetic */ baan a;
    final /* synthetic */ azlv b;

    public azlt(azlv azlvVar, baan baanVar) {
        this.b = azlvVar;
        this.a = baanVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvoj> btzrVar, btzy btzyVar) {
        this.a.o(btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvoj> btzrVar, dvon dvonVar) {
        dvon dvonVar2 = dvonVar;
        baan baanVar = this.a;
        baanVar.b = dvonVar2;
        int b = dvom.b(dvonVar2.b);
        if (b == 0) {
            b = dvom.a;
        }
        baanVar.c = b;
        int i = baanVar.c;
        int i2 = i - 1;
        bttq bttqVar = null;
        if (i != 0) {
            if (i2 != 0) {
                bttqVar = i2 != 2 ? i2 != 3 ? bttq.SINGLE_REQUEST_ERROR : bttq.SINGLE_REQUEST_FATAL_ERROR : bttq.INVALID_GAIA_AUTH_TOKEN;
            }
            if (bttqVar == bttq.INVALID_GAIA_AUTH_TOKEN) {
                this.b.d.A(btzrVar.c, btzrVar.b);
            }
            this.a.o(bttqVar);
            return;
        }
        throw null;
    }
}
