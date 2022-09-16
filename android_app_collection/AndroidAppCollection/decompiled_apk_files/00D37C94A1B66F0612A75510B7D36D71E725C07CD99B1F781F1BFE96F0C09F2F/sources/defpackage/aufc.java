package defpackage;
/* compiled from: PG */
/* renamed from: aufc  reason: default package */
/* loaded from: classes2.dex */
public final class aufc extends aopi implements aoqv {
    public static final aufc a;
    private static volatile aorb o;
    public int b;
    public arag c;
    public boolean d;
    public apzg e;
    public double f;
    public arag g;
    public apzg h;
    public apzg i;
    public apzg j;
    public double k;
    public arag l;
    public double m;
    public arag n;
    private byte p = 2;

    static {
        aufc aufcVar = new aufc();
        a = aufcVar;
        aopi.registerDefaultInstance(aufc.class, aufcVar);
    }

    private aufc() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\b\u0001ᐉ\u0000\u0003ဇ\u0002\u0004ᐉ\u0003\u0005က\u0004\u0006ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bက\t\fᐉ\n\rက\u000b\u000eᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new aufc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aufc.class) {
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
