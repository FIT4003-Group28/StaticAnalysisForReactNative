package defpackage;
/* compiled from: PG */
/* renamed from: army  reason: default package */
/* loaded from: classes2.dex */
public final class army extends aopi implements aoqv {
    public static final army a;
    private static volatile aorb d;
    public arpa b;
    public aqhz c;
    private int e;
    private aoux f;
    private byte g = 2;

    static {
        army armyVar = new army();
        a = armyVar;
        aopi.registerDefaultInstance(army.class, armyVar);
    }

    private army() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "b", "c", "f"});
            case 3:
                return new army();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (army.class) {
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
