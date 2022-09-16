package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint extends aopi implements aoqv {
    public static final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a;
    private static volatile aorb b;
    public static final aopg pauseWatchHistoryEndpoint;
    private byte c = 2;

    static {
        PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint = new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
        a = pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint;
        aopi.registerDefaultInstance(PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint);
        pauseWatchHistoryEndpoint = aopi.newSingularGeneratedExtension(apzg.a, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint, null, 63121553, aosj.MESSAGE, PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class);
    }

    private PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint() {
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
                return new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class) {
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
