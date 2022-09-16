package defpackage;
/* compiled from: PG */
/* renamed from: ausw  reason: default package */
/* loaded from: classes2.dex */
public final class ausw extends aopi implements aoqv {
    public static final ausw a;
    private static volatile aorb c;
    public apzg b;
    private int d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        ausw auswVar = new ausw();
        a = auswVar;
        aopi.registerDefaultInstance(ausw.class, auswVar);
    }

    private ausw() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"d", "e", "b", "f"});
            case 3:
                return new ausw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ausw.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
