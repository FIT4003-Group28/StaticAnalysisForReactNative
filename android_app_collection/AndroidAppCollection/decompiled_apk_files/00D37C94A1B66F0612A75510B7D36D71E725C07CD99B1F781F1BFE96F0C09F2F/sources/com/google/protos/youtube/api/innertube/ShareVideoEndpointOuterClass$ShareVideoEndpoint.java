package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareVideoEndpointOuterClass$ShareVideoEndpoint extends aopi implements aoqv {
    public static final ShareVideoEndpointOuterClass$ShareVideoEndpoint a;
    private static volatile aorb d;
    public static final aopg shareVideoEndpoint;
    public String b = "";
    public String c = "";
    private int e;

    static {
        ShareVideoEndpointOuterClass$ShareVideoEndpoint shareVideoEndpointOuterClass$ShareVideoEndpoint = new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
        a = shareVideoEndpointOuterClass$ShareVideoEndpoint;
        aopi.registerDefaultInstance(ShareVideoEndpointOuterClass$ShareVideoEndpoint.class, shareVideoEndpointOuterClass$ShareVideoEndpoint);
        shareVideoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, shareVideoEndpointOuterClass$ShareVideoEndpoint, shareVideoEndpointOuterClass$ShareVideoEndpoint, null, 73844178, aosj.MESSAGE, ShareVideoEndpointOuterClass$ShareVideoEndpoint.class);
    }

    private ShareVideoEndpointOuterClass$ShareVideoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "b", "c"});
            case 3:
                return new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShareVideoEndpointOuterClass$ShareVideoEndpoint.class) {
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
