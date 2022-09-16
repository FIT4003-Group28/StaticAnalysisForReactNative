package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InviteMoreEndpointOuterClass$InviteMoreEndpoint extends aopi implements aoqv {
    public static final InviteMoreEndpointOuterClass$InviteMoreEndpoint a;
    private static volatile aorb b;
    public static final aopg inviteMoreEndpoint;
    private int c;
    private aunb d;
    private byte e = 2;

    static {
        InviteMoreEndpointOuterClass$InviteMoreEndpoint inviteMoreEndpointOuterClass$InviteMoreEndpoint = new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
        a = inviteMoreEndpointOuterClass$InviteMoreEndpoint;
        aopi.registerDefaultInstance(InviteMoreEndpointOuterClass$InviteMoreEndpoint.class, inviteMoreEndpointOuterClass$InviteMoreEndpoint);
        inviteMoreEndpoint = aopi.newSingularGeneratedExtension(apzg.a, inviteMoreEndpointOuterClass$InviteMoreEndpoint, inviteMoreEndpointOuterClass$InviteMoreEndpoint, null, 77296946, aosj.MESSAGE, InviteMoreEndpointOuterClass$InviteMoreEndpoint.class);
    }

    private InviteMoreEndpointOuterClass$InviteMoreEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new InviteMoreEndpointOuterClass$InviteMoreEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (InviteMoreEndpointOuterClass$InviteMoreEndpoint.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
