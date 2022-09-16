package defpackage;
/* compiled from: PG */
/* renamed from: aswy  reason: default package */
/* loaded from: classes2.dex */
public final class aswy extends aopi implements aoqv {
    public static final aswy a;
    private static volatile aorb j;
    public int b;
    public int c;
    public arag e;
    public arag f;
    public awmt g;
    public awmt h;
    public awmt i;
    private byte k = 2;
    public aopu d = emptyProtobufList();

    static {
        aswy aswyVar = new aswy();
        a = aswyVar;
        aopi.registerDefaultInstance(aswy.class, aswyVar);
    }

    private aswy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001ဌ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "c", asut.k, "d", asww.class, "e", "f", "g", "h", "i"});
            case 3:
                return new aswy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aswy.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
