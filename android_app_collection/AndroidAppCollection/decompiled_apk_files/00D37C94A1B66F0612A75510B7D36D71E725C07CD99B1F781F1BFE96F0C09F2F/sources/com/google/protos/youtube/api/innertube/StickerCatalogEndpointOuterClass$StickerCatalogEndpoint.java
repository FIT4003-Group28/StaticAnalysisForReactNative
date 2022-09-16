package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StickerCatalogEndpointOuterClass$StickerCatalogEndpoint extends aopi implements aoqv {
    public static final StickerCatalogEndpointOuterClass$StickerCatalogEndpoint a;
    private static volatile aorb b;
    public static final aopg stickerCatalogEndpoint;
    private int c;
    private aunb d;
    private byte e = 2;

    static {
        StickerCatalogEndpointOuterClass$StickerCatalogEndpoint stickerCatalogEndpointOuterClass$StickerCatalogEndpoint = new StickerCatalogEndpointOuterClass$StickerCatalogEndpoint();
        a = stickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
        aopi.registerDefaultInstance(StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class, stickerCatalogEndpointOuterClass$StickerCatalogEndpoint);
        stickerCatalogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, stickerCatalogEndpointOuterClass$StickerCatalogEndpoint, stickerCatalogEndpointOuterClass$StickerCatalogEndpoint, null, 153501069, aosj.MESSAGE, StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class);
    }

    private StickerCatalogEndpointOuterClass$StickerCatalogEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new StickerCatalogEndpointOuterClass$StickerCatalogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
