package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand extends aopi implements aoqv {
    public static final RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand a;
    private static volatile aorb b;
    public static final aopg rotateToOptimalFullscreenOrientationCommand;

    static {
        RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand rotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand = new RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand();
        a = rotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand;
        aopi.registerDefaultInstance(RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class, rotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand);
        rotateToOptimalFullscreenOrientationCommand = aopi.newSingularGeneratedExtension(apzg.a, rotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand, rotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand, null, 282384239, aosj.MESSAGE, RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class);
    }

    private RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand() {
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
                return new RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.class) {
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
