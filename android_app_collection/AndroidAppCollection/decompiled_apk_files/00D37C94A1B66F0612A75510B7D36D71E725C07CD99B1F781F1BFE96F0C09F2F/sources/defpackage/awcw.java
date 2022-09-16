package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awcw  reason: default package */
/* loaded from: classes2.dex */
public final class awcw extends aopi implements aoqv {
    public static final awcw a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private apmg f;
    private apmg g;
    private awdg h;
    private awdq i;
    private arag j;
    private aoux k;
    private byte l = 2;

    static {
        awcw awcwVar = new awcw();
        a = awcwVar;
        aopi.registerDefaultInstance(awcw.class, awcwVar);
    }

    private awcw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\u0007\nᐉ\b\fᐉ\u0002\rᐉ\u0003", new Object[]{"c", "d", "e", "h", "i", "j", "k", "f", "g"});
            case 3:
                return new awcw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awcw.class) {
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
