package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint extends aopi implements aoqv {
    public static final YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint a;
    private static volatile aorb c;
    public static final aopg ypcTipTransactionEndpoint;
    public String b = "";
    private int d;

    static {
        YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint = new YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint();
        a = ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint;
        aopi.registerDefaultInstance(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class, ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint);
        ypcTipTransactionEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint, ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint, null, 65099913, aosj.MESSAGE, YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class);
    }

    private YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class) {
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
