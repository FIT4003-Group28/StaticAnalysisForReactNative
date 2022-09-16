package defpackage;
/* compiled from: PG */
/* renamed from: arth  reason: default package */
/* loaded from: classes2.dex */
public final class arth extends aopi implements aoqv {
    public static final arth a;
    private static volatile aorb e;
    public Object c;
    public arpa d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        arth arthVar = new arth();
        a = arthVar;
        aopi.registerDefaultInstance(arth.class, arthVar);
    }

    private arth() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"c", "b", "f", "d", apzg.class, apzg.class});
            case 3:
                return new arth();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arth.class) {
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
