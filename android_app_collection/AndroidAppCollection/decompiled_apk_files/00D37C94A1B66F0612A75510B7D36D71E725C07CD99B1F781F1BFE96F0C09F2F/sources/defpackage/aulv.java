package defpackage;
/* compiled from: PG */
/* renamed from: aulv  reason: default package */
/* loaded from: classes2.dex */
public final class aulv extends aopi implements aoqv {
    public static final aulv a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public float d;
    public aulu e;
    public int f;
    public int g;
    private byte i = 2;

    static {
        aulv aulvVar = new aulv();
        a = aulvVar;
        aopi.registerDefaultInstance(aulv.class, aulvVar);
    }

    private aulv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", aulk.h, "g"});
            case 3:
                return new aulv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aulv.class) {
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
