package defpackage;
/* compiled from: PG */
/* renamed from: aqko  reason: default package */
/* loaded from: classes2.dex */
public final class aqko extends aopi implements aoqv {
    public static final aqko a;
    private static volatile aorb h;
    public int b;
    public long f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        aqko aqkoVar = new aqko();
        a = aqkoVar;
        aopi.registerDefaultInstance(aqko.class, aqkoVar);
    }

    private aqko() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqko();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqko.class) {
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
