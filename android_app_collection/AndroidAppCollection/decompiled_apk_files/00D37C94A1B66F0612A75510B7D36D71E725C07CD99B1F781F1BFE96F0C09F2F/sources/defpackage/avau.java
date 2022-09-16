package defpackage;
/* compiled from: PG */
/* renamed from: avau  reason: default package */
/* loaded from: classes2.dex */
public final class avau extends aopi implements aoqv {
    public static final avau a;
    private static volatile aorb e;
    public int b;
    public aqmu c;
    public avat d;
    private atup f;
    private awid g;
    private byte h = 2;

    static {
        avau avauVar = new avau();
        a = avauVar;
        aopi.registerDefaultInstance(avau.class, avauVar);
    }

    private avau() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001ﱃ\u196f\uf39a\u1f17\u0004\u0000\u0000\u0004ﱃ\u196fᐉ\u0002\ue5d9ᩭᐉ\u0000\uf875ᯧᐉ\u0001\uf39a\u1f17ᐉ\u0003", new Object[]{"b", "c", "f", "g", "d"});
            case 3:
                return new avau();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avau.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
