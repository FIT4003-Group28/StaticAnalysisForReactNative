package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint extends aopi implements aoqv {
    public static final UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint a;
    private static volatile aorb d;
    public static final aopg updateCommentDialogEndpoint;
    public avsu b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint = new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
        a = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
        aopi.registerDefaultInstance(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint);
        updateCommentDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, null, 122557296, aosj.MESSAGE, UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class);
    }

    private UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဇ\u0002", new Object[]{"e", "b", "c"});
            case 3:
                return new UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.class) {
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
