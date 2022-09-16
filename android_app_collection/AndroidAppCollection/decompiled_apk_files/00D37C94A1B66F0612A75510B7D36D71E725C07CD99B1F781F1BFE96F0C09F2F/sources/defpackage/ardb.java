package defpackage;
/* compiled from: PG */
/* renamed from: ardb  reason: default package */
/* loaded from: classes2.dex */
public final class ardb extends aopi implements aoqv {
    public static final ardb a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public arcz f;
    private arag i;
    private byte j = 2;
    public aopu g = emptyProtobufList();

    static {
        ardb ardbVar = new ardb();
        a = ardbVar;
        aopi.registerDefaultInstance(ardb.class, ardbVar);
    }

    private ardb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0004\u0005\u001b\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", arda.class, "i"});
            case 3:
                return new ardb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (ardb.class) {
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
