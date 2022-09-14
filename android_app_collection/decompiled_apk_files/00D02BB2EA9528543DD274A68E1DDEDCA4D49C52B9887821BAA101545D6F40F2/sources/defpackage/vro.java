package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vro  reason: default package */
/* loaded from: classes7.dex */
public class vro extends vra {
    public vro(cklf cklfVar, vpd vpdVar, btrm btrmVar, vrr vrrVar, gga ggaVar, dxio<bsvm> dxioVar, @dzsi Runnable runnable) {
        super(cklfVar, vpdVar, btrmVar, vrrVar.a(dcdc.e(), false, cjtd.a(dtxx.e)), ggaVar, dxioVar, runnable, vpc.SANTIAGO);
    }

    @Override // defpackage.vqw
    public Integer d() {
        return Integer.valueOf(pxo.SANTIAGO_SELLO_VERDE_LICENSE_RESTRICTION_PROMO_TITLE);
    }

    @Override // defpackage.vqw
    public Integer e() {
        return Integer.valueOf(pxo.SANTIAGO_SELLO_VERDE_LICENSE_RESTRICTION_PROMO_BODY);
    }

    @Override // defpackage.vra
    @dzsi
    protected final String i(dowl dowlVar) {
        dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        switch (dowlVar.ordinal()) {
            case 14:
                gga ggaVar = this.b;
                return ggaVar.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar.getString(R.string.THURSDAY), 0, 1});
            case 15:
                gga ggaVar2 = this.b;
                return ggaVar2.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar2.getString(R.string.FRIDAY), 2, 3});
            case 16:
                gga ggaVar3 = this.b;
                return ggaVar3.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar3.getString(R.string.MONDAY), 4, 5});
            case 17:
                gga ggaVar4 = this.b;
                return ggaVar4.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar4.getString(R.string.TUESDAY), 6, 7});
            case 18:
                gga ggaVar5 = this.b;
                return ggaVar5.getString(R.string.ROTATION_LICENSE_RESTRICTION_PROMO_PLATE_SAVED, new Object[]{ggaVar5.getString(R.string.WEDNESDAY), 8, 9});
            default:
                return null;
        }
    }
}
