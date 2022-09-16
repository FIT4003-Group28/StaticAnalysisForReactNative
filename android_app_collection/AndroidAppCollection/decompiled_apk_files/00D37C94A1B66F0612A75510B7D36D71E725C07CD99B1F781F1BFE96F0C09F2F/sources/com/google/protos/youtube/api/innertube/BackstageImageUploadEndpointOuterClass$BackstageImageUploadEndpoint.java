package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint extends aopi implements aoqv {
    public static final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint a;
    public static final aopg backstageImageUploadEndpoint;
    private static volatile aorb k;
    public int b;
    public apku e;
    public apkn f;
    public aunb g;
    public apzg h;
    public boolean i;
    public aunb j;
    private arag l;
    private arag m;
    private byte n = 2;
    public String c = "";
    public String d = "";

    static {
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
        a = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
        aopi.registerDefaultInstance(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        backstageImageUploadEndpoint = aopi.newSingularGeneratedExtension(apzg.a, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, null, 125827176, aosj.MESSAGE, BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class);
    }

    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0006\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\u000bᐉ\u000b\fᐉ\f\rᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "j"});
            case 3:
                return new BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
