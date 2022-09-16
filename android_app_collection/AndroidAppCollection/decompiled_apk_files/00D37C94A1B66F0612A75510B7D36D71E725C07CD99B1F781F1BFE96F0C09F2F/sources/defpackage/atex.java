package defpackage;
/* compiled from: PG */
/* renamed from: atex  reason: default package */
/* loaded from: classes2.dex */
public final class atex extends aopi implements aoqv {
    public static final atex a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arhs d;
    public apzg e;
    public arag f;
    public arhs g;
    public apzg h;
    public boolean i;
    private arag l;
    private arag m;
    private aoux n;
    private byte o = 2;
    public aoob j = aoob.b;

    static {
        atex atexVar = new atex();
        a = atexVar;
        aopi.registerDefaultInstance(atex.class, atexVar);
    }

    private atex() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\n\bည\u000b\u000bဇ\b\fᐉ\u0001\rᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "n", "j", "i", "l", "m"});
            case 3:
                return new atex();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atex.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
