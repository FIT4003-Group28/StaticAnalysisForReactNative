package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint extends aopi implements aoqv {
    public static final ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint a;
    public static final aopg channelCreationFormEndpoint;
    private static volatile aorb e;
    public int b;
    public aoob c = aoob.b;
    public int d;

    static {
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = new ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint();
        a = channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
        aopi.registerDefaultInstance(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint);
        channelCreationFormEndpoint = aopi.newSingularGeneratedExtension(apzg.a, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint, null, 77125633, aosj.MESSAGE, ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class);
    }

    private ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0000\u0003ဌ\u0001", new Object[]{"b", "c", "d", apog.l});
            case 3:
                return new ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class) {
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
