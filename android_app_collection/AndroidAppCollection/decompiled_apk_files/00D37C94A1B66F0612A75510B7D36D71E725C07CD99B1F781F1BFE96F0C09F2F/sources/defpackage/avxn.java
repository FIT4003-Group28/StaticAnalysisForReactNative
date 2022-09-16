package defpackage;
/* compiled from: PG */
/* renamed from: avxn  reason: default package */
/* loaded from: classes2.dex */
public final class avxn extends aopi implements aoqv {
    public static final avxn a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private avxm f;
    private arag g;
    private arag h;
    private aoux i;
    private byte j = 2;

    static {
        avxn avxnVar = new avxn();
        a = avxnVar;
        aopi.registerDefaultInstance(avxn.class, avxnVar);
    }

    private avxn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\tᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avxn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avxn.class) {
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
