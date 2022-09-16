package defpackage;
/* compiled from: PG */
/* renamed from: avnf  reason: default package */
/* loaded from: classes2.dex */
public final class avnf extends aopi implements aoqv {
    public static final avnf a;
    private static volatile aorb k;
    public int b;
    public arhs d;
    public apzg e;
    public arag f;
    public long g;
    public avhn h;
    public arag i;
    public apok j;
    private aoux l;
    private byte m = 2;
    public String c = "";

    static {
        avnf avnfVar = new avnf();
        a = avnfVar;
        aopi.registerDefaultInstance(avnf.class, avnfVar);
    }

    private avnf() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l"});
            case 3:
                return new avnf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avnf.class) {
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
