package com.google.android.gms.common.api;

import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class zzc {
    private static final Map<Object, zzc> zzdo = new WeakHashMap();
    private static final Object sLock = new Object();

    public abstract void remove(int i);
}
