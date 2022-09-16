package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint extends aopi implements aoqv {
    public static final CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint a;
    private static volatile aorb c;
    public static final aopg createBackstagePostDialogEndpoint;
    public aqir b;
    private int d;
    private byte e = 2;

    static {
        CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = new CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint();
        a = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
        aopi.registerDefaultInstance(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class, createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint);
        createBackstagePostDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint, createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint, null, 117834934, aosj.MESSAGE, CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class);
    }

    private CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
