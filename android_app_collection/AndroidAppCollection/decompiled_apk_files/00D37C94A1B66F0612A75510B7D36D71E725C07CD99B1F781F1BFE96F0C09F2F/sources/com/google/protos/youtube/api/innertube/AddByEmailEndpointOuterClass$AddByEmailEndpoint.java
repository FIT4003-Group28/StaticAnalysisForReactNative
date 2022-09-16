package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddByEmailEndpointOuterClass$AddByEmailEndpoint extends aopi implements aoqv {
    public static final AddByEmailEndpointOuterClass$AddByEmailEndpoint a;
    public static final aopg addByEmailEndpoint;
    private static volatile aorb b;

    static {
        AddByEmailEndpointOuterClass$AddByEmailEndpoint addByEmailEndpointOuterClass$AddByEmailEndpoint = new AddByEmailEndpointOuterClass$AddByEmailEndpoint();
        a = addByEmailEndpointOuterClass$AddByEmailEndpoint;
        aopi.registerDefaultInstance(AddByEmailEndpointOuterClass$AddByEmailEndpoint.class, addByEmailEndpointOuterClass$AddByEmailEndpoint);
        addByEmailEndpoint = aopi.newSingularGeneratedExtension(apzg.a, addByEmailEndpointOuterClass$AddByEmailEndpoint, addByEmailEndpointOuterClass$AddByEmailEndpoint, null, 161983468, aosj.MESSAGE, AddByEmailEndpointOuterClass$AddByEmailEndpoint.class);
    }

    private AddByEmailEndpointOuterClass$AddByEmailEndpoint() {
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
                return new AddByEmailEndpointOuterClass$AddByEmailEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (AddByEmailEndpointOuterClass$AddByEmailEndpoint.class) {
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
