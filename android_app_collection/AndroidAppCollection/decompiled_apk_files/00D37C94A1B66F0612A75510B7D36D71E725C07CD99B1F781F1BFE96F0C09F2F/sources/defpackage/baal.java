package defpackage;
/* compiled from: PG */
/* renamed from: baal  reason: default package */
/* loaded from: classes2.dex */
public final class baal extends aopi implements aoqv {
    public static final baal a;
    private static volatile aorb e;
    public aopt b = emptyLongList();
    public aopt c = emptyLongList();
    public aopq d = emptyIntList();

    static {
        baal baalVar = new baal();
        a = baalVar;
        aopi.registerDefaultInstance(baal.class, baalVar);
    }

    private baal() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001%\u0002%\u0003'", new Object[]{"b", "c", "d"});
            case 3:
                return new baal();
            case 4:
                return new aopa((float[]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (baal.class) {
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
