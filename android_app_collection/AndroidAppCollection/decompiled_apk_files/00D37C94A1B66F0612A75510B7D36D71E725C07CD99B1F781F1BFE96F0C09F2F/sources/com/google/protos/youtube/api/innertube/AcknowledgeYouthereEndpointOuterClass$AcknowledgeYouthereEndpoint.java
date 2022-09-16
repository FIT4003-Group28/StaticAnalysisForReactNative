package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint extends aopi implements aoqv {
    public static final AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint a;
    public static final aopg acknowledgeYouthereEndpoint;
    private static volatile aorb d;
    public int b;
    public awgw c;
    private byte e = 2;

    static {
        AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint = new AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint();
        a = acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint;
        aopi.registerDefaultInstance(AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class, acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint);
        acknowledgeYouthereEndpoint = aopi.newSingularGeneratedExtension(apzg.a, acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint, acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint, null, 333157331, aosj.MESSAGE, AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class);
    }

    private AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class) {
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
