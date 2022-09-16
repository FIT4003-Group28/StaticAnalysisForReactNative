package defpackage;
/* compiled from: PG */
/* renamed from: atkr  reason: default package */
/* loaded from: classes2.dex */
public final class atkr extends aopi implements aoqv {
    public static final atkr a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private arag f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aoux k;
    private aunb l;
    private aunb m;
    private apzg n;
    private byte o = 2;

    static {
        atkr atkrVar = new atkr();
        a = atkrVar;
        aopi.registerDefaultInstance(atkr.class, atkrVar);
    }

    private atkr() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nᐉ\t\u000bᐉ\n\fᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new atkr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atkr.class) {
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
