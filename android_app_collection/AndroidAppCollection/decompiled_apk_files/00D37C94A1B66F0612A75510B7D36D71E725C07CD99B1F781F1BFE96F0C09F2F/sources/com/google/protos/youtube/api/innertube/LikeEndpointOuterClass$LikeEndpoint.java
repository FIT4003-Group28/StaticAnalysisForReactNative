package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LikeEndpointOuterClass$LikeEndpoint extends aopi implements aoqv {
    public static final LikeEndpointOuterClass$LikeEndpoint a;
    private static volatile aorb h;
    public static final aopg likeEndpoint;
    public int b;
    public Object d;
    public int e;
    public aspc f;
    public int c = 0;
    private byte i = 2;
    public aopu g = emptyProtobufList();

    static {
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = new LikeEndpointOuterClass$LikeEndpoint();
        a = likeEndpointOuterClass$LikeEndpoint;
        aopi.registerDefaultInstance(LikeEndpointOuterClass$LikeEndpoint.class, likeEndpointOuterClass$LikeEndpoint);
        likeEndpoint = aopi.newSingularGeneratedExtension(apzg.a, likeEndpointOuterClass$LikeEndpoint, likeEndpointOuterClass$LikeEndpoint, null, 63158558, aosj.MESSAGE, LikeEndpointOuterClass$LikeEndpoint.class);
    }

    private LikeEndpointOuterClass$LikeEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003Л\u0006ျ\u0000\u0007ျ\u0000\bျ\u0000", new Object[]{"d", "c", "b", "e", aspb.a(), "f", "g", apzg.class});
            case 3:
                return new LikeEndpointOuterClass$LikeEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (LikeEndpointOuterClass$LikeEndpoint.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
