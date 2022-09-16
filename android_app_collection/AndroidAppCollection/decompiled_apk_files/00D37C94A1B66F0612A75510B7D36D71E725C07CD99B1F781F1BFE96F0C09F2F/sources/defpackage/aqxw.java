package defpackage;
/* compiled from: PG */
/* renamed from: aqxw  reason: default package */
/* loaded from: classes2.dex */
public final class aqxw extends aopi implements aoqv {
    public static final aqxw a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public boolean d;

    static {
        aqxw aqxwVar = new aqxw();
        a = aqxwVar;
        aopi.registerDefaultInstance(aqxw.class, aqxwVar);
        b = aopi.newSingularGeneratedExtension(aqya.a, aqxwVar, aqxwVar, null, 188907957, aosj.MESSAGE, aqxw.class);
    }

    private aqxw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqxw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqxw.class) {
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
