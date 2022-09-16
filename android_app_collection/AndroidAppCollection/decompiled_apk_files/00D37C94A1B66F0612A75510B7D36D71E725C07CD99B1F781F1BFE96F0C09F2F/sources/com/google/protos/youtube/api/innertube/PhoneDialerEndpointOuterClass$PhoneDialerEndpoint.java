package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneDialerEndpointOuterClass$PhoneDialerEndpoint extends aopi implements aoqv {
    public static final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint a;
    private static volatile aorb c;
    public static final aopg phoneDialerEndpoint;
    private int d;
    private apzg e;
    private byte f = 2;
    public String b = "";

    static {
        PhoneDialerEndpointOuterClass$PhoneDialerEndpoint phoneDialerEndpointOuterClass$PhoneDialerEndpoint = new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
        a = phoneDialerEndpointOuterClass$PhoneDialerEndpoint;
        aopi.registerDefaultInstance(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class, phoneDialerEndpointOuterClass$PhoneDialerEndpoint);
        phoneDialerEndpoint = aopi.newSingularGeneratedExtension(apzg.a, phoneDialerEndpointOuterClass$PhoneDialerEndpoint, phoneDialerEndpointOuterClass$PhoneDialerEndpoint, null, 100946440, aosj.MESSAGE, PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class);
    }

    private PhoneDialerEndpointOuterClass$PhoneDialerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
            case 3:
                return new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class) {
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
