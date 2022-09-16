package defpackage;
/* compiled from: PG */
/* renamed from: kkb  reason: default package */
/* loaded from: classes3.dex */
public final class kkb extends aopi implements aoqv {
    public static final kkb a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public long d = -1;
    public long e;
    public long f;

    static {
        kkb kkbVar = new kkb();
        a = kkbVar;
        aopi.registerDefaultInstance(kkb.class, kkbVar);
    }

    private kkb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new kkb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (kkb.class) {
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
