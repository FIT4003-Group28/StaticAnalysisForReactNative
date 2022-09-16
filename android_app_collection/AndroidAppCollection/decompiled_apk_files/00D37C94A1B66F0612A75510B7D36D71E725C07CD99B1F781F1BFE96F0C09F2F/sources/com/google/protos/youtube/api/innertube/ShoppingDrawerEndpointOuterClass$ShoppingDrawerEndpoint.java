package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint extends aopi implements aoqv {
    public static final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint a;
    private static volatile aorb d;
    public static final aopg shoppingDrawerEndpoint;
    public int b;
    public int c;
    private int e;

    static {
        ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint = new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
        a = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
        aopi.registerDefaultInstance(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint);
        shoppingDrawerEndpoint = aopi.newSingularGeneratedExtension(apzg.a, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint, null, 154446441, aosj.MESSAGE, ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class);
    }

    private ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"e", "b", aupm.s, "c"});
            case 3:
                return new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
