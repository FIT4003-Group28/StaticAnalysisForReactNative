package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cfi  reason: default package */
/* loaded from: classes4.dex */
public final class cfi extends ceu<cfg> implements bwy {
    public cfi(cfg cfgVar) {
        super(cfgVar);
    }

    @Override // defpackage.bxd
    public final Class<cfg> a() {
        return cfg.class;
    }

    @Override // defpackage.bxd
    public final int c() {
        cfn cfnVar = ((cfg) this.a).a.a;
        bsp bspVar = (bsp) cfnVar.a;
        return bspVar.a.limit() + bspVar.c.length + (bspVar.d.length * 4) + cfnVar.j;
    }

    @Override // defpackage.bxd
    public final void d() {
        bxl bxlVar;
        ((cfg) this.a).stop();
        cfg cfgVar = (cfg) this.a;
        cfgVar.b = true;
        cfn cfnVar = cfgVar.a.a;
        cfnVar.b.clear();
        cfnVar.e();
        cfnVar.c();
        cfk cfkVar = cfnVar.e;
        if (cfkVar != null) {
            cfnVar.c.l(cfkVar);
            cfnVar.e = null;
        }
        cfk cfkVar2 = cfnVar.g;
        if (cfkVar2 != null) {
            cfnVar.c.l(cfkVar2);
            cfnVar.g = null;
        }
        cfk cfkVar3 = cfnVar.i;
        if (cfkVar3 != null) {
            cfnVar.c.l(cfkVar3);
            cfnVar.i = null;
        }
        bsp bspVar = (bsp) cfnVar.a;
        bspVar.f = null;
        byte[] bArr = bspVar.c;
        if (bArr != null) {
            bspVar.j.c(bArr);
        }
        int[] iArr = bspVar.d;
        if (iArr != null && (bxlVar = bspVar.j.b) != null) {
            bxlVar.a(iArr);
        }
        Bitmap bitmap = bspVar.g;
        if (bitmap != null) {
            bspVar.j.a(bitmap);
        }
        bspVar.g = null;
        bspVar.a = null;
        bspVar.h = null;
        byte[] bArr2 = bspVar.b;
        if (bArr2 != null) {
            bspVar.j.c(bArr2);
        }
        cfnVar.f = true;
    }

    @Override // defpackage.ceu, defpackage.bwy
    public final void e() {
        ((cfg) this.a).a().prepareToDraw();
    }
}
