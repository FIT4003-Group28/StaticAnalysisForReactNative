package defpackage;
/* compiled from: PG */
/* renamed from: apcy  reason: default package */
/* loaded from: classes.dex */
public final class apcy extends aopi implements aoqv {
    public static final apcy a;
    private static volatile aorb g;
    public int b;
    public int c;
    public apcx d;
    public int e;
    public aopq f = emptyIntList();

    static {
        apcy apcyVar = new apcy();
        a = apcyVar;
        aopi.registerDefaultInstance(apcy.class, apcyVar);
    }

    private apcy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002ဌ\u0000\u0003ဉ\u0001\u0004ဌ\u0002\u0005\u001e", new Object[]{"b", "c", apcb.a(), "d", "e", apca.a(), "f", apcf.a()});
            case 3:
                return new apcy();
            case 4:
                return new aopa((byte[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apcy.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
