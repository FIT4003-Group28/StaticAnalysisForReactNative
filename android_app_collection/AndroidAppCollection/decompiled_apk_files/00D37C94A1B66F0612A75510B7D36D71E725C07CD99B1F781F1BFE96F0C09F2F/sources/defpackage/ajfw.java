package defpackage;
/* compiled from: PG */
/* renamed from: ajfw  reason: default package */
/* loaded from: classes.dex */
public final class ajfw extends aopi implements aoqv {
    public static final ajfw a;
    private static volatile aorb f;
    public int b;
    public int c;
    public long d;
    public String e = "";

    static {
        ajfw ajfwVar = new ajfw();
        a = ajfwVar;
        aopi.registerDefaultInstance(ajfw.class, ajfwVar);
    }

    private ajfw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဃ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajfw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ajfw.class) {
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
