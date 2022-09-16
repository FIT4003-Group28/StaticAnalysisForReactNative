package defpackage;
/* compiled from: PG */
/* renamed from: awbo  reason: default package */
/* loaded from: classes2.dex */
public final class awbo extends aopi implements aoqv {
    public static final awbo a;
    private static volatile aorb h;
    public int b;
    public arag d;
    public arag e;
    public arag f;
    private byte i = 2;
    public String c = "";
    public String g = "";

    static {
        awbo awboVar = new awbo();
        a = awboVar;
        aopi.registerDefaultInstance(awbo.class, awboVar);
    }

    private awbo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new awbo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awbo.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
