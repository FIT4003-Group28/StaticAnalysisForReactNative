package defpackage;
/* compiled from: PG */
/* renamed from: awis  reason: default package */
/* loaded from: classes2.dex */
public final class awis extends aopi implements aoqv {
    public static final awis a;
    private static volatile aorb f;
    public int b;
    public arag d;
    public awiv e;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private awiu k;
    private byte l = 2;
    public String c = "";

    static {
        awis awisVar = new awis();
        a = awisVar;
        aopi.registerDefaultInstance(awis.class, awisVar);
    }

    private awis() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\u0005", new Object[]{"b", "c", "g", "d", "h", "i", "e", "k", "j"});
            case 3:
                return new awis();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awis.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
