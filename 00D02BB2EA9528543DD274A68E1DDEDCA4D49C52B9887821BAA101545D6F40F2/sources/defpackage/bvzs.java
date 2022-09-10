package defpackage;
/* compiled from: PG */
/* renamed from: bvzs  reason: default package */
/* loaded from: classes4.dex */
public final class bvzs extends bvwl<dmew, dmfa> {
    private final dxio<axwp> c;

    public bvzs(dxio<axwp> dxioVar) {
        super(dmew.c, dmfa.c);
        this.c = dxioVar;
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmfa g(dmew dmewVar) {
        azxb azxbVar;
        azwv a;
        dmex bZ = dmfa.b.bZ();
        for (dmdp dmdpVar : dmewVar.a) {
            dmey bZ2 = dmez.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmez dmezVar = (dmez) bZ2.b;
            dmdpVar.getClass();
            dmezVar.b = dmdpVar;
            dmezVar.a |= 1;
            try {
                dtbq a2 = bkkc.a(dmdpVar.a);
                dgrh dgrhVar = a2.b;
                if (dgrhVar == null) {
                    dgrhVar = dgrh.d;
                }
                akqi k = akqi.k(dgrhVar);
                dtbo dtboVar = a2.d;
                if (dtboVar == null) {
                    dtboVar = dtbo.d;
                }
                double d = dtboVar.b;
                dtbo dtboVar2 = a2.d;
                if (dtboVar2 == null) {
                    dtboVar2 = dtbo.d;
                }
                azxbVar = azxb.f(k, new akqq(d, dtboVar2.c));
            } catch (dstw | IllegalArgumentException unused) {
                azxbVar = null;
            }
            if (azxbVar != null && (a = this.c.a().a(azxbVar)) != null) {
                dcpd<azwu> it = a.n().iterator();
                while (it.hasNext()) {
                    azwu next = it.next();
                    drcn bZ3 = drco.d.bZ();
                    baab b = next.b();
                    baab baabVar = baab.FAVORITES;
                    int ordinal = b.ordinal();
                    drcq drcqVar = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? drcq.UNKNOWN_PLACE_LIST_TYPE : drcq.CUSTOM : drcq.STARRED : drcq.WANT_TO_GO : drcq.FAVORITES;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    drco drcoVar = (drco) bZ3.b;
                    drcoVar.b = drcqVar.g;
                    drcoVar.a |= 1;
                    String a3 = next.a();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    drco drcoVar2 = (drco) bZ3.b;
                    a3.getClass();
                    drcoVar2.a = 2 | drcoVar2.a;
                    drcoVar2.c = a3;
                    bZ2.a(bZ3);
                }
                if (a.f()) {
                    drcn bZ4 = drco.d.bZ();
                    drcq drcqVar2 = drcq.STARRED;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    drco drcoVar3 = (drco) bZ4.b;
                    drcoVar3.b = drcqVar2.g;
                    drcoVar3.a |= 1;
                    bZ2.a(bZ4);
                }
                if (((dmez) bZ2.b).c.size() > 0) {
                    dmez bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmfa dmfaVar = (dmfa) bZ.b;
                    bK.getClass();
                    dsrj<dmez> dsrjVar = dmfaVar.a;
                    if (!dsrjVar.a()) {
                        dmfaVar.a = dsqw.cl(dsrjVar);
                    }
                    dmfaVar.a.add(bK);
                }
            }
        }
        return bZ.bK();
    }
}
