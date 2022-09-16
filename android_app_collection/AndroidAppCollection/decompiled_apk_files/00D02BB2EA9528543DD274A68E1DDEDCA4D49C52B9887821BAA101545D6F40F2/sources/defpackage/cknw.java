package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: cknw  reason: default package */
/* loaded from: classes4.dex */
public class cknw extends cknx {
    @dzsi
    private final ilo a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final List<drbz> f;

    public cknw(@dzsi ilo iloVar, boolean z, boolean z2, boolean z3, boolean z4, List<drbz> list) {
        this.a = iloVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
    }

    @Override // defpackage.cknx
    public final dwge a(akqi akqiVar, int i, @dzsi String str, int i2, int i3) {
        ilo iloVar;
        String cR;
        dwfy bZ = dwge.m.bZ();
        h(bZ, akqiVar);
        dwfs e = e(this.c, this.d, this.e, this.f);
        j(e, i, str);
        n(e, i2, i3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar = (dwge) bZ.b;
        dwfv bK = e.bK();
        bK.getClass();
        dwgeVar.h = bK;
        dwgeVar.a |= 128;
        if (this.b && (iloVar = this.a) != null && (cR = iloVar.cR()) != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwge dwgeVar2 = (dwge) bZ.b;
            cR.getClass();
            dwgeVar2.a |= 32768;
            dwgeVar2.l = cR;
        }
        dnqg bZ2 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwge dwgeVar3 = (dwge) bZ.b;
        dnqh bK2 = bZ2.bK();
        bK2.getClass();
        dwgeVar3.k = bK2;
        dwgeVar3.a |= 8192;
        return bZ.bK();
    }

    @Override // defpackage.cknx
    public final int b(@dzsi ilo iloVar) {
        if (!this.d) {
            return iloVar.aG() - iloVar.aH();
        }
        return iloVar.aG();
    }
}
