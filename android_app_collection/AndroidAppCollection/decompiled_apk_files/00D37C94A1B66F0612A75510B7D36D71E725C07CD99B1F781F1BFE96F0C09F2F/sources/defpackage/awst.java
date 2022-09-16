package defpackage;
/* compiled from: PG */
/* renamed from: awst  reason: default package */
/* loaded from: classes2.dex */
public final class awst extends aopi implements aoqv {
    public static final awst a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public Object e;
    public int f;
    public awmt h;
    public int d = 0;
    private byte k = 2;
    public boolean g = true;
    public String i = "";

    static {
        awst awstVar = new awst();
        a = awstVar;
        aopi.registerDefaultInstance(awst.class, awstVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awstVar, awstVar, null, 272494533, aosj.MESSAGE, awst.class);
    }

    private awst() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0002\t\u0006\u0000\u0000\u0001\u0002့\u0000\u0003ဴ\u0000\u0004င\u0003\u0007ဇ\u0006\bᐉ\u0007\tဈ\b", new Object[]{"e", "d", "c", "f", "g", "h", "i"});
            case 3:
                return new awst();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (awst.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
