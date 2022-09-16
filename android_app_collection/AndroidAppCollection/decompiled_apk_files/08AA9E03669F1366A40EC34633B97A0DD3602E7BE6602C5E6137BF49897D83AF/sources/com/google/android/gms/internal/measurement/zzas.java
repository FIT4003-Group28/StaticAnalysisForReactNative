package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
/* loaded from: classes.dex */
public final class zzas {
    public static final String VERSION = String.valueOf(GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE / NetstatsParserPatterns.NEW_TS_TO_MILLIS).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    public static final String zzvp;

    static {
        String valueOf = String.valueOf(VERSION);
        zzvp = valueOf.length() != 0 ? "ma".concat(valueOf) : new String("ma");
    }
}
