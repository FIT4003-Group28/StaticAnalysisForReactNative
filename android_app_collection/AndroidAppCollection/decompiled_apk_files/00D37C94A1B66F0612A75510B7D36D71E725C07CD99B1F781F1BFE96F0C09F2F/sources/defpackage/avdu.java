package defpackage;
/* compiled from: PG */
/* renamed from: avdu  reason: default package */
/* loaded from: classes2.dex */
public final class avdu extends aopi implements aoqv {
    public static final avdu a;
    private static volatile aorb g;
    public int b;
    public avdq c;
    public avdh d;
    public avdl e;
    public avdj f;
    private byte h = 2;

    static {
        avdu avduVar = new avdu();
        a = avduVar;
        aopi.registerDefaultInstance(avdu.class, avduVar);
    }

    private avdu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue55e⡇\ue628堙\u0004\u0000\u0000\u0004\ue55e⡇ᐉ\u0000\ue1c5㙻ᐉ\u0001\uf6b6䣧ᐉ\u0002\ue628堙ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new avdu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avdu.class) {
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
