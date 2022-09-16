package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint extends aopi implements aoqv {
    public static final LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint a;
    private static volatile aorb c;
    public static final aopg liveChatItemContextMenuEndpoint;
    public aoob b = aoob.b;
    private int d;

    static {
        LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint = new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
        a = liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
        aopi.registerDefaultInstance(LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class, liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint);
        liveChatItemContextMenuEndpoint = aopi.newSingularGeneratedExtension(apzg.a, liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint, liveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint, null, 122458429, aosj.MESSAGE, LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class);
    }

    private LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint() {
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
                return new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class) {
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
