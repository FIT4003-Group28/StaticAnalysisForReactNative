package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: vrq  reason: default package */
/* loaded from: classes7.dex */
public class vrq extends vrn {
    public vrq(Activity activity, List<dowm> list, boolean z, cjtd cjtdVar) {
        super(activity, vph.e(vpc.SANTIAGO, list), i(activity), z, cjtdVar);
    }

    private static dcdc<vqx> i(Activity activity) {
        return dcdc.k(new vqx(dowl.UNSET, activity.getString(pxo.SANTIAGO_PLATE_DAY)), j(activity, dowl.SANTIAGO_SELLO_VERDE_4_5, R.string.MONDAY), j(activity, dowl.SANTIAGO_SELLO_VERDE_6_7, R.string.TUESDAY), j(activity, dowl.SANTIAGO_SELLO_VERDE_8_9, R.string.WEDNESDAY), j(activity, dowl.SANTIAGO_SELLO_VERDE_0_1, R.string.THURSDAY), j(activity, dowl.SANTIAGO_SELLO_VERDE_2_3, R.string.FRIDAY));
    }

    private static vqx j(Activity activity, dowl dowlVar, int i) {
        return new vqx(dowlVar, activity.getString(R.string.ROTATION_PLATE_TYPE, new Object[]{activity.getString(i), vph.c(dowlVar).b(), vph.d(dowlVar).b()}));
    }
}
