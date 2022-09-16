package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ModalEndpointOuterClass$ModalEndpoint extends aopi implements aoqv {
    public static final ModalEndpointOuterClass$ModalEndpoint a;
    private static volatile aorb d;
    public static final aopg modalEndpoint;
    public atie b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        ModalEndpointOuterClass$ModalEndpoint modalEndpointOuterClass$ModalEndpoint = new ModalEndpointOuterClass$ModalEndpoint();
        a = modalEndpointOuterClass$ModalEndpoint;
        aopi.registerDefaultInstance(ModalEndpointOuterClass$ModalEndpoint.class, modalEndpointOuterClass$ModalEndpoint);
        modalEndpoint = aopi.newSingularGeneratedExtension(apzg.a, modalEndpointOuterClass$ModalEndpoint, modalEndpointOuterClass$ModalEndpoint, null, 106613511, aosj.MESSAGE, ModalEndpointOuterClass$ModalEndpoint.class);
    }

    private ModalEndpointOuterClass$ModalEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new ModalEndpointOuterClass$ModalEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ModalEndpointOuterClass$ModalEndpoint.class) {
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
