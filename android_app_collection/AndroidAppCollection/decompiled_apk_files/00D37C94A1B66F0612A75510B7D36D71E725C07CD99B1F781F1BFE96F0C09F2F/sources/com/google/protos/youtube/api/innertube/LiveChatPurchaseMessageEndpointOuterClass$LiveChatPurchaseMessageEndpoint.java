package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint extends aopi implements aoqv {
    public static final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint a;
    private static volatile aorb c;
    public static final aopg liveChatPurchaseMessageEndpoint;
    public aoob b = aoob.b;
    private int d;

    static {
        LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint = new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
        a = liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
        aopi.registerDefaultInstance(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint);
        liveChatPurchaseMessageEndpoint = aopi.newSingularGeneratedExtension(apzg.a, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint, null, 133030216, aosj.MESSAGE, LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class);
    }

    private LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "b"});
            case 3:
                return new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class) {
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
