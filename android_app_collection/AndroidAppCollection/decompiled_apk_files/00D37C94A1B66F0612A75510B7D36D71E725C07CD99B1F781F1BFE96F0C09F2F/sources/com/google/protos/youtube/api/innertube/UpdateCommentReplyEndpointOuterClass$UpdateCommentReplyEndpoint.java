package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint extends aopi implements aoqv {
    public static final UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint a;
    private static volatile aorb e;
    public static final aopg updateCommentReplyEndpoint;
    public arag c;
    public boolean d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint = new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
        a = updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
        aopi.registerDefaultInstance(UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint);
        updateCommentReplyEndpoint = aopi.newSingularGeneratedExtension(apzg.a, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint, updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint, null, 100723586, aosj.MESSAGE, UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class);
    }

    private UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
