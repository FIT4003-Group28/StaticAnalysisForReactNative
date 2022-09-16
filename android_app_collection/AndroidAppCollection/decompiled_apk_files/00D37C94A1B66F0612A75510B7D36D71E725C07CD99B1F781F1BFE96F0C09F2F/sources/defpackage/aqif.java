package defpackage;
/* compiled from: PG */
/* renamed from: aqif  reason: default package */
/* loaded from: classes2.dex */
public final class aqif extends aopi implements aoqv {
    public static final aqif a;
    private static volatile aorb b;
    private int c;
    private arjw d;
    private byte e = 2;

    static {
        aqif aqifVar = new aqif();
        a = aqifVar;
        aopi.registerDefaultInstance(aqif.class, aqifVar);
    }

    private aqif() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uec81⟕\uec81⟕\u0001\u0000\u0000\u0001\uec81⟕ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqif();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqif.class) {
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
