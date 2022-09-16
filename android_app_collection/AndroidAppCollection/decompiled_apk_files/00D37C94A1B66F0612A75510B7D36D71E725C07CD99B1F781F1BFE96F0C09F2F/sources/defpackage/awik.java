package defpackage;
/* compiled from: PG */
/* renamed from: awik  reason: default package */
/* loaded from: classes2.dex */
public final class awik extends aopi implements aoqv {
    public static final awik a;
    private static volatile aorb g;
    public avhn b;
    public arag c;
    public arag d;
    public arag e;
    private int h;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        awik awikVar = new awik();
        a = awikVar;
        aopi.registerDefaultInstance(awik.class, awikVar);
    }

    private awik() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005", new Object[]{"h", "b", "c", "d", "e", "i", "f"});
            case 3:
                return new awik();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awik.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
