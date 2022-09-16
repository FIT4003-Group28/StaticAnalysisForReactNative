package defpackage;
/* compiled from: PG */
/* renamed from: artu  reason: default package */
/* loaded from: classes2.dex */
public final class artu extends aopi implements aoqv {
    public static final artu a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public int d;
    public asag e;
    public boolean g;
    private byte i = 2;
    public String f = "";

    static {
        artu artuVar = new artu();
        a = artuVar;
        aopi.registerDefaultInstance(artu.class, artuVar);
    }

    private artu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဌ\u0001", new Object[]{"b", "c", "e", "f", "g", "d", auii.u});
            case 3:
                return new artu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (artu.class) {
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
