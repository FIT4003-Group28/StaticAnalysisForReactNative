package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebviewEndpointOuterClass$WebviewEndpoint extends aopi implements aoqv {
    public static final WebviewEndpointOuterClass$WebviewEndpoint a;
    private static volatile aorb d;
    public static final aopg webviewEndpoint;
    public boolean c;
    private int e;
    private apzg f;
    private byte g = 2;
    public String b = "";

    static {
        WebviewEndpointOuterClass$WebviewEndpoint webviewEndpointOuterClass$WebviewEndpoint = new WebviewEndpointOuterClass$WebviewEndpoint();
        a = webviewEndpointOuterClass$WebviewEndpoint;
        aopi.registerDefaultInstance(WebviewEndpointOuterClass$WebviewEndpoint.class, webviewEndpointOuterClass$WebviewEndpoint);
        webviewEndpoint = aopi.newSingularGeneratedExtension(apzg.a, webviewEndpointOuterClass$WebviewEndpoint, webviewEndpointOuterClass$WebviewEndpoint, null, 77364463, aosj.MESSAGE, WebviewEndpointOuterClass$WebviewEndpoint.class);
    }

    private WebviewEndpointOuterClass$WebviewEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"e", "b", "f", "c"});
            case 3:
                return new WebviewEndpointOuterClass$WebviewEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (WebviewEndpointOuterClass$WebviewEndpoint.class) {
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
