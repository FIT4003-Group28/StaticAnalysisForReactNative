package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint extends aopi implements aoqv {
    public static final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint a;
    private static volatile aorb d;
    public static final aopg ypcCompleteTransactionEndpoint;
    public aoob c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
        a = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
        aopi.registerDefaultInstance(YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint);
        ypcCompleteTransactionEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, null, 137730199, aosj.MESSAGE, YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class);
    }

    private YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint() {
        emptyProtobufList();
        this.c = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002", new Object[]{"e", "b", "c"});
            case 3:
                return new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class) {
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
