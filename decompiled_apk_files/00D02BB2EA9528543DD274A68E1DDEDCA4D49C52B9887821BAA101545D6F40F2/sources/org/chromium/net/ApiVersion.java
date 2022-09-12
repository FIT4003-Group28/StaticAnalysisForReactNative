package org.chromium.net;
/* compiled from: PG */
/* loaded from: classes7.dex */
public class ApiVersion {
    private static final int API_LEVEL = 13;
    private static final String CRONET_VERSION = "88.0.4314.2";
    private static final String LAST_CHANGE = "1a009f12c7d324e6474840aea484d24f036da051-refs/branch-heads/4314@{#3}";
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
        return "88.0.4314.2@1a009f12";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 13;
    }
}
