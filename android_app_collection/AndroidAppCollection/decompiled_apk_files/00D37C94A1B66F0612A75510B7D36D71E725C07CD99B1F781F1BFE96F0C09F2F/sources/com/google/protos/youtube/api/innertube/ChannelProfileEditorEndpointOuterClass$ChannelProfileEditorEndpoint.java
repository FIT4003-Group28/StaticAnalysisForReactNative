package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint extends aopi implements aoqv {
    public static final ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint a;
    private static volatile aorb b;
    public static final aopg channelProfileEditorEndpoint;

    static {
        ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint = new ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint();
        a = channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint;
        aopi.registerDefaultInstance(ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.class, channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint);
        channelProfileEditorEndpoint = aopi.newSingularGeneratedExtension(apzg.a, channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint, channelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint, null, 101493342, aosj.MESSAGE, ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.class);
    }

    private ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint() {
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
                return new ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.class) {
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
