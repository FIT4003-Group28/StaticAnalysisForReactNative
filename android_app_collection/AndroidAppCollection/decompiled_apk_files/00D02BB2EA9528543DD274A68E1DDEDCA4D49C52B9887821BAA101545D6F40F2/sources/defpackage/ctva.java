package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctva  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctva implements dbrn {
    static final dbrn a = new ctva();

    private ctva() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        final cuhg cuhgVar = (cuhg) obj;
        final dxsd bZ = dxse.f.bZ();
        String a2 = cuhgVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a2.getClass();
        ((dxse) bZ.b).a = a2;
        cstn.a(cuhgVar.e(), new mw(bZ, cuhgVar) { // from class: ctvd
            private final dxsd a;
            private final cuhg b;

            {
                this.a = bZ;
                this.b = cuhgVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                dxsd dxsdVar = this.a;
                Boolean bool = (Boolean) obj2;
                boolean booleanValue = this.b.e().b().booleanValue();
                if (dxsdVar.c) {
                    dxsdVar.bF();
                    dxsdVar.c = false;
                }
                dxse dxseVar = dxse.f;
                ((dxse) dxsdVar.b).e = booleanValue;
            }
        });
        cstn.a(cuhgVar.b(), new mw(bZ) { // from class: ctve
            private final dxsd a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                dxsd dxsdVar = this.a;
                int i = ((cuhp) obj2).g;
                int i2 = 4;
                if (i == 0) {
                    i2 = 2;
                } else if (i == 1) {
                    i2 = 3;
                } else if (i != 2) {
                    i2 = i != 3 ? i != 4 ? 7 : 6 : 5;
                }
                dxsp bZ2 = dxsq.b.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ((dxsq) bZ2.b).a = dxpe.a(i2);
                dxsq bK = bZ2.bK();
                if (dxsdVar.c) {
                    dxsdVar.bF();
                    dxsdVar.c = false;
                }
                dxse dxseVar = dxse.f;
                bK.getClass();
                ((dxse) dxsdVar.b).b = bK;
            }
        });
        dcdc<cuhl> c = cuhgVar.c().c(dcdc.e());
        if (!c.isEmpty()) {
            dcdc a3 = cstr.a(c, ctvf.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxse dxseVar = (dxse) bZ.b;
            dsrj<dxso> dsrjVar = dxseVar.c;
            if (!dsrjVar.a()) {
                dxseVar.c = dsqw.cl(dsrjVar);
            }
            dsod.bv(a3, dxseVar.c);
        }
        dcdc<cuhi> c2 = cuhgVar.d().c(dcdc.e());
        if (!c2.isEmpty()) {
            dcdc a4 = cstr.a(c2, ctvg.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxse dxseVar2 = (dxse) bZ.b;
            dsrj<dxsg> dsrjVar2 = dxseVar2.d;
            if (!dsrjVar2.a()) {
                dxseVar2.d = dsqw.cl(dsrjVar2);
            }
            dsod.bv(a4, dxseVar2.d);
        }
        return bZ.bK();
    }
}
