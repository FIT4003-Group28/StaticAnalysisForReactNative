package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint extends aopi implements aoqv {
    public static final OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint a;
    private static volatile aorb e;
    public static final aopg offlineVideoWithOfflineabilityEndpoint;
    public int c;
    public aunb d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint = new OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint();
        a = offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
        aopi.registerDefaultInstance(OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.class, offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint);
        offlineVideoWithOfflineabilityEndpoint = aopi.newSingularGeneratedExtension(apzg.a, offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint, offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint, null, 171338118, aosj.MESSAGE, OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.class);
    }

    private OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", atqy.u, "d"});
            case 3:
                return new OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.class) {
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
