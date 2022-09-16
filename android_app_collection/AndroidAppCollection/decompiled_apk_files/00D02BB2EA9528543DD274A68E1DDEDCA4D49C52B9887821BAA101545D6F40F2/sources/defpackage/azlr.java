package defpackage;
/* compiled from: PG */
/* renamed from: azlr  reason: default package */
/* loaded from: classes3.dex */
final class azlr implements btzi<dvor, dvov> {
    final /* synthetic */ baao a;
    final /* synthetic */ azlv b;

    public azlr(azlv azlvVar, baao baaoVar) {
        this.b = azlvVar;
        this.a = baaoVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvor> btzrVar, btzy btzyVar) {
        this.a.o(btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvor> btzrVar, dvov dvovVar) {
        dvov dvovVar2 = dvovVar;
        baao baaoVar = this.a;
        baaoVar.b = dvovVar2;
        int b = dvou.b(dvovVar2.b);
        if (b == 0) {
            b = dvou.a;
        }
        baaoVar.c = b;
        int i = baaoVar.c;
        int i2 = i - 1;
        bttq bttqVar = null;
        if (i != 0) {
            if (i2 != 0) {
                bttqVar = i2 != 2 ? (i2 == 3 || i2 == 4) ? bttq.SINGLE_REQUEST_FATAL_ERROR : bttq.SINGLE_REQUEST_ERROR : bttq.INVALID_GAIA_AUTH_TOKEN;
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
