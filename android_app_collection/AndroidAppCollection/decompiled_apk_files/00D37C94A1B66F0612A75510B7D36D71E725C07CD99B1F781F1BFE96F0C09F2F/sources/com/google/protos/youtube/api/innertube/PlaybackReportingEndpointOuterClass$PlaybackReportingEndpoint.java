package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint extends aopi implements aoqv {
    public static final PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint a;
    private static volatile aorb b;
    public static final aopg playbackReportingEndpoint;

    static {
        PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint playbackReportingEndpointOuterClass$PlaybackReportingEndpoint = new PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint();
        a = playbackReportingEndpointOuterClass$PlaybackReportingEndpoint;
        aopi.registerDefaultInstance(PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint.class, playbackReportingEndpointOuterClass$PlaybackReportingEndpoint);
        playbackReportingEndpoint = aopi.newSingularGeneratedExtension(apzg.a, playbackReportingEndpointOuterClass$PlaybackReportingEndpoint, playbackReportingEndpointOuterClass$PlaybackReportingEndpoint, null, 81465530, aosj.MESSAGE, PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint.class);
    }

    private PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint() {
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
                return new PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (PlaybackReportingEndpointOuterClass$PlaybackReportingEndpoint.class) {
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
