package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareEndpointOuterClass$ShareEntityEndpoint extends aopi implements aoqv {
    public static final ShareEndpointOuterClass$ShareEntityEndpoint a;
    private static volatile aorb d;
    public static final aopg shareEntityEndpoint;
    private int e;
    private apzg f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = new ShareEndpointOuterClass$ShareEntityEndpoint();
        a = shareEndpointOuterClass$ShareEntityEndpoint;
        aopi.registerDefaultInstance(ShareEndpointOuterClass$ShareEntityEndpoint.class, shareEndpointOuterClass$ShareEntityEndpoint);
        shareEntityEndpoint = aopi.newSingularGeneratedExtension(apzg.a, shareEndpointOuterClass$ShareEntityEndpoint, shareEndpointOuterClass$ShareEntityEndpoint, null, 90650344, aosj.MESSAGE, ShareEndpointOuterClass$ShareEntityEndpoint.class);
    }

    private ShareEndpointOuterClass$ShareEntityEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0007ᐉ\u0004", new Object[]{"e", "b", "c", "f"});
            case 3:
                return new ShareEndpointOuterClass$ShareEntityEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShareEndpointOuterClass$ShareEntityEndpoint.class) {
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
