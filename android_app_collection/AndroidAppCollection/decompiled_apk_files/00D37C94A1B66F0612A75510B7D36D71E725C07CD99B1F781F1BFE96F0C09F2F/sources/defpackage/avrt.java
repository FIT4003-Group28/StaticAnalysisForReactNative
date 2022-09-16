package defpackage;
/* compiled from: PG */
/* renamed from: avrt  reason: default package */
/* loaded from: classes2.dex */
public final class avrt extends aopi implements aoqv {
    public static final avrt a;
    private static volatile aorb b;
    private int c;
    private avru d;
    private avru e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apzg k;
    private aunb l;
    private aoux m;
    private avru n;
    private avru o;
    private byte p = 2;

    static {
        avrt avrtVar = new avrt();
        a = avrtVar;
        aopi.registerDefaultInstance(avrt.class, avrtVar);
    }

    private avrt() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\f\u0001ᐉ\u000f\u0002ᐉ\u0010\u0003ᐉ\u0003\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\u000b\bᐉ\u000e\tᐉ\u0000\nᐉ\u0001\rᐉ\u0005\u000eᐉ\u0006\u0010ᐉ\f", new Object[]{"c", "n", "o", "f", "i", "j", "k", "m", "d", "e", "g", "h", "l"});
            case 3:
                return new avrt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrt.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
