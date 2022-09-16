package defpackage;
/* compiled from: PG */
/* renamed from: tql  reason: default package */
/* loaded from: classes4.dex */
public final class tql extends aopi implements aoqv {
    public static final tql a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;

    static {
        tql tqlVar = new tql();
        a = tqlVar;
        aopi.registerDefaultInstance(tql.class, tqlVar);
    }

    private tql() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new tql();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (tql.class) {
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
