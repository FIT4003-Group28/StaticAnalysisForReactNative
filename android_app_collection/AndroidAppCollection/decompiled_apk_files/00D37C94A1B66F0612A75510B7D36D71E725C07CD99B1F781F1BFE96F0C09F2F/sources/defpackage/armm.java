package defpackage;
/* compiled from: PG */
/* renamed from: armm  reason: default package */
/* loaded from: classes2.dex */
public final class armm extends aopi implements aoqv {
    public static final armm a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public armi d;
    public int e;
    public aptr g;
    private byte i = 2;
    public String f = "";

    static {
        armm armmVar = new armm();
        a = armmVar;
        aopi.registerDefaultInstance(armm.class, armmVar);
    }

    private armm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ဌ\u0002\u0005ဈ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", arka.j, "f", "g"});
            case 3:
                return new armm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (armm.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
