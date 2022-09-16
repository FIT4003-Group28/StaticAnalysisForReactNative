package defpackage;
/* compiled from: PG */
/* renamed from: avmz  reason: default package */
/* loaded from: classes2.dex */
public final class avmz extends aopi implements aoqv {
    public static final avmz a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private avnb e;
    private aoux f;
    private byte g = 2;

    static {
        avmz avmzVar = new avmz();
        a = avmzVar;
        aopi.registerDefaultInstance(avmz.class, avmzVar);
    }

    private avmz() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new avmz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avmz.class) {
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
