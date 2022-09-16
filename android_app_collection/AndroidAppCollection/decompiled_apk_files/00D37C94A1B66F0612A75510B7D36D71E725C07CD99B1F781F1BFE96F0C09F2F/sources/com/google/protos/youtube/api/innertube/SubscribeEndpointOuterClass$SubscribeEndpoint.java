package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubscribeEndpointOuterClass$SubscribeEndpoint extends aopi implements aoqv {
    public static final SubscribeEndpointOuterClass$SubscribeEndpoint a;
    private static volatile aorb e;
    public static final aopg subscribeEndpoint;
    public aopu b = aopi.emptyProtobufList();
    public String c = "";
    public String d = "";
    private int f;

    static {
        SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = new SubscribeEndpointOuterClass$SubscribeEndpoint();
        a = subscribeEndpointOuterClass$SubscribeEndpoint;
        aopi.registerDefaultInstance(SubscribeEndpointOuterClass$SubscribeEndpoint.class, subscribeEndpointOuterClass$SubscribeEndpoint);
        subscribeEndpoint = aopi.newSingularGeneratedExtension(apzg.a, subscribeEndpointOuterClass$SubscribeEndpoint, subscribeEndpointOuterClass$SubscribeEndpoint, null, 68997349, aosj.MESSAGE, SubscribeEndpointOuterClass$SubscribeEndpoint.class);
    }

    private SubscribeEndpointOuterClass$SubscribeEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new SubscribeEndpointOuterClass$SubscribeEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (SubscribeEndpointOuterClass$SubscribeEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
