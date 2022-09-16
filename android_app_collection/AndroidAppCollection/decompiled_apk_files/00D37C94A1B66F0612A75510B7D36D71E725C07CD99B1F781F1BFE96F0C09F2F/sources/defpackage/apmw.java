package defpackage;
/* compiled from: PG */
/* renamed from: apmw  reason: default package */
/* loaded from: classes.dex */
public final class apmw extends aopi implements aoqv {
    public static final apmw a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public float d;
    public int e;

    static {
        apmw apmwVar = new apmw();
        a = apmwVar;
        aopi.registerDefaultInstance(apmw.class, apmwVar);
    }

    private apmw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\f\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\fင\u0006", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apmw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apmw.class) {
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
