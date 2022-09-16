package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoManagerEndpointOuterClass$VideoManagerEndpoint extends aopi implements aoqv {
    public static final VideoManagerEndpointOuterClass$VideoManagerEndpoint a;
    private static volatile aorb b;
    public static final aopg videoManagerEndpoint;

    static {
        VideoManagerEndpointOuterClass$VideoManagerEndpoint videoManagerEndpointOuterClass$VideoManagerEndpoint = new VideoManagerEndpointOuterClass$VideoManagerEndpoint();
        a = videoManagerEndpointOuterClass$VideoManagerEndpoint;
        aopi.registerDefaultInstance(VideoManagerEndpointOuterClass$VideoManagerEndpoint.class, videoManagerEndpointOuterClass$VideoManagerEndpoint);
        videoManagerEndpoint = aopi.newSingularGeneratedExtension(apzg.a, videoManagerEndpointOuterClass$VideoManagerEndpoint, videoManagerEndpointOuterClass$VideoManagerEndpoint, null, 80252293, aosj.MESSAGE, VideoManagerEndpointOuterClass$VideoManagerEndpoint.class);
    }

    private VideoManagerEndpointOuterClass$VideoManagerEndpoint() {
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
                return new VideoManagerEndpointOuterClass$VideoManagerEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (VideoManagerEndpointOuterClass$VideoManagerEndpoint.class) {
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
