package defpackage;
/* compiled from: PG */
/* renamed from: arcm  reason: default package */
/* loaded from: classes2.dex */
public final class arcm extends aopi implements aoqv {
    public static final arcm a;
    private static volatile aorb b;
    private int c;
    private aqdn d;
    private aqdi e;
    private aqdr f;
    private aqdz g;
    private byte h = 2;

    static {
        arcm arcmVar = new arcm();
        a = arcmVar;
        aopi.registerDefaultInstance(arcm.class, arcmVar);
    }

    private arcm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uef41ᠸ\ue974⢵\u0004\u0000\u0000\u0004\uef41ᠸᐉ\u0001ﾾ‶ᐉ\u0003\ued6a▻ᐉ\u0002\ue974⢵ᐉ\u0000", new Object[]{"c", "e", "g", "f", "d"});
            case 3:
                return new arcm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcm.class) {
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
