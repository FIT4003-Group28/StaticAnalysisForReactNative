package defpackage;
/* compiled from: PG */
/* renamed from: arff  reason: default package */
/* loaded from: classes2.dex */
public final class arff extends aopi implements aoqv {
    public static final arff a;
    private static volatile aorb d;
    public int b;
    public String c;
    private arag e;
    private arag f;
    private aoux g;
    private arfg h;
    private byte i = 2;

    static {
        arff arffVar = new arff();
        a = arffVar;
        aopi.registerDefaultInstance(arff.class, arffVar);
    }

    private arff() {
        aoob aoobVar = aoob.b;
        this.c = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\b\u0013\u0005\u0000\u0000\u0004\bᐉ\n\nᐉ\u0002\u000bᐉ\u0004\fᐉ\f\u0013ဈ\u0012", new Object[]{"b", "g", "e", "f", "h", "c"});
            case 3:
                return new arff();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arff.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
