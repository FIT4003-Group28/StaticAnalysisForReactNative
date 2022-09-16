package defpackage;
/* compiled from: PG */
/* renamed from: asro  reason: default package */
/* loaded from: classes2.dex */
public final class asro extends aopi implements aoqv {
    public static final asro a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public long e;
    public asrn f;
    public arag g;
    private byte i = 2;

    static {
        asro asroVar = new asro();
        a = asroVar;
        aopi.registerDefaultInstance(asro.class, asroVar);
    }

    private asro() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဂ\u0001\u0005ᐉ\u0005\u0006ဂ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "f", "e", "g"});
            case 3:
                return new asro();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asro.class) {
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
