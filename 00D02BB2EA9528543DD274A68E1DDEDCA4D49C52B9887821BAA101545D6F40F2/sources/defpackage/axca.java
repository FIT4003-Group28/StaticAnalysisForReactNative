package defpackage;
/* compiled from: PG */
/* renamed from: axca  reason: default package */
/* loaded from: classes.dex */
public final class axca {
    private final dbty<Integer> a;
    private final axby b;

    public axca(final dxio<dkux> dxioVar, axby axbyVar) {
        this.a = dbud.a(new dbty(dxioVar) { // from class: axbz
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar2 = this.a;
                return Integer.valueOf(((dkux) dxioVar2.a()).i() ? ((dkux) dxioVar2.a()).h() : 20);
            }
        });
        this.b = axbyVar;
    }

    @dzsi
    public final axds a(@dzsi axds axdsVar, dviw dviwVar, @dzsi dviq dviqVar, int i) {
        axdr bZ;
        awvv<?>[] awvvVarArr;
        dviw dviwVar2 = dviwVar;
        int a = drbt.a(dviwVar2.b);
        if (a == 0) {
            return axdsVar;
        }
        int i2 = 2;
        if (a != 2) {
            return axdsVar;
        }
        if (axdsVar != null) {
            dsqp dsqpVar = (dsqp) axdsVar.cu(5);
            dsqpVar.bC(axdsVar);
            bZ = (axdr) dsqpVar;
        } else {
            bZ = axds.ac.bZ();
        }
        awvv<?>[] a2 = awvv.a();
        int length = a2.length;
        int i3 = 0;
        while (i3 < length) {
            awvv<?> awvvVar = a2[i3];
            awwx a3 = awwy.a(awvvVar);
            dviq a4 = this.b.a(dviqVar, awvvVar.O);
            long j = i;
            dssj i4 = a3.i(dviwVar2);
            if (a3.m(i4) != i2) {
                awvvVarArr = a2;
            } else {
                String str = a3.h(i4).e;
                int a5 = a3.a(bZ);
                int i5 = 0;
                while (true) {
                    if (i5 >= a5) {
                        awvvVarArr = a2;
                        i5 = -1;
                        break;
                    }
                    awvvVarArr = a2;
                    String str2 = a3.h(a3.j(bZ, i5)).e;
                    dviq d = a3.d(bZ, i5);
                    boolean z = true;
                    if (a4 != null && d != null && !a4.equals(d)) {
                        z = false;
                    }
                    if (str2.equals(str) && z) {
                        break;
                    }
                    i5++;
                    a2 = awvvVarArr;
                }
                if (i5 >= 0) {
                    a3.e(bZ, i5);
                }
                a3.k(bZ, i4, a4, j);
            }
            while (a3.a(bZ) > this.a.a().intValue()) {
                a3.e(bZ, a3.a(bZ) - 1);
            }
            i3++;
            dviwVar2 = dviwVar;
            a2 = awvvVarArr;
            i2 = 2;
        }
        return bZ.bK();
    }
}
