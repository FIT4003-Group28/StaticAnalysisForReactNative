package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint extends aopi implements aoqv {
    public static final UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint a;
    private static volatile aorb c;
    public static final aopg unlimitedFamilyFlowEndpoint;
    public avnr b;
    private int d;
    private byte e = 2;

    static {
        UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint = new UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint();
        a = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
        aopi.registerDefaultInstance(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class, unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint);
        unlimitedFamilyFlowEndpoint = aopi.newSingularGeneratedExtension(apzg.a, unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint, unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint, null, 128200871, aosj.MESSAGE, UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class);
    }

    private UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf34d㲔\uf34d㲔\u0001\u0000\u0000\u0001\uf34d㲔ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class) {
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
