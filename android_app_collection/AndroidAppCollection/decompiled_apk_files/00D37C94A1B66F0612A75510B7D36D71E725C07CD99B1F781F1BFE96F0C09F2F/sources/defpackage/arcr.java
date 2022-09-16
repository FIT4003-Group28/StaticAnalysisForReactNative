package defpackage;
/* compiled from: PG */
/* renamed from: arcr  reason: default package */
/* loaded from: classes2.dex */
public final class arcr extends aopi implements aoqv {
    public static final arcr a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public avhn d;
    public apzg e;
    public arag f;
    public arag g;
    private arag i;
    private arag j;
    private aoux k;
    private byte l = 2;

    static {
        arcr arcrVar = new arcr();
        a = arcrVar;
        aopi.registerDefaultInstance(arcr.class, arcrVar);
    }

    private arcr() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\t\tᐉ\u0007\fᐉ\b", new Object[]{"b", "c", "d", "i", "e", "j", "k", "f", "g"});
            case 3:
                return new arcr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arcr.class) {
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
