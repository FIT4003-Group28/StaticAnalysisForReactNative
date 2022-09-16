package defpackage;
/* compiled from: PG */
/* renamed from: awio  reason: default package */
/* loaded from: classes2.dex */
public final class awio extends aopi implements aoqv {
    public static final awio a;
    private static volatile aorb e;
    public int b;
    public awii c;
    public awij d;
    private awih f;
    private byte g = 2;

    static {
        awio awioVar = new awio();
        a = awioVar;
        aopi.registerDefaultInstance(awio.class, awioVar);
    }

    private awio() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueb52⃢\uf4cb♄\u0003\u0000\u0000\u0003\ueb52⃢ᐉ\u0001\uf374\u20f1ᐉ\u0000\uf4cb♄ᐉ\u0002", new Object[]{"b", "d", "c", "f"});
            case 3:
                return new awio();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awio.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
