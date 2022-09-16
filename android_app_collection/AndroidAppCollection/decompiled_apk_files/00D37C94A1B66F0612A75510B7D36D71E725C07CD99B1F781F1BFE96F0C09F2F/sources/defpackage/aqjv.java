package defpackage;
/* compiled from: PG */
/* renamed from: aqjv  reason: default package */
/* loaded from: classes2.dex */
public final class aqjv extends aopi implements aoqv {
    public static final aqjv a;
    private static volatile aorb c;
    public avhn b;
    private int d;
    private byte e = 2;

    static {
        aqjv aqjvVar = new aqjv();
        a = aqjvVar;
        aopi.registerDefaultInstance(aqjv.class, aqjvVar);
    }

    private aqjv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new aqjv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqjv.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
