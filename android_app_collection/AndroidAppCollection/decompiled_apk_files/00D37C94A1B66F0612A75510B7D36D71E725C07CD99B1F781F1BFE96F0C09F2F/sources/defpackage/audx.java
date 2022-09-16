package defpackage;
/* compiled from: PG */
/* renamed from: audx  reason: default package */
/* loaded from: classes2.dex */
public final class audx extends aopi implements aoqv {
    public static final audx a;
    private static volatile aorb o;
    public int b;
    public arag c;
    public audr d;
    public auds e;
    public arag f;
    public audv g;
    public arag h;
    public audv i;
    public audv j;
    public boolean k;
    public arag l;
    public boolean m;
    public apzg n;
    private audy p;
    private auds q;
    private arag r;
    private auea s;
    private byte t = 2;

    static {
        audx audxVar = new audx();
        a = audxVar;
        aopi.registerDefaultInstance(audx.class, audxVar);
    }

    private audx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fဇ\f\rᐉ\n\u000eᐉ\r\u000fဇ\u000e\u0010ᐉ\u000f", new Object[]{"b", "c", "d", "e", "q", "r", "p", "s", "f", "g", "h", "j", "k", "i", "l", "m", "n"});
            case 3:
                return new audx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (audx.class) {
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
