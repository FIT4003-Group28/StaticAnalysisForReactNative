package defpackage;
/* compiled from: PG */
/* renamed from: avna  reason: default package */
/* loaded from: classes2.dex */
public final class avna extends aopi implements aoqv {
    public static final avna a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apok g;
    private apok h;
    private aoux i;
    private byte j = 2;

    static {
        avna avnaVar = new avna();
        a = avnaVar;
        aopi.registerDefaultInstance(avna.class, avnaVar);
    }

    private avna() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004\tᐉ\b\nᐉ\t\fᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avna();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avna.class) {
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
