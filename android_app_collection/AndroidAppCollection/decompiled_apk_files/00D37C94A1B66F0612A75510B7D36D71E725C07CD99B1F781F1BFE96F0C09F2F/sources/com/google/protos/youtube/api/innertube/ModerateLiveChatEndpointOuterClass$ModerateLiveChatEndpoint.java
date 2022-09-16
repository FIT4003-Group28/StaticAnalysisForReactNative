package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint extends aopi implements aoqv {
    public static final ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint a;
    private static volatile aorb c;
    public static final aopg moderateLiveChatEndpoint;
    public aoob b = aoob.b;
    private int d;

    static {
        ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint = new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
        a = moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
        aopi.registerDefaultInstance(ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class, moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint);
        moderateLiveChatEndpoint = aopi.newSingularGeneratedExtension(apzg.a, moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint, moderateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint, null, 125606357, aosj.MESSAGE, ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class);
    }

    private ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint() {
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
                return new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class) {
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
