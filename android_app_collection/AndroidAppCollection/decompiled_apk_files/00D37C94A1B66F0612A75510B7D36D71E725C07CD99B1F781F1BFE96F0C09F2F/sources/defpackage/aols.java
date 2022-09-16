package defpackage;
/* compiled from: PG */
/* renamed from: aols  reason: default package */
/* loaded from: classes.dex */
public final class aols extends aopi implements aoqv {
    public static final aols a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public Object f;
    public aomr i;
    public aono j;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public String h = "";

    static {
        aols aolsVar = new aols();
        a = aolsVar;
        aopi.registerDefaultInstance(aols.class, aolsVar);
    }

    private aols() {
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
                return newMessageInfo(a, "\u0001\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ျ\u0000\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဿ\u0000\bျ\u0001\tြ\u0001\nြ\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "j", aoli.f, aoki.class, aooo.class});
            case 3:
                return new aols();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aols.class) {
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
