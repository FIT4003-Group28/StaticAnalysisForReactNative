package defpackage;

import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yoc  reason: default package */
/* loaded from: classes7.dex */
enum yoc {
    CAR(drsm.DRIVE, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_CAR)),
    BICYCLE(drsm.BICYCLE, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_BICYCLE)),
    RICKSHAW(drsm.OFFLINE_TAXI, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_RICKSHAW)),
    RIDESHARE(drsm.ONLINE_TAXI, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_RIDESHARING)),
    TWO_WHEELER(drsm.TWO_WHEELER, Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_TWO_WHEELER));
    
    final Integer f;
    final drsm g;

    yoc(drsm drsmVar, Integer num) {
        this.g = drsmVar;
        this.f = num;
    }

    public static Set<yoc> a(dwbg dwbgVar) {
        EnumSet noneOf = EnumSet.noneOf(yoc.class);
        if (dwbgVar.f) {
            noneOf.add(BICYCLE);
        }
        if (dwbgVar.b) {
            noneOf.add(CAR);
        }
        if (dwbgVar.e) {
            noneOf.add(RIDESHARE);
        }
        if (dwbgVar.c) {
            noneOf.add(RICKSHAW);
        }
        if (dwbgVar.d) {
            noneOf.add(TWO_WHEELER);
        }
        return noneOf;
    }
}
