package defpackage;
/* compiled from: PG */
/* renamed from: apmk  reason: default package */
/* loaded from: classes.dex */
public final class apmk extends aopi implements aoqv {
    public static final apmk a;
    private static volatile aorb h;
    public int b;
    public arag d;
    public arag e;
    public arag f;
    public apml g;
    private aoux i;
    private byte j = 2;
    public String c = "";

    static {
        apmk apmkVar = new apmk();
        a = apmkVar;
        aopi.registerDefaultInstance(apmk.class, apmkVar);
    }

    private apmk() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0006\u0005ဉ\u0005\bᐉ\u0002\tᐉ\u0003", new Object[]{"b", "c", "d", "i", "g", "e", "f"});
            case 3:
                return new apmk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apmk.class) {
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
