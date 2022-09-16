package defpackage;
/* compiled from: PG */
/* renamed from: apba  reason: default package */
/* loaded from: classes.dex */
public final class apba extends aopd implements aope {
    public static final apba a;
    private static volatile aorb v;
    public int b;
    public avhn c;
    public aunb d;
    public arag e;
    public aunb f;
    public arag g;
    public float h;
    public aunb i;
    public arag j;
    public arag k;
    public apzg m;
    public float n;
    public aoob o;
    public aopu p;
    public avhn q;
    public int r;
    public int s;
    public aunb t;
    public apbc u;
    private aoux w;
    private byte x = 2;

    static {
        apba apbaVar = new apba();
        a = apbaVar;
        aopi.registerDefaultInstance(apba.class, apbaVar);
    }

    private apba() {
        emptyProtobufList();
        this.o = aoob.b;
        this.p = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0001\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ခ\u0005\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bခ\n\nᐉ\u000b\u000bည\f\fЛ\rᐉ\r\u0010ᐉ\u0001\u0011ᐉ\u0003\u0012ᐉ\u0006\u0013ဋ\u000e\u0014ဌ\u000f\u0015ᐉ\u0010\u0016ဉ\u0011", new Object[]{"b", "c", "e", "g", "h", "j", "k", "m", "n", "w", "o", "p", apzg.class, "q", "d", "f", "i", "r", "s", auii.i, "t", "u"});
            case 3:
                return new apba();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (apba.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
