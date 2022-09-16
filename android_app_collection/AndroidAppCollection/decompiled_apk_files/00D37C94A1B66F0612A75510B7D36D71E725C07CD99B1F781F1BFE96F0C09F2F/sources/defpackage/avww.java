package defpackage;
/* compiled from: PG */
/* renamed from: avww  reason: default package */
/* loaded from: classes2.dex */
public final class avww extends aopi implements aoqv {
    public static final avww a;
    private static volatile aorb f;
    public int b;
    public apai c;
    public aoyz e;
    private aoux g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        avww avwwVar = new avww();
        a = avwwVar;
        aopi.registerDefaultInstance(avww.class, avwwVar);
    }

    private avww() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "g", "d", "e"});
            case 3:
                return new avww();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avww.class) {
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
