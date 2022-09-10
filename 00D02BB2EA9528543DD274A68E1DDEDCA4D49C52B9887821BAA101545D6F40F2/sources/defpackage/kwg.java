package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: kwg  reason: default package */
/* loaded from: classes7.dex */
public final class kwg implements akpn {
    private static final dcqe a = dcqe.c("kwg");

    @Override // defpackage.akpn
    public final int a(akps akpsVar, int i) {
        if (akpsVar == akps.NORMAL) {
            return R.drawable.car_only_pin;
        }
        bvoo.h("Got an unexpected PinType: %s", akpsVar);
        return R.drawable.car_only_pin;
    }

    @Override // defpackage.akpn
    public final int b(int i, boolean z) {
        if (i == 0 || !z) {
            return R.drawable.car_only_regular_measle;
        }
        switch (i) {
            case 1:
                return R.drawable.car_only_ordinal_measle_1;
            case 2:
                return R.drawable.car_only_ordinal_measle_2;
            case 3:
                return R.drawable.car_only_ordinal_measle_3;
            case 4:
                return R.drawable.car_only_ordinal_measle_4;
            case 5:
                return R.drawable.car_only_ordinal_measle_5;
            case 6:
                return R.drawable.car_only_ordinal_measle_6;
            case 7:
                return R.drawable.car_only_ordinal_measle_7;
            case 8:
                return R.drawable.car_only_ordinal_measle_8;
            case 9:
                return R.drawable.car_only_ordinal_measle_9;
            case 10:
                return R.drawable.car_only_ordinal_measle_10;
            default:
                return R.drawable.car_only_ordinal_measle;
        }
    }

    @Override // defpackage.akpn
    public final int c() {
        return R.drawable.car_only_empty;
    }
}
