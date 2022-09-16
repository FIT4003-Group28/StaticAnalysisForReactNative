package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint extends aopi implements aoqv {
    public static final MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint a;
    private static volatile aorb b;
    public static final aopg mdxViewVideoInfoEndpoint;

    static {
        MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint = new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
        a = mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
        aopi.registerDefaultInstance(MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class, mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint);
        mdxViewVideoInfoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint, mdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint, null, 105496274, aosj.MESSAGE, MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class);
    }

    private MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
