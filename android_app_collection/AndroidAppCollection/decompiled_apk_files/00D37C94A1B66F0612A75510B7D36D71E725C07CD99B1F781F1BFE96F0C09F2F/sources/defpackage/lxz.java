package defpackage;
/* compiled from: PG */
/* renamed from: lxz  reason: default package */
/* loaded from: classes3.dex */
public final class lxz extends aopi implements aoqv {
    public static final lxz a;
    private static volatile aorb e;
    public int b;
    public long c = -1;
    public int d;

    static {
        lxz lxzVar = new lxz();
        a = lxzVar;
        aopi.registerDefaultInstance(lxz.class, lxzVar);
    }

    private lxz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new lxz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (lxz.class) {
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
