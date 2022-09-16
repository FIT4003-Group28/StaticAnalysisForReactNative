package defpackage;
/* compiled from: PG */
/* renamed from: avoe  reason: default package */
/* loaded from: classes2.dex */
public final class avoe extends aopi implements aoqv {
    public static final avoe a;
    private static volatile aorb l;
    public int b;
    public avhn c;
    public avhn d;
    public avod e;
    public arag f;
    public awig h;
    public apok i;
    public avoa j;
    private arag m;
    private arag n;
    private arag o;
    private arag p;
    private aoux q;
    private byte r = 2;
    public aopu g = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        avoe avoeVar = new avoe();
        a = avoeVar;
        aopi.registerDefaultInstance(avoe.class, avoeVar);
    }

    private avoe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\b\u0005ᐉ\u0010\u0006ည\u0011\u0007ᐉ\u0001\bᐉ\u0005\tᐉ\t\u000bЛ\fᐉ\u0007\u000eဉ\u0002\u000fᐉ\f\u0013ᐉ\u0006", new Object[]{"b", "c", "m", "f", "i", "q", "k", "d", "n", "p", "g", arag.class, "h", "e", "j", "o"});
            case 3:
                return new avoe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avoe.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
