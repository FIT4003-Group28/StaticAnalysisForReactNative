package defpackage;
/* compiled from: PG */
/* renamed from: oqw  reason: default package */
/* loaded from: classes4.dex */
public final class oqw extends aopi implements aoqv {
    public static final oqw a;
    private static volatile aorb e;
    public int b;
    public aopq c;
    public String d;

    static {
        oqw oqwVar = new oqw();
        a = oqwVar;
        aopi.registerDefaultInstance(oqw.class, oqwVar);
    }

    private oqw() {
        emptyIntList();
        this.c = emptyIntList();
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u0016\u0003ဈ\u0000", new Object[]{"b", "c", "d"});
            case 3:
                return new oqw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (oqw.class) {
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
