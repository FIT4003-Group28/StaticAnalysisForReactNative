package defpackage;
/* compiled from: PG */
/* renamed from: avms  reason: default package */
/* loaded from: classes2.dex */
public final class avms extends aopi implements aoqv {
    public static final avms a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public arag d;
    public apok e;
    public avmr f;
    private aoux h;
    private byte i = 2;

    static {
        avms avmsVar = new avms();
        a = avmsVar;
        aopi.registerDefaultInstance(avms.class, avmsVar);
    }

    private avms() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "h", "f"});
            case 3:
                return new avms();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avms.class) {
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
