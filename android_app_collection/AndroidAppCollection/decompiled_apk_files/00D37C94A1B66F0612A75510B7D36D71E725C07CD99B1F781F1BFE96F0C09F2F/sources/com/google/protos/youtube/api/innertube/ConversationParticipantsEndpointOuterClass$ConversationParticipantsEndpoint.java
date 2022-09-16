package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint extends aopi implements aoqv {
    public static final ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint a;
    private static volatile aorb b;
    public static final aopg conversationParticipantsEndpoint;

    static {
        ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint = new ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint();
        a = conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint;
        aopi.registerDefaultInstance(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.class, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint);
        conversationParticipantsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint, null, 80296137, aosj.MESSAGE, ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.class);
    }

    private ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint() {
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
                return new ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.class) {
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
