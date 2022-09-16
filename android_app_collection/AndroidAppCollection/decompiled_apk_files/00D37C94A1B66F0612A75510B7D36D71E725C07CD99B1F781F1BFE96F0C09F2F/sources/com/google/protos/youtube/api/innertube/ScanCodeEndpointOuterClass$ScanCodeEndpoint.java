package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ScanCodeEndpointOuterClass$ScanCodeEndpoint extends aopi implements aoqv {
    public static final ScanCodeEndpointOuterClass$ScanCodeEndpoint a;
    private static volatile aorb b;
    public static final aopg scanCodeEndpoint;

    static {
        ScanCodeEndpointOuterClass$ScanCodeEndpoint scanCodeEndpointOuterClass$ScanCodeEndpoint = new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
        a = scanCodeEndpointOuterClass$ScanCodeEndpoint;
        aopi.registerDefaultInstance(ScanCodeEndpointOuterClass$ScanCodeEndpoint.class, scanCodeEndpointOuterClass$ScanCodeEndpoint);
        scanCodeEndpoint = aopi.newSingularGeneratedExtension(apzg.a, scanCodeEndpointOuterClass$ScanCodeEndpoint, scanCodeEndpointOuterClass$ScanCodeEndpoint, null, 159170544, aosj.MESSAGE, ScanCodeEndpointOuterClass$ScanCodeEndpoint.class);
    }

    private ScanCodeEndpointOuterClass$ScanCodeEndpoint() {
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
                return new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ScanCodeEndpointOuterClass$ScanCodeEndpoint.class) {
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
