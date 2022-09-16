package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AgeVerificationEndpointOuterClass$AgeVerificationEndpoint extends aopi implements aoqv {
    public static final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint a;
    public static final aopg ageVerificationEndpoint;
    private static volatile aorb d;
    public apzg c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        AgeVerificationEndpointOuterClass$AgeVerificationEndpoint ageVerificationEndpointOuterClass$AgeVerificationEndpoint = new AgeVerificationEndpointOuterClass$AgeVerificationEndpoint();
        a = ageVerificationEndpointOuterClass$AgeVerificationEndpoint;
        aopi.registerDefaultInstance(AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class, ageVerificationEndpointOuterClass$AgeVerificationEndpoint);
        ageVerificationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, ageVerificationEndpointOuterClass$AgeVerificationEndpoint, ageVerificationEndpointOuterClass$AgeVerificationEndpoint, null, 322638812, aosj.MESSAGE, AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class);
    }

    private AgeVerificationEndpointOuterClass$AgeVerificationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new AgeVerificationEndpointOuterClass$AgeVerificationEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class) {
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
