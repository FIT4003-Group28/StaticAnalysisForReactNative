package defpackage;
/* compiled from: PG */
/* renamed from: arph  reason: default package */
/* loaded from: classes2.dex */
public final class arph extends aopi implements aoqv {
    public static final arph a;
    private static volatile aorb l;
    public int b;
    public aroy c;
    public boolean d;
    public int e;
    public arpe f;
    public arpf g;
    public arpo h;
    public arpp i;
    public assw j;
    public assx k;
    private byte m = 2;

    static {
        arph arphVar = new arph();
        a = arphVar;
        aopi.registerDefaultInstance(arph.class, arphVar);
    }

    private arph() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0002\u0003ဉ\u0004\u0004ဉ\u0006\u0006ဇ\u0001\u0007ဉ\u0005\bဉ\u0007\u000bဉ\b\fဉ\t", new Object[]{"b", "c", "e", arpt.b, "f", "h", "d", "g", "i", "j", "k"});
            case 3:
                return new arph();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arph.class) {
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
