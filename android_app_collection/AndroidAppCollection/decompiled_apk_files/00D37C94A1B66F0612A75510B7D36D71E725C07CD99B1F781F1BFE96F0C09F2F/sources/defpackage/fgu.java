package defpackage;
/* compiled from: PG */
/* renamed from: fgu  reason: default package */
/* loaded from: classes3.dex */
public final class fgu extends aopi implements aoqv {
    public static final fgu a;
    private static volatile aorb l;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public aoqp f = aoqp.a;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        fgu fguVar = new fgu();
        a = fguVar;
        aopi.registerDefaultInstance(fgu.class, fguVar);
    }

    private fgu() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u00042\u0005ဇ\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\tင\u0007", new Object[]{"b", "c", "d", "e", "f", fgt.a, "g", "h", "i", "j", "k"});
            case 3:
                return new fgu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (fgu.class) {
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
