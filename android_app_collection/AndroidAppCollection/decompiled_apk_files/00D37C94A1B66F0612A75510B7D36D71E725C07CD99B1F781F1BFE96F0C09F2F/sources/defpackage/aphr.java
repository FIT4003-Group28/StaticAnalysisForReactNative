package defpackage;
/* compiled from: PG */
/* renamed from: aphr  reason: default package */
/* loaded from: classes.dex */
public final class aphr extends aopi implements aoqv {
    public static final aphr a;
    private static volatile aorb k;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        aphr aphrVar = new aphr();
        a = aphrVar;
        aopi.registerDefaultInstance(aphr.class, aphrVar);
    }

    private aphr() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0012\u0019\b\u0000\u0000\u0000\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u0019ဇ\u0018", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aphr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aphr.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
