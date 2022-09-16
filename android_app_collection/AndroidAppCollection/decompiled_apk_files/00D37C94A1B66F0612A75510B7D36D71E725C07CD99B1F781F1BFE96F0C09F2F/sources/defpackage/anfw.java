package defpackage;
/* compiled from: PG */
/* renamed from: anfw  reason: default package */
/* loaded from: classes.dex */
public final class anfw extends aopi implements aoqv {
    public static final anfw a;
    private static volatile aorb f;
    public int b;
    public int c;
    public boolean d;
    public float e;

    static {
        anfw anfwVar = new anfw();
        a = anfwVar;
        aopi.registerDefaultInstance(anfw.class, anfwVar);
    }

    private anfw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ခ\u0002", new Object[]{"b", "c", adzd.t, "d", "e"});
            case 3:
                return new anfw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anfw.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
