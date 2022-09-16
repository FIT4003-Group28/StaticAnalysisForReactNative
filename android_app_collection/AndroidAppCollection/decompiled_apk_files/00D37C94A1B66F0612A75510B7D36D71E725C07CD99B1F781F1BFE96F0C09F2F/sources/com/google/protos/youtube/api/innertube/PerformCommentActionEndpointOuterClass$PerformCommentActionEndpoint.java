package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint extends aopi implements aoqv {
    public static final PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint a;
    private static volatile aorb e;
    public static final aopg performCommentActionEndpoint;
    private int f;
    private byte g = 2;
    public String b = "";
    public aopu c = aopi.emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
        a = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
        aopi.registerDefaultInstance(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint);
        performCommentActionEndpoint = aopi.newSingularGeneratedExtension(apzg.a, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint, performCommentActionEndpointOuterClass$PerformCommentActionEndpoint, null, 65929205, aosj.MESSAGE, PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class);
    }

    private PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003\u001a", new Object[]{"f", "b", "d", apzg.class, "c"});
            case 3:
                return new PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.class) {
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
