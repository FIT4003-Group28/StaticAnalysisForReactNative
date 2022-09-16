package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint extends aopi implements aoqv {
    public static final AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint a;
    public static final aopg adChoicesDialogEndpoint;
    private static volatile aorb c;
    public aoye b;
    private int d;
    private byte e = 2;

    static {
        AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint = new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
        a = adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
        aopi.registerDefaultInstance(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class, adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint);
        adChoicesDialogEndpoint = aopi.newSingularGeneratedExtension(apzg.a, adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint, adChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint, null, 83457823, aosj.MESSAGE, AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class);
    }

    private AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint() {
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
                return new AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.class) {
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
