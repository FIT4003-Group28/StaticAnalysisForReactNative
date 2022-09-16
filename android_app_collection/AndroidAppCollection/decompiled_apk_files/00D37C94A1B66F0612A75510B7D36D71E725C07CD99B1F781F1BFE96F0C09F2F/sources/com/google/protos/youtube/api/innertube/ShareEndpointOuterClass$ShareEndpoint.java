package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareEndpointOuterClass$ShareEndpoint extends aopi implements aoqv {
    public static final ShareEndpointOuterClass$ShareEndpoint a;
    private static volatile aorb d;
    public static final aopg shareEndpoint;
    private int e;
    private autb f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = new ShareEndpointOuterClass$ShareEndpoint();
        a = shareEndpointOuterClass$ShareEndpoint;
        aopi.registerDefaultInstance(ShareEndpointOuterClass$ShareEndpoint.class, shareEndpointOuterClass$ShareEndpoint);
        shareEndpoint = aopi.newSingularGeneratedExtension(apzg.a, shareEndpointOuterClass$ShareEndpoint, shareEndpointOuterClass$ShareEndpoint, null, 85383280, aosj.MESSAGE, ShareEndpointOuterClass$ShareEndpoint.class);
    }

    private ShareEndpointOuterClass$ShareEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"e", "b", "c", "f"});
            case 3:
                return new ShareEndpointOuterClass$ShareEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShareEndpointOuterClass$ShareEndpoint.class) {
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
