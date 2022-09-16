package defpackage;
/* compiled from: PG */
/* renamed from: atcg  reason: default package */
/* loaded from: classes2.dex */
public final class atcg extends aopi implements aoqv {
    public static final atcg a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        atcg atcgVar = new atcg();
        a = atcgVar;
        aopi.registerDefaultInstance(atcg.class, atcgVar);
    }

    private atcg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", atck.p});
            case 3:
                return new atcg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atcg.class) {
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
