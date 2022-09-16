package defpackage;
/* compiled from: PG */
/* renamed from: apko  reason: default package */
/* loaded from: classes.dex */
public final class apko extends aopi implements aoqv {
    public static final apko a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apok e;
    private arag f;
    private apok g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private apkq l;
    private arag m;
    private arag n;
    private aoux o;
    private byte p = 2;

    static {
        apko apkoVar = new apko();
        a = apkoVar;
        aopi.registerDefaultInstance(apko.class, apkoVar);
    }

    private apko() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u000e\f\u0000\u0000\f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\u000eᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new apko();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apko.class) {
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
