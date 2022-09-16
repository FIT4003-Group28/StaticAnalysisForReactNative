package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetPhotoEndpointOuterClass$GetPhotoEndpoint extends aopi implements aoqv {
    public static final GetPhotoEndpointOuterClass$GetPhotoEndpoint a;
    private static volatile aorb g;
    public static final aopg getPhotoEndpoint;
    public int b;
    public int c;
    public apok d;
    public ardn e;
    public arag f;
    private byte h = 2;

    static {
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint = new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
        a = getPhotoEndpointOuterClass$GetPhotoEndpoint;
        aopi.registerDefaultInstance(GetPhotoEndpointOuterClass$GetPhotoEndpoint.class, getPhotoEndpointOuterClass$GetPhotoEndpoint);
        getPhotoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, getPhotoEndpointOuterClass$GetPhotoEndpoint, getPhotoEndpointOuterClass$GetPhotoEndpoint, null, 99404607, aosj.MESSAGE, GetPhotoEndpointOuterClass$GetPhotoEndpoint.class);
    }

    private GetPhotoEndpointOuterClass$GetPhotoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", aqyp.t, "d", "e", "f"});
            case 3:
                return new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (GetPhotoEndpointOuterClass$GetPhotoEndpoint.class) {
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
