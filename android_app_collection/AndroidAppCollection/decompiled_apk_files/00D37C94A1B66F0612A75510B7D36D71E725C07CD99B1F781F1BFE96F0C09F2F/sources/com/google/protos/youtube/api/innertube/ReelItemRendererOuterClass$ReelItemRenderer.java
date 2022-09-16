package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelItemRendererOuterClass$ReelItemRenderer extends aopi implements aoqv {
    public static final ReelItemRendererOuterClass$ReelItemRenderer a;
    public static final aopg reelItemRenderer;
    private static volatile aorb t;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public avhn f;
    public avhn g;
    public arag h;
    public arag i;
    public arag j;
    public arag k;
    public int l;
    public apzg m;
    public ates n;
    public int o;
    public aovs q;
    public int r;
    public aule s;
    private arag u;
    private aoux v;
    private byte w = 2;
    public aoob p = aoob.b;

    static {
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = new ReelItemRendererOuterClass$ReelItemRenderer();
        a = reelItemRendererOuterClass$ReelItemRenderer;
        aopi.registerDefaultInstance(ReelItemRendererOuterClass$ReelItemRenderer.class, reelItemRendererOuterClass$ReelItemRenderer);
        reelItemRenderer = aopi.newSingularGeneratedExtension(aunb.a, reelItemRendererOuterClass$ReelItemRenderer, reelItemRendererOuterClass$ReelItemRenderer, null, 158884182, aosj.MESSAGE, ReelItemRendererOuterClass$ReelItemRenderer.class);
    }

    private ReelItemRendererOuterClass$ReelItemRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0002\u0016\u0013\u0000\u0000\r\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\f\tᐉ\r\u000bᐉ\u0010\fည\u0011\rဉ\u0012\u000eဌ\u0013\u000fᐉ\u0007\u0010ဌ\u000e\u0012ᐉ\u0001\u0013ဉ\u0015\u0014ᐉ\t\u0015ᐉ\n\u0016ဌ\u000b", new Object[]{"b", "d", "e", "f", "g", "h", "i", "m", "n", "v", "p", "q", "r", auii.m, "u", "o", auii.l, "c", "s", "j", "k", "l", aulk.j});
            case 3:
                return new ReelItemRendererOuterClass$ReelItemRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (ReelItemRendererOuterClass$ReelItemRenderer.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
