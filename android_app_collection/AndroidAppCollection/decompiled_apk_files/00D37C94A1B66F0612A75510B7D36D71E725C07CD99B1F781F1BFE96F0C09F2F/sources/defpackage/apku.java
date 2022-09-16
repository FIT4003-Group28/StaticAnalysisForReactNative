package defpackage;
/* compiled from: PG */
/* renamed from: apku  reason: default package */
/* loaded from: classes.dex */
public final class apku extends aopi implements aoqv {
    public static final apku a;
    private static volatile aorb g;
    public float b;
    public float c;
    public int d;
    public float e;
    public float f;
    private int h;

    static {
        apku apkuVar = new apku();
        a = apkuVar;
        aopi.registerDefaultInstance(apku.class, apkuVar);
    }

    private apku() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new apku();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apku.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
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
