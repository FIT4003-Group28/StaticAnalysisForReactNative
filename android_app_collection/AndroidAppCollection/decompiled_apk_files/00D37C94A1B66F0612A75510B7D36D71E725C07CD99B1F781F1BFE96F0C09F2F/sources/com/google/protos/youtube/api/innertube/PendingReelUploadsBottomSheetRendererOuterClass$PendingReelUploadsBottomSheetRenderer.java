package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer extends aopi implements aoqv {
    public static final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    private static volatile aorb g;
    public static final aopg pendingReelUploadsBottomSheetRenderer;
    public int b;
    public arag c;
    public aunb d;
    public aunb e;
    private arag h;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer = new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
        a = pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
        aopi.registerDefaultInstance(PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class, pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer);
        pendingReelUploadsBottomSheetRenderer = aopi.newSingularGeneratedExtension(aunb.a, pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer, pendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer, null, 291412923, aosj.MESSAGE, PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class);
    }

    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "i"});
            case 3:
                return new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class) {
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
