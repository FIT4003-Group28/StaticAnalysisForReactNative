package defpackage;
/* compiled from: PG */
/* renamed from: aqya  reason: default package */
/* loaded from: classes2.dex */
public final class aqya extends aopd implements aope {
    public static final aqya a;
    private static volatile aorb j;
    public int b;
    public Object d;
    public apzg e;
    public arag f;
    public arag g;
    public aqyb h;
    public aopu i;
    private arag k;
    private ates m;
    private aqxz n;
    private aoux o;
    public int c = 0;
    private byte p = 2;

    static {
        aqya aqyaVar = new aqya();
        a = aqyaVar;
        aopi.registerDefaultInstance(aqya.class, aqyaVar);
    }

    private aqya() {
        emptyProtobufList();
        emptyProtobufList();
        this.i = emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0001\u000b\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\bᐉ\t\tᐉ\u000b\nᐉ\u0007\rᐉ\b\u000eᐼ\u0000\u000fЛ", new Object[]{"d", "c", "b", avhn.class, "e", "f", "k", "g", "n", "o", "h", "m", arhs.class, "i", apzg.class});
            case 3:
                return new aqya();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqya.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
