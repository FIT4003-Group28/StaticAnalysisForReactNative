package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FingerprintAuthRendererOuterClass$FingerprintAuthRenderer extends aopi implements aoqv {
    public static final FingerprintAuthRendererOuterClass$FingerprintAuthRenderer a;
    public static final aopg fingerprintAuthRenderer;
    private static volatile aorb i;
    public int b;
    public arag c;
    public int e;
    public boolean f;
    public arag h;
    private aoux j;
    private byte k = 2;
    public aopu d = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer = new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
        a = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
        aopi.registerDefaultInstance(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
        fingerprintAuthRenderer = aopi.newSingularGeneratedExtension(aunb.a, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer, null, 196186429, aosj.MESSAGE, FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class);
    }

    private FingerprintAuthRendererOuterClass$FingerprintAuthRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", arag.class, "e", "f", "j", "g", "h"});
            case 3:
                return new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
