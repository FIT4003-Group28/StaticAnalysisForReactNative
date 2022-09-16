package defpackage;
/* compiled from: PG */
/* renamed from: aufg  reason: default package */
/* loaded from: classes2.dex */
public final class aufg extends aopi implements aoqv {
    public static final aufg a;
    private static volatile aorb e;
    public int b;
    public int c;
    public aopp d = emptyFloatList();
    private int f;

    static {
        aufg aufgVar = new aufg();
        a = aufgVar;
        aopi.registerDefaultInstance(aufg.class, aufgVar);
    }

    private aufg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aufg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aufg.class) {
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
