package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint extends aopi implements aoqv {
    public static final ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint a;
    private static volatile aorb c;
    public static final aopg showModifyChannelNotificationOptionsEndpoint;
    public auvm b;
    private int d;
    private CommandExecutorCommandOuterClass$CommandExecutorCommand e;
    private byte f = 2;

    static {
        ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint = new ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint();
        a = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint;
        aopi.registerDefaultInstance(ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.class, showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint);
        showModifyChannelNotificationOptionsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint, showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint, null, 144153690, aosj.MESSAGE, ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.class);
    }

    private ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
            case 3:
                return new ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.class) {
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
