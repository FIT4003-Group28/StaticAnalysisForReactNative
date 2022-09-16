package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MuteAdEndpointOuterClass$MuteAdEndpoint extends aopi implements aoqv {
    public static final MuteAdEndpointOuterClass$MuteAdEndpoint a;
    private static volatile aorb d;
    public static final aopg muteAdEndpoint;
    public int b;
    private int e;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = new MuteAdEndpointOuterClass$MuteAdEndpoint();
        a = muteAdEndpointOuterClass$MuteAdEndpoint;
        aopi.registerDefaultInstance(MuteAdEndpointOuterClass$MuteAdEndpoint.class, muteAdEndpointOuterClass$MuteAdEndpoint);
        muteAdEndpoint = aopi.newSingularGeneratedExtension(apzg.a, muteAdEndpointOuterClass$MuteAdEndpoint, muteAdEndpointOuterClass$MuteAdEndpoint, null, 69108384, aosj.MESSAGE, MuteAdEndpointOuterClass$MuteAdEndpoint.class);
    }

    private MuteAdEndpointOuterClass$MuteAdEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002ဌ\u0001\u0003Л", new Object[]{"e", "b", atdq.n, "c", apzg.class});
            case 3:
                return new MuteAdEndpointOuterClass$MuteAdEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (MuteAdEndpointOuterClass$MuteAdEndpoint.class) {
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
