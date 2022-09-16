package defpackage;
/* compiled from: PG */
/* renamed from: aqbx  reason: default package */
/* loaded from: classes2.dex */
public final class aqbx extends aopi implements aoqv {
    public static final aqbx a;
    private static volatile aorb m;
    public int b;
    public aqby c;
    public aqbs d;
    public aoob e;
    public arag f;
    public arag g;
    public boolean h;
    public aopu i;
    public arag j;
    public aunb k;
    public boolean l;
    private arag n;
    private aunb o;
    private aoux p;
    private arag q;
    private arag r;
    private aunb s;
    private aunb t;
    private aunb u;
    private aunb v;
    private aunb w;
    private byte x = 2;

    static {
        aqbx aqbxVar = new aqbx();
        a = aqbxVar;
        aopi.registerDefaultInstance(aqbx.class, aqbxVar);
    }

    private aqbx() {
        emptyProtobufList();
        this.e = aoob.b;
        this.i = emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u001f\u0014\u0000\u0001\u0011\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ည\u0004\bᐉ\u0005\nᐉ\u0007\u000bᐉ\b\u000eဇ\f\u000fЛ\u0010ᐉ\u000f\u0011ᐉ\u000b\u0012ᐉ\u0010\u0014ᐉ\u0003\u0015ᐉ\t\u0016ᐉ\n\u0017ᐉ\u0012\u0018ᐉ\u0013\u001dᐉ\u0015\u001eᐉ\u0016\u001fဇ\u0017", new Object[]{"b", "n", "c", "d", "e", "p", "f", "g", "h", "i", apzg.class, "t", "s", "u", "o", "q", "r", "j", "v", "k", "w", "l"});
            case 3:
                return new aqbx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqbx.class) {
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
