package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer extends aopi implements aoqv {
    public static final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer a;
    public static final aopg companionStateRenderer;
    private static volatile aorb f;
    public int b;
    public aunb d;
    public boolean e;
    private apzg g;
    private byte h = 2;
    public String c = "";

    static {
        MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
        a = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
        aopi.registerDefaultInstance(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer);
        companionStateRenderer = aopi.newSingularGeneratedExtension(aunb.a, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer, null, 166494362, aosj.MESSAGE, MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class);
    }

    private MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "g", "e"});
            case 3:
                return new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class) {
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
