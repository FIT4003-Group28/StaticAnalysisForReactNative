package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint extends aopi implements aoqv {
    public static final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint a;
    private static volatile aorb g;
    public static final aopg offlinePlaylistEndpoint;
    public int b;
    public int d;
    public aunb e;
    public atpy f;
    private byte h = 2;
    public String c = "";

    static {
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
        a = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
        aopi.registerDefaultInstance(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint);
        offlinePlaylistEndpoint = aopi.newSingularGeneratedExtension(apzg.a, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint, null, 73082583, aosj.MESSAGE, OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class);
    }

    private OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0004ᐉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", atqy.l, "e", "f"});
            case 3:
                return new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
