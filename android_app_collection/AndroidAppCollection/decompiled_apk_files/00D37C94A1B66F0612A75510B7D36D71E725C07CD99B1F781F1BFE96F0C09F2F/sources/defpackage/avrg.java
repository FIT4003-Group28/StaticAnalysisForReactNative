package defpackage;
/* compiled from: PG */
/* renamed from: avrg  reason: default package */
/* loaded from: classes2.dex */
public final class avrg extends aopi implements aoqv {
    public static final avrg a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private aoux h;
    private apzg i;
    private byte j = 2;

    static {
        avrg avrgVar = new avrg();
        a = avrgVar;
        aopi.registerDefaultInstance(avrg.class, avrgVar);
    }

    private avrg() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0006\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\t\u000bᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avrg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrg.class) {
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
