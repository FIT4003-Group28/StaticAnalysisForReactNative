package defpackage;
/* compiled from: PG */
/* renamed from: aqoj  reason: default package */
/* loaded from: classes2.dex */
public final class aqoj extends aopi implements aoqv {
    public static final aqoj a;
    public static final aopg b;
    private static volatile aorb o;
    public int c;
    public int e;
    public float f;
    public float g;
    public boolean i;
    public boolean j;
    public boolean k;
    public atqu l;
    public long m;
    public atqt n;
    public String d = "";
    public String h = "";

    static {
        aqoj aqojVar = new aqoj();
        a = aqojVar;
        aopi.registerDefaultInstance(aqoj.class, aqojVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqojVar, aqojVar, null, 141, aosj.MESSAGE, aqoj.class);
    }

    private aqoj() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ဈ\u0004\u0005ခ\u0003\u0006ဇ\u0005\u0007ဇ\u0006\tဇ\u0007\nဉ\b\u000bဂ\t\fဉ\n", new Object[]{"c", "d", "e", avyq.a(), "f", "h", "g", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new aqoj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aqoj.class) {
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
