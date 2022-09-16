package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint extends aopi implements aoqv {
    public static final YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint a;
    private static volatile aorb d;
    public static final aopg ypcGetOfflineUpsellEndpoint;
    public int b;
    public String c = "";

    static {
        YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint = new YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint();
        a = ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
        aopi.registerDefaultInstance(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint);
        ypcGetOfflineUpsellEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint, ypcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint, null, 133724106, aosj.MESSAGE, YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class);
    }

    private YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint() {
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
                return new YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.class) {
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
