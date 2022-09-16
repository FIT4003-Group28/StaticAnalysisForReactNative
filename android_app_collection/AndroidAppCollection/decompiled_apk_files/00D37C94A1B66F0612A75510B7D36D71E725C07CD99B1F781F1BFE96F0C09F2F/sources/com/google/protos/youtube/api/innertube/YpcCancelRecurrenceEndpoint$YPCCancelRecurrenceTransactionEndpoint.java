package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint extends aopi implements aoqv {
    public static final YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint a;
    private static volatile aorb f;
    public static final aopg ypcCancelRecurrenceEndpoint;
    public awir d;
    private int g;
    public String b = "";
    public String c = "";
    public aoob e = aoob.b;

    static {
        YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint = new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
        a = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
        aopi.registerDefaultInstance(YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint);
        ypcCancelRecurrenceEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint, null, 88642421, aosj.MESSAGE, YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class);
    }

    private YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ည\u0003\u0004ဈ\u0001", new Object[]{"g", "b", "d", "e", "c"});
            case 3:
                return new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
