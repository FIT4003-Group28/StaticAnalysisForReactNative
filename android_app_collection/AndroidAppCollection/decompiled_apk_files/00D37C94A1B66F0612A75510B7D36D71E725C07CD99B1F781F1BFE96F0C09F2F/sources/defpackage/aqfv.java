package defpackage;
/* compiled from: PG */
/* renamed from: aqfv  reason: default package */
/* loaded from: classes2.dex */
public final class aqfv extends aopi implements aoqv {
    public static final aqfv a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    private aoux g;
    private byte h = 2;

    static {
        aqfv aqfvVar = new aqfv();
        a = aqfvVar;
        aopi.registerDefaultInstance(aqfv.class, aqfvVar);
    }

    private aqfv() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new aqfv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqfv.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
