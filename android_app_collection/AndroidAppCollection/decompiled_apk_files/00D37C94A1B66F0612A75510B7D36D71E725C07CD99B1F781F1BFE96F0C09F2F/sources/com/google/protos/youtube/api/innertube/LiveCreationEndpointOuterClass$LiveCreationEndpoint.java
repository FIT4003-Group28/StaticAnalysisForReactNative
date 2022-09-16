package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveCreationEndpointOuterClass$LiveCreationEndpoint extends aopi implements aoqv {
    public static final LiveCreationEndpointOuterClass$LiveCreationEndpoint a;
    private static volatile aorb d;
    public static final aopg liveCreationEndpoint;
    public int b;
    public String c = "";

    static {
        LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
        a = liveCreationEndpointOuterClass$LiveCreationEndpoint;
        aopi.registerDefaultInstance(LiveCreationEndpointOuterClass$LiveCreationEndpoint.class, liveCreationEndpointOuterClass$LiveCreationEndpoint);
        liveCreationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, liveCreationEndpointOuterClass$LiveCreationEndpoint, liveCreationEndpointOuterClass$LiveCreationEndpoint, null, 122546829, aosj.MESSAGE, LiveCreationEndpointOuterClass$LiveCreationEndpoint.class);
    }

    private LiveCreationEndpointOuterClass$LiveCreationEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"b", "c"});
            case 3:
                return new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (LiveCreationEndpointOuterClass$LiveCreationEndpoint.class) {
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
