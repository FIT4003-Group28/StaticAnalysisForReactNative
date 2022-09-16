package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint extends aopi implements aoqv {
    public static final TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint a;
    private static volatile aorb c;
    public static final aopg takePictureForThumbnailEndpoint;
    public String b = "";
    private int d;

    static {
        TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint = new TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint();
        a = takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
        aopi.registerDefaultInstance(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class, takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint);
        takePictureForThumbnailEndpoint = aopi.newSingularGeneratedExtension(apzg.a, takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint, takePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint, null, 124581055, aosj.MESSAGE, TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class);
    }

    private TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
            case 3:
                return new TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
