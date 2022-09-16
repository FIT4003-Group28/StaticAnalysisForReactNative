package defpackage;
/* compiled from: PG */
/* renamed from: artr  reason: default package */
/* loaded from: classes2.dex */
public final class artr extends aopi implements aoqv {
    public static final artr a;
    private static volatile aorb i;
    public arpa b;
    public aunb c;
    public aunb d;
    public aunb e;
    public boolean g;
    public apzg h;
    private int j;
    private aoux k;
    private arbf l;
    private byte m = 2;
    public aoob f = aoob.b;

    static {
        artr artrVar = new artr();
        a = artrVar;
        aopi.registerDefaultInstance(artr.class, artrVar);
    }

    private artr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ဇ\u0006\bᐉ\u0007̉ᐉ\b", new Object[]{"j", "b", "c", "d", "e", "k", "f", "g", "h", "l"});
            case 3:
                return new artr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (artr.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
