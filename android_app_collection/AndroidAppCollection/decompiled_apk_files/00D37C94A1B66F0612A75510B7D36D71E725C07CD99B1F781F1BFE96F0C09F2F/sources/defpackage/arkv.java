package defpackage;
/* compiled from: PG */
/* renamed from: arkv  reason: default package */
/* loaded from: classes2.dex */
public final class arkv extends aopi implements aoqv {
    public static final arkv a;
    private static volatile aorb e;
    public int b;
    public arku c;
    private arpa f;
    private aoux g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        arkv arkvVar = new arkv();
        a = arkvVar;
        aopi.registerDefaultInstance(arkv.class, arkvVar);
    }

    private arkv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"b", "f", "c", "g", "d"});
            case 3:
                return new arkv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arkv.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
