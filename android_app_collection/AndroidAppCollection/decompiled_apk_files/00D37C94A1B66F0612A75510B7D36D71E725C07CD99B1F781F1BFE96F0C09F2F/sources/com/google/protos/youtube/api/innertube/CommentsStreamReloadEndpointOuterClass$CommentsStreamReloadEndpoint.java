package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint extends aopi implements aoqv {
    public static final CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint a;
    public static final aopg commentsStreamReloadEndpoint;
    private static volatile aorb h;
    public int b;
    public aqcm c;
    public int d;
    public int f;
    public boolean g;
    private byte i = 2;
    public String e = "";

    static {
        CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = new CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint();
        a = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
        aopi.registerDefaultInstance(CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint);
        commentsStreamReloadEndpoint = aopi.newSingularGeneratedExtension(apzg.a, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint, null, 137332281, aosj.MESSAGE, CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class);
    }

    private CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", apvq.t, "e", "f", "g"});
            case 3:
                return new CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.class) {
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
