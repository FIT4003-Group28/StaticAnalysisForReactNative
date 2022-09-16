package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint extends aopi implements aoqv {
    public static final MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint a;
    private static volatile aorb c;
    public static final aopg microphoneCaptureEndpoint;
    public boolean b;
    private int d;

    static {
        MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint = new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
        a = microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
        aopi.registerDefaultInstance(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class, microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint);
        microphoneCaptureEndpoint = aopi.newSingularGeneratedExtension(apzg.a, microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint, microphoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint, null, 142199843, aosj.MESSAGE, MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class);
    }

    private MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
            case 3:
                return new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class) {
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
