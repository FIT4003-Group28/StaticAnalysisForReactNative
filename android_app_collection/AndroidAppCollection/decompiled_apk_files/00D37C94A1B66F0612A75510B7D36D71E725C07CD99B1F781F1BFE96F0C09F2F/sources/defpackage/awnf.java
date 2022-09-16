package defpackage;
/* compiled from: PG */
/* renamed from: awnf  reason: default package */
/* loaded from: classes2.dex */
public final class awnf extends aopi implements aoqv {
    public static final awnf a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        awnf awnfVar = new awnf();
        a = awnfVar;
        aopi.registerDefaultInstance(awnf.class, awnfVar);
    }

    private awnf() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဴ\u0000\u0003ျ\u0000\u0004်\u0000\u0005ွ\u0000\u0006ြ\u0000\u0007ြ\u0000\b့\u0000\tှ\u0000", new Object[]{"c", "b", awkk.k, awne.class, awmz.class});
            case 3:
                return new awnf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awnf.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
