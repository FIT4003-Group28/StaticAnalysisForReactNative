package defpackage;
/* compiled from: PG */
/* renamed from: avxk  reason: default package */
/* loaded from: classes2.dex */
public final class avxk extends aopi implements aoqv {
    public static final avxk a;
    private static volatile aorb h;
    public int b;
    public int c = 0;
    public Object d;
    public avxh e;
    public int f;
    public aqsv g;

    static {
        avxk avxkVar = new avxk();
        a = avxkVar;
        aopi.registerDefaultInstance(avxk.class, avxkVar);
    }

    private avxk() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဉ\u0004", new Object[]{"d", "c", "b", "e", "f", avxs.u, avxf.class, avxj.class, "g"});
            case 3:
                return new avxk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avxk.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
