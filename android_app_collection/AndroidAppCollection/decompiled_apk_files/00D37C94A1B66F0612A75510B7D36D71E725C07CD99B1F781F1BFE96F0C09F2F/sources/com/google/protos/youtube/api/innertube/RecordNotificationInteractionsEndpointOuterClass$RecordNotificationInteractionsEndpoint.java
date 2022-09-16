package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint extends aopi implements aoqv {
    public static final RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint a;
    private static volatile aorb d;
    public static final aopg recordNotificationInteractionsEndpoint;
    private int e;
    private byte f = 2;
    public aoob b = aoob.b;
    public aopu c = emptyProtobufList();

    static {
        RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint = new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
        a = recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
        aopi.registerDefaultInstance(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class, recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint);
        recordNotificationInteractionsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint, recordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint, null, 78414307, aosj.MESSAGE, RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class);
    }

    private RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ည\u0000\u0002Л", new Object[]{"e", "b", "c", apzg.class});
            case 3:
                return new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class) {
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
