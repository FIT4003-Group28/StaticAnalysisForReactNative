package defpackage;
/* compiled from: PG */
/* renamed from: aref  reason: default package */
/* loaded from: classes2.dex */
public final class aref extends aopi implements aoqv {
    public static final aref a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        aref arefVar = new aref();
        a = arefVar;
        aopi.registerDefaultInstance(aref.class, arefVar);
    }

    private aref() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"d", "c", "b", "e", arec.class, aree.class, areb.class, ared.class});
            case 3:
                return new aref();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aref.class) {
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
