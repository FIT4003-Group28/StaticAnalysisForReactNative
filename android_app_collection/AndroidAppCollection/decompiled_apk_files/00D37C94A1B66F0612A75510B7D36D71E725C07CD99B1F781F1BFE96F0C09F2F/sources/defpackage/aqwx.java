package defpackage;
/* compiled from: PG */
/* renamed from: aqwx  reason: default package */
/* loaded from: classes2.dex */
public final class aqwx extends aopi implements aoqv {
    public static final aqwx a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        aqwx aqwxVar = new aqwx();
        a = aqwxVar;
        aopi.registerDefaultInstance(aqwx.class, aqwxVar);
    }

    private aqwx() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0004\u0005ᐉ\u0001", new Object[]{"c", "d", "f", "e"});
            case 3:
                return new aqwx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqwx.class) {
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
