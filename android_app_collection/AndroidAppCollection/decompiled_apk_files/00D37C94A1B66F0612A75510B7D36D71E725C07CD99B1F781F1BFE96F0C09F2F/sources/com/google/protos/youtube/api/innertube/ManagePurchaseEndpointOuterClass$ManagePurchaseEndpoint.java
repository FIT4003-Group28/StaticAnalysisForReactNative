package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint extends aopi implements aoqv {
    public static final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint a;
    private static volatile aorb c;
    public static final aopg managePurchaseEndpoint;
    public aszj b;
    private int d;
    private byte e = 2;

    static {
        ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint = new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
        a = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
        aopi.registerDefaultInstance(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class, managePurchaseEndpointOuterClass$ManagePurchaseEndpoint);
        managePurchaseEndpoint = aopi.newSingularGeneratedExtension(apzg.a, managePurchaseEndpointOuterClass$ManagePurchaseEndpoint, managePurchaseEndpointOuterClass$ManagePurchaseEndpoint, null, 95591119, aosj.MESSAGE, ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class);
    }

    private ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class) {
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
