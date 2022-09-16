package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: zan  reason: default package */
/* loaded from: classes7.dex */
public final class zan {
    public static boolean a(vwn vwnVar, int i) {
        vwh vwhVar;
        Iterator<vwh> it = vwnVar.s().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                vwhVar = null;
                break;
            }
            vwhVar = it.next();
            if (vwhVar.b == i) {
                break;
            }
        }
        return vwhVar != null && vwhVar.l;
    }

    public static void b(vnk vnkVar, Context context, vwo vwoVar) {
        synchronized (vnkVar) {
            vwi s = vnkVar.l().d().s();
            ArrayList arrayList = new ArrayList(s.a.size());
            for (vwh vwhVar : s.a) {
                dsqp dsqpVar = (dsqp) vwhVar.cu(5);
                dsqpVar.bC(vwhVar);
                vwa vwaVar = (vwa) dsqpVar;
                if (vwaVar.c) {
                    vwaVar.bF();
                    vwaVar.c = false;
                }
                vwh vwhVar2 = (vwh) vwaVar.b;
                vwh vwhVar3 = vwh.n;
                vwhVar2.m = null;
                vwhVar2.a &= -1025;
                arrayList.add(vwaVar.bK());
            }
            dsqp dsqpVar2 = (dsqp) s.cu(5);
            dsqpVar2.bC(s);
            vvz vvzVar = (vvz) dsqpVar2;
            if (vvzVar.c) {
                vvzVar.bF();
                vvzVar.c = false;
            }
            ((vwi) vvzVar.b).a = vwi.ck();
            vvzVar.a(arrayList);
            final vwi bK = vvzVar.bK();
            vnkVar.m(vnkVar.l().j(context, vwoVar.a(vnkVar.l().d(), new mw(bK) { // from class: zak
                private final vwi a;

                {
                    this.a = bK;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    ((vwl) obj).o(this.a);
                }
            })));
        }
    }

    public static void c(vnk vnkVar, Context context, int i, zam zamVar, vwo vwoVar) {
        synchronized (vnkVar) {
            vwi s = vnkVar.l().d().s();
            vwh b = zay.b(s, i);
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            vwa vwaVar = (vwa) dsqpVar;
            zamVar.a(vwaVar);
            final vwi a = zay.a(s, vwaVar.bK());
            vnkVar.m(vnkVar.l().j(context, vwoVar.a(vnkVar.l().d(), new mw(a) { // from class: zal
                private final vwi a;

                {
                    this.a = a;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    ((vwl) obj).o(this.a);
                }
            })));
        }
    }

    public static void d(vnk vnkVar, Context context, int i, final int i2, final int i3, vwo vwoVar) {
        c(vnkVar, context, i, new zam(i2, i3) { // from class: zaj
            private final int a;
            private final int b;

            {
                this.a = i2;
                this.b = i3;
            }

            @Override // defpackage.zam
            public final void a(vwa vwaVar) {
                int i4 = this.a;
                int i5 = this.b;
                vwb bZ = vwg.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                vwg vwgVar = (vwg) bZ.b;
                int i6 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                vwgVar.b = i6;
                int i7 = vwgVar.a | 1;
                vwgVar.a = i7;
                vwgVar.c = i5 - 1;
                vwgVar.a = i7 | 2;
                if (vwaVar.c) {
                    vwaVar.bF();
                    vwaVar.c = false;
                }
                vwh vwhVar = (vwh) vwaVar.b;
                vwg bK = bZ.bK();
                vwh vwhVar2 = vwh.n;
                bK.getClass();
                vwhVar.m = bK;
                vwhVar.a |= 1024;
            }
        }, vwoVar);
    }
}
