package defpackage;
/* compiled from: PG */
/* renamed from: aver  reason: default package */
/* loaded from: classes2.dex */
public final class aver extends aopi implements aoqv {
    public static final aver a;
    private static volatile aorb n;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private int o;

    static {
        aver averVar = new aver();
        a = averVar;
        aopi.registerDefaultInstance(aver.class, averVar);
    }

    private aver() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0005င\u0003\u0006င\u0004\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r", new Object[]{"o", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new aver();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aver.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
