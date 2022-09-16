package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartStreamEndpointOuterClass$StartStreamEndpoint extends aopi implements aoqv {
    public static final StartStreamEndpointOuterClass$StartStreamEndpoint a;
    private static volatile aorb c;
    public static final aopg startStreamEndpoint;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        StartStreamEndpointOuterClass$StartStreamEndpoint startStreamEndpointOuterClass$StartStreamEndpoint = new StartStreamEndpointOuterClass$StartStreamEndpoint();
        a = startStreamEndpointOuterClass$StartStreamEndpoint;
        aopi.registerDefaultInstance(StartStreamEndpointOuterClass$StartStreamEndpoint.class, startStreamEndpointOuterClass$StartStreamEndpoint);
        startStreamEndpoint = aopi.newSingularGeneratedExtension(apzg.a, startStreamEndpointOuterClass$StartStreamEndpoint, startStreamEndpointOuterClass$StartStreamEndpoint, null, 147899445, aosj.MESSAGE, StartStreamEndpointOuterClass$StartStreamEndpoint.class);
    }

    private StartStreamEndpointOuterClass$StartStreamEndpoint() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
            case 3:
                return new StartStreamEndpointOuterClass$StartStreamEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (StartStreamEndpointOuterClass$StartStreamEndpoint.class) {
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
