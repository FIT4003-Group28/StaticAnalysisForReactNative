package defpackage;
/* compiled from: PG */
/* renamed from: aphf  reason: default package */
/* loaded from: classes.dex */
public final class aphf extends aopi implements aoqv {
    public static final aphf a;
    private static volatile aorb k;
    public int b;
    public boolean c;
    public int d;
    public String e = "";
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        aphf aphfVar = new aphf();
        a = aphfVar;
        aopi.registerDefaultInstance(aphf.class, aphfVar);
    }

    private aphf() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aphf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aphf.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
