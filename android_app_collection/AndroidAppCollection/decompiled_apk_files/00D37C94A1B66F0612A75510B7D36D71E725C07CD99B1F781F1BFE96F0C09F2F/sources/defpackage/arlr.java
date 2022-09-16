package defpackage;
/* compiled from: PG */
/* renamed from: arlr  reason: default package */
/* loaded from: classes2.dex */
public final class arlr extends aopd implements aope {
    public static final arlr a;
    private static volatile aorb t;
    public int b;
    public aroy c;
    public atop h;
    public boolean i;
    public arln j;
    public aqgj k;
    public boolean m;
    public int p;
    public aqmf q;
    public arls r;
    public atcp s;
    private asag u;
    private byte v = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aopq n = emptyIntList();
    public aopu o = emptyProtobufList();

    static {
        arlr arlrVar = new arlr();
        a = arlrVar;
        aopi.registerDefaultInstance(arlr.class, arlrVar);
    }

    private arlr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001%\u0011\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ဈ\u0004\nᐉ\t\u000bဈ\u0003\u000fဇ\r\u0012ဉ\u0010\u0017ဉ\u0015\u0019ဇ\u0016\u001aဉ\u000b\u001b\u0016\u001c\u001b\u001dဌ\u0017 ဉ\u001a!ဉ\u001b%ဉ\u001d", new Object[]{"b", "c", "d", "e", "g", "u", "f", "i", "j", "k", "m", "h", "n", "o", aukj.class, "p", arka.a, "q", "r", "s"});
            case 3:
                return new arlr();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (arlr.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
