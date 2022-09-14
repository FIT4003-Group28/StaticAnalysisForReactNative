package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vrb  reason: default package */
/* loaded from: classes7.dex */
public class vrb extends vra {
    public vrb(cklf cklfVar, vpd vpdVar, btrm btrmVar, vre vreVar, gga ggaVar, dxio<bsvm> dxioVar, @dzsi Runnable runnable) {
        super(cklfVar, vpdVar, btrmVar, vreVar.a(dcdc.e(), false, cjtd.a(dtxx.e)), ggaVar, dxioVar, runnable, vpc.MANILA);
    }

    @Override // defpackage.vqw
    public Integer d() {
        return Integer.valueOf((int) R.string.MANILA_NUMBER_CODE_LICENSE_RESTRICTION_PROMO_TITLE);
    }

    @Override // defpackage.vqw
    public Integer e() {
        return Integer.valueOf((int) R.string.MANILA_NUMBER_CODE_LICENSE_RESTRICTION_PROMO_BODY);
    }

    @Override // defpackage.vra
    @dzsi
    protected final String i(dowl dowlVar) {
        dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        switch (dowlVar.ordinal()) {
            case 9:
                gga ggaVar = this.b;
                return ggaVar.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar.getString(R.string.MONDAY), 1, 2});
            case 10:
                gga ggaVar2 = this.b;
                return ggaVar2.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar2.getString(R.string.TUESDAY), 3, 4});
            case 11:
                gga ggaVar3 = this.b;
                return ggaVar3.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar3.getString(R.string.WEDNESDAY), 5, 6});
            case 12:
                gga ggaVar4 = this.b;
                return ggaVar4.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar4.getString(R.string.THURSDAY), 7, 8});
            case 13:
                gga ggaVar5 = this.b;
                return ggaVar5.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar5.getString(R.string.FRIDAY), 9, 0});
            default:
                return null;
        }
    }
}
