package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint extends aopi implements aoqv {
    public static final AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint a;
    public static final aopg addUpcomingEventReminderEndpoint;
    private static volatile aorb c;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint = new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
        a = addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
        aopi.registerDefaultInstance(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class, addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint);
        addUpcomingEventReminderEndpoint = aopi.newSingularGeneratedExtension(apzg.a, addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint, addUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint, null, 123790168, aosj.MESSAGE, AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class);
    }

    private AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class) {
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
