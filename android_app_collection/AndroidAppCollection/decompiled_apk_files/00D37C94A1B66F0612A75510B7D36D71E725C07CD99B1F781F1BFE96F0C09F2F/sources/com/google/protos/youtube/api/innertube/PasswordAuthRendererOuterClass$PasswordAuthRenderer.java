package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PasswordAuthRendererOuterClass$PasswordAuthRenderer extends aopi implements aoqv {
    public static final PasswordAuthRendererOuterClass$PasswordAuthRenderer a;
    private static volatile aorb n;
    public static final aopg passwordAuthRenderer;
    public int b;
    public arag c;
    public int e;
    public boolean f;
    public arag g;
    public arag h;
    public arag j;
    public apwe k;
    public aunb l;
    public int m;
    private aoux o;
    private byte p = 2;
    public aopu d = emptyProtobufList();
    public aoob i = aoob.b;

    static {
        PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer = new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
        a = passwordAuthRendererOuterClass$PasswordAuthRenderer;
        aopi.registerDefaultInstance(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, passwordAuthRendererOuterClass$PasswordAuthRenderer);
        passwordAuthRenderer = aopi.newSingularGeneratedExtension(aunb.a, passwordAuthRendererOuterClass$PasswordAuthRenderer, passwordAuthRendererOuterClass$PasswordAuthRenderer, null, 196176225, aosj.MESSAGE, PasswordAuthRendererOuterClass$PasswordAuthRenderer.class);
    }

    private PasswordAuthRendererOuterClass$PasswordAuthRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0006\tᐉ\u0007\nဉ\b\u000bᐉ\t\fဌ\n", new Object[]{"b", "c", "d", arag.class, "e", "f", "g", "h", "o", "i", "j", "k", "l", "m", apiv.a});
            case 3:
                return new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (PasswordAuthRendererOuterClass$PasswordAuthRenderer.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
