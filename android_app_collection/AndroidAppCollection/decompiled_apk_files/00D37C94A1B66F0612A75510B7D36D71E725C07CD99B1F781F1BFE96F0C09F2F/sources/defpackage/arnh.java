package defpackage;
/* compiled from: PG */
/* renamed from: arnh  reason: default package */
/* loaded from: classes2.dex */
public final class arnh extends aopi implements aoqv {
    public static final arnh a;
    private static volatile aorb m;
    public int b;
    public int c;
    public int d;
    public arag e;
    public apzg f;
    public arni g;
    public apok h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    private arag n;
    private apzg o;
    private byte p = 2;

    static {
        arnh arnhVar = new arnh();
        a = arnhVar;
        aopi.registerDefaultInstance(arnh.class, arnhVar);
    }

    private arnh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0006\u0001ဌ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bဌ\b\tဂ\t\nᐉ\u0005\fဇ\u000b\rဇ\f", new Object[]{"b", "c", arka.m, "d", arka.l, "e", "n", "o", "g", "h", "i", aqal.a(), "j", "f", "k", "l"});
            case 3:
                return new arnh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arnh.class) {
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
