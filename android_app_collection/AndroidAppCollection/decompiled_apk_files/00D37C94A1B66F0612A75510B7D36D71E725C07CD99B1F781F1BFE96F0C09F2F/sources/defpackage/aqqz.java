package defpackage;
/* compiled from: PG */
/* renamed from: aqqz  reason: default package */
/* loaded from: classes2.dex */
public final class aqqz extends aopi implements aoqv {
    public static final aqqz a;
    private static volatile aorb m;
    public int b;
    public long d;
    public long e;
    public boolean f;
    public String i;
    public aopq j;
    public aoob k;
    public int l;
    public String c = "";
    public String g = "";
    public String h = "";

    static {
        aqqz aqqzVar = new aqqz();
        a = aqqzVar;
        aopi.registerDefaultInstance(aqqz.class, aqqzVar);
    }

    private aqqz() {
        aoob aoobVar = aoob.b;
        this.i = "";
        this.j = emptyIntList();
        this.k = aoob.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\bဈ\u0007\t\u0016\nည\b\u000bင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new aqqz();
            case 4:
                return new aopa((char[]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqqz.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
