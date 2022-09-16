package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint extends aopi implements aoqv {
    public static final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint a;
    private static volatile aorb g;
    public static final aopg notificationOptOutEndpoint;
    public int b;
    public arag d;
    public aoob e;
    public aopu f;
    private arag h;
    private byte i = 2;
    public aoob c = aoob.b;

    static {
        NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
        a = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
        aopi.registerDefaultInstance(NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint);
        notificationOptOutEndpoint = aopi.newSingularGeneratedExtension(apzg.a, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint, notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint, null, 65091333, aosj.MESSAGE, NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class);
    }

    private NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint() {
        emptyProtobufList();
        this.e = aoob.b;
        this.f = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0003\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0000\bည\u0004\tЛ", new Object[]{"b", "h", "d", "c", "e", "f", apzg.class});
            case 3:
                return new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
