package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint extends aopi implements aoqv {
    public static final CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint a;
    public static final aopg createCommentReplyDialogEndpoint;
    private static volatile aorb j;
    public int b;
    public aqiu c;
    public apzm d;
    public apzm e;
    public boolean f;
    public apzg h;
    private byte k = 2;
    public String g = "";
    public String i = "";

    static {
        CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint = new CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint();
        a = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
        aopi.registerDefaultInstance(CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.class, createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint);
        createCommentReplyDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint, createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint, null, 95237586, aosj.MESSAGE, CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.class);
    }

    private CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.class) {
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
