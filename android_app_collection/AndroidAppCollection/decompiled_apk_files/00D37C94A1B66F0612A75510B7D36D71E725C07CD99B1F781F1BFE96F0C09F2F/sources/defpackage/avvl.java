package defpackage;
/* compiled from: PG */
/* renamed from: avvl  reason: default package */
/* loaded from: classes2.dex */
public final class avvl extends aopi implements aoqv {
    public static final avvl a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private aoux g;
    private arag h;
    private apzg i;
    private byte j = 2;

    static {
        avvl avvlVar = new avvl();
        a = avvlVar;
        aopi.registerDefaultInstance(avvl.class, avvlVar);
    }

    private avvl() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0006\u0005ᐉ\u0007\u0007ᐉ\u0004\nᐉ\u0002", new Object[]{"c", "d", "e", "h", "i", "g", "f"});
            case 3:
                return new avvl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avvl.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
