package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint extends aopi implements aoqv {
    public static final ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint a;
    private static volatile aorb b;
    public static final aopg resumeWatchHistoryEndpoint;
    private byte c = 2;

    static {
        ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint = new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
        a = resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint;
        aopi.registerDefaultInstance(ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class, resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint);
        resumeWatchHistoryEndpoint = aopi.newSingularGeneratedExtension(apzg.a, resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint, resumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint, null, 63121560, aosj.MESSAGE, ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class);
    }

    private ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class) {
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
