package defpackage;
/* compiled from: PG */
/* renamed from: awno  reason: default package */
/* loaded from: classes2.dex */
public final class awno extends aopi implements aoqv {
    public static final awno a;
    private static volatile aorb j;
    public int b;
    public float c;
    public float d;
    public awnj e;
    public awoq f;
    public int g;
    public int h;
    public boolean i;

    static {
        awno awnoVar = new awno();
        a = awnoVar;
        aopi.registerDefaultInstance(awno.class, awnoVar);
    }

    private awno() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", awkk.n, "h", awkk.m, "i"});
            case 3:
                return new awno();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (awno.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
