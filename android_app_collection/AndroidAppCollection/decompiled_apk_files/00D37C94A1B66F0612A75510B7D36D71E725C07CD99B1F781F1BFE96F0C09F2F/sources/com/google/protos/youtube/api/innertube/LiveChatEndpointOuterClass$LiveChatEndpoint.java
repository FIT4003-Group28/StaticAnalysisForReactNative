package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatEndpointOuterClass$LiveChatEndpoint extends aopi implements aoqv {
    public static final LiveChatEndpointOuterClass$LiveChatEndpoint a;
    private static volatile aorb e;
    public static final aopg liveChatEndpoint;
    public int b;
    public assp d;
    private byte f = 2;
    public aoob c = aoob.b;

    static {
        LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = new LiveChatEndpointOuterClass$LiveChatEndpoint();
        a = liveChatEndpointOuterClass$LiveChatEndpoint;
        aopi.registerDefaultInstance(LiveChatEndpointOuterClass$LiveChatEndpoint.class, liveChatEndpointOuterClass$LiveChatEndpoint);
        liveChatEndpoint = aopi.newSingularGeneratedExtension(apzg.a, liveChatEndpointOuterClass$LiveChatEndpoint, liveChatEndpointOuterClass$LiveChatEndpoint, null, 132716540, aosj.MESSAGE, LiveChatEndpointOuterClass$LiveChatEndpoint.class);
    }

    private LiveChatEndpointOuterClass$LiveChatEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new LiveChatEndpointOuterClass$LiveChatEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (LiveChatEndpointOuterClass$LiveChatEndpoint.class) {
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
