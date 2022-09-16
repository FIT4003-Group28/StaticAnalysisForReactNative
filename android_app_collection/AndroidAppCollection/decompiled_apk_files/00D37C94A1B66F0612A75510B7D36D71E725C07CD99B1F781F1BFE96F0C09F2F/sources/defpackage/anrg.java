package defpackage;
/* compiled from: PG */
/* renamed from: anrg  reason: default package */
/* loaded from: classes.dex */
public final class anrg extends aopi implements aoqv {
    public static final anrg a;
    private static volatile aorb f;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        anrg anrgVar = new anrg();
        a = anrgVar;
        aopi.registerDefaultInstance(anrg.class, anrgVar);
    }

    private anrg() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anrg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anrg.class) {
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
