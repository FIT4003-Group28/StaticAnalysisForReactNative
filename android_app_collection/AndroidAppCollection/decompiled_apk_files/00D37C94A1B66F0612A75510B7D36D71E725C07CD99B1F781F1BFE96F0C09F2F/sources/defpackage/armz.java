package defpackage;
/* compiled from: PG */
/* renamed from: armz  reason: default package */
/* loaded from: classes2.dex */
public final class armz extends aopi implements aoqv {
    public static final armz a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    private byte i = 2;
    public String d = "";
    public aopq e = emptyIntList();
    public int f = 1;
    public String g = "";

    static {
        armz armzVar = new armz();
        a = armzVar;
        aopi.registerDefaultInstance(armz.class, armzVar);
    }

    private armz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0004\u0016\u0006ဌ\u0003\u0007ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", aupm.p, "g"});
            case 3:
                return new armz();
            case 4:
                return new aopa((int[][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (armz.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
