package defpackage;
/* compiled from: PG */
/* renamed from: apfs  reason: default package */
/* loaded from: classes.dex */
public final class apfs extends aopi implements aoqv {
    public static final apfs a;
    private static volatile aorb c;
    public apfr b;
    private int d;

    static {
        apfs apfsVar = new apfs();
        a = apfsVar;
        aopi.registerDefaultInstance(apfs.class, apfsVar);
    }

    private apfs() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001ﲡ㤸ﲡ㤸\u0001\u0000\u0000\u0000ﲡ㤸ဉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new apfs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apfs.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
