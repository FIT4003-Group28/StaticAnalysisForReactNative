package defpackage;
/* compiled from: PG */
/* renamed from: asjb  reason: default package */
/* loaded from: classes2.dex */
public final class asjb extends aopi implements aoqv {
    public static final asjb a;
    public static final aopg b;
    private static volatile aorb o;
    public int c;
    public int d = -1;
    public int e = -1;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        asjb asjbVar = new asjb();
        a = asjbVar;
        aopi.registerDefaultInstance(asjb.class, asjbVar);
        b = aopi.newSingularGeneratedExtension(apzh.a, asjbVar, asjbVar, null, 288976216, aosj.MESSAGE, asjb.class);
    }

    private asjb() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\fဌ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", aqfh.o});
            case 3:
                return new asjb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (asjb.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
