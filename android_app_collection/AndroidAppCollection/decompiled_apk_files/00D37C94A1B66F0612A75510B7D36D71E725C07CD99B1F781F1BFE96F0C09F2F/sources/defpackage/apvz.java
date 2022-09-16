package defpackage;
/* compiled from: PG */
/* renamed from: apvz  reason: default package */
/* loaded from: classes2.dex */
public final class apvz extends aopi implements aoqv {
    public static final apvz a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public long f;
    public String e = "";
    public String g = "";

    static {
        apvz apvzVar = new apvz();
        a = apvzVar;
        aopi.registerDefaultInstance(apvz.class, apvzVar);
    }

    private apvz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new apvz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apvz.class) {
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
