package defpackage;
/* compiled from: PG */
/* renamed from: apbm  reason: default package */
/* loaded from: classes.dex */
public final class apbm extends aopi implements aoqv {
    public static final apbm a;
    private static volatile aorb c;
    private int d;
    private arag e;
    private aoux f;
    private byte g = 2;
    public aoob b = aoob.b;

    static {
        apbm apbmVar = new apbm();
        a = apbmVar;
        aopi.registerDefaultInstance(apbm.class, apbmVar);
    }

    private apbm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ည\u0005", new Object[]{"d", "e", "f", "b"});
            case 3:
                return new apbm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apbm.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
