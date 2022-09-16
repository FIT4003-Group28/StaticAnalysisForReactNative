package defpackage;
/* compiled from: PG */
/* renamed from: atbx */
/* loaded from: classes2.dex */
public final class atbx extends aopi implements aoqv {
    private static final atbx a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    static {
        atbx atbxVar = new atbx();
        a = atbxVar;
        aopi.registerDefaultInstance(atbx.class, atbxVar);
    }

    private atbx() {
    }

    public static atbw a() {
        return (atbw) a.createBuilder();
    }

    public static /* synthetic */ atbx b() {
        return a;
    }

    public void g(boolean z) {
        this.c |= 8;
        this.g = z;
    }

    public void h(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void i(atcu atcuVar) {
        this.d = atcuVar.m;
        this.c |= 1;
    }

    public void j(boolean z) {
        this.c |= 4;
        this.f = z;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", atcu.a(), "e", "f", "g"});
            case 3:
                return new atbx();
            case 4:
                return new atbw();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atbx.class) {
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
}
