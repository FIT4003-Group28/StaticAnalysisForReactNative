package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint extends aopi implements aoqv {
    public static final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint a;
    private static volatile aorb c;
    public static final aopg selectActiveIdentityEndpoint;
    private int d;
    private apzg e;
    private apzg f;
    private byte g = 2;
    public aopu b = emptyProtobufList();

    static {
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint = new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
        a = selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
        aopi.registerDefaultInstance(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint);
        selectActiveIdentityEndpoint = aopi.newSingularGeneratedExtension(apzg.a, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint, selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint, null, 77196420, aosj.MESSAGE, SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class);
    }

    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"d", "b", aoxp.class, "e", "f"});
            case 3:
                return new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class) {
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
