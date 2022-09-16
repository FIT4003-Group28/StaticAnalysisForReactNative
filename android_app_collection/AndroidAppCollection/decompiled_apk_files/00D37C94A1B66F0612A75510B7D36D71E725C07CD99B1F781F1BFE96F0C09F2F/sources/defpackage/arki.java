package defpackage;
/* compiled from: PG */
/* renamed from: arki  reason: default package */
/* loaded from: classes2.dex */
public final class arki extends aopi implements aoqv {
    public static final arki a;
    private static volatile aorb c;
    public asue b;
    private int d;
    private byte e = 2;

    static {
        arki arkiVar = new arki();
        a = arkiVar;
        aopi.registerDefaultInstance(arki.class, arkiVar);
    }

    private arki() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue572㬡\ue572㬡\u0001\u0000\u0000\u0001\ue572㬡ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new arki();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arki.class) {
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
