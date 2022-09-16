package defpackage;
/* compiled from: PG */
/* renamed from: avft  reason: default package */
/* loaded from: classes2.dex */
public final class avft extends aopi implements aoqv {
    public static final avft a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public String e = "";
    public avfu f;
    private int h;

    static {
        avft avftVar = new avft();
        a = avftVar;
        aopi.registerDefaultInstance(avft.class, avftVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, avftVar, avftVar, null, 228301911, aosj.MESSAGE, avft.class);
    }

    private avft() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"h", "c", "d", "e", "f"});
            case 3:
                return new avft();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avft.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
