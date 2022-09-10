package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwjk  reason: default package */
/* loaded from: classes4.dex */
public final class bwjk implements btzi<dvto, dvts> {
    private final dxio<akfa> a;
    private final bwno b;

    public bwjk(bwno bwnoVar, dxio<akfa> dxioVar) {
        this.b = bwnoVar;
        this.a = dxioVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvto> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.d)) {
            this.b.i();
            return;
        }
        this.b.o(btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvto> btzrVar, dvts dvtsVar) {
        bttq bttqVar;
        akfa a;
        dvts dvtsVar2 = dvtsVar;
        this.b.e = dvtsVar2;
        dtnh dtnhVar = dvtsVar2.a;
        if (dtnhVar == null) {
            dtnhVar = dtnh.g;
        }
        int a2 = dtng.a(dtnhVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 0 || i == 3) {
            bttqVar = null;
        } else if (i != 4) {
            dtnh dtnhVar2 = dvtsVar2.a;
            if (dtnhVar2 == null) {
                dtnhVar2 = dtnh.g;
            }
            int i2 = dtnhVar2.b;
            bttqVar = bttq.SINGLE_REQUEST_FATAL_ERROR;
        } else {
            bttqVar = bttq.INVALID_GAIA_AUTH_TOKEN;
        }
        if (bttqVar == bttq.INVALID_GAIA_AUTH_TOKEN && (a = this.a.a()) != null) {
            a.A(btzrVar.c, btzrVar.b);
        }
        this.b.o(bttqVar);
    }
}
