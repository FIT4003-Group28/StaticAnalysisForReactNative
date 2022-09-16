package defpackage;
/* compiled from: PG */
/* renamed from: arbs  reason: default package */
/* loaded from: classes2.dex */
public final class arbs extends aopi implements aoqv {
    public static final arbs a;
    private static volatile aorb b;
    private int c;
    private aqfa d;
    private aqio e;
    private aqei f;
    private byte g = 2;

    static {
        arbs arbsVar = new arbs();
        a = arbsVar;
        aopi.registerDefaultInstance(arbs.class, arbsVar);
    }

    private arbs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf143ᠤ\uf5b1⼞\u0003\u0000\u0000\u0003\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0002\uf5b1⼞ᐉ\u0001", new Object[]{"c", "d", "f", "e"});
            case 3:
                return new arbs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arbs.class) {
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
