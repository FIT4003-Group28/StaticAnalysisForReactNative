package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: baam  reason: default package */
/* loaded from: classes3.dex */
public final class baam {
    public static int a(baab baabVar) {
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2131231623;
            }
            return ordinal != 2 ? 2131232750 : 2131231730;
        }
        return 2131231630;
    }

    public static int b(baab baabVar) {
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? R.color.place_list_custom : R.color.place_list_starred : R.color.place_list_want_to_go : R.color.place_list_favorites;
    }

    public static cqss c(baab baabVar) {
        return cqrt.c(b(baabVar));
    }

    public static cqtd d(baab baabVar) {
        return cqrt.g(a(baabVar), c(baabVar));
    }

    public static jic e(baab baabVar) {
        return new jic((String) null, ckqc.FULLY_QUALIFIED, d(baabVar), 0);
    }
}
