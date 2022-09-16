package defpackage;
/* compiled from: PG */
/* renamed from: apdh  reason: default package */
/* loaded from: classes.dex */
public final class apdh extends aopi implements aoqv {
    public static final apdh a;
    private static volatile aorb h;
    public int b;
    public int c;
    public int d;
    public int e = 1;
    public apdg f;
    public int g;

    static {
        apdh apdhVar = new apdh();
        a = apdhVar;
        aopi.registerDefaultInstance(apdh.class, apdhVar);
    }

    private apdh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဉ\u0003\u0005ဌ\u0005\u0006ဌ\u0001\bင\u0002", new Object[]{"b", "c", apcd.a(), "f", "g", apca.a(), "d", apcf.a(), "e"});
            case 3:
                return new apdh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apdh.class) {
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
