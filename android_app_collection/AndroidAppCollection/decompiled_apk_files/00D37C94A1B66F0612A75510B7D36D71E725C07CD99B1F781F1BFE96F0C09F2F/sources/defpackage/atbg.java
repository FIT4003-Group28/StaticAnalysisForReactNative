package defpackage;
/* compiled from: PG */
/* renamed from: atbg  reason: default package */
/* loaded from: classes2.dex */
public final class atbg extends aopi implements aoqv {
    public static final atbg a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public String f = "";

    static {
        atbg atbgVar = new atbg();
        a = atbgVar;
        aopi.registerDefaultInstance(atbg.class, atbgVar);
    }

    private atbg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", atck.d, "d", atck.n, "e", "f"});
            case 3:
                return new atbg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atbg.class) {
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
