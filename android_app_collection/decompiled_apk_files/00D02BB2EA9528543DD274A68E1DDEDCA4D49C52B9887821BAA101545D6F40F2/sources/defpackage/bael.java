package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bael  reason: default package */
/* loaded from: classes3.dex */
public final class bael {
    public static cqss a(baab baabVar) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ibm.L();
            }
            if (ordinal == 2) {
                return iva.b(ibl.X(), ibl.T());
            }
            return iva.b(ibl.ar(), cqrt.c(R.color.mod_google_cyan300));
        }
        return iva.b(cqrt.c(R.color.mod_google_pink600), ibl.ap());
    }

    public static cqtd b(baab baabVar) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        return cqrt.g(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? 2131232316 : 2131232431 : R.drawable.ic_want_to_go_black_24 : 2131232272, a(baabVar));
    }

    public static cqtd c() {
        return cqrt.g(R.drawable.ic_labeled_place_black_24, ibm.x());
    }

    public static jic d(baab baabVar) {
        return new jic((String) null, ckqc.FULLY_QUALIFIED, b(baabVar), 0);
    }
}
