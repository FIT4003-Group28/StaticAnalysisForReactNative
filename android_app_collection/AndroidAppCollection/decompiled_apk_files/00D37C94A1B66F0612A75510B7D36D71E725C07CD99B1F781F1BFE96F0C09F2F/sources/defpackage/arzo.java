package defpackage;
/* compiled from: PG */
/* renamed from: arzo  reason: default package */
/* loaded from: classes2.dex */
public final class arzo extends aopi implements aoqv {
    public static final aopr a = new asvu(1);
    public static final arzo b;
    private static volatile aorb e;
    public aopq c = emptyIntList();
    public String d = "";
    private int f;

    static {
        arzo arzoVar = new arzo();
        b = arzoVar;
        aopi.registerDefaultInstance(arzo.class, arzoVar);
    }

    private arzo() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"f", "d", "c", atru.a()});
            case 3:
                return new arzo();
            case 4:
                return new aopa((boolean[][]) null, (byte[]) null);
            case 5:
                return b;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arzo.class) {
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
