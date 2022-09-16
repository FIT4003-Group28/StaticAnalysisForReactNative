package defpackage;
/* compiled from: PG */
/* renamed from: atdz  reason: default package */
/* loaded from: classes2.dex */
public final class atdz extends aopi implements aoqv {
    public static final atdz a;
    private static volatile aorb l;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int m;

    static {
        atdz atdzVar = new atdz();
        a = atdzVar;
        aopi.registerDefaultInstance(atdz.class, atdzVar);
    }

    private atdz() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\r\n\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\tင\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f", new Object[]{"m", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new atdz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atdz.class) {
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
