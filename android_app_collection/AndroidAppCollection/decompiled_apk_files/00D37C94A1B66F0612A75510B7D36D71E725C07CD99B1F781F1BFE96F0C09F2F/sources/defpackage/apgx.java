package defpackage;
/* compiled from: PG */
/* renamed from: apgx  reason: default package */
/* loaded from: classes.dex */
public final class apgx extends aopi implements aoqv {
    public static final apgx a;
    private static volatile aorb l;
    public boolean b;
    public long c;
    public long d;
    public int e;
    public long f;
    public boolean g;
    public long h;
    public int i;
    public boolean j;
    public int k;
    private int m;

    static {
        apgx apgxVar = new apgx();
        a = apgxVar;
        aopi.registerDefaultInstance(apgx.class, apgxVar);
    }

    private apgx() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0005ဂ\u0002\u0006ဇ\b\u0007ဂ\t\bဂ\u0006\nင\u000b\u000bဌ\r\fဇ\f\u0010င\u0004", new Object[]{"m", "b", "c", "d", "g", "h", "f", "i", "k", apfa.p, "j", "e"});
            case 3:
                return new apgx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (apgx.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
