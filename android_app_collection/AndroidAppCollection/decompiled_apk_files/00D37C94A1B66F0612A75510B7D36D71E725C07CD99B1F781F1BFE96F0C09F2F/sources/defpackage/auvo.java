package defpackage;
/* compiled from: PG */
/* renamed from: auvo  reason: default package */
/* loaded from: classes2.dex */
public final class auvo extends aopi implements aoqv {
    public static final auvo a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public auvu d;
    public apuq f;
    public apzg g;
    public arag h;
    public arag i;
    public apmg j;
    public ates k;
    private aoux n;
    private byte o = 2;
    public aopu e = emptyProtobufList();
    public aoob l = aoob.b;

    static {
        auvo auvoVar = new auvo();
        a = auvoVar;
        aopi.registerDefaultInstance(auvo.class, auvoVar);
    }

    private auvo() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bည\t\fЛ\rᐉ\u0002", new Object[]{"b", "c", "d", "g", "h", "i", "j", "k", "n", "l", "e", avhc.class, "f"});
            case 3:
                return new auvo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (auvo.class) {
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
