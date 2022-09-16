package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UnsubscribeEndpointOuterClass$UnsubscribeEndpoint extends aopi implements aoqv {
    public static final UnsubscribeEndpointOuterClass$UnsubscribeEndpoint a;
    private static volatile aorb f;
    public static final aopg unsubscribeEndpoint;
    public int b;
    private avsq g;
    private byte h = 2;
    public aopu c = aopi.emptyProtobufList();
    public String d = "";
    public String e = "";

    static {
        UnsubscribeEndpointOuterClass$UnsubscribeEndpoint unsubscribeEndpointOuterClass$UnsubscribeEndpoint = new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
        a = unsubscribeEndpointOuterClass$UnsubscribeEndpoint;
        aopi.registerDefaultInstance(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class, unsubscribeEndpointOuterClass$UnsubscribeEndpoint);
        unsubscribeEndpoint = aopi.newSingularGeneratedExtension(apzg.a, unsubscribeEndpointOuterClass$UnsubscribeEndpoint, unsubscribeEndpointOuterClass$UnsubscribeEndpoint, null, 68997401, aosj.MESSAGE, UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class);
    }

    private UnsubscribeEndpointOuterClass$UnsubscribeEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u001a\u0002ဈ\u0000\u0004ဈ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
