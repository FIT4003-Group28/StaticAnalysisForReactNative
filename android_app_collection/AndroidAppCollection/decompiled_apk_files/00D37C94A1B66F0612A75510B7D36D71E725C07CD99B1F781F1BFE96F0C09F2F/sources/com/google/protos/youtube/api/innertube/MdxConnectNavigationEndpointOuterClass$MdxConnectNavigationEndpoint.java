package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint extends aopi implements aoqv {
    public static final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint a;
    private static volatile aorb e;
    public static final aopg mdxConnectNavigationEndpoint;
    public int b;
    public atdp c;
    public atcn d;

    static {
        MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
        a = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
        aopi.registerDefaultInstance(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint);
        mdxConnectNavigationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint, null, 119886855, aosj.MESSAGE, MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class);
    }

    private MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0000\u0004ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
