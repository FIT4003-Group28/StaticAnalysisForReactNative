package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yng  reason: default package */
/* loaded from: classes7.dex */
public final class yng {
    private static final dcqe a = dcqe.c("yng");

    public static int a(dqvb dqvbVar) {
        dqvb dqvbVar2 = dqvb.TRANSIT_BEST;
        int ordinal = dqvbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return R.string.DIRECTIONS_TRANSIT_OPTIONS_ROUTES_SORTING_FEWER_TRANSFERS;
            }
            if (ordinal == 2) {
                return R.string.DIRECTIONS_TRANSIT_OPTIONS_ROUTES_SORTING_LESS_WALKINS;
            }
            if (ordinal == 3) {
                return R.string.DIRECTIONS_TRANSIT_OPTIONS_ROUTES_SORTING_PREFER_ACCESSIBLE;
            }
            if (ordinal == 4) {
                return R.string.DIRECTIONS_TRANSIT_OPTIONS_ROUTES_SORTING_PREFER_LOWEST_COST;
            }
            bvoo.h("Missing string for TransitScoringPreference = %d", Integer.valueOf(dqvbVar.f));
            return 0;
        }
        return R.string.DIRECTIONS_TRANSIT_OPTIONS_ROUTES_SORTING_BEST_ROUTE;
    }
}
