package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byat  reason: default package */
/* loaded from: classes4.dex */
public final class byat implements bxzw {
    private final bvgc a;
    private final bvfy b;
    private final Executor c;

    public byat(bvgc bvgcVar, bvfy bvfyVar, Executor executor) {
        this.a = bvgcVar;
        this.b = bvfyVar;
        this.c = executor;
    }

    @Override // defpackage.bxzw
    public final dehn<List<bxzt>> a() {
        return deew.h(((bvga) this.b).b().c(dlzu.a), byar.a, this.c);
    }

    @Override // defpackage.bxzw
    public final dehn<bxzs> b(String str, final boolean z) {
        bvgf b = ((bvge) this.a).b();
        dman bZ = dmao.b.bZ();
        dmah bZ2 = dmam.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmam dmamVar = (dmam) bZ2.b;
        str.getClass();
        dmamVar.a |= 8;
        dmamVar.e = str;
        int i = z ? 2 : 3;
        dmam dmamVar2 = (dmam) bZ2.b;
        dmamVar2.c = i - 1;
        dmamVar2.a |= 2;
        dmam dmamVar3 = (dmam) bZ2.b;
        dmamVar3.b = 2;
        dmamVar3.a |= 1;
        dmam dmamVar4 = (dmam) bZ2.b;
        dmamVar4.d = 4;
        dmamVar4.a = 4 | dmamVar4.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmao dmaoVar = (dmao) bZ.b;
        dmam bK = bZ2.bK();
        bK.getClass();
        dsrj<dmam> dsrjVar = dmaoVar.a;
        if (!dsrjVar.a()) {
            dmaoVar.a = dsqw.cl(dsrjVar);
        }
        dmaoVar.a.add(bK);
        return deew.h(b.c(bZ.bK()), new dbrn(z) { // from class: byas
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                btzx btzxVar = (btzx) obj;
                if (this.a) {
                    return bxzs.CONSENT_STATUS_ACCEPTED;
                }
                return bxzs.CONSENT_STATUS_REJECTED;
            }
        }, this.c);
    }
}
