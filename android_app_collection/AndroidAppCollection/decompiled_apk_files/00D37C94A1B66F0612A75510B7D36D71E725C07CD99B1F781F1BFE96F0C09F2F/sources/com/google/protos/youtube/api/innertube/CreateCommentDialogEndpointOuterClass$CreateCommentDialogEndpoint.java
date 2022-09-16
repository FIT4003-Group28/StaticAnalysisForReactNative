package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint extends aopi implements aoqv {
    public static final CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint a;
    public static final aopg createCommentDialogEndpoint;
    private static volatile aorb e;
    public aqit b;
    public awlj c;
    public boolean d;
    private int f;
    private apzg g;
    private byte h = 2;

    static {
        CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint = new CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint();
        a = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint;
        aopi.registerDefaultInstance(CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.class, createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint);
        createCommentDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint, createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint, null, 122289677, aosj.MESSAGE, CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.class);
    }

    private CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဇ\u0003\u0006ᐉ\u0005", new Object[]{"f", "b", "c", "d", "g"});
            case 3:
                return new CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.class) {
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
