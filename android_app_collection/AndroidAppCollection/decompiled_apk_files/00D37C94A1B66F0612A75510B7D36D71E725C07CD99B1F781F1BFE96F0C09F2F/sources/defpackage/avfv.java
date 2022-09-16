package defpackage;
/* compiled from: PG */
/* renamed from: avfv  reason: default package */
/* loaded from: classes2.dex */
public final class avfv extends aopi implements aoqv {
    public static final avfv a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public aunb d;
    public aunb e;
    public arag f;
    public arag g;
    public arag h;
    public aunb i;
    public arag j;
    public aunb k;
    private arag m;
    private aunb n;
    private aunb o;
    private byte p = 2;

    static {
        avfv avfvVar = new avfv();
        a = avfvVar;
        aopi.registerDefaultInstance(avfv.class, avfvVar);
    }

    private avfv() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b", new Object[]{"b", "c", "m", "d", "e", "f", "g", "n", "o", "h", "i", "j", "k"});
            case 3:
                return new avfv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avfv.class) {
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
