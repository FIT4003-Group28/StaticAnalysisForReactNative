package defpackage;
/* compiled from: PG */
/* renamed from: asdd  reason: default package */
/* loaded from: classes2.dex */
public final class asdd extends aopi implements aoqv {
    public static final asdd a;
    private static volatile aorb g;
    public Object c;
    public Object e;
    public arpa f;
    private int h;
    private arbf i;
    public int b = 0;
    public int d = 0;
    private byte j = 2;

    static {
        asdd asddVar = new asdd();
        a = asddVar;
        aopi.registerDefaultInstance(asdd.class, asddVar);
    }

    private asdd() {
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
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001̉\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0001\u0004ျ\u0000\u0005ျ\u0001̉ᐉ\u0005", new Object[]{"c", "b", "e", "d", "h", "f", asaj.class, asgt.class, "i"});
            case 3:
                return new asdd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asdd.class) {
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
