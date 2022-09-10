package defpackage;

import com.google.android.filament.R;
/* renamed from: cuno  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cuno implements dbrn {
    static final dbrn a = new cuno();

    private cuno() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuql cuqlVar = (cuql) obj;
        cuqp cuqpVar = cuqp.RICH_TEXT;
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        cupw cupwVar = cupw.STACK_CARD;
        int ordinal = cuqlVar.b().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dxrv bZ = dxrw.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dxrw) bZ.b).c = dxpa.a(4);
                dxry c = cunv.c(cuqlVar.c());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dxrw dxrwVar = (dxrw) bZ.b;
                c.getClass();
                dxrwVar.b = c;
                dxrwVar.a = 102;
                return bZ.bK();
            }
            throw new IllegalArgumentException("Got unknown ui component model type");
        }
        dxrv bZ2 = dxrw.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dxrw) bZ2.b).c = dxpa.a(3);
        cuqk a2 = cuqlVar.a();
        dxrp bZ3 = dxrq.b.bZ();
        dcdc a3 = cstr.a(a2.a(), cunp.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dxrq dxrqVar = (dxrq) bZ3.b;
        dsrj<dxry> dsrjVar = dxrqVar.a;
        if (!dsrjVar.a()) {
            dxrqVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(a3, dxrqVar.a);
        dxrq bK = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dxrw dxrwVar2 = (dxrw) bZ2.b;
        bK.getClass();
        dxrwVar2.b = bK;
        dxrwVar2.a = R.styleable.AppCompatTheme_switchStyle;
        return bZ2.bK();
    }
}
