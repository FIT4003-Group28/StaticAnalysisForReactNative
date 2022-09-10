package defpackage;

import com.google.geo.imagery.viewer.api.IconHandle;
/* compiled from: PG */
/* renamed from: bwvj  reason: default package */
/* loaded from: classes4.dex */
public final class bwvj implements btzi<dwyz, dwzd> {
    final /* synthetic */ bwvk a;

    public bwvj(bwvk bwvkVar) {
        this.a = bwvkVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwyz> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwyz> btzrVar, dwzd dwzdVar) {
        dwzd dwzdVar2 = dwzdVar;
        int a = dwzc.a(dwzdVar2.a);
        if (a == 0 || a == 1) {
            bwvk bwvkVar = this.a;
            double d = dwzdVar2.b.d(0);
            bwvl bwvlVar = bwvkVar.b;
            dhjy bZ = dhjz.e.bZ();
            double d2 = bwvkVar.a.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            int i = dhjzVar.a | 2;
            dhjzVar.a = i;
            dhjzVar.c = d2;
            double d3 = bwvkVar.a.b;
            int i2 = i | 1;
            dhjzVar.a = i2;
            dhjzVar.b = d3;
            dhjzVar.a = i2 | 4;
            dhjzVar.d = d;
            bwvlVar.a = bZ.bK();
            dftz dftzVar = bwvlVar.d;
            if (dftzVar == null || dftzVar.c()) {
                return;
            }
            bwvlVar.a();
            dfsp bZ2 = dfss.k.bZ();
            double d4 = bwvlVar.a.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfss dfssVar = (dfss) bZ2.b;
            int i3 = 1 | dfssVar.a;
            dfssVar.a = i3;
            dfssVar.b = d4;
            dhjz dhjzVar2 = bwvlVar.a;
            double d5 = dhjzVar2.b;
            int i4 = i3 | 2;
            dfssVar.a = i4;
            dfssVar.c = d5;
            double d6 = dhjzVar2.d;
            dfssVar.a = i4 | 4;
            dfssVar.d = d6 - 6.0d;
            dfss.b(dfssVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfss dfssVar2 = (dfss) bZ2.b;
            dfssVar2.a |= 512;
            dfssVar2.h = 0.0f;
            IconHandle iconHandle = bwvlVar.b;
            if (iconHandle != null) {
                dftzVar.b(iconHandle, bZ2.bK());
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfss.b((dfss) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfss dfssVar3 = (dfss) bZ2.b;
            dfssVar3.a |= 512;
            dfssVar3.h = 0.5f;
            IconHandle iconHandle2 = bwvlVar.c;
            if (iconHandle2 == null) {
                return;
            }
            dftzVar.b(iconHandle2, bZ2.bK());
        }
    }
}
