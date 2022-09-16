package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PingingEndpointOuterClass$PingingEndpoint extends aopi implements aoqv {
    public static final PingingEndpointOuterClass$PingingEndpoint a;
    private static volatile aorb d;
    public static final aopg pingingEndpoint;
    public int b;
    public boolean c;

    static {
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint = new PingingEndpointOuterClass$PingingEndpoint();
        a = pingingEndpointOuterClass$PingingEndpoint;
        aopi.registerDefaultInstance(PingingEndpointOuterClass$PingingEndpoint.class, pingingEndpointOuterClass$PingingEndpoint);
        pingingEndpoint = aopi.newSingularGeneratedExtension(apzg.a, pingingEndpointOuterClass$PingingEndpoint, pingingEndpointOuterClass$PingingEndpoint, null, 98444775, aosj.MESSAGE, PingingEndpointOuterClass$PingingEndpoint.class);
    }

    private PingingEndpointOuterClass$PingingEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            case 3:
                return new PingingEndpointOuterClass$PingingEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (PingingEndpointOuterClass$PingingEndpoint.class) {
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
