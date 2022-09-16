package defpackage;
/* compiled from: PG */
/* renamed from: aotz  reason: default package */
/* loaded from: classes.dex */
public final class aotz extends aopi implements aoqv {
    public static final aotz a;
    private static volatile aorb j;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;

    static {
        aotz aotzVar = new aotz();
        a = aotzVar;
        aopi.registerDefaultInstance(aotz.class, aotzVar);
    }

    private aotz() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aotz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aotz.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
