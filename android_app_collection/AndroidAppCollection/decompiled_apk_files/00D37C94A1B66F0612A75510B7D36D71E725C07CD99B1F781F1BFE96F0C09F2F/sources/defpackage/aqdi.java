package defpackage;
/* compiled from: PG */
/* renamed from: aqdi  reason: default package */
/* loaded from: classes2.dex */
public final class aqdi extends aopd implements aope {
    public static final aqdi a;
    private static volatile aorb o;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public apzg g;
    public aqdj h;
    public ates k;
    public aoob m;
    public aunb n;
    private arag p;
    private avaz q;
    private aoux r;
    private arcq s;
    private byte t = 2;
    public aopu i = emptyProtobufList();
    public aopu j = emptyProtobufList();

    static {
        aqdi aqdiVar = new aqdi();
        a = aqdiVar;
        aopi.registerDefaultInstance(aqdi.class, aqdiVar);
    }

    private aqdi() {
        emptyProtobufList();
        this.m = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0002\u000e\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\u0003\nᐉ\f\u000bᐉ\b\fЛ\rЛ\u000eည\r\u0011ᐉ\u000f\u0013ᐉ\t\u0015ᐉ\u0011", new Object[]{"b", "c", "p", "e", "f", "g", "q", "d", "r", "h", "i", aplw.class, "j", aplw.class, "m", "s", "k", "n"});
            case 3:
                return new aqdi();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aqdi.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
