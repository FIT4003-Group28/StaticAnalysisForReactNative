package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer extends aopi implements aoqv {
    public static final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer a;
    private static volatile aorb f;
    public static final aopg passwordBiometricAuthRenderer;
    public int b;
    public aunb c;
    public arag d;
    public boolean e;
    private byte g = 2;

    static {
        PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer = new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
        a = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
        aopi.registerDefaultInstance(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class, passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);
        passwordBiometricAuthRenderer = aopi.newSingularGeneratedExtension(aunb.a, passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, null, 310393920, aosj.MESSAGE, PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class);
    }

    private PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class) {
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
