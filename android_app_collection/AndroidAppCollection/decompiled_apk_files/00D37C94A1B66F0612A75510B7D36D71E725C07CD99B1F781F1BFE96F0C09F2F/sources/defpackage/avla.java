package defpackage;
/* compiled from: PG */
/* renamed from: avla  reason: default package */
/* loaded from: classes2.dex */
public final class avla extends aopi implements aoqv {
    private static final avla a;
    private static volatile aorb b;
    private int c = 0;
    private Object d;

    static {
        avla avlaVar = new avla();
        a = avlaVar;
        aopi.registerDefaultInstance(avla.class, avlaVar);
    }

    private avla() {
    }

    public static avla c() {
        return a;
    }

    public avkz a() {
        return avkz.a(this.c);
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"d", "c", avky.class});
            case 3:
                return new avla();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avla.class) {
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
