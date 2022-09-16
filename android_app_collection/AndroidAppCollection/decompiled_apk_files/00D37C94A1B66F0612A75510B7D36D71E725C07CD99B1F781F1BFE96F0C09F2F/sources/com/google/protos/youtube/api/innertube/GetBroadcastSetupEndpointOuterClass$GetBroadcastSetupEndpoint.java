package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint extends aopi implements aoqv {
    public static final GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint a;
    private static volatile aorb c;
    public static final aopg getBroadcastSetupEndpoint;
    public String b = "";
    private int d;

    static {
        GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint = new GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint();
        a = getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
        aopi.registerDefaultInstance(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class, getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint);
        getBroadcastSetupEndpoint = aopi.newSingularGeneratedExtension(apzg.a, getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint, getBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint, null, 147869735, aosj.MESSAGE, GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class);
    }

    private GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
            case 3:
                return new GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class) {
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
