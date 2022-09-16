package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint extends aopi implements aoqv {
    public static final ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint a;
    public static final aopg confirmDialogEndpoint;
    private static volatile aorb d;
    public int b;
    public aqfs c;
    private byte e = 2;

    static {
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = new ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint();
        a = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
        aopi.registerDefaultInstance(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class, confirmDialogEndpointOuterClass$ConfirmDialogEndpoint);
        confirmDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, confirmDialogEndpointOuterClass$ConfirmDialogEndpoint, confirmDialogEndpointOuterClass$ConfirmDialogEndpoint, null, 79289575, aosj.MESSAGE, ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class);
    }

    private ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class) {
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
