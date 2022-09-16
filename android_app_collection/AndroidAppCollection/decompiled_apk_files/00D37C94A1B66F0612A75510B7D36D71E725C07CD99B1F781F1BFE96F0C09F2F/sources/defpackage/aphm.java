package defpackage;
/* compiled from: PG */
/* renamed from: aphm  reason: default package */
/* loaded from: classes.dex */
public final class aphm extends aopi implements aoqv {
    public static final aphm a;
    private static volatile aorb j;
    public int b;
    public apok c;
    public arag d;
    public arag e;
    public float f;
    public int g;
    public int h;
    public int i;
    private byte k = 2;

    static {
        aphm aphmVar = new aphm();
        a = aphmVar;
        aopi.registerDefaultInstance(aphm.class, aphmVar);
    }

    private aphm() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aoxm.e});
            case 3:
                return new aphm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aphm.class) {
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
