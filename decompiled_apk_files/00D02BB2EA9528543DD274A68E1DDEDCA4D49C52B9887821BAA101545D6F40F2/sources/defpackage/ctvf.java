package defpackage;
/* renamed from: ctvf  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctvf implements dbrn {
    static final dbrn a = new ctvf();

    private ctvf() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhl cuhlVar = (cuhl) obj;
        cuhs cuhsVar = cuhs.UNKNOWN;
        cuhn cuhnVar = cuhn.UNKNOWN;
        int ordinal = cuhlVar.a().ordinal();
        if (ordinal == 1) {
            dxsn bZ = dxso.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxso) bZ.b).c = dxpd.a(3);
            dxsj bZ2 = dxsk.b.bZ();
            int b = cuhlVar.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dxsk) bZ2.b).a = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxso dxsoVar = (dxso) bZ.b;
            dxsk bK = bZ2.bK();
            bK.getClass();
            dxsoVar.b = bK;
            dxsoVar.a = 2;
            return bZ.bK();
        } else if (ordinal == 2) {
            dxsn bZ3 = dxso.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ((dxso) bZ3.b).c = dxpd.a(4);
            dxsc dxscVar = dxsc.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dxso dxsoVar2 = (dxso) bZ3.b;
            dxscVar.getClass();
            dxsoVar2.b = dxscVar;
            dxsoVar2.a = 3;
            return bZ3.bK();
        } else {
            String valueOf = String.valueOf(cuhlVar.a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unable to convert rich text line style to proto: ");
            sb.append(valueOf);
            sb.toString();
            cstl.a("RichTextProtoConvUtils");
            return dxso.d;
        }
    }
}
