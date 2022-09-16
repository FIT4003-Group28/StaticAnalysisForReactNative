package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint extends aopi implements aoqv {
    public static final EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint a;
    private static volatile aorb b;
    public static final aopg editConversationNameEntryEndpoint;
    private int c;
    private aqsh d;
    private byte e = 2;

    static {
        EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint = new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
        a = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
        aopi.registerDefaultInstance(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint);
        editConversationNameEntryEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint, null, 127156142, aosj.MESSAGE, EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class);
    }

    private EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class) {
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
