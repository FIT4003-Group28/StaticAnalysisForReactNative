package defpackage;
/* compiled from: PG */
/* renamed from: avdz  reason: default package */
/* loaded from: classes2.dex */
public final class avdz extends aopi implements aoqv {
    public static final avdz a;
    private static volatile aorb b;
    private int c;
    private arha d;
    private byte e = 2;

    static {
        avdz avdzVar = new avdz();
        a = avdzVar;
        aopi.registerDefaultInstance(avdz.class, avdzVar);
    }

    private avdz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue7ecᢆ\ue7ecᢆ\u0001\u0000\u0000\u0001\ue7ecᢆᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new avdz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avdz.class) {
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
