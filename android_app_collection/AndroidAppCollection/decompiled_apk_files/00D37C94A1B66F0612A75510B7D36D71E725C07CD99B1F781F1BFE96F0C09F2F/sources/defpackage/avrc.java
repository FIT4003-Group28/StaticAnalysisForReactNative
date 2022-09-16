package defpackage;
/* compiled from: PG */
/* renamed from: avrc  reason: default package */
/* loaded from: classes2.dex */
public final class avrc extends aopi implements aoqv {
    public static final avrc a;
    private static volatile aorb f;
    public arag b;
    public arag c;
    public aovr d;
    public long e;
    private int g;
    private byte h = 2;

    static {
        avrc avrcVar = new avrc();
        a = avrcVar;
        aopi.registerDefaultInstance(avrc.class, avrcVar);
    }

    private avrc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ဂ\u0003\u0004ᐉ\u0001\u0006ဉ\u0002", new Object[]{"g", "b", "e", "c", "d"});
            case 3:
                return new avrc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avrc.class) {
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
