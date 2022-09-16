package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendShareEndpoint$SendShareToConversationEndpoint extends aopi implements aoqv {
    public static final SendShareEndpoint$SendShareToConversationEndpoint a;
    private static volatile aorb b;
    public static final aopg sendShareToConversationEndpoint;
    private int c;
    private aqhn d;
    private arag e;
    private byte f = 2;

    static {
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = new SendShareEndpoint$SendShareToConversationEndpoint();
        a = sendShareEndpoint$SendShareToConversationEndpoint;
        aopi.registerDefaultInstance(SendShareEndpoint$SendShareToConversationEndpoint.class, sendShareEndpoint$SendShareToConversationEndpoint);
        sendShareToConversationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sendShareEndpoint$SendShareToConversationEndpoint, sendShareEndpoint$SendShareToConversationEndpoint, null, 92589349, aosj.MESSAGE, SendShareEndpoint$SendShareToConversationEndpoint.class);
    }

    private SendShareEndpoint$SendShareToConversationEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e"});
            case 3:
                return new SendShareEndpoint$SendShareToConversationEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (SendShareEndpoint$SendShareToConversationEndpoint.class) {
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
