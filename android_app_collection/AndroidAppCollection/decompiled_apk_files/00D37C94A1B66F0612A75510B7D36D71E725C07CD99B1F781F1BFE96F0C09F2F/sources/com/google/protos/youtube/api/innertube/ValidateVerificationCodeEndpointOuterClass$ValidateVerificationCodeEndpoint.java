package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint extends aopi implements aoqv {
    public static final ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint a;
    private static volatile aorb b;
    public static final aopg validateVerificationCodeEndpoint;

    static {
        ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint = new ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint();
        a = validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
        aopi.registerDefaultInstance(ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class, validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint);
        validateVerificationCodeEndpoint = aopi.newSingularGeneratedExtension(apzg.a, validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint, validateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint, null, 131794550, aosj.MESSAGE, ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class);
    }

    private ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class) {
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
