package defpackage;
/* compiled from: PG */
/* renamed from: atyg  reason: default package */
/* loaded from: classes2.dex */
public final class atyg extends aopi implements aoqv {
    public static final atyg a;
    private static volatile aorb r;
    public int b;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean p;
    public atyh q;
    private byte s = 2;
    public String c = "";
    public String o = "";

    static {
        atyg atygVar = new atyg();
        a = atygVar;
        aopi.registerDefaultInstance(atyg.class, atygVar);
    }

    private atyg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003,\u000f\u0000\u0000\u0001\u0003ဈ\u0001\u0004ဋ\u0002\u0005ဂ\u0003\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\nဇ\u000b\u000bဇ\f\fဈ\u000e\u001dဇ\u0019\u001fᐉ\u001c%င\u0007&င\b)င\t,ဇ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "l", "m", "o", "p", "q", "i", "j", "k", "n"});
            case 3:
                return new atyg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (atyg.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
