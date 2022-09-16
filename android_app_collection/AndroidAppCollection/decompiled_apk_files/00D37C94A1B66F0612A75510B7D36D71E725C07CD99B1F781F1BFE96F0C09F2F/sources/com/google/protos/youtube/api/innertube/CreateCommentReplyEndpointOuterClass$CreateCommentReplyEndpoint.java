package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint extends aopi implements aoqv {
    public static final CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint a;
    public static final aopg createCommentReplyEndpoint;
    private static volatile aorb h;
    public int b;
    public arag d;
    public boolean e;
    private arag i;
    private byte j = 2;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint = new CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint();
        a = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
        aopi.registerDefaultInstance(CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint);
        createCommentReplyEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint, null, 66712070, aosj.MESSAGE, CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class);
    }

    private CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "i", "d", "e", "f", "g"});
            case 3:
                return new CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.class) {
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
