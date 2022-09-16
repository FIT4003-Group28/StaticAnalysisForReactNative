package defpackage;
/* compiled from: PG */
/* renamed from: avid  reason: default package */
/* loaded from: classes2.dex */
public final class avid extends aopi implements aoqv {
    public static final avid a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public arag e;
    public int f;
    private int h;
    private byte i = 2;

    static {
        avid avidVar = new avid();
        a = avidVar;
        aopi.registerDefaultInstance(avid.class, avidVar);
    }

    private avid() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ဌ\u0004", new Object[]{"h", "b", "c", "d", "e", "f", arhr.a()});
            case 3:
                return new avid();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avid.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
