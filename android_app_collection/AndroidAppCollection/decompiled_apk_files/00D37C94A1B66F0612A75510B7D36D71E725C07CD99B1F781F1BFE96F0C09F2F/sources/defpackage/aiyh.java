package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aiyh  reason: default package */
/* loaded from: classes.dex */
public enum aiyh {
    UNKNOWN,
    OFF,
    ON,
    ON_RECOMMENDED;
    
    public static final Map e;
    public static final Map f;

    static {
        aiyh aiyhVar = UNKNOWN;
        aiyh aiyhVar2 = OFF;
        aiyh aiyhVar3 = ON;
        aiyh aiyhVar4 = ON_RECOMMENDED;
        HashMap hashMap = new HashMap();
        hashMap.put(apps.CAPTIONS_INITIAL_STATE_UNKNOWN, aiyhVar);
        hashMap.put(apps.CAPTIONS_INITIAL_STATE_ON_REQUIRED, aiyhVar3);
        hashMap.put(apps.CAPTIONS_INITIAL_STATE_ON_RECOMMENDED, aiyhVar4);
        hashMap.put(apps.CAPTIONS_INITIAL_STATE_OFF_REQUIRED, aiyhVar2);
        hashMap.put(apps.CAPTIONS_INITIAL_STATE_OFF_RECOMMENDED, aiyhVar);
        f = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(atzp.UNKNOWN, aiyhVar);
        hashMap2.put(atzp.ON, aiyhVar3);
        hashMap2.put(atzp.OFF, aiyhVar2);
        hashMap2.put(atzp.ON_WEAK, aiyhVar);
        hashMap2.put(atzp.OFF_WEAK, aiyhVar);
        hashMap2.put(atzp.FORCED_ON, aiyhVar3);
        e = Collections.unmodifiableMap(hashMap2);
    }
}
