package defpackage;
/* compiled from: PG */
/* renamed from: avqn  reason: default package */
/* loaded from: classes2.dex */
public final class avqn extends aopi implements aoqv {
    public static final avqn a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private avpu h;
    private apok i;
    private apok j;
    private arag k;
    private apok l;
    private apok m;
    private apok n;
    private aoux o;
    private byte p = 2;

    static {
        avqn avqnVar = new avqn();
        a = avqnVar;
        aopi.registerDefaultInstance(avqn.class, avqnVar);
    }

    private avqn() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0000\f\u0002ᐉ\u0002\u0003ᐉ\u0005\u0004ᐉ\u0007\u0006ᐉ\u000f\u0007ᐉ\b\bᐉ\u0004\tᐉ\t\fᐉ\n\rᐉ\u000b\u000eᐉ\f\u000fᐉ\r\u0011ᐉ\u0003", new Object[]{"c", "d", "g", "h", "o", "i", "f", "j", "k", "l", "m", "n", "e"});
            case 3:
                return new avqn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqn.class) {
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
