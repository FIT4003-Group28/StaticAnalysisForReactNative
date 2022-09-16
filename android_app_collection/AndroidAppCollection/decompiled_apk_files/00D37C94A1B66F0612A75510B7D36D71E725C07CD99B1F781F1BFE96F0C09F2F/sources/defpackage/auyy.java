package defpackage;
/* compiled from: PG */
/* renamed from: auyy  reason: default package */
/* loaded from: classes2.dex */
public final class auyy extends aopi implements aoqv {
    private static final auyy a;
    private static volatile aorb b;
    private int c;
    private boolean d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private byte k = 2;

    static {
        auyy auyyVar = new auyy();
        a = auyyVar;
        aopi.registerDefaultInstance(auyy.class, auyyVar);
    }

    private auyy() {
    }

    public static auyy h() {
        return a;
    }

    public arag a() {
        arag aragVar = this.j;
        return aragVar == null ? arag.a : aragVar;
    }

    public arag b() {
        arag aragVar = this.g;
        return aragVar == null ? arag.a : aragVar;
    }

    public arag c() {
        arag aragVar = this.h;
        return aragVar == null ? arag.a : aragVar;
    }

    public arag d() {
        arag aragVar = this.i;
        return aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0006\u0002ဇ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new auyy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auyy.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public arag e() {
        arag aragVar = this.e;
        return aragVar == null ? arag.a : aragVar;
    }

    public arag f() {
        arag aragVar = this.f;
        return aragVar == null ? arag.a : aragVar;
    }

    public boolean i() {
        return this.d;
    }

    public boolean j() {
        return (this.c & 64) != 0;
    }

    public boolean k() {
        return (this.c & 8) != 0;
    }

    public boolean l() {
        return (this.c & 16) != 0;
    }

    public boolean m() {
        return (this.c & 32) != 0;
    }

    public boolean n() {
        return (this.c & 2) != 0;
    }

    public boolean o() {
        return (this.c & 4) != 0;
    }
}
