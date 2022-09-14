package defpackage;
/* compiled from: PG */
/* renamed from: bntu  reason: default package */
/* loaded from: classes.dex */
public final class bntu {
    private bntu() {
    }

    public static boolean a(bnuo bnuoVar, int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            return ((i == 4 || i == 5) && bnuoVar == bnuo.INDOOR_PASS) ? false : true;
        }
        bnuo bnuoVar2 = bnuo.UNDERLAY_PASS;
        int ordinal = bnuoVar.ordinal();
        return ordinal == 0 || ordinal == 13 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6 || ordinal == 7 || ordinal == 8;
    }
}
