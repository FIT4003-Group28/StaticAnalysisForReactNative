package defpackage;
/* compiled from: PG */
/* renamed from: asci  reason: default package */
/* loaded from: classes2.dex */
public final class asci extends aopi implements aoqv {
    public static final asci a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public aopq e = emptyIntList();
    public int f;

    static {
        asci asciVar = new asci();
        a = asciVar;
        aopi.registerDefaultInstance(asci.class, asciVar);
    }

    private asci() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ဋ\u0001\u0003\u001d\u0005ဌ\u0003", new Object[]{"b", "c", "d", "e", "f", arpt.q});
            case 3:
                return new asci();
            case 4:
                return new aopa((char[][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asci.class) {
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
