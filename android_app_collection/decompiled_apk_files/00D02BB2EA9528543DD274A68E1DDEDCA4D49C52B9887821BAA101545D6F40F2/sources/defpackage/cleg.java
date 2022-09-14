package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: cleg  reason: default package */
/* loaded from: classes5.dex */
public enum cleg {
    UNKNOWN_MOBILE_SUBTYPE,
    GPRS,
    EDGE,
    UMTS,
    CDMA,
    EVDO_0,
    EVDO_A,
    RTT,
    HSDPA,
    HSUPA,
    HSPA,
    IDEN,
    EVDO_B,
    LTE,
    EHRPD,
    HSPAP,
    GSM,
    TD_SCDMA,
    IWLAN,
    LTE_CA,
    COMBINED;
    
    public static final SparseArray<cleg> v;

    static {
        cleg clegVar = UNKNOWN_MOBILE_SUBTYPE;
        cleg clegVar2 = GPRS;
        cleg clegVar3 = EDGE;
        cleg clegVar4 = UMTS;
        cleg clegVar5 = CDMA;
        cleg clegVar6 = EVDO_0;
        cleg clegVar7 = EVDO_A;
        cleg clegVar8 = RTT;
        cleg clegVar9 = HSDPA;
        cleg clegVar10 = HSUPA;
        cleg clegVar11 = HSPA;
        cleg clegVar12 = IDEN;
        cleg clegVar13 = EVDO_B;
        cleg clegVar14 = LTE;
        cleg clegVar15 = EHRPD;
        cleg clegVar16 = HSPAP;
        cleg clegVar17 = GSM;
        cleg clegVar18 = TD_SCDMA;
        cleg clegVar19 = IWLAN;
        cleg clegVar20 = LTE_CA;
        SparseArray<cleg> sparseArray = new SparseArray<>();
        v = sparseArray;
        sparseArray.put(0, clegVar);
        sparseArray.put(1, clegVar2);
        sparseArray.put(2, clegVar3);
        sparseArray.put(3, clegVar4);
        sparseArray.put(4, clegVar5);
        sparseArray.put(5, clegVar6);
        sparseArray.put(6, clegVar7);
        sparseArray.put(7, clegVar8);
        sparseArray.put(8, clegVar9);
        sparseArray.put(9, clegVar10);
        sparseArray.put(10, clegVar11);
        sparseArray.put(11, clegVar12);
        sparseArray.put(12, clegVar13);
        sparseArray.put(13, clegVar14);
        sparseArray.put(14, clegVar15);
        sparseArray.put(15, clegVar16);
        sparseArray.put(16, clegVar17);
        sparseArray.put(17, clegVar18);
        sparseArray.put(18, clegVar19);
        sparseArray.put(19, clegVar20);
    }
}
