package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint extends aopi implements aoqv {
    public static final SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint a;
    private static volatile aorb c;
    public static final aopg sendLiveChatVoteEndpoint;
    public aoob b = aoob.b;
    private int d;

    static {
        SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint sendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint = new SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint();
        a = sendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint;
        aopi.registerDefaultInstance(SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class, sendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint);
        sendLiveChatVoteEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint, sendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint, null, 239906307, aosj.MESSAGE, SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class);
    }

    private SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint() {
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
                return new SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class) {
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
