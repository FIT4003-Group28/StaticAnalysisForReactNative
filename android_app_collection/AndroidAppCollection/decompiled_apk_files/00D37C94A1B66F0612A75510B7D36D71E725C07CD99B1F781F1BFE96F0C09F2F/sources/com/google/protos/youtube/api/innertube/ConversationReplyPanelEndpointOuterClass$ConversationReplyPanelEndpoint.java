package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint extends aopi implements aoqv {
    public static final ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint a;
    private static volatile aorb b;
    public static final aopg conversationReplyPanelEndpoint;
    private int c;
    private aqie d;
    private byte e = 2;

    static {
        ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint = new ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint();
        a = conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;
        aopi.registerDefaultInstance(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.class, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint);
        conversationReplyPanelEndpoint = aopi.newSingularGeneratedExtension(apzg.a, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint, null, 71845583, aosj.MESSAGE, ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.class);
    }

    private ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.class) {
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
