package defpackage;
/* compiled from: PG */
/* renamed from: auqd  reason: default package */
/* loaded from: classes2.dex */
public final class auqd extends aopi implements aoqv {
    public static final auqd a;
    private static volatile aorb e;
    public int b;
    public aunb c;
    public int d;
    private byte f = 2;

    static {
        auqd auqdVar = new auqd();
        a = auqdVar;
        aopi.registerDefaultInstance(auqd.class, auqdVar);
    }

    private auqd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", aupm.d});
            case 3:
                return new auqd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auqd.class) {
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
