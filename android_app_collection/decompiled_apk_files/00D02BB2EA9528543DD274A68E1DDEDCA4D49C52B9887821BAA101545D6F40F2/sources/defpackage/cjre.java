package defpackage;
/* compiled from: PG */
/* renamed from: cjre  reason: default package */
/* loaded from: classes4.dex */
class cjre implements dbrn<dnpb, deak> {
    public static final deak b(dnpb dnpbVar) {
        deaj bZ = deak.d.bZ();
        if ((dnpbVar.a & 1) != 0) {
            dbrn<dnpf, dpkp> dbrnVar = cjsl.b;
            dnpf b = dnpf.b(dnpbVar.b);
            if (b == null) {
                b = dnpf.UNKNOWN_LABEL_CONTENT_TYPE;
            }
            dpkp a = dbrnVar.a(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deak deakVar = (deak) bZ.b;
            deakVar.b = a.d;
            deakVar.a |= 1;
        }
        if ((dnpbVar.a & 2) != 0) {
            dbrn<dnpd, dpkn> dbrnVar2 = cjsl.a;
            dnpd b2 = dnpd.b(dnpbVar.c);
            if (b2 == null) {
                b2 = dnpd.UNKNOWN_LABEL_CONTENT_LOCATION;
            }
            dpkn a2 = dbrnVar2.a(b2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deak deakVar2 = (deak) bZ.b;
            deakVar2.c = a2.d;
            deakVar2.a |= 2;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ deak a(dnpb dnpbVar) {
        throw null;
    }
}
