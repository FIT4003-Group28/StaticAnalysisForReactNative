package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: cyvr  reason: default package */
/* loaded from: classes5.dex */
public final class cyvr {
    public static EnumSet a(int i) {
        cygl cyglVar;
        switch (i - 1) {
            case 1:
                cyglVar = cygl.DEVICE;
                break;
            case 2:
            case 3:
                cyglVar = cygl.PAPI_AUTOCOMPLETE;
                break;
            case 4:
            case 5:
            case 6:
                cyglVar = cygl.PAPI_TOPN;
                break;
            case 7:
                cyglVar = cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID;
                break;
            default:
                cyglVar = cygl.UNKNOWN_PROVENANCE;
                break;
        }
        if (cyglVar == cygl.UNKNOWN_PROVENANCE) {
            return EnumSet.noneOf(cygl.class);
        }
        return EnumSet.of(cyglVar);
    }
}
