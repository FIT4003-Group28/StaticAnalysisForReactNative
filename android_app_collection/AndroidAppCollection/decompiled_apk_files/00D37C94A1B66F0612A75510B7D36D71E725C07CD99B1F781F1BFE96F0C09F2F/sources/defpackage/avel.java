package defpackage;
/* compiled from: PG */
/* renamed from: avel  reason: default package */
/* loaded from: classes2.dex */
public final class avel extends aopi implements aoqv {
    public static final avel a;
    private static volatile aorb l;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int j;
    public String h = "";
    public String i = "";
    public String k = "";

    static {
        avel avelVar = new avel();
        a = avelVar;
        aopi.registerDefaultInstance(avel.class, avelVar);
    }

    private avel() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\nဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new avel();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avel.class) {
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
