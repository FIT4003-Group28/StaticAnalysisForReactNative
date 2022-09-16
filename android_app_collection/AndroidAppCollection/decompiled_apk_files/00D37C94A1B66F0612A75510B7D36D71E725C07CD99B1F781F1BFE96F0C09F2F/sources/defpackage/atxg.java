package defpackage;
/* compiled from: PG */
/* renamed from: atxg  reason: default package */
/* loaded from: classes2.dex */
public final class atxg extends aopi implements aoqv {
    public static final atxg a;
    private static volatile aorb g;
    public int b;
    public int c;
    public aopq d = emptyIntList();
    public int e;
    public boolean f;

    static {
        atxg atxgVar = new atxg();
        a = atxgVar;
        aopi.registerDefaultInstance(atxg.class, atxgVar);
    }

    private atxg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u0016\u0003င\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new atxg();
            case 4:
                return new aopa((short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atxg.class) {
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
