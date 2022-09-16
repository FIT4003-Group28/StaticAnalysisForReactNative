package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint extends aopi implements aoqv {
    public static final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint a;
    private static volatile aorb h;
    public static final aopg ypcHandleTransactionEndpoint;
    public int b;
    public int f;
    public String c = "";
    public String d = "";
    public aoob e = aoob.b;
    public aopu g = aopi.emptyProtobufList();

    static {
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint = new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
        a = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
        aopi.registerDefaultInstance(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint);
        ypcHandleTransactionEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, null, 165047913, aosj.MESSAGE, YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class);
    }

    private YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဌ\u0003\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", avge.m, "g"});
            case 3:
                return new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
