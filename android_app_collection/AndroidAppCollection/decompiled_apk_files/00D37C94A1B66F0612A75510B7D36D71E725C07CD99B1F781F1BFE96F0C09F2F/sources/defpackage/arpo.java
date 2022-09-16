package defpackage;
/* compiled from: PG */
/* renamed from: arpo  reason: default package */
/* loaded from: classes2.dex */
public final class arpo extends aopi implements aoqv {
    public static final arpo a;
    private static volatile aorb m;
    public int b;
    public int f;
    public arpk g;
    public boolean h;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";
    public String j = "";

    static {
        arpo arpoVar = new arpo();
        a = arpoVar;
        aopi.registerDefaultInstance(arpo.class, arpoVar);
    }

    private arpo() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဌ\u0004\u0006ဉ\u0006\u0007ဇ\u0007\bဈ\b\tဈ\t\nဇ\n\u000bဈ\u0003\rဌ\f", new Object[]{"b", "c", "d", "f", auca.p, "g", "h", "i", "j", "k", "e", "l", asev.h});
            case 3:
                return new arpo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arpo.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
