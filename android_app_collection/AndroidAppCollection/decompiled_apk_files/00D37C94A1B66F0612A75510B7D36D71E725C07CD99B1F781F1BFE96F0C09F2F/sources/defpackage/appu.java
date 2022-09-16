package defpackage;
/* compiled from: PG */
/* renamed from: appu  reason: default package */
/* loaded from: classes2.dex */
public final class appu extends aopi implements aoqv {
    public static final appu a;
    private static volatile aorb c;
    public atzs b;
    private int d;
    private atzo e;
    private byte f = 2;

    static {
        appu appuVar = new appu();
        a = appuVar;
        aopi.registerDefaultInstance(appu.class, appuVar);
    }

    private appu() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ufdd2ត\uee01ᢝ\u0002\u0000\u0000\u0002\ufdd2តᐉ\u0000\uee01ᢝᐉ\u0001", new Object[]{"d", "e", "b"});
            case 3:
                return new appu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (appu.class) {
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
