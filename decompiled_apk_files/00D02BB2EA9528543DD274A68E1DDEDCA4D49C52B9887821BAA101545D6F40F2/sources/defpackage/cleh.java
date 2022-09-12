package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: cleh  reason: default package */
/* loaded from: classes5.dex */
public enum cleh {
    MOBILE,
    WIFI,
    MOBILE_MMS,
    MOBILE_SUPL,
    MOBILE_DUN,
    MOBILE_HIPRI,
    WIMAX,
    BLUETOOTH,
    DUMMY,
    ETHERNET,
    MOBILE_FOTA,
    MOBILE_IMS,
    MOBILE_CBS,
    WIFI_P2P,
    MOBILE_IA,
    MOBILE_EMERGENCY,
    PROXY,
    VPN,
    NONE;
    
    public static final SparseArray<cleh> t;

    static {
        cleh clehVar = MOBILE;
        cleh clehVar2 = WIFI;
        cleh clehVar3 = MOBILE_MMS;
        cleh clehVar4 = MOBILE_SUPL;
        cleh clehVar5 = MOBILE_DUN;
        cleh clehVar6 = MOBILE_HIPRI;
        cleh clehVar7 = WIMAX;
        cleh clehVar8 = BLUETOOTH;
        cleh clehVar9 = DUMMY;
        cleh clehVar10 = ETHERNET;
        cleh clehVar11 = MOBILE_FOTA;
        cleh clehVar12 = MOBILE_IMS;
        cleh clehVar13 = MOBILE_CBS;
        cleh clehVar14 = WIFI_P2P;
        cleh clehVar15 = MOBILE_IA;
        cleh clehVar16 = MOBILE_EMERGENCY;
        cleh clehVar17 = PROXY;
        cleh clehVar18 = VPN;
        cleh clehVar19 = NONE;
        SparseArray<cleh> sparseArray = new SparseArray<>();
        t = sparseArray;
        sparseArray.put(0, clehVar);
        sparseArray.put(1, clehVar2);
        sparseArray.put(2, clehVar3);
        sparseArray.put(3, clehVar4);
        sparseArray.put(4, clehVar5);
        sparseArray.put(5, clehVar6);
        sparseArray.put(6, clehVar7);
        sparseArray.put(7, clehVar8);
        sparseArray.put(8, clehVar9);
        sparseArray.put(9, clehVar10);
        sparseArray.put(10, clehVar11);
        sparseArray.put(11, clehVar12);
        sparseArray.put(12, clehVar13);
        sparseArray.put(13, clehVar14);
        sparseArray.put(14, clehVar15);
        sparseArray.put(15, clehVar16);
        sparseArray.put(16, clehVar17);
        sparseArray.put(17, clehVar18);
        sparseArray.put(-1, clehVar19);
    }
}
