package defpackage;
/* compiled from: PG */
/* renamed from: auau  reason: default package */
/* loaded from: classes2.dex */
public final class auau extends aopi implements aoqv {
    public static final auau a;
    private static volatile aorb d;
    public int b;
    public auas c;
    private auat e;
    private apoj f;
    private asov g;
    private byte h = 2;

    static {
        auau auauVar = new auau();
        a = auauVar;
        aopi.registerDefaultInstance(auau.class, auauVar);
    }

    private auau() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uea9e\u1ca7\uf830㷭\u0004\u0000\u0000\u0004\uea9e\u1ca7ᐉ\u0002\ueb11ἑᐉ\u0001\ue917►ᐉ\u0000\uf830㷭ᐉ\u0003", new Object[]{"b", "g", "f", "e", "c"});
            case 3:
                return new auau();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auau.class) {
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
