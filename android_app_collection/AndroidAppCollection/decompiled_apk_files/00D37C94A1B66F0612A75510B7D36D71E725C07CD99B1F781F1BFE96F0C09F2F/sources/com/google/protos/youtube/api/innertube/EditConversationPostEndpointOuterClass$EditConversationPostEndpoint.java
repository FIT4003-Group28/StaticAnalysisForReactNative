package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditConversationPostEndpointOuterClass$EditConversationPostEndpoint extends aopi implements aoqv {
    public static final EditConversationPostEndpointOuterClass$EditConversationPostEndpoint a;
    private static volatile aorb b;
    public static final aopg editConversationPostEndpoint;

    static {
        EditConversationPostEndpointOuterClass$EditConversationPostEndpoint editConversationPostEndpointOuterClass$EditConversationPostEndpoint = new EditConversationPostEndpointOuterClass$EditConversationPostEndpoint();
        a = editConversationPostEndpointOuterClass$EditConversationPostEndpoint;
        aopi.registerDefaultInstance(EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class, editConversationPostEndpointOuterClass$EditConversationPostEndpoint);
        editConversationPostEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editConversationPostEndpointOuterClass$EditConversationPostEndpoint, editConversationPostEndpointOuterClass$EditConversationPostEndpoint, null, 88564668, aosj.MESSAGE, EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class);
    }

    private EditConversationPostEndpointOuterClass$EditConversationPostEndpoint() {
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
                return new EditConversationPostEndpointOuterClass$EditConversationPostEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.class) {
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
