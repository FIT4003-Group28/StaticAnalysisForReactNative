package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint extends aopi implements aoqv {
    public static final PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint a;
    private static volatile aorb c;
    public static final aopg phoneVerificationContactNumberInputEndpoint;
    public atwf b;
    private int d;
    private byte e = 2;

    static {
        PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint = new PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint();
        a = phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
        aopi.registerDefaultInstance(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.class, phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint);
        phoneVerificationContactNumberInputEndpoint = aopi.newSingularGeneratedExtension(apzg.a, phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint, phoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint, null, 134477788, aosj.MESSAGE, PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.class);
    }

    private PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint() {
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
                return new PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.class) {
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
