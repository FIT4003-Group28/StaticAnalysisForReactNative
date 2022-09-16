package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint extends aopi implements aoqv {
    public static final GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint a;
    private static volatile aorb b;
    public static final aopg getScheduledBroadcastsEndpoint;
    private byte c = 2;

    static {
        GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint = new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
        a = getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
        aopi.registerDefaultInstance(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint);
        getScheduledBroadcastsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint, null, 147074744, aosj.MESSAGE, GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class);
    }

    private GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class) {
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
