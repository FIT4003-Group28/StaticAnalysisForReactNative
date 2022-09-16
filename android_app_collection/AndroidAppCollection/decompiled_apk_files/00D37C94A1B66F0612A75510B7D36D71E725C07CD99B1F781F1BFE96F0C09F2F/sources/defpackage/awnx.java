package defpackage;
/* compiled from: PG */
/* renamed from: awnx  reason: default package */
/* loaded from: classes2.dex */
public final class awnx extends aopi implements aoqv {
    public static final awnx a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public int d;

    static {
        awnx awnxVar = new awnx();
        a = awnxVar;
        aopi.registerDefaultInstance(awnx.class, awnxVar);
    }

    private awnx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဋ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new awnx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awnx.class) {
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
