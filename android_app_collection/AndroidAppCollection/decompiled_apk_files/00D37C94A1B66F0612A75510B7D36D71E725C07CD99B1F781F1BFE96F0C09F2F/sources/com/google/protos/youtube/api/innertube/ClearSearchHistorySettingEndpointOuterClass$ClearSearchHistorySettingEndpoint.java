package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint extends aopi implements aoqv {
    public static final ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint a;
    private static volatile aorb c;
    public static final aopg clearSearchHistorySettingEndpoint;
    public String b = "";
    private int d;

    static {
        ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint = new ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint();
        a = clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
        aopi.registerDefaultInstance(ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint);
        clearSearchHistorySettingEndpoint = aopi.newSingularGeneratedExtension(apzg.a, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint, null, 86611299, aosj.MESSAGE, ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class);
    }

    private ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
