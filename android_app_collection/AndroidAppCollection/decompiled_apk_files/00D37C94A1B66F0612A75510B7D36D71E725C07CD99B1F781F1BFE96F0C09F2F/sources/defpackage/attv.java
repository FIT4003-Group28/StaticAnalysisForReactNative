package defpackage;
/* compiled from: PG */
/* renamed from: attv  reason: default package */
/* loaded from: classes2.dex */
public final class attv extends aopi implements aoqv {
    public static final attv a;
    private static volatile aorb x;
    public int b;
    public long e;
    public attt g;
    public attu h;
    public boolean l;
    public boolean m;
    public aqxk n;
    public long o;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    private byte y = 2;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    public String f = "";
    public aopq i = emptyIntList();
    public aopq j = emptyIntList();
    public aoob k = aoob.b;
    public String p = "";
    public String v = "";
    public String w = "";

    static {
        attv attvVar = new attv();
        a = attvVar;
        aopi.registerDefaultInstance(attv.class, attvVar);
    }

    private attv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001!\u0015\u0000\u0002\u0001\u0001ည\u0000\u0002ည\u0001\u0003ဂ\u0002\u0005ဈ\u0004\u0007ဉ\u0007\n\u0016\u000b\u0016\fᐉ\u0006\u0010ည\f\u0011ဇ\r\u0016ဇ\u0012\u0017ဉ\u0013\u0018ဂ\u0014\u0019ဈ\u0015\u001aဇ\u0016\u001bဇ\u0017\u001dဇ\u0019\u001eဇ\u001a\u001fဇ\u001b ဈ\u001c!ဈ\u001d", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
            case 3:
                return new attv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = x;
                if (aorbVar == null) {
                    synchronized (attv.class) {
                        aorbVar = x;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            x = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
