package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint extends aopi implements aoqv {
    public static final RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint a;
    private static volatile aorb c;
    public static final aopg removeUpcomingEventReminderEndpoint;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint = new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
        a = removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
        aopi.registerDefaultInstance(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class, removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint);
        removeUpcomingEventReminderEndpoint = aopi.newSingularGeneratedExtension(apzg.a, removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint, removeUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint, null, 124510444, aosj.MESSAGE, RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class);
    }

    private RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint() {
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
                return new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class) {
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
