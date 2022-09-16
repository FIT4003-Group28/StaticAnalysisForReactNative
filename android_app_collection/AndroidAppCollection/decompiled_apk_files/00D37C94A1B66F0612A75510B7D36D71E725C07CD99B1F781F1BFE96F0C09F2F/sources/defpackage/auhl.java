package defpackage;
/* compiled from: PG */
/* renamed from: auhl  reason: default package */
/* loaded from: classes2.dex */
public final class auhl extends aopi implements aoqv {
    public static final auhl a;
    private static volatile aorb b;
    private int c;
    private auhv d;
    private auhi e;
    private aozy f;
    private aoux g;
    private byte h = 2;

    static {
        auhl auhlVar = new auhl();
        a = auhlVar;
        aopi.registerDefaultInstance(auhl.class, auhlVar);
    }

    private auhl() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0004ᐉ\u0004\u0006ᐉ\u0001\u0007ᐉ\u0003", new Object[]{"c", "d", "g", "e", "f"});
            case 3:
                return new auhl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auhl.class) {
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
