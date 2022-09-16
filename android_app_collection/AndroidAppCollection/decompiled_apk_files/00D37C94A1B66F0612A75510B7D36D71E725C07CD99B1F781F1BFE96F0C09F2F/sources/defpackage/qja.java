package defpackage;
/* compiled from: PG */
/* renamed from: qja  reason: default package */
/* loaded from: classes4.dex */
public final class qja extends aopi implements aoqv {
    public static final qja a;
    private static volatile aorb n;
    public int b;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String l = "";
    public String m = "";

    static {
        qja qjaVar = new qja();
        a = qjaVar;
        aopi.registerDefaultInstance(qja.class, qjaVar);
    }

    private qja() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဌ\b\nဈ\t\fဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", dnn.o, "l", "m"});
            case 3:
                return new qja();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (qja.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
