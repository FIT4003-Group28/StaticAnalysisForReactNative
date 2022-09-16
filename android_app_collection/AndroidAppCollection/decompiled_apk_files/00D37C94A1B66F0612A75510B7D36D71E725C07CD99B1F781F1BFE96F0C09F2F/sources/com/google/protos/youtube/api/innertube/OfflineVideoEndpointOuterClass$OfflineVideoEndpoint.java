package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflineVideoEndpointOuterClass$OfflineVideoEndpoint extends aopi implements aoqv {
    public static final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint a;
    private static volatile aorb i;
    public static final aopg offlineVideoEndpoint;
    public int b;
    public Object d;
    public int f;
    public aunb g;
    public atpy h;
    public int c = 0;
    private byte j = 2;
    public String e = "";

    static {
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
        a = offlineVideoEndpointOuterClass$OfflineVideoEndpoint;
        aopi.registerDefaultInstance(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class, offlineVideoEndpointOuterClass$OfflineVideoEndpoint);
        offlineVideoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, offlineVideoEndpointOuterClass$OfflineVideoEndpoint, null, 73080600, aosj.MESSAGE, OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class);
    }

    private OfflineVideoEndpointOuterClass$OfflineVideoEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ျ\u0000\u0002ဌ\u0003\u0004ᐉ\u0005\u0005ဈ\u0002\u0006ဉ\u0006\u0007ျ\u0000", new Object[]{"d", "c", "b", "f", atqy.u, "g", "e", "h"});
            case 3:
                return new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
