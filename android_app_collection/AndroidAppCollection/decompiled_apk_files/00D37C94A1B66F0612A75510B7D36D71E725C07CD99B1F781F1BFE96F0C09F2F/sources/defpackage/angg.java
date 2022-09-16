package defpackage;
/* compiled from: PG */
/* renamed from: angg  reason: default package */
/* loaded from: classes.dex */
public final class angg extends aopi implements aoqv {
    public static final angg a;
    private static volatile aorb e;
    public int b;
    public angh c;
    public long d;
    private byte f = 2;

    static {
        angg anggVar = new angg();
        a = anggVar;
        aopi.registerDefaultInstance(angg.class, anggVar);
    }

    private angg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new angg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (angg.class) {
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
