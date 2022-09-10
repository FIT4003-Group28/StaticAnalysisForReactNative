package defpackage;

import android.view.View;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccef  reason: default package */
/* loaded from: classes4.dex */
public final class ccef {
    private final String a;
    private final View.OnClickListener b;

    public ccef(final dxio<cccs> dxioVar, final dxio<bvby> dxioVar2, dxio<cceb> dxioVar3, dxio<bvjj> dxioVar4, final dxio<Executor> dxioVar5, final drmb drmbVar) {
        this.a = drmbVar.c;
        this.b = new View.OnClickListener(dxioVar2, dxioVar, dxioVar5, drmbVar) { // from class: cced
            private final dxio a;
            private final dxio b;
            private final dxio c;
            private final drmb d;

            {
                this.a = dxioVar2;
                this.b = dxioVar;
                this.c = dxioVar5;
                this.d = drmbVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxio dxioVar6 = this.a;
                dxio dxioVar7 = this.b;
                dxio dxioVar8 = this.c;
                drmb drmbVar2 = this.d;
                bvby bvbyVar = (bvby) dxioVar6.a();
                cccs cccsVar = (cccs) dxioVar7.a();
                Executor executor = (Executor) dxioVar8.a();
                String str = drmbVar2.b;
                cccsVar.b();
                dnqg bZ = dnqh.p.bZ();
                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.l = dnmuVar.ap;
                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                int i = ddda.cv.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                dnqhVar2.a |= 64;
                dnqhVar2.g = i;
                dnqh bK = bZ.bK();
                dhvz bZ2 = dhwa.d.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dhwa dhwaVar = (dhwa) bZ2.b;
                str.getClass();
                int i2 = dhwaVar.a | 1;
                dhwaVar.a = i2;
                dhwaVar.b = str;
                bK.getClass();
                dhwaVar.c = bK;
                dhwaVar.a = i2 | 2;
                bvbyVar.b(bZ2.bK(), new ccee(cccsVar, str), executor);
            }
        };
    }

    public static final oy c() {
        return oy.h;
    }

    public static final cjtd d() {
        return cjtd.a(dtxl.eh);
    }

    public final String a() {
        return this.a;
    }

    public final View.OnClickListener b() {
        return this.b;
    }
}
