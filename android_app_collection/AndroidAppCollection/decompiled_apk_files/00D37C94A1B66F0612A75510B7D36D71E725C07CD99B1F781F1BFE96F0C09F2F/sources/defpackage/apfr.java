package defpackage;
/* compiled from: PG */
/* renamed from: apfr  reason: default package */
/* loaded from: classes.dex */
public final class apfr extends aopi implements aoqv {
    public static final apfr a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        apfr apfrVar = new apfr();
        a = apfrVar;
        aopi.registerDefaultInstance(apfr.class, apfrVar);
    }

    private apfr() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007\nဇ\b\u0010ဇ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new apfr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apfr.class) {
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
