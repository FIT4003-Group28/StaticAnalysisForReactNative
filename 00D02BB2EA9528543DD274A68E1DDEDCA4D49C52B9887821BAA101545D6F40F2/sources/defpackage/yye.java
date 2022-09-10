package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yye  reason: default package */
/* loaded from: classes7.dex */
public abstract class yye implements yyb {
    public static final cqtd c = cqrt.f(2131232774);
    private final zvb a;
    @dzsi
    private final cjtd b;

    public yye(Context context, djyo djyoVar, @dzsi cjtd cjtdVar) {
        dcdc f;
        if (djyoVar.d.size() <= 0) {
            String quantityString = context.getResources().getQuantityString(R.plurals.TRANSIT_SCHEMATIC_MAP_DEFAULT_BUTTON_TITLE, djyoVar.g.size());
            dpcb bZ = dpce.f.bZ();
            douk bZ2 = doul.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doul doulVar = (doul) bZ2.b;
            quantityString.getClass();
            doulVar.a |= 1;
            doulVar.b = quantityString;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpce dpceVar = (dpce) bZ.b;
            doul bK = bZ2.bK();
            bK.getClass();
            dpceVar.c = bK;
            dpceVar.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpce dpceVar2 = (dpce) bZ.b;
            dpceVar2.b = 2;
            dpceVar2.a |= 1;
            f = dcdc.f(bZ.bK());
        } else {
            f = dcdc.r(djyoVar.d);
        }
        this.a = new zvb(f, vtj.TRANSIT_AUTO);
        this.b = cjtdVar;
    }

    @Override // defpackage.yyb
    public cqtd b() {
        return c;
    }

    @Override // defpackage.yyb
    public zvb c() {
        return this.a;
    }

    @Override // defpackage.yyb
    @dzsi
    public cjtd d() {
        return this.b;
    }
}
