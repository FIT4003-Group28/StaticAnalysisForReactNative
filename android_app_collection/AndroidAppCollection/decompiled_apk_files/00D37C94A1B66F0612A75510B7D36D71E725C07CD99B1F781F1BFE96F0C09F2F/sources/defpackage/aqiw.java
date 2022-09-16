package defpackage;
/* compiled from: PG */
/* renamed from: aqiw  reason: default package */
/* loaded from: classes2.dex */
public final class aqiw extends aopi implements aoqv {
    public static final aqiw a;
    private static volatile aorb h;
    public arag b;
    public aunb d;
    public int e;
    public aunb f;
    public aunb g;
    private int i;
    private byte j = 2;
    public String c = "";

    static {
        aqiw aqiwVar = new aqiw();
        a = aqiwVar;
        aopi.registerDefaultInstance(aqiw.class, aqiwVar);
    }

    private aqiw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဌ\u0003", new Object[]{"i", "b", "c", "d", "f", "g", "e", auca.p});
            case 3:
                return new aqiw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqiw.class) {
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
