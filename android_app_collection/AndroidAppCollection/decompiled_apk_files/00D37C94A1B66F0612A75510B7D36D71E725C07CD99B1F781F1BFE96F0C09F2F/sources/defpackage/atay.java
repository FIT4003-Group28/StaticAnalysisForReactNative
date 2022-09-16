package defpackage;
/* compiled from: PG */
/* renamed from: atay  reason: default package */
/* loaded from: classes2.dex */
public final class atay extends aopi implements aoqv {
    public static final atay a;
    private static volatile aorb d;
    public Object c;
    private int e;
    private arag f;
    private arag g;
    private apok h;
    private arag i;
    public int b = 0;
    private byte j = 2;

    static {
        atay atayVar = new atay();
        a = atayVar;
        aopi.registerDefaultInstance(atay.class, atayVar);
    }

    private atay() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001ဿ\u0000\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tှ\u0000", new Object[]{"c", "b", "e", auca.p, "f", "g", "h", "i"});
            case 3:
                return new atay();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atay.class) {
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
