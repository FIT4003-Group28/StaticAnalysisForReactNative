package defpackage;
/* compiled from: PG */
/* renamed from: avgw  reason: default package */
/* loaded from: classes2.dex */
public final class avgw extends aopi implements aoqv {
    public static final avgw a;
    private static volatile aorb d;
    public int b;
    public arhs c;
    private arag e;
    private byte f = 2;

    static {
        avgw avgwVar = new avgw();
        a = avgwVar;
        aopi.registerDefaultInstance(avgw.class, avgwVar);
    }

    private avgw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "e", "c"});
            case 3:
                return new avgw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avgw.class) {
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
