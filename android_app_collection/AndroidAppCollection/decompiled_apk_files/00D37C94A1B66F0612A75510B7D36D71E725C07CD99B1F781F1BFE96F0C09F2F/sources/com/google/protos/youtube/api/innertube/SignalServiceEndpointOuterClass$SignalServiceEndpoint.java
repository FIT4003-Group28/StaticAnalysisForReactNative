package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SignalServiceEndpointOuterClass$SignalServiceEndpoint extends aopi implements aoqv {
    public static final SignalServiceEndpointOuterClass$SignalServiceEndpoint a;
    private static volatile aorb c;
    public static final aopg signalServiceEndpoint;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        SignalServiceEndpointOuterClass$SignalServiceEndpoint signalServiceEndpointOuterClass$SignalServiceEndpoint = new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
        a = signalServiceEndpointOuterClass$SignalServiceEndpoint;
        aopi.registerDefaultInstance(SignalServiceEndpointOuterClass$SignalServiceEndpoint.class, signalServiceEndpointOuterClass$SignalServiceEndpoint);
        signalServiceEndpoint = aopi.newSingularGeneratedExtension(apzg.a, signalServiceEndpointOuterClass$SignalServiceEndpoint, signalServiceEndpointOuterClass$SignalServiceEndpoint, null, 124290411, aosj.MESSAGE, SignalServiceEndpointOuterClass$SignalServiceEndpoint.class);
    }

    private SignalServiceEndpointOuterClass$SignalServiceEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"b", apzg.class});
            case 3:
                return new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (SignalServiceEndpointOuterClass$SignalServiceEndpoint.class) {
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
