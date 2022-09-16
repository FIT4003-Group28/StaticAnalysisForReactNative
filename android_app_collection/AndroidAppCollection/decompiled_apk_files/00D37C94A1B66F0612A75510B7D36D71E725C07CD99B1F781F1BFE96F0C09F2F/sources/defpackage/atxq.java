package defpackage;
/* compiled from: PG */
/* renamed from: atxq  reason: default package */
/* loaded from: classes2.dex */
public final class atxq extends aopi implements aoqv {
    public static final atxq a;
    private static volatile aorb b;
    private int c;
    private aueo d;
    private arag e;
    private arag f;
    private arag g;
    private apzg h;
    private aoux i;
    private byte j = 2;

    static {
        atxq atxqVar = new atxq();
        a = atxqVar;
        aopi.registerDefaultInstance(atxq.class, atxqVar);
    }

    private atxq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new atxq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atxq.class) {
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
