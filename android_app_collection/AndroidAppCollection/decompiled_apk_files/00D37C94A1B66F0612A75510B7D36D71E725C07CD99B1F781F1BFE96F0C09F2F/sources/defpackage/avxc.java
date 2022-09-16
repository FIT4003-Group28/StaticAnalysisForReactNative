package defpackage;
/* compiled from: PG */
/* renamed from: avxc  reason: default package */
/* loaded from: classes2.dex */
public final class avxc extends aopd implements aope {
    public static final avxc a;
    private static volatile aorb t;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public apzg h;
    public apmg i;
    public apmg j;
    public apmg k;
    public avss m;
    public avxb n;
    public aopu o;
    public ates p;
    public avxd q;
    public avxe r;
    public aoob s;
    private aoxw u;
    private aoux v;
    private byte w = 2;

    static {
        avxc avxcVar = new avxc();
        a = avxcVar;
        aopi.registerDefaultInstance(avxc.class, avxcVar);
    }

    private avxc() {
        emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
        emptyProtobufList();
        this.s = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002\u0019\u0012\u0000\u0001\u000f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\t\tᐉ\n\nᐉ\u000b\u000bᐉ\r\fЛ\u000eᐉ\u000f\u0010ᐉ\u0013\u0011ည\u0014\u0012ᐉ\f\u0014ဉ\u0010\u0015ဉ\u0011\u0019ᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "o", avhc.class, "p", "v", "s", "m", "q", "r", "u"});
            case 3:
                return new avxc();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (avxc.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
