package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vrh  reason: default package */
/* loaded from: classes7.dex */
public class vrh extends vra {
    public vrh(cklf cklfVar, vpd vpdVar, btrm btrmVar, vrk vrkVar, gga ggaVar, dxio<bsvm> dxioVar, @dzsi Runnable runnable) {
        super(cklfVar, vpdVar, btrmVar, vrkVar.a(dcdc.e(), false, cjtd.a(dtxx.e)), ggaVar, dxioVar, runnable, vpc.SAO_PAULO);
    }

    @Override // defpackage.vqw
    public Integer d() {
        return Integer.valueOf((int) R.string.RODIZIO_LICENSE_RESTRICTION_PROMO_TITLE);
    }

    @Override // defpackage.vqw
    public Integer e() {
        return Integer.valueOf((int) R.string.RODIZIO_LICENSE_RESTRICTION_PROMO_BODY);
    }

    @Override // defpackage.vra
    @dzsi
    protected final String i(dowl dowlVar) {
        dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        switch (dowlVar.ordinal()) {
            case 4:
                gga ggaVar = this.b;
                return ggaVar.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar.getString(R.string.MONDAY), 1, 2});
            case 5:
                gga ggaVar2 = this.b;
                return ggaVar2.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar2.getString(R.string.TUESDAY), 3, 4});
            case 6:
                gga ggaVar3 = this.b;
                return ggaVar3.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar3.getString(R.string.WEDNESDAY), 5, 6});
            case 7:
                gga ggaVar4 = this.b;
                return ggaVar4.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar4.getString(R.string.THURSDAY), 7, 8});
            case 8:
                gga ggaVar5 = this.b;
                return ggaVar5.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar5.getString(R.string.FRIDAY), 9, 0});
            default:
                return null;
        }
    }
}
