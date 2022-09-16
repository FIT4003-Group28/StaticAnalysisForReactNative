package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FlagEndpointOuterClass$FlagEndpoint extends aopi implements aoqv {
    public static final FlagEndpointOuterClass$FlagEndpoint a;
    private static volatile aorb d;
    public static final aopg flagEndpoint;
    public String b = "";
    public int c;
    private int e;

    static {
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = new FlagEndpointOuterClass$FlagEndpoint();
        a = flagEndpointOuterClass$FlagEndpoint;
        aopi.registerDefaultInstance(FlagEndpointOuterClass$FlagEndpoint.class, flagEndpointOuterClass$FlagEndpoint);
        flagEndpoint = aopi.newSingularGeneratedExtension(apzg.a, flagEndpointOuterClass$FlagEndpoint, flagEndpointOuterClass$FlagEndpoint, null, 76638993, aosj.MESSAGE, FlagEndpointOuterClass$FlagEndpoint.class);
    }

    private FlagEndpointOuterClass$FlagEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002", new Object[]{"e", "b", "c", aqyp.a});
            case 3:
                return new FlagEndpointOuterClass$FlagEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (FlagEndpointOuterClass$FlagEndpoint.class) {
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
