package defpackage;
/* compiled from: PG */
/* renamed from: awip  reason: default package */
/* loaded from: classes2.dex */
public final class awip extends aopi implements aoqv {
    public static final awip a;
    private static volatile aorb d;
    public int b;
    public arag c;
    private arag e;
    private apok f;
    private apok g;
    private aoux h;
    private byte i = 2;

    static {
        awip awipVar = new awip();
        a = awipVar;
        aopi.registerDefaultInstance(awip.class, awipVar);
    }

    private awip() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0006ᐉ\u0004", new Object[]{"b", "e", "c", "f", "h", "g"});
            case 3:
                return new awip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awip.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
