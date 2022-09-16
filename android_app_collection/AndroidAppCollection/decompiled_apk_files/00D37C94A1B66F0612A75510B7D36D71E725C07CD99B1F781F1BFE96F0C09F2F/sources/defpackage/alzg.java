package defpackage;
/* compiled from: PG */
/* renamed from: alzg  reason: default package */
/* loaded from: classes.dex */
public final class alzg extends aopi implements aoqv {
    public static final aopr a = new uil(2);
    public static final alzg b;
    private static volatile aorb e;
    public String c = "";
    public aopq d = emptyIntList();
    private int f;

    static {
        alzg alzgVar = new alzg();
        b = alzgVar;
        aopi.registerDefaultInstance(alzg.class, alzgVar);
    }

    private alzg() {
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"f", "c", "d", alze.b()});
            case 3:
                return new alzg();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (alzg.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
