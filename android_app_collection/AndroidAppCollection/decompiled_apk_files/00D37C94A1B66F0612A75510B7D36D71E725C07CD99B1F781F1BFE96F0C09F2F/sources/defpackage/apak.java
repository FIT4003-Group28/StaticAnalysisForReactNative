package defpackage;
/* compiled from: PG */
/* renamed from: apak  reason: default package */
/* loaded from: classes.dex */
public final class apak extends aopi implements aoqv {
    public static final apak a;
    private static volatile aorb h;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float f;
    public int g;
    private int i;
    private int j;
    private int k;

    static {
        apak apakVar = new apak();
        a = apakVar;
        aopi.registerDefaultInstance(apak.class, apakVar);
    }

    private apak() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0003\u0007E\u0006\u0000\u0000\u0000\u0007င\u0005?ဇ;Aဌ=Cဇ?Dခ@EငA", new Object[]{"i", "j", "k", "b", "c", "d", aoxm.g, "e", "f", "g"});
            case 3:
                return new apak();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apak.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
