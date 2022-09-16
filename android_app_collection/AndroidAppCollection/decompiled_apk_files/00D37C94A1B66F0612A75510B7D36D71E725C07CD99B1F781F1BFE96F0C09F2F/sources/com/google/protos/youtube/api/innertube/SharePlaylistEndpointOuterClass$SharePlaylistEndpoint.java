package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SharePlaylistEndpointOuterClass$SharePlaylistEndpoint extends aopi implements aoqv {
    public static final SharePlaylistEndpointOuterClass$SharePlaylistEndpoint a;
    private static volatile aorb e;
    public static final aopg sharePlaylistEndpoint;
    public int b;
    public String c = "";
    public String d = "";

    static {
        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
        a = sharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
        aopi.registerDefaultInstance(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint);
        sharePlaylistEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint, null, 73844191, aosj.MESSAGE, SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class);
    }

    private SharePlaylistEndpointOuterClass$SharePlaylistEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class) {
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
