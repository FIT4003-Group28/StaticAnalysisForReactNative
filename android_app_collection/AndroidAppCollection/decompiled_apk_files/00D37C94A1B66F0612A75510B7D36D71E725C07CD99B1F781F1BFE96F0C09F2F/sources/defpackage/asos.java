package defpackage;
/* compiled from: PG */
/* renamed from: asos  reason: default package */
/* loaded from: classes2.dex */
public final class asos extends aopi implements aoqv {
    public static final asos a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        asos asosVar = new asos();
        a = asosVar;
        aopi.registerDefaultInstance(asos.class, asosVar);
    }

    private asos() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0005ဋ\u0005\u0006ဋ\u0006\nဋ\u0003", new Object[]{"h", "b", "c", "e", "f", "d"});
            case 3:
                return new asos();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asos.class) {
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
