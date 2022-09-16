package defpackage;

import com.google.geo.imagery.viewer.api.IconHandle;
/* compiled from: PG */
/* renamed from: bxbn  reason: default package */
/* loaded from: classes4.dex */
final class bxbn implements Runnable {
    final /* synthetic */ bxbs a;

    public bxbn(bxbs bxbsVar) {
        this.a = bxbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        Runnable runnable = this.a.u;
        if (runnable != null) {
            runnable.run();
        }
        bxbs bxbsVar = this.a;
        bwvl bwvlVar = bxbsVar.p;
        if (bwvlVar != null) {
            dhjx l = bxbsVar.l();
            dftz dftzVar = bwvlVar.d;
            if (dftzVar == null || dftzVar.c()) {
                return;
            }
            dhjz dhjzVar = bwvlVar.a;
            double d = dhjzVar.b;
            double d2 = dhjzVar.c;
            double d3 = dhjzVar.d;
            dhjz dhjzVar2 = l.b;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            double d4 = dhjzVar2.b;
            dhjz dhjzVar3 = l.b;
            if (dhjzVar3 == null) {
                dhjzVar3 = dhjz.e;
            }
            double d5 = dhjzVar3.c;
            dhjz dhjzVar4 = l.b;
            if (dhjzVar4 == null) {
                dhjzVar4 = dhjz.e;
            }
            double b = dfug.b(d, d2, d3, d4, d5, dhjzVar4.d);
            float f = b < 19.0d ? 1.5f : b < 50.0d ? (float) ((20.0d / (b + 1.0d)) * 1.5d) : 0.0f;
            bwvlVar.a();
            dfsp bZ = dfss.k.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfss dfssVar = (dfss) bZ.b;
            dfssVar.a |= 64;
            dfssVar.f = f;
            IconHandle iconHandle = bwvlVar.b;
            if (iconHandle != null) {
                dftzVar.b(iconHandle, bZ.bK());
            }
            float f2 = f * 0.5f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfss dfssVar2 = (dfss) bZ.b;
            dfssVar2.a |= 64;
            dfssVar2.f = f2;
            IconHandle iconHandle2 = bwvlVar.c;
            if (iconHandle2 == null) {
                return;
            }
            dftzVar.b(iconHandle2, bZ.bK());
        }
    }
}
