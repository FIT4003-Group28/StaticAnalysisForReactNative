package defpackage;
/* compiled from: PG */
/* renamed from: aqlb  reason: default package */
/* loaded from: classes2.dex */
public final class aqlb extends aopd implements aope {
    public static final aqlb a;
    private static volatile aorb z;
    private aoux A;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public apok g;
    public avhu h;
    public avhu i;
    public avhn j;
    public aqkz k;
    public apzg m;
    public apzg n;
    public aqla o;
    public int r;
    public ates s;
    public float t;
    public boolean u;
    public int v;
    public int w;
    public int c = 0;
    private byte B = 2;
    public aopu p = emptyProtobufList();
    public aopq q = emptyIntList();
    public aoob x = aoob.b;
    public aopu y = emptyProtobufList();

    static {
        aqlb aqlbVar = new aqlb();
        a = aqlbVar;
        aopi.registerDefaultInstance(aqlb.class, aqlbVar);
    }

    private aqlb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0001\u0001\u0001\u001c\u0017\u0000\u0003\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ဉ\t\bЛ\tᐉ\u0014\nည\u0015\u000bᐉ\u0003\fᐉ\u0004\r\u001d\u000eᐉ\r\u000fᐉ\b\u0010ခ\u000e\u0011ဇ\u000f\u0012ᐼ\u0000\u0013င\u0012\u0014င\u0013\u0016ᐼ\u0000\u0018ဌ\u000b\u001aᐉ\u0006\u001cЛ", new Object[]{"d", "c", "b", "e", "f", "g", "j", "m", "o", "p", apzg.class, "A", "x", "h", "i", "q", "s", "n", "t", "u", avwx.class, "v", "w", aunb.class, "r", aqfh.j, "k", "y", aunb.class});
            case 3:
                return new aqlb();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = z;
                if (aorbVar == null) {
                    synchronized (aqlb.class) {
                        aorbVar = z;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            z = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
