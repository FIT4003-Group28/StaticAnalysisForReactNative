package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendShareEndpoint$SendShareExternallyEndpoint extends aopi implements aoqv {
    public static final SendShareEndpoint$SendShareExternallyEndpoint a;
    private static volatile aorb f;
    public static final aopg sendShareExternallyEndpoint;
    public int b;
    public arnf c;
    public arnd d;
    public arnc e;
    private byte g = 2;

    static {
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = new SendShareEndpoint$SendShareExternallyEndpoint();
        a = sendShareEndpoint$SendShareExternallyEndpoint;
        aopi.registerDefaultInstance(SendShareEndpoint$SendShareExternallyEndpoint.class, sendShareEndpoint$SendShareExternallyEndpoint);
        sendShareExternallyEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sendShareEndpoint$SendShareExternallyEndpoint, sendShareEndpoint$SendShareExternallyEndpoint, null, 92310068, aosj.MESSAGE, SendShareEndpoint$SendShareExternallyEndpoint.class);
    }

    private SendShareEndpoint$SendShareExternallyEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new SendShareEndpoint$SendShareExternallyEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (SendShareEndpoint$SendShareExternallyEndpoint.class) {
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
