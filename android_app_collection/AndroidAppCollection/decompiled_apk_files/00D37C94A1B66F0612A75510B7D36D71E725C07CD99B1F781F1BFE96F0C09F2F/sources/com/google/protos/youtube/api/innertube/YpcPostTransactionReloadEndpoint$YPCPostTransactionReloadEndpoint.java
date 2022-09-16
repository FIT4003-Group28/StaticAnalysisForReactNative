package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint extends aopi implements aoqv {
    public static final YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint a;
    private static volatile aorb b;
    public static final aopg ypcPostTransactionReloadEndpoint;

    static {
        YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint ypcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint = new YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint();
        a = ypcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint;
        aopi.registerDefaultInstance(YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.class, ypcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint);
        ypcPostTransactionReloadEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint, ypcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint, null, 339342808, aosj.MESSAGE, YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.class);
    }

    private YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint() {
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
                return new YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.class) {
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
