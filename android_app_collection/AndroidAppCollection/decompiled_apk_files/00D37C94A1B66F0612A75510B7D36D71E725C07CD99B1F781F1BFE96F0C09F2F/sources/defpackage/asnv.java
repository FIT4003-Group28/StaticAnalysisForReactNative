package defpackage;
/* compiled from: PG */
/* renamed from: asnv  reason: default package */
/* loaded from: classes2.dex */
public final class asnv extends aopi implements aoqv {
    public static final asnv a;
    private static volatile aorb h;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public boolean f;
    public int g;

    static {
        asnv asnvVar = new asnv();
        a = asnvVar;
        aopi.registerDefaultInstance(asnv.class, asnvVar);
    }

    private asnv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဋ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new asnv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asnv.class) {
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
