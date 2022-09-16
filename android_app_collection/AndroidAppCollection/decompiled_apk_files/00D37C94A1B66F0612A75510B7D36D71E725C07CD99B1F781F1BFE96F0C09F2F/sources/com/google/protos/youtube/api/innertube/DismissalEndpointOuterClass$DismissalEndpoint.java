package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissalEndpointOuterClass$DismissalEndpoint extends aopi implements aoqv {
    public static final DismissalEndpointOuterClass$DismissalEndpoint a;
    private static volatile aorb d;
    public static final aopg dismissalEndpoint;
    private int e;
    private byte f = 2;
    public String b = "";
    public aopu c = emptyProtobufList();

    static {
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = new DismissalEndpointOuterClass$DismissalEndpoint();
        a = dismissalEndpointOuterClass$DismissalEndpoint;
        aopi.registerDefaultInstance(DismissalEndpointOuterClass$DismissalEndpoint.class, dismissalEndpointOuterClass$DismissalEndpoint);
        dismissalEndpoint = aopi.newSingularGeneratedExtension(apzg.a, dismissalEndpointOuterClass$DismissalEndpoint, dismissalEndpointOuterClass$DismissalEndpoint, null, 63120728, aosj.MESSAGE, DismissalEndpointOuterClass$DismissalEndpoint.class);
    }

    private DismissalEndpointOuterClass$DismissalEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"e", "b", "c", apzg.class});
            case 3:
                return new DismissalEndpointOuterClass$DismissalEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (DismissalEndpointOuterClass$DismissalEndpoint.class) {
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
