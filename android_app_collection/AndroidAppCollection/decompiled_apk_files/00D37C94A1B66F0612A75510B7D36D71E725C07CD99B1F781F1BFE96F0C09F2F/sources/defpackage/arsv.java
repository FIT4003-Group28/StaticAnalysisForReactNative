package defpackage;
/* compiled from: PG */
/* renamed from: arsv  reason: default package */
/* loaded from: classes2.dex */
public final class arsv extends aopi implements aoqv {
    public static final arsv a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public arag d;
    private int f;
    private byte g = 2;

    static {
        arsv arsvVar = new arsv();
        a = arsvVar;
        aopi.registerDefaultInstance(arsv.class, arsvVar);
    }

    private arsv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"f", "b", arpt.d, "c", "d"});
            case 3:
                return new arsv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arsv.class) {
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
