package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bpxb  reason: default package */
/* loaded from: classes4.dex */
public final class bpxb extends bvxb<dgnf, dgnh> {
    public final gga a;
    public final bwqv b;
    private final bpvf c;

    public bpxb(gga ggaVar, bwqv bwqvVar, bpvf bpvfVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = bpvfVar;
    }

    public static dbsi<bpxa, akqi> g(dpsn dpsnVar, List<dpsn> list, dpsn dpsnVar2) {
        if (dpsnVar2.c != 0) {
            return dbsi.a(bpxa.EXTENT_PICKER_ROUTE, akqi.j(dpsnVar2));
        }
        if (!list.isEmpty()) {
            return dbsi.a(bpxa.EXTENT_PICKER_SEGMENTS, akqi.j(list.get(0)));
        }
        return dbsi.a(bpxa.LEGACY_FEATURE_ID, akqi.j(dpsnVar));
    }

    public static drkz h(digh dighVar) {
        drky bZ = drkz.f.bZ();
        dpsn dpsnVar = dighVar.b;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drkz drkzVar = (drkz) bZ.b;
        dpsnVar.getClass();
        drkzVar.b = dpsnVar;
        drkzVar.a |= 1;
        dpyn dpynVar = dighVar.c;
        if (dpynVar == null) {
            dpynVar = dpyn.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drkz drkzVar2 = (drkz) bZ.b;
        dpynVar.getClass();
        drkzVar2.c = dpynVar;
        drkzVar2.a |= 2;
        dpuq dpuqVar = dighVar.i;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drkz drkzVar3 = (drkz) bZ.b;
        dpuqVar.getClass();
        drkzVar3.d = dpuqVar;
        drkzVar3.a |= 4;
        return bZ.bK();
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.er";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    @dzsi
    public final /* bridge */ /* synthetic */ dgnh e(dgnf dgnfVar) {
        final dgnf dgnfVar2 = dgnfVar;
        dpsn i = akqi.b(dgnfVar2.a).i();
        dgnn dgnnVar = dgnfVar2.d;
        if (dgnnVar == null) {
            dgnnVar = dgnn.o;
        }
        dsrj<dpsn> dsrjVar = dgnnVar.j;
        dgnn dgnnVar2 = dgnfVar2.d;
        if (dgnnVar2 == null) {
            dgnnVar2 = dgnn.o;
        }
        dpsn dpsnVar = dgnnVar2.l;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        final dbsi<bpxa, akqi> g = g(i, dsrjVar, dpsnVar);
        this.c.a(g.b, new bpus(this, dgnfVar2, g) { // from class: bpwx
            private final bpxb a;
            private final dgnf b;
            private final dbsi c;

            {
                this.a = this;
                this.b = dgnfVar2;
                this.c = g;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
                if (r14.g.size() > 1) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
                r7 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
                if (r14.g.size() > 1) goto L15;
             */
            @Override // defpackage.bpus
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.digi r14) {
                /*
                    Method dump skipped, instructions count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bpwx.a(digi):void");
            }
        });
        return dgnh.a;
    }

    public final void i(bphu bphuVar, bpuk bpukVar, dbsg<drkz> dbsgVar, dnqe dnqeVar) {
        this.a.D(bphv.aT(bwrs.a(bvrt.b(bpukVar)), dbsgVar, this.b, bphuVar, dnqeVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgnf j(byte[] bArr) {
        return ((dgnc) dgnf.e.bZ().bx(bArr, dsqa.c())).bK();
    }
}
