package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer extends aopi implements aoqv {
    public static final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer a;
    private static volatile aorb i;
    public static final aopg reelShelfCreationRenderer;
    public int b;
    public apzg c;
    public arhs d;
    public arag e;
    public avhn f;
    public aovs g;
    private aoux j;
    private byte k = 2;
    public aoob h = aoob.b;

    static {
        ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
        a = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
        aopi.registerDefaultInstance(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
        reelShelfCreationRenderer = aopi.newSingularGeneratedExtension(aunb.a, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer, null, 231434348, aosj.MESSAGE, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class);
    }

    private ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0004\u0005ည\u0005\u0006ᐉ\u0006\u0007ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "j", "f"});
            case 3:
                return new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class) {
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
