package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LightweightCameraEndpointOuterClass$LightweightCameraEndpoint extends aopi implements aoqv {
    public static final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint a;
    private static volatile aorb g;
    public static final aopg lightweightCameraEndpoint;
    public int b;
    public int c;
    public apzg d;
    private byte h = 2;
    public aopu e = emptyProtobufList();
    public String f = "";

    static {
        LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
        a = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
        aopi.registerDefaultInstance(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint);
        lightweightCameraEndpoint = aopi.newSingularGeneratedExtension(apzg.a, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint, lightweightCameraEndpointOuterClass$LightweightCameraEndpoint, null, 139979438, aosj.MESSAGE, LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class);
    }

    private LightweightCameraEndpointOuterClass$LightweightCameraEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0002\u0002င\u0001\u0003ᐉ\u0002\u0005Л\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", aunb.class, "f"});
            case 3:
                return new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
