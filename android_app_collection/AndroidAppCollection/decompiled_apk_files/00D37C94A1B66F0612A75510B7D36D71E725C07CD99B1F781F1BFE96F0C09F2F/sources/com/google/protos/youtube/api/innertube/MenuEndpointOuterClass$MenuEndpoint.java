package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MenuEndpointOuterClass$MenuEndpoint extends aopi implements aoqv {
    public static final MenuEndpointOuterClass$MenuEndpoint a;
    private static volatile aorb d;
    public static final aopg menuEndpoint;
    public int b;
    public ates c;
    private byte e = 2;

    static {
        MenuEndpointOuterClass$MenuEndpoint menuEndpointOuterClass$MenuEndpoint = new MenuEndpointOuterClass$MenuEndpoint();
        a = menuEndpointOuterClass$MenuEndpoint;
        aopi.registerDefaultInstance(MenuEndpointOuterClass$MenuEndpoint.class, menuEndpointOuterClass$MenuEndpoint);
        menuEndpoint = aopi.newSingularGeneratedExtension(apzg.a, menuEndpointOuterClass$MenuEndpoint, menuEndpointOuterClass$MenuEndpoint, null, 98150882, aosj.MESSAGE, MenuEndpointOuterClass$MenuEndpoint.class);
    }

    private MenuEndpointOuterClass$MenuEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new MenuEndpointOuterClass$MenuEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (MenuEndpointOuterClass$MenuEndpoint.class) {
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
