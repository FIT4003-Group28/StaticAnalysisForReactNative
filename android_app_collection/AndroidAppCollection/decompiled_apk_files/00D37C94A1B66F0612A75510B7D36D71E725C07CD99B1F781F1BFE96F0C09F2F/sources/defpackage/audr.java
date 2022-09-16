package defpackage;
/* compiled from: PG */
/* renamed from: audr  reason: default package */
/* loaded from: classes2.dex */
public final class audr extends aopi implements aoqv {
    public static final audr a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public boolean d;
    public apzg e;
    private arag g;
    private byte h = 2;

    static {
        audr audrVar = new audr();
        a = audrVar;
        aopi.registerDefaultInstance(audr.class, audrVar);
    }

    private audr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"b", "g", "c", "d", "e"});
            case 3:
                return new audr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (audr.class) {
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
