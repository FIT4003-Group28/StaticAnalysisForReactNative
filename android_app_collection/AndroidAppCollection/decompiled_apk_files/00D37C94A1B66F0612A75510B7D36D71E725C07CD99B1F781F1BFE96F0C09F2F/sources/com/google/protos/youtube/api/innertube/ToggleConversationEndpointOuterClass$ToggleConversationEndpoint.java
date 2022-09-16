package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ToggleConversationEndpointOuterClass$ToggleConversationEndpoint extends aopi implements aoqv {
    public static final ToggleConversationEndpointOuterClass$ToggleConversationEndpoint a;
    private static volatile aorb c;
    public static final aopg toggleConversationEndpoint;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        ToggleConversationEndpointOuterClass$ToggleConversationEndpoint toggleConversationEndpointOuterClass$ToggleConversationEndpoint = new ToggleConversationEndpointOuterClass$ToggleConversationEndpoint();
        a = toggleConversationEndpointOuterClass$ToggleConversationEndpoint;
        aopi.registerDefaultInstance(ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class, toggleConversationEndpointOuterClass$ToggleConversationEndpoint);
        toggleConversationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, toggleConversationEndpointOuterClass$ToggleConversationEndpoint, toggleConversationEndpointOuterClass$ToggleConversationEndpoint, null, 131184017, aosj.MESSAGE, ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class);
    }

    private ToggleConversationEndpointOuterClass$ToggleConversationEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", apzg.class});
            case 3:
                return new ToggleConversationEndpointOuterClass$ToggleConversationEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.class) {
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
