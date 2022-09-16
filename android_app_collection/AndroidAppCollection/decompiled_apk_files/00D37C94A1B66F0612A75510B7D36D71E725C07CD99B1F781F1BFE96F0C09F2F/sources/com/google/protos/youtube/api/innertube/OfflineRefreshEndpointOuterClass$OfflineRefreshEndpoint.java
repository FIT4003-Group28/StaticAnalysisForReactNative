package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint extends aopi implements aoqv {
    public static final OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint a;
    private static volatile aorb b;
    public static final aopg offlineRefreshEndpoint;

    static {
        OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint = new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
        a = offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
        aopi.registerDefaultInstance(OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class, offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint);
        offlineRefreshEndpoint = aopi.newSingularGeneratedExtension(apzg.a, offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint, offlineRefreshEndpointOuterClass$OfflineRefreshEndpoint, null, 140507150, aosj.MESSAGE, OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class);
    }

    private OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
