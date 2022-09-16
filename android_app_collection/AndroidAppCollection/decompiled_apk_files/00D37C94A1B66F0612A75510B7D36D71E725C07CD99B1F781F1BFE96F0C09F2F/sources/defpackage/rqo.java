package defpackage;
/* compiled from: PG */
/* renamed from: rqo  reason: default package */
/* loaded from: classes4.dex */
public final class rqo extends aopi implements aoqv {
    public static final rqo a;
    private static volatile aorb h;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public long f;
    public double g;

    static {
        rqo rqoVar = new rqo();
        a = rqoVar;
        aopi.registerDefaultInstance(rqo.class, rqoVar);
    }

    private rqo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0006က\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new rqo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (rqo.class) {
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
