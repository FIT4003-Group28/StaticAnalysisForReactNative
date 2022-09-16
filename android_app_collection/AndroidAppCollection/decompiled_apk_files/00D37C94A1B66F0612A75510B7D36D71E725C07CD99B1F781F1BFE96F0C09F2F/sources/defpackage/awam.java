package defpackage;
/* compiled from: PG */
/* renamed from: awam  reason: default package */
/* loaded from: classes2.dex */
public final class awam extends aopi implements aoqv {
    public static final aopr a = new asvu(10);
    public static final awam b;
    private static volatile aorb h;
    public aopq c = emptyIntList();
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;

    static {
        awam awamVar = new awam();
        b = awamVar;
        aopi.registerDefaultInstance(awam.class, awamVar);
    }

    private awam() {
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
                return newMessageInfo(b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002ဋ\u0000\u0003ဋ\u0001\u0004ဋ\u0002\u0005ဋ\u0003", new Object[]{"i", "c", awal.a(), "d", "e", "f", "g"});
            case 3:
                return new awam();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awam.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
