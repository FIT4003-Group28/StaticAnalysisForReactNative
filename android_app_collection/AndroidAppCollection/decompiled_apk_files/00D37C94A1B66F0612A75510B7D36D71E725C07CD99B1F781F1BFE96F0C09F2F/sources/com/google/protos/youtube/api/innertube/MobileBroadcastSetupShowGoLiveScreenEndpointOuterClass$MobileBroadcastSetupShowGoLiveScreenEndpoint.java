package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint extends aopi implements aoqv {
    public static final MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint a;
    private static volatile aorb d;
    public static final aopg mobileBroadcastSetupShowGoLiveScreenEndpoint;
    public String b = "";
    public String c = "";
    private int e;

    static {
        MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint mobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint = new MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint();
        a = mobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
        aopi.registerDefaultInstance(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.class, mobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint);
        mobileBroadcastSetupShowGoLiveScreenEndpoint = aopi.newSingularGeneratedExtension(apzg.a, mobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint, mobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint, null, 127759225, aosj.MESSAGE, MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.class);
    }

    private MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဈ\u0001", new Object[]{"e", "c", "b"});
            case 3:
                return new MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
