package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint extends aopi implements aoqv {
    public static final PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint a;
    private static volatile aorb c;
    public static final aopg phoneVerificationCodeInputResultEndpoint;
    public atvx b;
    private int d;
    private byte e = 2;

    static {
        PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint = new PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint();
        a = phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint;
        aopi.registerDefaultInstance(PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.class, phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint);
        phoneVerificationCodeInputResultEndpoint = aopi.newSingularGeneratedExtension(apzg.a, phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint, phoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint, null, 132194316, aosj.MESSAGE, PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.class);
    }

    private PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.class) {
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
