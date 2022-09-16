package defpackage;
/* compiled from: PG */
/* renamed from: ausg  reason: default package */
/* loaded from: classes2.dex */
public final class ausg extends aopi implements aoqv {
    public static final ausg a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private ause g;
    private arag h;
    private arag i;
    private arag j;
    private aoux k;
    private byte l = 2;

    static {
        ausg ausgVar = new ausg();
        a = ausgVar;
        aopi.registerDefaultInstance(ausg.class, ausgVar);
    }

    private ausg() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\b\u0007ᐉ\t\bᐉ\n\u000bᐉ\u0005\rᐉ\u000b", new Object[]{"c", "d", "e", "f", "h", "i", "j", "g", "k"});
            case 3:
                return new ausg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ausg.class) {
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
