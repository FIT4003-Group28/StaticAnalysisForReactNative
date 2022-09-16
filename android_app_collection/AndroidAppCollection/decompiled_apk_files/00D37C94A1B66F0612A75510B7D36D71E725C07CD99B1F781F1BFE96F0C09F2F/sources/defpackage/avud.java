package defpackage;
/* compiled from: PG */
/* renamed from: avud  reason: default package */
/* loaded from: classes2.dex */
public final class avud extends aopi implements aoqv {
    public static final avud a;
    private static volatile aorb e;
    public int b;
    public avtt c;
    public aopq d = emptyIntList();

    static {
        avud avudVar = new avud();
        a = avudVar;
        aopi.registerDefaultInstance(avud.class, avudVar);
    }

    private avud() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"b", "c", "d", avuj.a()});
            case 3:
                return new avud();
            case 4:
                return new aopa((int[][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avud.class) {
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
