package defpackage;
/* compiled from: PG */
/* renamed from: auci  reason: default package */
/* loaded from: classes2.dex */
public final class auci extends aopi implements aoqv {
    public static final auci a;
    private static volatile aorb m;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public int j;
    public String k;
    public boolean l;

    static {
        auci auciVar = new auci();
        a = auciVar;
        aopi.registerDefaultInstance(auci.class, auciVar);
    }

    private auci() {
        aoob aoobVar = aoob.b;
        this.k = "";
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u001e\n\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0005ဈ\u0006\u0006ဌ\u0000\nဈ\b\u000bဈ\t\rဌ\u000b\u0011ဈ\u000f\u001dဇ\u0016\u001eဈ\u0005", new Object[]{"b", "d", "e", "g", "c", auca.e, "h", "i", "j", auca.p, "k", "l", "f"});
            case 3:
                return new auci();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (auci.class) {
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
