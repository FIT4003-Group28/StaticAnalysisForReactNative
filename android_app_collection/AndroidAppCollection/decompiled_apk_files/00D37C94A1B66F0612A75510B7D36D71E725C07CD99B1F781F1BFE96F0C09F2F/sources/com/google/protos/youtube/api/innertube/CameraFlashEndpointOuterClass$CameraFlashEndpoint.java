package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraFlashEndpointOuterClass$CameraFlashEndpoint extends aopi implements aoqv {
    public static final CameraFlashEndpointOuterClass$CameraFlashEndpoint a;
    private static volatile aorb c;
    public static final aopg cameraFlashEndpoint;
    public boolean b;
    private int d;

    static {
        CameraFlashEndpointOuterClass$CameraFlashEndpoint cameraFlashEndpointOuterClass$CameraFlashEndpoint = new CameraFlashEndpointOuterClass$CameraFlashEndpoint();
        a = cameraFlashEndpointOuterClass$CameraFlashEndpoint;
        aopi.registerDefaultInstance(CameraFlashEndpointOuterClass$CameraFlashEndpoint.class, cameraFlashEndpointOuterClass$CameraFlashEndpoint);
        cameraFlashEndpoint = aopi.newSingularGeneratedExtension(apzg.a, cameraFlashEndpointOuterClass$CameraFlashEndpoint, cameraFlashEndpointOuterClass$CameraFlashEndpoint, null, 142202467, aosj.MESSAGE, CameraFlashEndpointOuterClass$CameraFlashEndpoint.class);
    }

    private CameraFlashEndpointOuterClass$CameraFlashEndpoint() {
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
                return new CameraFlashEndpointOuterClass$CameraFlashEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (CameraFlashEndpointOuterClass$CameraFlashEndpoint.class) {
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
