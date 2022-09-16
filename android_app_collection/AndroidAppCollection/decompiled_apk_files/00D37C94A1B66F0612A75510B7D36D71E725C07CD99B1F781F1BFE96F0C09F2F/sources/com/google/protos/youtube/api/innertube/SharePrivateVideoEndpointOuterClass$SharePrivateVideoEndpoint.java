package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint extends aopi implements aoqv {
    public static final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    private static volatile aorb d;
    public static final aopg sharePrivateVideoEndpoint;
    public apzg c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
        a = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
        aopi.registerDefaultInstance(SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint);
        sharePrivateVideoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, null, 117735229, aosj.MESSAGE, SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class);
    }

    private SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class) {
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
