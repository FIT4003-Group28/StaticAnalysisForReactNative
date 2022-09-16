package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCommentEndpointOuterClass$CreateCommentEndpoint extends aopi implements aoqv {
    public static final CreateCommentEndpointOuterClass$CreateCommentEndpoint a;
    public static final aopg createCommentEndpoint;
    private static volatile aorb h;
    public int b;
    public arag d;
    public boolean e;
    private byte i = 2;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint = new CreateCommentEndpointOuterClass$CreateCommentEndpoint();
        a = createCommentEndpointOuterClass$CreateCommentEndpoint;
        aopi.registerDefaultInstance(CreateCommentEndpointOuterClass$CreateCommentEndpoint.class, createCommentEndpointOuterClass$CreateCommentEndpoint);
        createCommentEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createCommentEndpointOuterClass$CreateCommentEndpoint, createCommentEndpointOuterClass$CreateCommentEndpoint, null, 68212148, aosj.MESSAGE, CreateCommentEndpointOuterClass$CreateCommentEndpoint.class);
    }

    private CreateCommentEndpointOuterClass$CreateCommentEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new CreateCommentEndpointOuterClass$CreateCommentEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (CreateCommentEndpointOuterClass$CreateCommentEndpoint.class) {
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
