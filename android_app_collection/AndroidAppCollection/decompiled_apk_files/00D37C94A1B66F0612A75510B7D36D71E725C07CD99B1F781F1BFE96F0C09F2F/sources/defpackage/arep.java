package defpackage;
/* compiled from: PG */
/* renamed from: arep  reason: default package */
/* loaded from: classes2.dex */
public final class arep extends aopi implements aoqv {
    public static final arep a;
    private static volatile aorb o;
    public int b;
    public avhn c;
    public arag e;
    public int f;
    public ates g;
    public apzg h;
    public arag i;
    public arag j;
    public apmg k;
    public apmg l;
    public apmg m;
    public aoob n;
    private arag p;
    private apok q;
    private aoux r;
    private byte s = 2;
    public aopu d = emptyProtobufList();

    static {
        arep arepVar = new arep();
        a = arepVar;
        aopi.registerDefaultInstance(arep.class, arepVar);
    }

    private arep() {
        emptyProtobufList();
        emptyProtobufList();
        this.n = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006င\u0003\u0007ᐉ\u0006\bᐉ\b\tЛ\nᐉ\r\u000bည\u000e\fᐉ\f\rᐉ\u0007\u0010ᐉ\t\u0011ᐉ\n\u0012ᐉ\u000b", new Object[]{"b", "c", "e", "g", "h", "f", "p", "j", "d", avhc.class, "r", "n", "q", "i", "k", "l", "m"});
            case 3:
                return new arep();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (arep.class) {
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
