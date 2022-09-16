package defpackage;
/* compiled from: PG */
/* renamed from: tmf  reason: default package */
/* loaded from: classes4.dex */
public final class tmf extends aopd implements aope {
    public static final tmf a;
    private static volatile aorb e;
    public int b;
    public int c;
    private byte f = 2;
    public aopq d = emptyIntList();

    static {
        tmf tmfVar = new tmf();
        a = tmfVar;
        aopi.registerDefaultInstance(tmf.class, tmfVar);
    }

    private tmf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"b", "c", anfo.i, "d"});
            case 3:
                return new tmf();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (tmf.class) {
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
