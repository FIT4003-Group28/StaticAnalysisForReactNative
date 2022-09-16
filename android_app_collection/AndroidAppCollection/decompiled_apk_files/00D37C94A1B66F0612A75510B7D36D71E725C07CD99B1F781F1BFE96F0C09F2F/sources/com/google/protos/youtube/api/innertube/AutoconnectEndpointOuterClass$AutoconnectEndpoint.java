package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoconnectEndpointOuterClass$AutoconnectEndpoint extends aopi implements aoqv {
    public static final AutoconnectEndpointOuterClass$AutoconnectEndpoint a;
    public static final aopg autoconnectEndpoint;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        AutoconnectEndpointOuterClass$AutoconnectEndpoint autoconnectEndpointOuterClass$AutoconnectEndpoint = new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
        a = autoconnectEndpointOuterClass$AutoconnectEndpoint;
        aopi.registerDefaultInstance(AutoconnectEndpointOuterClass$AutoconnectEndpoint.class, autoconnectEndpointOuterClass$AutoconnectEndpoint);
        autoconnectEndpoint = aopi.newSingularGeneratedExtension(apzg.a, autoconnectEndpointOuterClass$AutoconnectEndpoint, autoconnectEndpointOuterClass$AutoconnectEndpoint, null, 354181190, aosj.MESSAGE, AutoconnectEndpointOuterClass$AutoconnectEndpoint.class);
    }

    private AutoconnectEndpointOuterClass$AutoconnectEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (AutoconnectEndpointOuterClass$AutoconnectEndpoint.class) {
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
