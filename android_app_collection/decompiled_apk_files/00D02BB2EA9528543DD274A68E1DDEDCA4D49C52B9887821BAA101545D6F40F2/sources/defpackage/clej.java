package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: clej  reason: default package */
/* loaded from: classes5.dex */
public enum clej {
    DEFAULT,
    UNMETERED_ONLY,
    UNMETERED_OR_DAILY,
    FAST_IF_RADIO_AWAKE,
    NEVER,
    UNRECOGNIZED;
    
    private static final SparseArray<clej> g;

    static {
        clej clejVar = DEFAULT;
        clej clejVar2 = UNMETERED_ONLY;
        clej clejVar3 = UNMETERED_OR_DAILY;
        clej clejVar4 = FAST_IF_RADIO_AWAKE;
        clej clejVar5 = NEVER;
        clej clejVar6 = UNRECOGNIZED;
        SparseArray<clej> sparseArray = new SparseArray<>();
        g = sparseArray;
        sparseArray.put(0, clejVar);
        sparseArray.put(1, clejVar2);
        sparseArray.put(2, clejVar3);
        sparseArray.put(3, clejVar4);
        sparseArray.put(4, clejVar5);
        sparseArray.put(-1, clejVar6);
    }
}
