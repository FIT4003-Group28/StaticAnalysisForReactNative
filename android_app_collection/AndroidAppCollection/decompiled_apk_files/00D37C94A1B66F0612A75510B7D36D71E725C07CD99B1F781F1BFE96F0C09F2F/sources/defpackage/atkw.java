package defpackage;
/* compiled from: PG */
/* renamed from: atkw  reason: default package */
/* loaded from: classes2.dex */
public final class atkw extends aopd implements aope {
    public static final atkw a;
    private static volatile aorb b;
    private int c;
    private atkx d;
    private arag e;
    private arag f;
    private apzg g;
    private asow h;
    private ates i;
    private aoux j;
    private arag k;
    private atkv m;
    private byte n = 2;

    static {
        atkw atkwVar = new atkw();
        a = atkwVar;
        aopi.registerDefaultInstance(atkw.class, atkwVar);
    }

    private atkw() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\b\tᐉ\u0005\u000bᐉ\u0007\rᐉ\u000b\u0010ᐉ\r", new Object[]{"c", "d", "e", "f", "g", "j", "h", "i", "k", "m"});
            case 3:
                return new atkw();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atkw.class) {
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
