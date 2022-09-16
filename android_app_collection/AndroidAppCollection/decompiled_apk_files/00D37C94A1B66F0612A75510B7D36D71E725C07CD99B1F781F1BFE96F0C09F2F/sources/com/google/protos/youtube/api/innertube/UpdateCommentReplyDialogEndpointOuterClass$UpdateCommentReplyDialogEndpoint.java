package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint extends aopi implements aoqv {
    public static final UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint a;
    private static volatile aorb d;
    public static final aopg updateCommentReplyDialogEndpoint;
    public avsv b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
        a = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
        aopi.registerDefaultInstance(UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint);
        updateCommentReplyDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint, updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint, null, 122558141, aosj.MESSAGE, UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class);
    }

    private UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဇ\u0003", new Object[]{"e", "b", "c"});
            case 3:
                return new UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.class) {
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
