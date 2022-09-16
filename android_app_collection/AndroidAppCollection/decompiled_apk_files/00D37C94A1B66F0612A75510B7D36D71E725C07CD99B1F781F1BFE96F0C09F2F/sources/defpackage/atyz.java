package defpackage;
/* compiled from: PG */
/* renamed from: atyz  reason: default package */
/* loaded from: classes2.dex */
public final class atyz extends aopi implements aoqv {
    public static final atyz a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        atyz atyzVar = new atyz();
        a = atyzVar;
        aopi.registerDefaultInstance(atyz.class, atyzVar);
    }

    private atyz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", atti.t, "e", atti.u});
            case 3:
                return new atyz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atyz.class) {
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
