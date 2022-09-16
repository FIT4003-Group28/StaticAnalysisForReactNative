package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UploadPhotoEndpointOuterClass$UploadPhotoEndpoint extends aopi implements aoqv {
    public static final UploadPhotoEndpointOuterClass$UploadPhotoEndpoint a;
    private static volatile aorb j;
    public static final aopg uploadPhotoEndpoint;
    public int b;
    public Object d;
    public avhn g;
    public arag h;
    public arag i;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public String f = "";

    static {
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = new UploadPhotoEndpointOuterClass$UploadPhotoEndpoint();
        a = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
        aopi.registerDefaultInstance(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
        uploadPhotoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint, null, 99402190, aosj.MESSAGE, UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class);
    }

    private UploadPhotoEndpointOuterClass$UploadPhotoEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0002\t\u0007\u0000\u0000\u0005\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\bဈ\u0003\tဈ\u0002", new Object[]{"d", "c", "b", apzg.class, apzg.class, "g", "h", "i", "f", "e"});
            case 3:
                return new UploadPhotoEndpointOuterClass$UploadPhotoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
