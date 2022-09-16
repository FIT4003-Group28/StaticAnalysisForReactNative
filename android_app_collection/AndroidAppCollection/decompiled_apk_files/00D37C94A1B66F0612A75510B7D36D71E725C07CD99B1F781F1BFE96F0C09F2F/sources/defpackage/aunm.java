package defpackage;
/* compiled from: PG */
/* renamed from: aunm  reason: default package */
/* loaded from: classes2.dex */
public final class aunm extends aopi implements aoqv {
    public static final aunm a;
    private static volatile aorb j;
    public int b;
    public atum c;
    public arag d;
    public arag e;
    public apok f;
    public apok g;
    public apnm h;
    private arag k;
    private apok l;
    private apnm m;
    private aoux n;
    private byte o = 2;
    public aoob i = aoob.b;

    static {
        aunm aunmVar = new aunm();
        a = aunmVar;
        aopi.registerDefaultInstance(aunm.class, aunmVar);
    }

    private aunm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\t\u0003ည\n\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0002\bᐉ\u0003\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "n", "i", "d", "f", "l", "k", "e", "g", "h", "m"});
            case 3:
                return new aunm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aunm.class) {
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
