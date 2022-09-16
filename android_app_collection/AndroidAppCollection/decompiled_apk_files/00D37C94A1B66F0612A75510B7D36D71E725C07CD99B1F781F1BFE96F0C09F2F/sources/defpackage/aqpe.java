package defpackage;
/* compiled from: PG */
/* renamed from: aqpe  reason: default package */
/* loaded from: classes2.dex */
public final class aqpe extends aopd implements aope {
    public static final aqpe a;
    private static volatile aorb e;
    public long b;
    public boolean c;
    public boolean d;
    private int f;
    private byte g = 2;

    static {
        aqpe aqpeVar = new aqpe();
        a = aqpeVar;
        aopi.registerDefaultInstance(aqpe.class, aqpeVar);
    }

    private aqpe() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aqpe();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqpe.class) {
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
