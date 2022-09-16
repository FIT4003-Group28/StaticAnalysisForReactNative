package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint extends aopi implements aoqv {
    public static final ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint a;
    private static volatile aorb b;
    public static final aopg conversationWithReplyEndpoint;
    private int c;
    private aqih d;
    private byte e = 2;

    static {
        ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint = new ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint();
        a = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
        aopi.registerDefaultInstance(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint);
        conversationWithReplyEndpoint = aopi.newSingularGeneratedExtension(apzg.a, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint, null, 96329534, aosj.MESSAGE, ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class);
    }

    private ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"c", "d"});
            case 3:
                return new ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class) {
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
