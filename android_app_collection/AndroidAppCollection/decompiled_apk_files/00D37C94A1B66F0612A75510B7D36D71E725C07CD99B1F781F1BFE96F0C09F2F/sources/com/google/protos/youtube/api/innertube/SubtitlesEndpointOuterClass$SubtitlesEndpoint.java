package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubtitlesEndpointOuterClass$SubtitlesEndpoint extends aopi implements aoqv {
    public static final SubtitlesEndpointOuterClass$SubtitlesEndpoint a;
    private static volatile aorb b;
    public static final aopg subtitlesEndpoint;

    static {
        SubtitlesEndpointOuterClass$SubtitlesEndpoint subtitlesEndpointOuterClass$SubtitlesEndpoint = new SubtitlesEndpointOuterClass$SubtitlesEndpoint();
        a = subtitlesEndpointOuterClass$SubtitlesEndpoint;
        aopi.registerDefaultInstance(SubtitlesEndpointOuterClass$SubtitlesEndpoint.class, subtitlesEndpointOuterClass$SubtitlesEndpoint);
        subtitlesEndpoint = aopi.newSingularGeneratedExtension(apzg.a, subtitlesEndpointOuterClass$SubtitlesEndpoint, subtitlesEndpointOuterClass$SubtitlesEndpoint, null, 105751339, aosj.MESSAGE, SubtitlesEndpointOuterClass$SubtitlesEndpoint.class);
    }

    private SubtitlesEndpointOuterClass$SubtitlesEndpoint() {
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
                return new SubtitlesEndpointOuterClass$SubtitlesEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (SubtitlesEndpointOuterClass$SubtitlesEndpoint.class) {
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
