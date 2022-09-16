package defpackage;
/* compiled from: PG */
/* renamed from: atsz  reason: default package */
/* loaded from: classes2.dex */
public final class atsz extends aopi implements aoqv {
    public static final atsz a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public String d = "";
    public int e;
    public long f;
    public long g;

    static {
        atsz atszVar = new atsz();
        a = atszVar;
        aopi.registerDefaultInstance(atsz.class, atszVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, atszVar, atszVar, null, 39, aosj.MESSAGE, atsz.class);
    }

    private atsz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"c", "d", "e", avyq.a(), "f", "g"});
            case 3:
                return new atsz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atsz.class) {
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
