package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint extends aopi implements aoqv {
    public static final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint a;
    private static volatile aorb d;
    public static final aopg mdxPlaybackEndpoint;
    public int b;
    public atdp c;

    static {
        MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
        a = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
        aopi.registerDefaultInstance(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint);
        mdxPlaybackEndpoint = aopi.newSingularGeneratedExtension(apzg.a, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint, null, 164988379, aosj.MESSAGE, MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class);
    }

    private MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
