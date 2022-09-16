package defpackage;
/* compiled from: PG */
/* renamed from: atqu  reason: default package */
/* loaded from: classes2.dex */
public final class atqu extends aopi implements aoqv {
    public static final atqu a;
    private static volatile aorb f;
    public int b;
    public long c;
    public int d;
    public atqt e;

    static {
        atqu atquVar = new atqu();
        a = atquVar;
        aopi.registerDefaultInstance(atqu.class, atquVar);
    }

    private atqu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", atqy.b, "e"});
            case 3:
                return new atqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atqu.class) {
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
