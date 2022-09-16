package org.spongycastle.pqc.crypto.newhope;

import com.baidu.mapapi.UIMsg;
/* loaded from: classes2.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short barrett(short s) {
        int i = s & 65535;
        return (short) (i - (((i * 5) >>> 16) * UIMsg.k_event.MV_MAP_CACHEMANAGE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short montgomery(int i) {
        return (short) (((((i * QInv) & RMask) * UIMsg.k_event.MV_MAP_CACHEMANAGE) + i) >>> 18);
    }

    Reduce() {
    }
}
