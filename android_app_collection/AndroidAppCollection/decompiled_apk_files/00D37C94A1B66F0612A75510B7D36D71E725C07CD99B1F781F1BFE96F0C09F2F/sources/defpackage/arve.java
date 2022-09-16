package defpackage;
/* compiled from: PG */
/* renamed from: arve  reason: default package */
/* loaded from: classes2.dex */
public final class arve extends aopi implements aoqv {
    public static final arve a;
    private static volatile aorb c;
    public arpa b;
    private int d;
    private arvf e;
    private byte f = 2;

    static {
        arve arveVar = new arve();
        a = arveVar;
        aopi.registerDefaultInstance(arve.class, arveVar);
    }

    private arve() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"d", "b", "e"});
            case 3:
                return new arve();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arve.class) {
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
