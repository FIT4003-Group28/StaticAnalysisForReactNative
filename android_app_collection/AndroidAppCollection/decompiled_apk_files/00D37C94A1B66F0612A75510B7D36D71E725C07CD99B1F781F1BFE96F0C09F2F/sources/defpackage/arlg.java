package defpackage;
/* compiled from: PG */
/* renamed from: arlg  reason: default package */
/* loaded from: classes2.dex */
public final class arlg extends aopi implements aoqv {
    public static final arlg a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        arlg arlgVar = new arlg();
        a = arlgVar;
        aopi.registerDefaultInstance(arlg.class, arlgVar);
    }

    private arlg() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဋ\u0003", new Object[]{"b", "c", arka.i, "d"});
            case 3:
                return new arlg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arlg.class) {
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
