package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendShareEndpoint$SendShareToContactsEndpoint extends aopi implements aoqv {
    public static final SendShareEndpoint$SendShareToContactsEndpoint a;
    private static volatile aorb e;
    public static final aopg sendShareToContactsEndpoint;
    public int b;
    public arnf c;
    public arne d;
    private aqhn f;
    private apzg g;
    private byte h = 2;

    static {
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = new SendShareEndpoint$SendShareToContactsEndpoint();
        a = sendShareEndpoint$SendShareToContactsEndpoint;
        aopi.registerDefaultInstance(SendShareEndpoint$SendShareToContactsEndpoint.class, sendShareEndpoint$SendShareToContactsEndpoint);
        sendShareToContactsEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sendShareEndpoint$SendShareToContactsEndpoint, sendShareEndpoint$SendShareToContactsEndpoint, null, 92775415, aosj.MESSAGE, SendShareEndpoint$SendShareToContactsEndpoint.class);
    }

    private SendShareEndpoint$SendShareToContactsEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "f", "g"});
            case 3:
                return new SendShareEndpoint$SendShareToContactsEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (SendShareEndpoint$SendShareToContactsEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
