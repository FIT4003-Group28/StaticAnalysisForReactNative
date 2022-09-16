package defpackage;
/* compiled from: PG */
/* renamed from: apkj  reason: default package */
/* loaded from: classes.dex */
public final class apkj extends aopi implements aoqv {
    public static final aopr a = new uil(12);
    public static final apkj b;
    private static volatile aorb g;
    public int c;
    public aopq d = emptyIntList();
    public int e;
    public int f;

    static {
        apkj apkjVar = new apkj();
        b = apkjVar;
        aopi.registerDefaultInstance(apkj.class, apkjVar);
    }

    private apkj() {
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
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002င\u0000\u0003င\u0001", new Object[]{"c", "d", apkc.a(), "e", "f"});
            case 3:
                return new apkj();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apkj.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
