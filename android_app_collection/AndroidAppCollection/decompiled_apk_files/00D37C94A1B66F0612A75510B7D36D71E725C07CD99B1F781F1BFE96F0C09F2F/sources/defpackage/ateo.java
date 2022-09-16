package defpackage;
/* compiled from: PG */
/* renamed from: ateo  reason: default package */
/* loaded from: classes2.dex */
public final class ateo extends aopi implements aoqv {
    public static final ateo a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arhs d;
    public apzg e;
    public atem g;
    public boolean h;
    public int i;
    public arhs j;
    private aoux l;
    private byte m = 2;
    public aoob f = aoob.b;

    static {
        ateo ateoVar = new ateo();
        a = ateoVar;
        aopi.registerDefaultInstance(ateo.class, ateoVar);
    }

    private ateo() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0007ဉ\u0005\bဇ\u0007\tဌ\b\u000bᐉ\n", new Object[]{"b", "c", "d", "e", "l", "f", "g", "h", "i", atdq.d, "j"});
            case 3:
                return new ateo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (ateo.class) {
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
