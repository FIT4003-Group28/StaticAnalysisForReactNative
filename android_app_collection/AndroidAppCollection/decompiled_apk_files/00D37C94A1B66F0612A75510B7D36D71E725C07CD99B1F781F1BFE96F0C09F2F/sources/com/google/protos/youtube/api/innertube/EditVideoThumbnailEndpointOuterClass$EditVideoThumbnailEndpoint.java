package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint extends aopi implements aoqv {
    public static final EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint a;
    private static volatile aorb c;
    public static final aopg editVideoThumbnailEndpoint;
    public String b = "";
    private int d;

    static {
        EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint = new EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint();
        a = editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
        aopi.registerDefaultInstance(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class, editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint);
        editVideoThumbnailEndpoint = aopi.newSingularGeneratedExtension(apzg.a, editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint, editVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint, null, 136550626, aosj.MESSAGE, EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class);
    }

    private EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.class) {
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
