package defpackage;
/* compiled from: PG */
/* renamed from: aoxo  reason: default package */
/* loaded from: classes.dex */
public final class aoxo extends aopi implements aoqv {
    public static final aopr a = new uil(8);
    public static final aoxo b;
    private static volatile aorb e;
    public boolean c;
    private int f;
    private apzg g;
    private byte h = 2;
    public aopq d = emptyIntList();

    static {
        aoxo aoxoVar = new aoxo();
        b = aoxoVar;
        aopi.registerDefaultInstance(aoxo.class, aoxoVar);
    }

    private aoxo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ဇ\u0000\u0003ᐉ\u0003\u0005\u001e", new Object[]{"f", "c", "g", "d", aoxn.a()});
            case 3:
                return new aoxo();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoxo.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
