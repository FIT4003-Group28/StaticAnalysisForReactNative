package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddPlaceEndpointOuterClass$AddPlaceEndpoint extends aopi implements aoqv {
    public static final AddPlaceEndpointOuterClass$AddPlaceEndpoint a;
    public static final aopg addPlaceEndpoint;
    private static volatile aorb e;
    public int b;
    public arag d;
    private arag f;
    private byte g = 2;
    public String c = "";

    static {
        AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint = new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
        a = addPlaceEndpointOuterClass$AddPlaceEndpoint;
        aopi.registerDefaultInstance(AddPlaceEndpointOuterClass$AddPlaceEndpoint.class, addPlaceEndpointOuterClass$AddPlaceEndpoint);
        addPlaceEndpoint = aopi.newSingularGeneratedExtension(apzg.a, addPlaceEndpointOuterClass$AddPlaceEndpoint, addPlaceEndpointOuterClass$AddPlaceEndpoint, null, 153675053, aosj.MESSAGE, AddPlaceEndpointOuterClass$AddPlaceEndpoint.class);
    }

    private AddPlaceEndpointOuterClass$AddPlaceEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (AddPlaceEndpointOuterClass$AddPlaceEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
