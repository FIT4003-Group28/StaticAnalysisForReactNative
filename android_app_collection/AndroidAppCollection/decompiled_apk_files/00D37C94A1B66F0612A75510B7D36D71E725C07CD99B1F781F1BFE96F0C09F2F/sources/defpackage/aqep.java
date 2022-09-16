package defpackage;
/* compiled from: PG */
/* renamed from: aqep  reason: default package */
/* loaded from: classes2.dex */
public final class aqep extends aopi implements aoqv {
    public static final aqep a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public auvu d;
    public apzg f;
    public arag g;
    public arag h;
    public apmg i;
    public ates j;
    public asxl k;
    private aoux n;
    private byte o = 2;
    public aopu e = emptyProtobufList();
    public aoob l = aoob.b;

    static {
        aqep aqepVar = new aqep();
        a = aqepVar;
        aopi.registerDefaultInstance(aqep.class, aqepVar);
    }

    private aqep() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\b\nည\t\u000bЛ\rဉ\u0007", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "n", "l", "e", avhc.class, "k"});
            case 3:
                return new aqep();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqep.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
