package defpackage;
/* compiled from: PG */
/* renamed from: auxc  reason: default package */
/* loaded from: classes2.dex */
public final class auxc extends aopi implements aoqv {
    public static final auxc a;
    private static volatile aorb q;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public int g;
    public int h;
    public int i;
    public apzg j;
    public auxe k;
    public aunb l;
    public ateb m;
    public int n;
    public aunb o;
    public auxd p;
    private arag r;
    private arag s;
    private aunb t;
    private aunb u;
    private aoux v;
    private byte w = 2;
    public aopu f = emptyProtobufList();

    static {
        auxc auxcVar = new auxc();
        a = auxcVar;
        aopi.registerDefaultInstance(auxc.class, auxcVar);
    }

    private auxc() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u0001\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u000b\u0004ᐉ\f\u0005Л\u0006ᐉ\u000e\u0007ᐉ\u0010\bᐉ\u0011\tᐉ\u0005\nᐉ\u0006\rᐉ\u0015\u000fᐉ\u0002\u0012ဌ\u000f\u0013ဌ\u0007\u0014ဌ\b\u0015ဌ\t\u0018ᐉ\u0012\u0019ဉ\u0013\u001aᐉ\r", new Object[]{"b", "c", "d", "j", "k", "f", aplw.class, "m", "t", "u", "r", "s", "v", "e", "n", auwh.f, "g", auwh.e, "h", auwh.e, "i", auwh.e, "o", "p", "l"});
            case 3:
                return new auxc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (auxc.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
