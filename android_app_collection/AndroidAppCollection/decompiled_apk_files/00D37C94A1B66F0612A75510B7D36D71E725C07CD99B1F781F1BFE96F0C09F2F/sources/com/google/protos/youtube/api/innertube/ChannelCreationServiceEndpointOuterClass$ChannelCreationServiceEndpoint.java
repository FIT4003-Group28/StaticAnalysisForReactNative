package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint extends aopi implements aoqv {
    public static final ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint a;
    public static final aopg channelCreationServiceEndpoint;
    private static volatile aorb e;
    public int b;
    public awle d;
    private byte f = 2;
    public aoob c = aoob.b;

    static {
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = new ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint();
        a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
        aopi.registerDefaultInstance(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint);
        channelCreationServiceEndpoint = aopi.newSingularGeneratedExtension(apzg.a, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint, channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint, null, 75058710, aosj.MESSAGE, ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class);
    }

    private ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ည\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class) {
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
