package defpackage;
/* compiled from: PG */
/* renamed from: avnd  reason: default package */
/* loaded from: classes2.dex */
public final class avnd extends aopi implements aoqv {
    public static final avnd a;
    private static volatile aorb d;
    public avnc b;
    public avnj c;
    private int e;
    private aoux f;
    private byte g = 2;

    static {
        avnd avndVar = new avnd();
        a = avndVar;
        aopi.registerDefaultInstance(avnd.class, avndVar);
    }

    private avnd() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0000", new Object[]{"e", "c", "f", "b"});
            case 3:
                return new avnd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avnd.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
