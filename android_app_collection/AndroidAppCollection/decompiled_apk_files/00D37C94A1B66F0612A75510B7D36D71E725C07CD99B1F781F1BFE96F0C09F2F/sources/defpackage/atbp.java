package defpackage;
/* compiled from: PG */
/* renamed from: atbp  reason: default package */
/* loaded from: classes2.dex */
public final class atbp extends aopi implements aoqv {
    public static final atbp a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        atbp atbpVar = new atbp();
        a = atbpVar;
        aopi.registerDefaultInstance(atbp.class, atbpVar);
    }

    private atbp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new atbp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atbp.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
