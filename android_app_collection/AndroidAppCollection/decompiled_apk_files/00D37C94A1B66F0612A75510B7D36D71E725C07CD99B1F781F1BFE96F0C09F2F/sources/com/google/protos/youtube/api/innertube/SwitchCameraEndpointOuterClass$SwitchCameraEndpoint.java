package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SwitchCameraEndpointOuterClass$SwitchCameraEndpoint extends aopi implements aoqv {
    public static final SwitchCameraEndpointOuterClass$SwitchCameraEndpoint a;
    private static volatile aorb b;
    public static final aopg switchCameraEndpoint;

    static {
        SwitchCameraEndpointOuterClass$SwitchCameraEndpoint switchCameraEndpointOuterClass$SwitchCameraEndpoint = new SwitchCameraEndpointOuterClass$SwitchCameraEndpoint();
        a = switchCameraEndpointOuterClass$SwitchCameraEndpoint;
        aopi.registerDefaultInstance(SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class, switchCameraEndpointOuterClass$SwitchCameraEndpoint);
        switchCameraEndpoint = aopi.newSingularGeneratedExtension(apzg.a, switchCameraEndpointOuterClass$SwitchCameraEndpoint, switchCameraEndpointOuterClass$SwitchCameraEndpoint, null, 142199568, aosj.MESSAGE, SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class);
    }

    private SwitchCameraEndpointOuterClass$SwitchCameraEndpoint() {
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
                return new SwitchCameraEndpointOuterClass$SwitchCameraEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class) {
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
