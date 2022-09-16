package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCommentEndpointOuterClass$UpdateCommentEndpoint extends aopi implements aoqv {
    public static final UpdateCommentEndpointOuterClass$UpdateCommentEndpoint a;
    private static volatile aorb e;
    public static final aopg updateCommentEndpoint;
    public arag c;
    public boolean d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        UpdateCommentEndpointOuterClass$UpdateCommentEndpoint updateCommentEndpointOuterClass$UpdateCommentEndpoint = new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
        a = updateCommentEndpointOuterClass$UpdateCommentEndpoint;
        aopi.registerDefaultInstance(UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class, updateCommentEndpointOuterClass$UpdateCommentEndpoint);
        updateCommentEndpoint = aopi.newSingularGeneratedExtension(apzg.a, updateCommentEndpointOuterClass$UpdateCommentEndpoint, updateCommentEndpointOuterClass$UpdateCommentEndpoint, null, 99326409, aosj.MESSAGE, UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class);
    }

    private UpdateCommentEndpointOuterClass$UpdateCommentEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new UpdateCommentEndpointOuterClass$UpdateCommentEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.class) {
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
