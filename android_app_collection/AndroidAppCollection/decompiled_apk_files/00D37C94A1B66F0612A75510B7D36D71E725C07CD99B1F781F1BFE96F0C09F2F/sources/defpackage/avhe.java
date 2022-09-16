package defpackage;
/* compiled from: PG */
/* renamed from: avhe  reason: default package */
/* loaded from: classes2.dex */
public final class avhe extends aopi implements aoqv {
    public static final avhe a;
    private static volatile aorb g;
    public int b;
    public arhs c;
    public arag d;
    public int e;
    public int f;
    private byte h = 2;

    static {
        avhe avheVar = new avhe();
        a = avheVar;
        aopi.registerDefaultInstance(avhe.class, avheVar);
    }

    private avhe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ဌ\u0002\u0003ဌ\u0003\u0004ᐉ\u0000", new Object[]{"b", "d", "e", avge.f, "f", avge.d, "c"});
            case 3:
                return new avhe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avhe.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
