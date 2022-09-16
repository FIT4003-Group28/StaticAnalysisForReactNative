package defpackage;
/* compiled from: PG */
/* renamed from: atso  reason: default package */
/* loaded from: classes2.dex */
public final class atso extends aopi implements aoqv {
    public static final atso a;
    private static volatile aorb e;
    public arpa b;
    public boolean c;
    public long d;
    private int f;
    private arbf g;
    private byte h = 2;

    static {
        atso atsoVar = new atso();
        a = atsoVar;
        aopi.registerDefaultInstance(atso.class, atsoVar);
    }

    private atso() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဂ\u0002̉ᐉ\u0003", new Object[]{"f", "b", "c", "d", "g"});
            case 3:
                return new atso();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atso.class) {
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
