package defpackage;
/* compiled from: PG */
/* renamed from: atcz  reason: default package */
/* loaded from: classes2.dex */
public final class atcz extends aopi implements aoqv {
    public static final atcz a;
    private static volatile aorb g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        atcz atczVar = new atcz();
        a = atczVar;
        aopi.registerDefaultInstance(atcz.class, atczVar);
    }

    private atcz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", atck.r, "d", "e", "f"});
            case 3:
                return new atcz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atcz.class) {
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
