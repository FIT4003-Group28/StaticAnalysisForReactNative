package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint extends aopi implements aoqv {
    public static final ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint a;
    private static volatile aorb b;
    public static final aopg connectionInviteUrlEndpoint;

    static {
        ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint = new ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint();
        a = connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint;
        aopi.registerDefaultInstance(ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.class, connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint);
        connectionInviteUrlEndpoint = aopi.newSingularGeneratedExtension(apzg.a, connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint, connectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint, null, 105643691, aosj.MESSAGE, ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.class);
    }

    private ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint() {
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
                return new ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.class) {
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
