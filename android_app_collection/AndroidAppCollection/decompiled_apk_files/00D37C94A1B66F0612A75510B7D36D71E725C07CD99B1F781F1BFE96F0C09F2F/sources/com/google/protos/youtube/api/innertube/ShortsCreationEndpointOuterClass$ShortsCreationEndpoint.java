package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShortsCreationEndpointOuterClass$ShortsCreationEndpoint extends aopi implements aoqv {
    public static final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint a;
    private static volatile aorb g;
    public static final aopg shortsCreationEndpoint;
    public int b;
    public int d;
    public int e;
    public apzg f;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
        a = shortsCreationEndpointOuterClass$ShortsCreationEndpoint;
        aopi.registerDefaultInstance(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class, shortsCreationEndpointOuterClass$ShortsCreationEndpoint);
        shortsCreationEndpoint = aopi.newSingularGeneratedExtension(apzg.a, shortsCreationEndpointOuterClass$ShortsCreationEndpoint, shortsCreationEndpointOuterClass$ShortsCreationEndpoint, null, 307460408, aosj.MESSAGE, ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class);
    }

    private ShortsCreationEndpointOuterClass$ShortsCreationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0002\u0002Л\u0003ဌ\u0001\u0004ဌ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", aunb.class, "d", auuv.a(), "e", aupm.t, "f"});
            case 3:
                return new ShortsCreationEndpointOuterClass$ShortsCreationEndpoint();
            case 4:
                return new aopa((float[]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
