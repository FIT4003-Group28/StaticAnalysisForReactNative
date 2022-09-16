package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint extends aopi implements aoqv {
    public static final PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint a;
    private static volatile aorb d;
    public static final aopg phoneVerificationCodeInputScreenEndpoint;
    public int b;
    public atwb c;
    private byte e = 2;

    static {
        PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint = new PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint();
        a = phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint;
        aopi.registerDefaultInstance(PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.class, phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint);
        phoneVerificationCodeInputScreenEndpoint = aopi.newSingularGeneratedExtension(apzg.a, phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint, phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint, null, 132445607, aosj.MESSAGE, PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.class);
    }

    private PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.class) {
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
