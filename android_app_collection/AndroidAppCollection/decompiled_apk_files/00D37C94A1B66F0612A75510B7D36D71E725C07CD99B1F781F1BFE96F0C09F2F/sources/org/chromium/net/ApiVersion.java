package org.chromium.net;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ApiVersion {
    private static final int API_LEVEL = 14;
    private static final String CRONET_VERSION = "94.0.4602.6";
    private static final String LAST_CHANGE = "8bbe1060c9428057eb5c24979fa83a2189fb8997-refs/branch-heads/4602@{#11}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "94.0.4602.6@8bbe1060";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 14;
    }
}
