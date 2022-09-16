package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awdw  reason: default package */
/* loaded from: classes2.dex */
public final class awdw extends aopi implements aoqv {
    public static final awdw a;
    private static volatile aorb d;
    public int b;
    public awdn c;
    private aoux e;
    private byte f = 2;

    static {
        awdw awdwVar = new awdw();
        a = awdwVar;
        aopi.registerDefaultInstance(awdw.class, awdwVar);
    }

    private awdw() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "e"});
            case 3:
                return new awdw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awdw.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
