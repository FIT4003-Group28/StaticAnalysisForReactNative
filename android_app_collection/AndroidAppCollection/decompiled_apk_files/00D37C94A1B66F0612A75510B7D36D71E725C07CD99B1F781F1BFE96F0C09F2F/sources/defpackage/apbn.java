package defpackage;
/* compiled from: PG */
/* renamed from: apbn  reason: default package */
/* loaded from: classes.dex */
public final class apbn extends aopi implements aoqv {
    public static final apbn a;
    private static volatile aorb c;
    private int d;
    private apok e;
    private arag f;
    private aoux g;
    private byte h = 2;
    public aoob b = aoob.b;

    static {
        apbn apbnVar = new apbn();
        a = apbnVar;
        aopi.registerDefaultInstance(apbn.class, apbnVar);
    }

    private apbn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ᐉ\u0003", new Object[]{"d", "e", "f", "b", "g"});
            case 3:
                return new apbn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apbn.class) {
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
