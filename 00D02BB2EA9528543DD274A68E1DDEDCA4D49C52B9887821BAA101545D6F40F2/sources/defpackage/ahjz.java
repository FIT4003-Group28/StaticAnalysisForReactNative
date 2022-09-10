package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ahjz  reason: default package */
/* loaded from: classes2.dex */
public final class ahjz implements btzi<dwzw, dxaa> {
    final /* synthetic */ ahka a;

    public ahjz(ahka ahkaVar) {
        this.a = ahkaVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwzw> btzrVar, btzy btzyVar) {
        this.a.i = 2;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwzw> btzrVar, dxaa dxaaVar) {
        dxaa dxaaVar2 = dxaaVar;
        int a = dwzz.a(dxaaVar2.b);
        if (a != 0 && a != 1) {
            this.a.i = 2;
            return;
        }
        this.a.a(dxaaVar2);
        ahka ahkaVar = this.a;
        bwrv c = ahka.c(ahkaVar.g);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            dwzx bZ = dxaa.g.bZ();
            int i = ahkaVar.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxaa dxaaVar3 = (dxaa) bZ.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            dxaaVar3.b = i2;
            dxaaVar3.a |= 1;
            for (int i3 = 0; i3 < 6; i3++) {
                long j = ahkaVar.f[i3];
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxaa dxaaVar4 = (dxaa) bZ.b;
                dsri dsriVar = dxaaVar4.c;
                if (!dsriVar.a()) {
                    dxaaVar4.c = dsqw.ci(dsriVar);
                }
                dxaaVar4.c.d(j);
            }
            if (ahkaVar.b != null) {
                dwzp bZ2 = dwzq.d.bZ();
                int i4 = ahkaVar.b.i();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwzq dwzqVar = (dwzq) bZ2.b;
                dwzqVar.a = 1 | dwzqVar.a;
                dwzqVar.b = i4;
                int m = ahkaVar.b.m();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwzq dwzqVar2 = (dwzq) bZ2.b;
                dwzqVar2.a |= 2;
                dwzqVar2.c = m;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxaa dxaaVar5 = (dxaa) bZ.b;
                dwzq bK = bZ2.bK();
                bK.getClass();
                dxaaVar5.d = bK;
                dxaaVar5.a = 2 | dxaaVar5.a;
            }
            int i5 = ahkaVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxaa dxaaVar6 = (dxaa) bZ.b;
            int i6 = dxaaVar6.a | 4;
            dxaaVar6.a = i6;
            dxaaVar6.e = i5;
            int i7 = ahkaVar.d;
            dxaaVar6.a = i6 | 8;
            dxaaVar6.f = i7;
            bvrs.a(byteArrayOutputStream, bZ.bK());
            ahkaVar.g.d(byteArrayOutputStream.toByteArray(), "savedLocationShiftCoefficients");
        } catch (IOException unused) {
            ahkaVar.g.b("savedLocationShiftCoefficients");
        } finally {
            ahka.d(c);
        }
    }
}
